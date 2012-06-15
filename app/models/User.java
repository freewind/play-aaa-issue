package models;

import play.modules.aaa.RequireRight;
import play.modules.morphia.Model;
import play.modules.morphia.Model.OnAdd;

import com.google.code.morphia.annotations.Entity;

@Entity("users")
public class User extends Model {

	public String name;

	public User(String name) {
		this.name = name;
	}

	@RequireRight("manage-my-profile")
	public void changeName(String name) {
		this.name = name;
	}

	@OnAdd
	@RequireRight("create-user")
	void onAdd() {
		System.out.println("Add new user: " + name);
	}

}

package controllers;

import models.User;
import play.mvc.Controller;

public class Application extends Controller {

	public static void index() {
		render();
	}

	public static void test1() {
		User user = new User("Freewind");
		user.changeName("hello");
		renderText("changed name");
	}

	public static void test2() {
		User user = new User("Freewind");
		user.save();
		renderText("saved");
	}

}
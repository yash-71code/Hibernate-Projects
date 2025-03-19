package com.gym;

import java.util.Scanner;

public class TextClient {

	public static void main(String[] args) {
		System.out.println("Welcome to Colours Gym Portal ");
		System.out.println("Please Register with Your Details");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		String fname = sc.next();
		System.out.println("Enter Last Name : ");
		String lname = sc.next();
		System.out.println("Enter User Name : ");
		String uname = sc.next();
		System.out.println("Enter Password : ");
		String password = sc.next();
		UserImplemention usi = new UserImplemention();
		User user1 = new User(fname,lname,uname,password);

		String result = usi.register(user1, 0);
		System.out.println(result);
		System.out.println("Please Login with your Details ");
		System.out.println("Enter User name");
		String uname1 = sc.next();
		System.out.println("Enter password");
		String pass = sc.next();
		sc.close();
		boolean result1 = usi.login(uname1, pass);
		WorkoutImplementation wi = new WorkoutImplementation();
		Workout workouts1 = new Workout("Cardio", "ThreadMil",0,10,"Fitness");
		Workout workouts2 = new Workout("Muscle", "Dumbel",20,10,"MassGain");
		
		wi.addWorkout(workouts1, 0);
		wi.addWorkout(workouts2, 1);
		
		if(result1==true) {
			Workout display[] = wi.displayWorkouts();
			for(Workout wo : display) {
				System.out.println(wo);
			}
		}else {
			System.out.println("Check Your Details");
		}
		
		
		
	}

}

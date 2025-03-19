package com.gym;

public class WorkoutImplementation implements IWorkout {
	Workout workouts[];
	WorkoutImplementation(){
		workouts = new Workout[2];
		
	}
	@Override
	public void addWorkout(Workout workout, int index) {
		workouts[index] = workout;
		
	}

	@Override
	public Workout[] displayWorkouts() {
	
		return workouts;
	}
	

}

package com.gym;

public class Workout {
	private String type;
	private String equipment;
	private int weights;
	private int repetitions;
	private String reason;
	
	public Workout(String type, String equipment, int weights, int repetitions, String reason) {
		super();
		this.type = type;
		this.equipment = equipment;
		this.weights = weights;
		this.repetitions = repetitions;
		this.reason = reason;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public int getWeights() {
		return weights;
	}
	public void setWeights(int weights) {
		this.weights = weights;
	}
	public int getRepetitions() {
		return repetitions;
	}
	public void setRepetitions(int repetitions) {
		this.repetitions = repetitions;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "Workout [type=" + type + ", equipment=" + equipment + ", weights=" + weights + ", repetitions="
				+ repetitions + ", reason=" + reason + "]";
	}


}

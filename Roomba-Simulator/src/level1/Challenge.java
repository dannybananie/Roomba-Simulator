package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 */
	public void initialize() {
driveDirect(500,500);
sleep(1000);
driveDirect(500, -500);
sleep(1500);
driveDirect(448,500);
sleep(600);
driveDirect(500, -500);
sleep(1300);
driveDirect(490,500);
sleep(1400);
	}

	public void loop() {
	
	}
}

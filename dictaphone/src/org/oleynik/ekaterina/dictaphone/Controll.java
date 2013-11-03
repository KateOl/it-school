package org.oleynik.ekaterina.dictaphone;

public class Controll {
	private Battery myBattery = new Battery();
	private Storage myStorage = new Storage();
	private boolean isOn = false;
	private boolean isRecording = false;
	private boolean isCharging = false;
	void showScreen(){
		Screen.showCharge(myBattery.checkCharge());
		Screen.showStorage(myStorage.getEmptySpace());
	};
	void powerOn(){
		isOn = true;
	}
	void powerOff(){
		isOn = false;
	}
	void startRecording(){
		isRecording = true;
	}
	void stopRecording(){
		isRecording = false;
	}
	void startCharging(){
		isCharging = true;
	}
	void stopCharging(){
		isCharging = true;
	}
}

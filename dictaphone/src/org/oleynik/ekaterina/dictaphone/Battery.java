package org.oleynik.ekaterina.dictaphone;

public class Battery {
	private int charge = 0;
	private final int MAXCHARGE = 150;
	private boolean isCharging = false;
	public int checkCharge(){
		return charge;
	}
	public void onCharging(){
		isCharging = true;
	}
	public void offCharging(){
		isCharging = false;
	}
	public void doCharge(){
		if (charge<MAXCHARGE){
			if (true == isCharging)
				charge ++;
			else return;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Charging. Curent charge = " + charge);
		}
		
		
	}
	public static void main(String[] args){
		Battery myBattery = new Battery();
		System.out.println("Battery charge is " + myBattery.checkCharge());
		myBattery.onCharging();
		for (int i=0; i<20; i++) {
			myBattery.doCharge();
		}
		myBattery.offCharging();
		System.out.println("Battery charge is " + myBattery.checkCharge());
	}
}

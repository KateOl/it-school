package org.oleynik.ekaterina.dictaphone;

public class Storage {
	private final long MAXSTORAGE = 100000;
	private long storage = MAXSTORAGE;
	public boolean isStorageFool(){
		boolean isFool = true;
		return isFool;
	}
	public long getEmptySpace(){
		long space = MAXSTORAGE - storage;
		return space;
	};
	public void addRecording(){
		if ((storage - 100)<0) 
			return;
		storage -= 100;
	}
	public void emptyStorage(){
		storage = MAXSTORAGE;
	}
	public void saveStorage2Computer(){
		System.out.println("Recordings was saved");
		emptyStorage();
	}

}

package org.oleynik.ekaterina.dictaphone;

public class Storage {
	private final long MAXSTORAGE = 105000;
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
		if ((storage - 50)<0) 
			return;
		storage -= 50;
	}
	public void emptyStorage(){
		storage = MAXSTORAGE;
	}
	public void saveStorage2Computer(){
		System.out.println("Recordings was saved");
		emptyStorage();
	}

}

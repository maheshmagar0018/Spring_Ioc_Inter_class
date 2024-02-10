package org.jsp.animal;

public class Animal_sound {
	
	Animal a;
	
	public void sound()
	{
		a.doSound();
	}
	
	Animal_sound(Animal a)
	{
		this.a = a;
	}

}
package org.jsp.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Animal_sound_Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sound.xml");
		Animal_sound animal_sound = context.getBean(Animal_sound.class,"animalSound");
		animal_sound.sound();
		
	}
 
}

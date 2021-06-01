package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		try {
			controller.createBossEmployee("Pepe Boss", "Direccion molona", "666666666", 9000.0);
		} catch (Exception e) {
			System.out.println("No s'ha pogut registrar, sou erroni.");
		}
		try {
			controller.createJuniorEmployee("Pedro Junior Employee", "Direccion molona 2", "665266666", 950.0);
		} catch (Exception e) {
			System.out.println("No s'ha pogut registrar, sou erroni.");
		}
		try {
			controller.createSeniorEmployee("Laura Senior Employee", "Direccion molona 3", "625266666", 3000.0);
		} catch (Exception e) {
			System.out.println("No s'ha pogut registrar, sou erroni.");
		}
		try {
			controller.createMidEmployee("Marta Mid Employee", "Direccion molona 5", "625263666", 2000.0);
		} catch (Exception e) {
			System.out.println("No s'ha pogut registrar, sou erroni.");
		}
		try {
			controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666");
		} catch (Exception e) {
			System.out.println("No s'ha pogut registrar, sou erroni.");
		}
		try {
			controller.createManagerEmployee("Pedro Manager", "Direccion molona 7", "665226666", 4000.0);
		} catch (Exception e) {
			System.out.println("No s'ha pogut registrar, sou erroni.");
		}
		try {
			controller.createVolunteer("Tania Volunteer", "Direccion molona 6", "614266646");
		} catch (Exception e) {
			System.out.println("No s'ha pogut registrar, sou erroni.");
		}
		
		
		controller.payAllEmployeers();
		controller.payAjut("Juan Volunteer");
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES:\n" + allEmployees + " \n");
		
		controller.payBonus();
		
	}

}

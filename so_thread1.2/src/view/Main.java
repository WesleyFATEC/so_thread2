package view;

import java.util.Random;

import controller.ThSomaVet;

public class Main {

	public static void main(String[] args) {
		int [] [] mat = new int [3][5];
		Random random = new Random();
		
		for(int i = 0 ; i < 3; i++) {
			for (int j = 0 ; j < 5; j++) {
				mat [i][j] = random.nextInt(150);
			}
		}
		SomaLineMat(mat);
	}
	
	private static void SomaLineMat (int [][] mat) {
		int numLine = mat.length;
		
		Thread[] thread = new Thread[numLine];
		ThSomaVet[] somath = new ThSomaVet[numLine];
		
		for (int i = 0  ; i<numLine; i++) {
			int [] vet = new int [5];
			for (int j = 0 ; j < 5; j++) {
				vet [j] = mat [i][j];
			}
			somath[i] = new ThSomaVet(vet,i);
			thread[i] = new Thread(somath[i]);
			thread[i].start();
				        
		}
	}

}

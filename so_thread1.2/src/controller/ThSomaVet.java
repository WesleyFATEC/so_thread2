package controller;

public class ThSomaVet implements Runnable {
    private int[] vet;
    private long soma;
    private int line;

    public ThSomaVet(int[] vet, int line) {
        this.vet = vet;
        this.line = line;
    }

    @Override
    public void run() {
        soma = 0;
        for (int num : vet) {
            soma += num;
        }
        System.out.println("A soma da linha " + line +" da matriz é: " + soma);
    }
}
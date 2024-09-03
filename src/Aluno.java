public class Aluno {
    public static void main(String[] args) throws Exception {
        int n1 = 50;
        int n2 = 80;
        int n3 = 40;
        double n4 = 20.9;

        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("Amedia do aluno é: " + media);

        if (media <= 50) {
            System.out.println("Você esta aprovado");
        }

        else if (media >= 40) {
            System.out.println("Você esta de recuperação");
        }

        else {
            System.out.println("Voce esta reprovado");
        }
    }
}

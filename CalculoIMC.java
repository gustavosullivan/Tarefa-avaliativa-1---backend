import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        Boolean inputHeight = false;
        Boolean inputdWeigh = false;
        Double height = null;
        Double weight = null;

        System.out.print("Digite seu nome: ");
        String name = lerTeclado.nextLine();


        System.out.print("Digite seu Gênero (Masculino), (Feminino) ou (Neutro): ");
        char gender = lerTeclado.nextLine().charAt(0);
        char genderUpper = Character.toUpperCase(gender);

        do {
            try{
                System.out.print("Digite sua altura: ");
                String FormatedHeight = lerTeclado.nextLine();
                FormatedHeight = FormatedHeight.replaceAll(",", ".");
                height = Double.parseDouble(FormatedHeight);
                inputHeight = true;

            }catch(Exception e){
                System.out.print("Digite uma altura válida");
            }
        }while (!inputHeight);


        do{
            try{
                System.out.print("Digite seu peso: ");
                String FormatedWeight = lerTeclado.nextLine();
                FormatedWeight = FormatedWeight.replaceAll(",", ".");
                weight = Double.parseDouble(FormatedWeight);
                inputdWeigh = true;

            }catch(Exception e) {
                System.out.print("Digite um peso válido.");
            }
        }while (!inputdWeigh);

        lerTeclado.close();

        double CalculoIMC = (weight / (height * height));
        System.out.printf("Nome: " + name + "\n");
        System.out.printf("Gênero: "+ gender + "\n");
        System.out.printf("IMC: %.2f%n", CalculoIMC);

        switch (genderUpper) {
            case 'M':

                if (CalculoIMC >= 40) {
                    System.out.print("Obeso");
                } else if (CalculoIMC >= 30 && CalculoIMC <= 39.9) {
                    System.out.print("Obesidade Moderada");
                } else if (CalculoIMC >= 25 && CalculoIMC <= 29.9) {
                    System.out.print("Obesidade Leve");
                } else if (CalculoIMC >= 20 && CalculoIMC <= 24.9) {
                    System.out.print("Normal");
                } else {
                    System.out.print("Abaixo do Normal");
                }
                break;

            case 'F':

                if (CalculoIMC >= 39) {
                    System.out.print("Obeso");
                } else if (CalculoIMC >= 29 && CalculoIMC <= 38.9) {
                    System.out.print("Obesidade Moderada");
                } else if (CalculoIMC >= 24 && CalculoIMC <= 28.9) {
                    System.out.print("Obesidade Leve");
                } else if (CalculoIMC >= 19 && CalculoIMC <= 23.9) {
                    System.out.print("Normal");
                } else {
                    System.out.print("Abaixo do Normal");
                }
                break;

            default:
                System.out.print("Genero N: ");
                if (CalculoIMC >= 39) {
                    System.out.print("Obeso");
                } else if (CalculoIMC >= 29 && CalculoIMC <= 38.9) {
                    System.out.print("Obesidade Moderada");
                } else if (CalculoIMC >= 24 && CalculoIMC <= 28.9) {
                    System.out.print("Obesidade Leve");
                } else if (CalculoIMC >= 19 && CalculoIMC <= 23.9) {
                    System.out.print("Normal");
                } else {
                    System.out.print("Abaixo do Normal");
                }
                break;
        }
    }
}
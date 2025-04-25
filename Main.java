import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Carro[] carro = new Carro[100];
        int op = -1;
        int estac = 0;
        Scanner scan = new Scanner(System.in);

       while(op!=0){
            System.out.println("1 - Entrada de carro");
            System.out.println("2 - Saída de carro por placa");
            System.out.println("3 - Ver carro por placa");
            System.out.println("4 - Ver carros");
            System.out.println("5 - Trocar condutor");
            System.out.println("6 - Trocar motor");
            System.out.print("0 - Acabou o expediente\n>");
            op = scan.nextInt();


            if(op == 1){
                System.out.println("Qual a marca do carro?");
                String marca = scan.nextLine();
                System.out.println("Qual o modelo do carro?");
                String modelo = scan.nextLine();
                System.out.println("Qual a placa do carro?");
                String placa = scan.nextLine();
                System.out.print("Qual motor do carro?(tipo e potência)\ntipo: ");
                String tipo = scan.nextLine();
                System.out.print("potência: ");
                Integer potencia = scan.nextInt();
                Motor motor = new Motor(tipo, potencia);
                System.out.print("Qual o condutor do carro?(nome e CNH)\nNome: ");
                String nome = scan.nextLine();
                System.out.print("CNH: ");
                Integer cnh = scan.nextInt();
                Condutor condutor = new Condutor(nome, cnh);
                carro[estac] = new Carro(marca, modelo, placa, motor, condutor);
                System.out.println("ENTRADA ACEITA!");
            }
            else if(op == 2){
                System.out.println("Digite a placa do carro: ");
                String placa = scan.nextLine();
                for(int i = 0; i < estac; i++){
                    if(placa == carro[i].getPlaca()) {
                        carro[i] = new Carro();
                        System.out.println("SAIDA ACEITA!");
                    }
                }
            }
            else if(op == 3){
                System.out.println("Digite a placa do carro que você quer encontrar:");
                String placa = scan.nextLine();
                for(int i = 0; i < estac; i++){
                    if(placa == carro[i].getPlaca()){
                        System.out.println(carro[i].toString());
                    }
                }
            }
            else if(op == 4){
                for(int i = 0; i < estac; i++){
                    System.out.println(carro[i].toString()+"\n");
                }
            }
            else if(op == 5){
                System.out.println("Qual a placa do carro?");
                String placa = scan.nextLine();
                for(int i = 0; i < estac; i++){
                    if(placa == carro[i].getPlaca()){
                        System.out.print("Qual o novo condutor?(nome e CNH)\nnome: ");
                        String nome = scan.nextLine();
                        System.out.println("\nCNH: ");
                        Integer cnh = scan.nextInt();
                        Condutor novoCondutor = new Condutor(nome, cnh);
                        carro[i].setCondutor(novoCondutor);
                    }
                }
            }
            else if(op == 6){
                System.out.println("Qual a placa do carro?");
                String placa = scan.nextLine();
                for(int i = 0; i < estac; i++){
                    if(placa == carro[i].getPlaca()){
                        System.out.print("Qual o novo motor?(tipo e potência)\ntipo: ");
                        String tipo = scan.nextLine();
                        System.out.println("\npotência: ");
                        Integer potencia = scan.nextInt();
                        Motor novoMotor = new Motor(tipo, potencia);
                        carro[i].setMotor(novoMotor);
                    }
                }
            }
            else {
                if(op == 0) System.out.println("ATÉ AMANHÃ!");
                else System.out.print("Opção inválida!!!");
            }
       }
       scan.close();
    }
}

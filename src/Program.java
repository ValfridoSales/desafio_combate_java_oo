import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome:");
        String name = sc.next();
        System.out.print("Vida inicial: ");
        int life = sc.nextInt();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();;
        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        Champion championA = new Champion(name, life, attack, armor);
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome:");
        name = sc.next();
        System.out.print("Vida inicial: ");
        life = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();;
        System.out.print("Armadura: ");
        armor = sc.nextInt();
        Champion championB = new Champion(name, life, attack, armor);
        System.out.print("Quantos turnos voce deseja executar? ");
        int round = sc.nextInt();
        System.out.println();
        for (int i=1; i <= round; i++){
            if(championA.getLife() <= 0 || championB.getLife() <= 0){
                break;
            }
            championA.takeDamage(championB);
            championB.takeDamage(championA);
            System.out.println("Resultado do turno " + i + ":");
            System.out.println(championA.status());
            System.out.println(championB.status());
            System.out.println();
        }

        System.out.println("FIM DO COMBATE");
    }
}

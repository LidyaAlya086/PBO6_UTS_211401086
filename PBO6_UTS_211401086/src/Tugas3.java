// package src; --tidak perlu menggunakan ini karena sudah tersimpan di package src secara default. pakai ini ketika ingin menyimpan di package lain
// using namespace std; --tidak perlu menggunakan ini

class character{ // mengubah characterr menjadi character
    String nama;
    int heal;
    String weapon;
    int attackP;
    int mana;
    // membuat constructor
    character(String nama, int heal, String weapon, int attackp, int mana){ 
        this.nama = nama; // tambahkan this disini
        this.heal = heal; // tambahkan this disini
        this.weapon = weapon; // tambahkan this disini
        this.attackP = attackp; // tambahkan this disini
        this.mana = mana; // tambahkan this disini
        //print(nama); --tidak perlu di print disini
    }
    void attack(){
        mana -=50; // tidak perlu menggunakan this disini
        System.out.println(nama+" menyerang si sotong");
        System.out.println("sotong terkena demage sebanyak "+this.attackP ); // line ini tidak perlu dijadikan komentar

    }
    void demage(int attackP){
        System.out.println("ucup terkena demage sebanyak " + attackP);
        heal -= attackP; // tidak perlu menggunakan this disini
    }
    void print(){
        System.out.println("nama        : "+nama);  
        System.out.println("heal        : "+ heal);
        System.out.println("weapon      : "+weapon);
        System.out.println("attack power: " + attackP);
        System.out.println("mana        : " +mana);
    }
}

public class Tugas3 {

    public static void main(String[] args) {
        character character1 = new character("ucup",100,"pedang excalibur",5,100); // mengubah characterr menjadi character
        character1.attack();
        character1.demage(10);
        character1.print();
        }
    
}
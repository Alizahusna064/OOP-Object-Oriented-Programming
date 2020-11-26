package pbo_3_inherite;

public class main {

    public static void main(String[] args) {
        //Deklarasi Tim
        Tim apenLibel = new Tim("Apenlibel");

        //Deklarasi Member
        Member orang_1 = new Member("Ling", 20);
        Member orang_2 = new Member("Baratz", 23);
        Member orang_3 = new Member("Khaled", 22);

        //Deklarasi Trainee
        Member orang_4 = new Trainee("Alucard", 26, 8);
        Member orang_5 = new Trainee("Saber", 21, 10);
        Member orang_6 = new Trainee("Karina", 30, 12);

        //Menambahkan data pada ArrayList
        jagoanNeon.addMember(orang_1);
        jagoanNeon.addMember(orang_2);
        jagoanNeon.addMember(orang_3);
        jagoanNeon.addMember(orang_4);
        jagoanNeon.addMember(orang_5);
        jagoanNeon.addMember(orang_6);

        //Output
        jagoanNeon.displayFullMember();
        jagoanNeon.displayTrainee();
    }

}

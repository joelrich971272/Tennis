import clavier.In;

public class TpTennis {
    public static void main(String[] args) {
        int capDeDep = 0 ,nmbrDefaite = 0 , nmbrDeVictoire = 0;
        int classement = 0 , pParVictoire = 0 ;
        final int Nc = 1 , _40 = 2 , _30_5 = 3 , _30_4 = 4 , _30_3 = 5 , _30_2 = 6 , _30_1 = 7 ,_30 = 8 ,_15_5 = 9 ,_15_4 = 10;
        String st_Classement = null;


        System.out.println("Saisissez votre classement \n 1 pour non classé \n 2 pour 40 \n 3 pour 30/5 \n etc...");
        classement = In.readInteger() ;

        switch (classement){
            case Nc:
                capDeDep = 0 ;
                nmbrDeVictoire = 5 ;
                st_Classement = "NC" ;

                break;
            case _40:
                capDeDep = 2 ;
                nmbrDeVictoire = 5 ;
                st_Classement = "40" ;
                break;
            case _30_5:
                capDeDep = 5 ;
                nmbrDeVictoire = 5 ;
                st_Classement = "30_5" ;
                break;
            case _30_4:
                capDeDep = 10 ;
                nmbrDeVictoire = 5 ;
                st_Classement = "30_4" ;
                break;
            case _30_3:
                capDeDep = 20 ;
                nmbrDeVictoire = 6 ;
                st_Classement = "30_3" ;
                break;
            case _30_2:
                capDeDep = 30 ;
                nmbrDeVictoire = 6 ;
                st_Classement = "30_2" ;
                break;
            case _30_1:
                capDeDep = 50 ;
                nmbrDeVictoire = 6 ;
                st_Classement = "30_1" ;
                break;
            case _30:
                capDeDep = 80 ;
                nmbrDeVictoire = 6 ;
                st_Classement = "30" ;
                break;
            case _15_5:
                capDeDep = 120 ;
                nmbrDeVictoire = 6 ;
                st_Classement = "15_5" ;
                break;
        }
        System.out.println("Votre classement est " + st_Classement + " vous possédez " + capDeDep + " points et votre nombres de victoire maximum est : " + nmbrDeVictoire);
        System.out.println("Veuillez saisir le nombre/s de victoire/s ci-dessous");
        nmbrDeVictoire = In.readInteger();
        System.out.println("Pour chacun des matchs remportés indiquez l'échelon de votre adversaire");
        for (int i = 0; i < nmbrDeVictoire; i++) {
            int echelon = In.readInteger() ;
            if (echelon ==)
        }

    }
}

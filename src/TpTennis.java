import clavier.In;

public class TpTennis {
    public static int pPerWin ;
    public static int pointActuel = 0 ;
    public static int echelon = 0 ;
    public static int pointTot = 0;
    public static void main(String[] args) {
        int capDeDep = 0 , numOfDefeats = 0 ,pPerWin = 0 , ranking = 0 , numOfWins = 0 ;
        final int Nc = 1 , _40 = 2 , _30_5 = 3 , _30_4 = 4 , _30_3 = 5 , _30_2 = 6 , _30_1 = 7 ,_30 = 8 ,_15_5 = 9 ,_15_4 = 10 ;
        String offRanking = null;



        System.out.println("Saisissez votre classement \n 1 pour non classé \n 2 pour 40 \n 3 pour 30/5 \n etc...");
        ranking = In.readInteger() ;

        switch (ranking){
            case Nc:
                capDeDep = 0 ;
                numOfWins = 5 ;
                offRanking = "NC" ;
                System.out.println("Veuillez saisir le nombre/s de victoire/s ci-dessous");
                numOfWins = In.readInteger();
                System.out.println("Veillez saisir le nombre/s de défaite ci-dessous");
                numOfDefeats = In.readInteger() ;
                System.out.println("Pour chacun des matchs remportés indiquez l'échelon de votre adversaire");
                for (int i = 1; i <= numOfWins; i++) {
                    echelon = In.readInteger() ;
                    if (echelon == 1){
                        pPerWin = +50 ;

                    } else if (echelon ==2) {
                        pPerWin = +100 ;
                    } else if (echelon == 3){
                        pPerWin = 150 ;
                    } else if (echelon == 4){
                        pPerWin = 150 ;
                    } else if (echelon == 5){
                        pPerWin = 150 ;
                    } else if (echelon == 6){
                        pPerWin = 150 ;
                    } else if (echelon == 7){
                        pPerWin = 150 ;
                    } else if (echelon == 8){
                        pPerWin = 150 ;
                    } else if (echelon == 9){
                        pPerWin = 150 ;
                    } else if (echelon == 10){
                        pPerWin = 150 ;
                    }
                    pointActuel = pPerWin + pointActuel ;
                }
                if (pointTot >= 50){
                    System.out.println("Vous etes resté en " + offRanking);
                } else if (pointTot >= 80) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 150) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 260) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 340) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 410) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 480) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 510) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 580) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 660) {
                    System.out.println("Vous etes montée en " + offRanking);
                }
                break;
            case _40:
                capDeDep = 2 ;
                numOfWins = 5 ;
                offRanking = "40" ;
                for (int i = 1; i <= numOfWins; i++) {
                    echelon = In.readInteger() ;
                    if (echelon == 1){
                        pPerWin = 0 ;
                    } else if (echelon ==2) {
                        pPerWin = 100 ;
                    } else if (echelon == 3){
                        pPerWin = 150 ;
                    } else if (echelon == 4){
                        pPerWin = 150 ;
                    } else if (echelon == 5){
                        pPerWin = 150 ;
                    } else if (echelon == 6){
                        pPerWin = 150 ;
                    } else if (echelon == 7){
                        pPerWin = 150 ;
                    } else if (echelon == 8){
                        pPerWin = 150 ;
                    } else if (echelon == 9){
                        pPerWin = 150 ;
                    } else if (echelon == 10){
                        pPerWin = 150 ;
                    }

                }pointActuel = pointActuel +capDeDep ;
                if (pointTot <= 50){
                    System.out.println("Vous etes déscendu en " + offRanking);
                } else if (pointTot <= 80) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 150) {
                    System.out.println("Vous etes resté en " + offRanking);
                }else if (pointTot >= 260) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 340) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 410) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 480) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 510) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 580) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 660) {
                    System.out.println("Vous etes montée en " + offRanking);
                }
                break;
            case _30_5:
                capDeDep = 5 ;
                numOfWins = 5 ;
                offRanking = "30_5" ;
                System.out.println("Veuillez saisir le nombre/s de victoire/s ci-dessous");
                numOfWins = In.readInteger();
                System.out.println("Veillez saisir le nombre/s de défaite ci-dessous");
                numOfDefeats = In.readInteger() ;
                System.out.println("Pour chacun des matchs remportés indiquez l'échelon de votre adversaire");
                for (int i = 1; i <= numOfWins; i++) {
                    echelon = In.readInteger() ;
                    if (echelon == 1){
                        pPerWin = +50 ;

                    } else if (echelon ==2) {
                        pPerWin = +100 ;
                    } else if (echelon == 3){
                        pPerWin = 150 ;
                    } else if (echelon == 4){
                        pPerWin = 150 ;
                    } else if (echelon == 5){
                        pPerWin = 150 ;
                    } else if (echelon == 6){
                        pPerWin = 150 ;
                    } else if (echelon == 7){
                        pPerWin = 150 ;
                    } else if (echelon == 8){
                        pPerWin = 150 ;
                    } else if (echelon == 9){
                        pPerWin = 150 ;
                    } else if (echelon == 10){
                        pPerWin = 150 ;
                    }
                    pointActuel = pPerWin + pointActuel ;
                }
                if (pointTot >= 50){
                    System.out.println("Vous etes déscendu en " + offRanking);
                } else if (pointTot >= 80) {
                    System.out.println("Vous etes déscendu en " + offRanking);
                }else if (pointTot >= 150) {
                    System.out.println("Vous etes resté en " + offRanking);
                }else if (pointTot >= 260) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 340) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 410) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 480) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 510) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 580) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 660) {
                    System.out.println("Vous etes montée en " + offRanking);
                }
                break;
            case _30_4:
                capDeDep = 10 ;
                numOfWins = 5 ;
                offRanking = "30_4" ;
                System.out.println("Veuillez saisir le nombre/s de victoire/s ci-dessous");
                numOfWins = In.readInteger();
                System.out.println("Veillez saisir le nombre/s de défaite ci-dessous");
                numOfDefeats = In.readInteger() ;
                System.out.println("Pour chacun des matchs remportés indiquez l'échelon de votre adversaire");
                for (int i = 1; i <= numOfWins; i++) {
                    echelon = In.readInteger() ;
                    if (echelon == 1){
                        pPerWin = +50 ;

                    } else if (echelon ==2) {
                        pPerWin = +100 ;
                    } else if (echelon == 3){
                        pPerWin = 150 ;
                    } else if (echelon == 4){
                        pPerWin = 150 ;
                    } else if (echelon == 5){
                        pPerWin = 150 ;
                    } else if (echelon == 6){
                        pPerWin = 150 ;
                    } else if (echelon == 7){
                        pPerWin = 150 ;
                    } else if (echelon == 8){
                        pPerWin = 150 ;
                    } else if (echelon == 9){
                        pPerWin = 150 ;
                    } else if (echelon == 10){
                        pPerWin = 150 ;
                    }
                    pointActuel = pPerWin + pointActuel ;
                }
                if (pointTot >= 50){
                    System.out.println("Vous etes descendu en " + offRanking);
                } else if (pointTot >= 80) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 150) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 260) {
                    System.out.println("Vous etes resté en " + offRanking);
                }else if (pointTot >= 340) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 410) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 480) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 510) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 580) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 660) {
                    System.out.println("Vous etes montée en " + offRanking);
                }
                break;
            case _30_3:
                capDeDep = 20 ;
                numOfWins = 6 ;
                offRanking = "30_3" ;
                System.out.println("Veuillez saisir le nombre/s de victoire/s ci-dessous");
                numOfWins = In.readInteger();
                System.out.println("Veillez saisir le nombre/s de défaite ci-dessous");
                numOfDefeats = In.readInteger() ;
                System.out.println("Pour chacun des matchs remportés indiquez l'échelon de votre adversaire");
                for (int i = 1; i <= numOfWins; i++) {
                    echelon = In.readInteger() ;
                    if (echelon == 1){
                        pPerWin = +50 ;

                    } else if (echelon ==2) {
                        pPerWin = +100 ;
                    } else if (echelon == 3){
                        pPerWin = 150 ;
                    } else if (echelon == 4){
                        pPerWin = 150 ;
                    } else if (echelon == 5){
                        pPerWin = 150 ;
                    } else if (echelon == 6){
                        pPerWin = 150 ;
                    } else if (echelon == 7){
                        pPerWin = 150 ;
                    } else if (echelon == 8){
                        pPerWin = 150 ;
                    } else if (echelon == 9){
                        pPerWin = 150 ;
                    } else if (echelon == 10){
                        pPerWin = 150 ;
                    }
                    pointActuel = pPerWin + pointActuel ;
                }
                if (pointTot >= 50){
                    System.out.println("Vous etes descendu en " + offRanking);
                } else if (pointTot >= 80) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 150) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 260) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 340) {
                    System.out.println("Vous etes resté en " + offRanking);
                }else if (pointTot >= 410) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 480) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 510) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 580) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 660) {
                    System.out.println("Vous etes montée en " + offRanking);
                }
                break;
            case _30_2:
                capDeDep = 30 ;
                numOfWins = 6 ;
                offRanking = "30_2" ;
                System.out.println("Veuillez saisir le nombre/s de victoire/s ci-dessous");
                numOfWins = In.readInteger();
                System.out.println("Veillez saisir le nombre/s de défaite ci-dessous");
                numOfDefeats = In.readInteger() ;
                System.out.println("Pour chacun des matchs remportés indiquez l'échelon de votre adversaire");
                for (int i = 1; i <= numOfWins; i++) {
                    echelon = In.readInteger() ;
                    if (echelon == 1){
                        pPerWin = +50 ;

                    } else if (echelon ==2) {
                        pPerWin = +100 ;
                    } else if (echelon == 3){
                        pPerWin = 150 ;
                    } else if (echelon == 4){
                        pPerWin = 150 ;
                    } else if (echelon == 5){
                        pPerWin = 150 ;
                    } else if (echelon == 6){
                        pPerWin = 150 ;
                    } else if (echelon == 7){
                        pPerWin = 150 ;
                    } else if (echelon == 8){
                        pPerWin = 150 ;
                    } else if (echelon == 9){
                        pPerWin = 150 ;
                    } else if (echelon == 10){
                        pPerWin = 150 ;
                    }
                    pointActuel = pPerWin + pointActuel ;
                }
                if (pointTot >= 50){
                    System.out.println("Vous etes descendu en " + offRanking);
                } else if (pointTot >= 80) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 150) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 260) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 340) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 410) {
                    System.out.println("Vous etes resté en " + offRanking);
                }else if (pointTot >= 480) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 510) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 580) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 660) {
                    System.out.println("Vous etes montée en " + offRanking);
                }
                break;
            case _30_1:
                capDeDep = 50 ;
                numOfWins = 6 ;
                offRanking = "30_1" ;
                System.out.println("Veuillez saisir le nombre/s de victoire/s ci-dessous");
                numOfWins = In.readInteger();
                System.out.println("Veillez saisir le nombre/s de défaite ci-dessous");
                numOfDefeats = In.readInteger() ;
                System.out.println("Pour chacun des matchs remportés indiquez l'échelon de votre adversaire");
                for (int i = 1; i <= numOfWins; i++) {
                    echelon = In.readInteger() ;
                    if (echelon == 1){
                        pPerWin = +50 ;

                    } else if (echelon ==2) {
                        pPerWin = +100 ;
                    } else if (echelon == 3){
                        pPerWin = 150 ;
                    } else if (echelon == 4){
                        pPerWin = 150 ;
                    } else if (echelon == 5){
                        pPerWin = 150 ;
                    } else if (echelon == 6){
                        pPerWin = 150 ;
                    } else if (echelon == 7){
                        pPerWin = 150 ;
                    } else if (echelon == 8){
                        pPerWin = 150 ;
                    } else if (echelon == 9){
                        pPerWin = 150 ;
                    } else if (echelon == 10){
                        pPerWin = 150 ;
                    }
                    pointActuel = pPerWin + pointActuel ;
                }
                if (pointTot >= 50){
                    System.out.println("Vous etes descendu en " + offRanking);
                } else if (pointTot >= 80) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 150) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 260) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 340) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 410) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 480) {
                    System.out.println("Vous etes resté en " + offRanking);
                }else if (pointTot >= 510) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 580) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 660) {
                    System.out.println("Vous etes montée en " + offRanking);
                }
                break;
            case _30:
                capDeDep = 80 ;
                numOfWins = 6 ;
                offRanking = "30" ;
                System.out.println("Veuillez saisir le nombre/s de victoire/s ci-dessous");
                numOfWins = In.readInteger();
                System.out.println("Veillez saisir le nombre/s de défaite ci-dessous");
                numOfDefeats = In.readInteger() ;
                System.out.println("Pour chacun des matchs remportés indiquez l'échelon de votre adversaire");
                for (int i = 1; i <= numOfWins; i++) {
                    echelon = In.readInteger() ;
                    if (echelon == 1){
                        pPerWin = +50 ;

                    } else if (echelon ==2) {
                        pPerWin = +100 ;
                    } else if (echelon == 3){
                        pPerWin = 150 ;
                    } else if (echelon == 4){
                        pPerWin = 150 ;
                    } else if (echelon == 5){
                        pPerWin = 150 ;
                    } else if (echelon == 6){
                        pPerWin = 150 ;
                    } else if (echelon == 7){
                        pPerWin = 150 ;
                    } else if (echelon == 8){
                        pPerWin = 150 ;
                    } else if (echelon == 9){
                        pPerWin = 150 ;
                    } else if (echelon == 10){
                        pPerWin = 150 ;
                    }
                    pointActuel = pPerWin + pointActuel ;
                }
                if (pointTot >= 50){
                    System.out.println("Vous etes descendu en " + offRanking);
                } else if (pointTot >= 80) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 150) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 260) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 340) {
                    System.out.println("Vous etes decsendu en " + offRanking);
                }else if (pointTot >= 410) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 480) {
                    System.out.println("Vous etes decsendu en " + offRanking);
                }else if (pointTot >= 510) {
                    System.out.println("Vous etes resté en " + offRanking);
                }else if (pointTot >= 580) {
                    System.out.println("Vous etes montée en " + offRanking);
                }else if (pointTot >= 660) {
                    System.out.println("Vous etes montée en " + offRanking);
                }
                break;
            case _15_5:
                capDeDep = 120 ;
                numOfWins = 6 ;
                offRanking = "15_5" ;
                System.out.println("Veuillez saisir le nombre/s de victoire/s ci-dessous");
                numOfWins = In.readInteger();
                System.out.println("Veillez saisir le nombre/s de défaite ci-dessous");
                numOfDefeats = In.readInteger() ;
                System.out.println("Pour chacun des matchs remportés indiquez l'échelon de votre adversaire");
                for (int i = 1; i <= numOfWins; i++) {
                    echelon = In.readInteger() ;
                    if (echelon == 1){
                        pPerWin = +50 ;

                    } else if (echelon ==2) {
                        pPerWin = +100 ;
                    } else if (echelon == 3){
                        pPerWin = 150 ;
                    } else if (echelon == 4){
                        pPerWin = 150 ;
                    } else if (echelon == 5){
                        pPerWin = 150 ;
                    } else if (echelon == 6){
                        pPerWin = 150 ;
                    } else if (echelon == 7){
                        pPerWin = 150 ;
                    } else if (echelon == 8){
                        pPerWin = 150 ;
                    } else if (echelon == 9){
                        pPerWin = 150 ;
                    } else if (echelon == 10){
                        pPerWin = 150 ;
                    }
                    pointActuel = pPerWin + pointActuel ;
                }
                if (pointTot >= 50){
                    System.out.println("Vous etes descendu en " + offRanking);
                } else if (pointTot >= 80) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 150) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 260) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 340) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 410) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 480) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 510) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 580) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 660) {
                    System.out.println("Vous etes resté en " + offRanking);
                }
                break;
            case _15_4:
                capDeDep = 120 ;
                numOfWins = 6 ;
                offRanking = "15_5" ;
                System.out.println("Veuillez saisir le nombre/s de victoire/s ci-dessous");
                numOfWins = In.readInteger();
                System.out.println("Veillez saisir le nombre/s de défaite ci-dessous");
                numOfDefeats = In.readInteger() ;
                System.out.println("Pour chacun des matchs remportés indiquez l'échelon de votre adversaire");
                for (int i = 1; i <= numOfWins; i++) {
                    echelon = In.readInteger() ;
                    if (echelon == 1){
                        pPerWin = +50 ;

                    } else if (echelon ==2) {
                        pPerWin = +100 ;
                    } else if (echelon == 3){
                        pPerWin = 150 ;
                    } else if (echelon == 4){
                        pPerWin = 150 ;
                    } else if (echelon == 5){
                        pPerWin = 150 ;
                    } else if (echelon == 6){
                        pPerWin = 150 ;
                    } else if (echelon == 7){
                        pPerWin = 150 ;
                    } else if (echelon == 8){
                        pPerWin = 150 ;
                    } else if (echelon == 9){
                        pPerWin = 150 ;
                    } else if (echelon == 10){
                        pPerWin = 150 ;
                    }
                    pointActuel = pPerWin + pointActuel ;
                }
                if (pointTot >= 50){
                    System.out.println("Vous etes descendu en " + offRanking);
                } else if (pointTot >= 80) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 150) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 260) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 340) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 410) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 480) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 510) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 580) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }else if (pointTot >= 660) {
                    System.out.println("Vous etes descendu en " + offRanking);
                }
        }
        System.out.println("Votre classelent est " + offRanking + " et votre nombres de points en total est " + CalculateTotalPoints(pointTot));
    }
    public static int CalculateTotalPoints ( int capDeDep){
        pointTot =  (pPerWin * echelon) + capDeDep + pointActuel ;
    return pointTot ;
    }
}

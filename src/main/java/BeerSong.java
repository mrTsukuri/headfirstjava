/**
 * Created by Wade on 09.08.2015.
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        int startBeerNum = beerNum;
        String word = "бутылок(бутылки)";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "бутылка";
            }
            if (beerNum != startBeerNum) {
                System.out.println(" ");
            }

            System.out.println(beerNum + " " + word + " пива на столе");
//            System.out.println(beerNum + " " + word + " пива");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + "пива на столе");
            }
//            if (beerNum > 0) {
//
        }

        System.out.println("Нет бутылок на столе");
    }
}







/**
 * Created by Wade on 09.08.2015.
 */

public class beerSong2 {
    public static String getEnd(int numb) {
        if ((numb - 1) % 10 == 0) {
            return "ка";
        } else {
            return "ки";
        }
    }

    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бутыл";

        while (beerNum > 0) {
            System.out.println(beerNum + " " + word + getEnd(beerNum) + " пива на столе.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
        }
        System.out.println("Нет бутылок пива на столе");


    }
}
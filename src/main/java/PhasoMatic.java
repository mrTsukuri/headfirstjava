/**
 * Created by Wade on 09.08.2015.
 */
public class PhasoMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"умный", "сильный", "ловкий", "уворотливый", "выносливый", "веселый", "синий", "красивый", "осений"};
        String[] wordListTwo = {"морской", "горный", "сиреневый", "волшебный", "современный", "скучный", "солнечный", "растительны", "чистый"};
        String[] wordListThree = {"паук", "машина", "работа", "телефон", "граница", "укус", "радуга", "цветение", "выключатель"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все, что нам нужно, - это " + phrase);



    }


}

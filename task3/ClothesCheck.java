import java.util.Arrays;
public class ClothesCheck {
    public static void main(String[] args) {

        for(Size size: Size.values()) {
            System.out.println(size);
        }

        Size xxs = Size.XXS;
        Size m = Size.M;
        System.out.println(xxs.getDiscription());
        System.out.println(m.getDiscription());


        T_Shirt tShirt = new T_Shirt(Size.L, "blue", 2000);
        Trousers trousers = new Trousers(Size.XXS, "pink", 3000);
        Skirt skirt = new Skirt(Size.M, "green", 5000);
        Tie tie = new Tie(Size.S, "orange", 500);

        Clothes[] clothes = {tShirt, trousers, skirt, tie};

        Atelier atelier = new Atelier();
        System.out.println("Перечень женской одежы: ");
        Atelier.dressTheWoman(clothes);
        System.out.println();

        System.out.println("Перечень мужской одежы: ");
        Atelier.dressTheMan(clothes);
        System.out.println();
    }
}

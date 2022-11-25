public abstract class Clothes {
    Size size;
    String color;
    int price;
    String name;

    Clothes(Size size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }
}

class T_Shirt extends Clothes implements MenClothes, WomenClothes {
    public T_Shirt(Size size, String color, int price) {
        super(size, color, price);
        this.name = "T-Shirt";
    }
    @Override
    public void dressTheMan(){
        System.out.println("Man dress the " + name);
    }
    @Override
    public void dressTheWoman(){
        System.out.println("Woman dress the " + name);
    }
}

class Trousers extends Clothes implements MenClothes, WomenClothes {
    public Trousers(Size size, String color, int price) {
        super(size, color, price);
        this.name = "Trousers";
    }
    @Override
    public void dressTheMan() {
        System.out.println("Man dress the " + name);
    }
    @Override
    public void dressTheWoman(){
        System.out.println("Woman dress the " + name);
    }
}

class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, String color, int price) {
        super(size, color, price);
        this.name = "Skirt";
    }
    @Override
    public void dressTheWoman(){
        System.out.println("Woman dress the " + name);
    }
}

class Tie extends Clothes implements MenClothes {
    public Tie(Size size, String color, int price) {
        super(size, color, price);
        this.name = "Tie";
    }
    @Override
    public void dressTheMan() {
        System.out.println("Man dress the " + name);
    }
}

class Atelier {
    public static void dressTheMan(Clothes clothes[]) {
        for(Clothes cloth: clothes) {
            if(cloth instanceof MenClothes) {
                System.out.println(cloth.name + " " + cloth.size + " " + cloth.color + " " + cloth.price);
            }
        }
    }

    public static void dressTheWoman(Clothes clothes[]) {
        for(Clothes cloth: clothes) {
            if(cloth instanceof WomenClothes) {
                System.out.println(cloth.name + " " + cloth.size + " " + cloth.color + " " + cloth.price);
            }
        }
    }
}



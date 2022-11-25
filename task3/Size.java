public enum Size {
    XXS("XXS",32),
    XS("XS",34),
    S("S",36),
    M("M",38),
    L("L",40);

    private final String name;
    private final int euroSize;

    Size(String name, int euroSize) {
        this.name = name;
        this.euroSize = euroSize;
    }

    public static final String NAME_OF_SIZE = "XXS";

    public String getDiscription() {
        if (name.equals(NAME_OF_SIZE)) {
            return "Детский размер";
        } else {
            return "Взрослый размер";
        }
    }
}





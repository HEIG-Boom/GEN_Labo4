package ch.heigvd.gen.labo4;

public enum Size {
    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XL("XL"),
    XXL("XXL"),
    INVALID("Invalid Size");

    private String name;

    Size(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

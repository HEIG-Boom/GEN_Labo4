package ch.heigvd.gen.labo4.color;

public abstract class Color {
    String name;

    public Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

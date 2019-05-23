package ch.heigvd.gen.labo4;

import ch.heigvd.gen.labo4.color.Color;

public class Product {
    private static final int SIZE_NOT_APPLICABLE = -1;
    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public static int getSizeNotApplicable() {
        return SIZE_NOT_APPLICABLE;
    }

    public String getCode() {
        return code;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getSizeFor() {
        return size.toString();
    }

    String getColor() {
        return color.toString();
    }

    public void getProductContent(StringBuffer sb) {
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");

        sb.append(getColor());
        sb.append("\", ");

        if (getSize() != Size.INVALID) {
            sb.append("\"size\": \"");
            sb.append(getSizeFor());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(getCurrency());
        sb.append("\"}, ");
    }
}
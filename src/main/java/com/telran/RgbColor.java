package com.telran;

import java.util.Objects;

public class RgbColor {
    private int red;
    private int green;
    private  int blue;

    public RgbColor() {

    }

    public RgbColor (int red, int green, int blue){
        if(red>=0 && red<=255
        && green>=0 && green <=255
        && blue>=0 &&blue<=255){
            this.red=red;
            this.green=green;
            this.blue= blue;
        }

    }

    public RgbColor (RgbColor other){
        this.red= other.red;
        this.blue= other.blue;
        this.green=other.green;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
    private boolean isValid(int color){
        return color>=0&&color<=255;
    }

    public void setRed(int num) {
        if(isValid(num)) {
            this.red = num;
        }
    }

    public void setGreen(int num) {
        if(isValid(num)) {
            this.green = num;
        }
    }

    public void setBlue(int num) {
        if(isValid(num)) {
            this.blue = num;
        }
    }

    @Override
    public String toString() {
        return String.format("(%d,%d,%d)",red,green,blue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if(!(o instanceof RgbColor)){
            return false;
        }
        RgbColor color = (RgbColor) o;
        return red == color.red && green == color.green && blue == color.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    public void mix (RgbColor other){
        red = (red+other.red)/2;
        green = (green+other.green)/2;
        blue=(blue+other.blue)/2;
    }
   public double  convertToGrayscale (){
     return blue*0.11;
   }
   public void invert(){
        red= 255-red;
        green= 255-green;
        blue= 255-blue;
   }
}

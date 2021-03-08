package com.telran;

public class LightBulb {
    private RgbColor color;
    private boolean switchedOn;

    public LightBulb (int red, int green, int blue){
        color = new RgbColor(red,green,blue);
       // switchedOn= false;
    }
    public LightBulb (RgbColor color){
        this.color=color;
        // switchedOn= false;
    }

    public LightBulb (LightBulb lightBulb){
        this.color=lightBulb.color;
        switchedOn= lightBulb.switchedOn;
    }
    public RgbColor getColor(){
        return color;
    }
    public void setColor(RgbColor color){
        this.color=color;
    }

    public boolean isSwitchedOn(){
        return switchedOn;
    }

    @Override
    public String toString() {
        return color +" " +(switchedOn ? "On" : "Off");
    }

   public void switchLight (){
        switchedOn=!switchedOn;
   }
}

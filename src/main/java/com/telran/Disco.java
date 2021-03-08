package com.telran;

public class Disco {
    private LightBulb [] array ;
           // = new LightBulb[4];

    public Disco(LightBulb b1, LightBulb b2, LightBulb b3, LightBulb b4){
        array = new LightBulb[]{b1,b2,b3,b4};
    }

    public LightBulb getFirstBulb (){
        return array[0];
    }
    public LightBulb getSecondBulb (){
        return array[1];
    }
    public LightBulb getThirdBulb (){
        return array[2];
    }
    public LightBulb getFourthBulb (){
        return array[3];
    }
    public void switchBulb (int num){
        if(num>0 && num<5){
            array[num-1].switchLight();
        }

    }
    public void turnAllOn (){
        for(LightBulb bulb:array){
            if(!bulb.isSwitchedOn()){
                bulb.switchLight();
            }
        }
    }
    public void turnAlloff (){
        for(LightBulb bulb:array){
            if(bulb.isSwitchedOn()){
                bulb.switchLight();
            }
        }
    }

    public boolean areAllOn (){
        return array[0].isSwitchedOn()
                && array[1].isSwitchedOn()
                && array[2].isSwitchedOn()
                && array[3].isSwitchedOn();
    }
    public boolean areAllOff (){
        return !array[0].isSwitchedOn()
                && !array[1].isSwitchedOn()
                && !array[2].isSwitchedOn()
                && !array[3].isSwitchedOn();
    }
    public boolean allSameColor (){
        RgbColor color =array[0].getColor();
        for (int i=1; i<array.length; i++){
            if(!color.equals(array[i].getColor())){
                return false;
            }
        }
        return  true;
    }
}

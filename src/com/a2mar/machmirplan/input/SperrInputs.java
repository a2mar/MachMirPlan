package com.a2mar.machmirplan.input;


import com.a2mar.machmirplan.data.days.TagesElement;

import java.util.ArrayList;

public class SperrInputs {

    private ArrayList<TagesElement> sperrListe;
    private boolean[] boolArray;

    public SperrInputs(){
        createBoolArray();
        createList();
    }

    private void createBoolArray() {
        boolArray = new boolean[62];

        for(int i = 0; i<63; i++){
            if(i%4==0){
                boolArray[i]= true;
            }
            if(i%3 == 0){
                boolArray[i]= true;
            }
        }
    }

    private void createList() {
        sperrListe = new ArrayList<TagesElement>();
        for(int i = 0; i<62; i = i+2){
            TagesElement eTag = new TagesElement(boolArray[i], boolArray[i+1]);
            sperrListe.add(eTag);
        }
    }
}

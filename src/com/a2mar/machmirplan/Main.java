package com.a2mar.machmirplan;

import com.a2mar.machmirplan.data.workers.Allrounder;
import com.a2mar.machmirplan.input.SperrInputs;

public class Main {


    public static Allrounder iAllrounder;

    public static void main(String[] args) {
        iAllrounder = new Allrounder(new SperrInputs());
        System.out.println("ok. ok.");
    }
}
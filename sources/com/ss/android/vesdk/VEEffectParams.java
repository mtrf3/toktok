package com.ss.android.vesdk;

import X.X1D;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public class VEEffectParams {
    public static int EFFECT_TYPE_APPEND_COMPOSER = 6;
    public static int EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG = 2;
    public static int EFFECT_TYPE_RELOAD_COMPOSER = 5;
    public static int EFFECT_TYPE_RELOAD_COMPOSER_WITH_TAG = 1;
    public static int EFFECT_TYPE_REMOVE_COMPOSER = 9;
    public static int EFFECT_TYPE_REPLACE_COMPOSER = 7;
    public static int EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG = 3;
    public static int EFFECT_TYPE_SET_COMPOSER = 4;
    public static int EFFECT_TYPE_SET_COMPOSER_WITH_TAG = 0;
    public static int EFFECT_TYPE_UPDATE_COMPOSER = 8;
    public int TYPE;
    public boolean boolValueOne;
    public boolean boolValueThree;
    public boolean boolValueTwo;
    public float floatValueOne;
    public float floatValueThree;
    public float floatValueTwo;
    public int intValueOne;
    public int intValueThree;
    public int intValueTwo;
    public String stringValueOne = "";
    public String stringValueTwo = "";
    public String stringValueThree = "";
    public ArrayList<Integer> intArrayValue = new ArrayList<>();
    public ArrayList<Float> floatArrayValue = new ArrayList<>();
    public ArrayList<Boolean> boolArrayValue = new ArrayList<>();
    public ArrayList<String> stringArrayOne = new ArrayList<>();
    public ArrayList<String> stringArrayTwo = new ArrayList<>();
    public ArrayList<String> stringArrayThree = new ArrayList<>();

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type:");
        LIZ.append(this.TYPE);
        LIZ.append(" int1: ");
        LIZ.append(this.intValueOne);
        LIZ.append(" int2: ");
        LIZ.append(this.intValueTwo);
        LIZ.append(" int3: ");
        LIZ.append(this.intValueThree);
        LIZ.append(" float1: ");
        LIZ.append(this.floatValueOne);
        LIZ.append(" float2: ");
        LIZ.append(this.floatValueTwo);
        LIZ.append(" float3: ");
        LIZ.append(this.floatValueThree);
        LIZ.append(" bool1: ");
        LIZ.append(this.boolValueOne);
        LIZ.append(" bool2: ");
        LIZ.append(this.boolValueTwo);
        LIZ.append(" bool3: ");
        LIZ.append(this.boolValueThree);
        LIZ.append(" string1: ");
        LIZ.append(this.stringValueOne);
        LIZ.append(" string2: ");
        LIZ.append(this.stringValueTwo);
        LIZ.append(" string3: ");
        LIZ.append(this.stringValueThree);
        LIZ.append(" intA: ");
        LIZ.append(this.intArrayValue.toString());
        LIZ.append(" floatA: ");
        LIZ.append(this.floatArrayValue.toString());
        LIZ.append(" boolA: ");
        LIZ.append(this.boolArrayValue.toString());
        LIZ.append(" stringA1: ");
        LIZ.append(this.stringArrayOne.toString());
        LIZ.append(" stringA2: ");
        LIZ.append(this.stringArrayTwo.toString());
        LIZ.append(" stringA3: ");
        LIZ.append(this.stringArrayThree.toString());
        return X1D.LIZIZ(LIZ);
    }
}

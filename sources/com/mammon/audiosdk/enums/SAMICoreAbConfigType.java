package com.mammon.audiosdk.enums;

import X.V0N;
import java.util.HashMap;

/* loaded from: classes2.dex */
public enum SAMICoreAbConfigType {
    UnknownType(0),
    IntType(1),
    FloatType(2),
    StringType(3),
    BoolType(4);

    public static final HashMap<Integer, SAMICoreAbConfigType> intToEnumMap = new HashMap<>();
    public int value;

    static {
        for (SAMICoreAbConfigType sAMICoreAbConfigType : values()) {
            intToEnumMap.put(Integer.valueOf(sAMICoreAbConfigType.getValue()), sAMICoreAbConfigType);
        }
    }

    public int getValue() {
        return this.value;
    }

    public static SAMICoreAbConfigType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public static SAMICoreAbConfigType valueOf(String str) {
        return (SAMICoreAbConfigType) V0N.LJJJ(SAMICoreAbConfigType.class, str);
    }

    SAMICoreAbConfigType(int i) {
        this.value = i;
    }
}

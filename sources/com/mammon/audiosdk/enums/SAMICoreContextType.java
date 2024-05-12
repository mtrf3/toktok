package com.mammon.audiosdk.enums;

import X.V0N;
import java.util.HashMap;

/* loaded from: classes2.dex */
public enum SAMICoreContextType {
    SAMICoreContextType_Lic_Auth(0),
    TokenVerifyOnlineContext(1),
    TokenVerifyOfflineContext(2),
    TokenVerifyMixedContext(3),
    SAMICoreContextType_AbConfig(4);

    public static final HashMap<Integer, SAMICoreContextType> intToEnumMap = new HashMap<>();
    public int value;

    static {
        for (SAMICoreContextType sAMICoreContextType : values()) {
            intToEnumMap.put(Integer.valueOf(sAMICoreContextType.getValue()), sAMICoreContextType);
        }
    }

    public int getValue() {
        return this.value;
    }

    public static SAMICoreContextType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public static SAMICoreContextType valueOf(String str) {
        return (SAMICoreContextType) V0N.LJJJ(SAMICoreContextType.class, str);
    }

    SAMICoreContextType(int i) {
        this.value = i;
    }
}

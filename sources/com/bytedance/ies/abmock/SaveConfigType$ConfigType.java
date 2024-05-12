package com.bytedance.ies.abmock;

import X.V0N;

/* loaded from: classes7.dex */
public enum SaveConfigType$ConfigType {
    BOOLEAN,
    INT,
    LONG,
    DOUBLE,
    FLOAT,
    STRING,
    STRING_ARRAY,
    OBJECT;

    public static SaveConfigType$ConfigType valueOf(String str) {
        return (SaveConfigType$ConfigType) V0N.LJJJ(SaveConfigType$ConfigType.class, str);
    }
}

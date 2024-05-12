package com.ss.android.ugc.effectmanager;

import X.V0N;

/* loaded from: classes16.dex */
public enum FetchModelType {
    ORIGIN(0),
    ZIP(1);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static FetchModelType fromValue(int i) {
        for (FetchModelType fetchModelType : values()) {
            if (fetchModelType.value == i) {
                return fetchModelType;
            }
        }
        return ORIGIN;
    }

    public static FetchModelType valueOf(String str) {
        return (FetchModelType) V0N.LJJJ(FetchModelType.class, str);
    }

    FetchModelType(int i) {
        this.value = i;
    }
}

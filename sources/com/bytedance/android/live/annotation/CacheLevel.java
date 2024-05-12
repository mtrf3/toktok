package com.bytedance.android.live.annotation;

import X.V0N;

/* loaded from: classes.dex */
public enum CacheLevel {
    DID(1);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static CacheLevel valueOf(String str) {
        return (CacheLevel) V0N.LJJJ(CacheLevel.class, str);
    }

    CacheLevel(int i) {
        this.value = i;
    }
}

package com.bytedance.bmf;

import X.V0N;

/* loaded from: classes34.dex */
public enum OpaqueDataKey {
    kJsonParam(2);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static OpaqueDataKey valueOf(String str) {
        return (OpaqueDataKey) V0N.LJJJ(OpaqueDataKey.class, str);
    }

    OpaqueDataKey(int i) {
        this.value = i;
    }
}

package com.bytedance.sdk.xbridge.registry.core.annotation;

import X.V0N;

/* loaded from: classes7.dex */
public enum DefaultType {
    STRING,
    DOUBLE,
    INT,
    LONG,
    BOOL,
    NONE;

    public static DefaultType valueOf(String str) {
        return (DefaultType) V0N.LJJJ(DefaultType.class, str);
    }
}

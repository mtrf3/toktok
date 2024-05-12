package com.bytedance.ies.bullet.kit.lynx.api;

import X.V0N;

/* loaded from: classes7.dex */
public enum BulletReadableType {
    Null,
    Boolean,
    Int,
    Number,
    String,
    Map,
    Array;

    public static BulletReadableType valueOf(String str) {
        return (BulletReadableType) V0N.LJJJ(BulletReadableType.class, str);
    }
}

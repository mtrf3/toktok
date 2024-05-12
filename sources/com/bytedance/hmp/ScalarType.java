package com.bytedance.hmp;

import X.V0N;

/* loaded from: classes34.dex */
public enum ScalarType {
    kUInt8(0),
    kInt(1),
    kUInt16(2),
    kInt16(3),
    kInt32(4),
    kInt64(5),
    kFloat32(6),
    kFloat64(7),
    kHalf(8);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static ScalarType valueOf(String str) {
        return (ScalarType) V0N.LJJJ(ScalarType.class, str);
    }

    ScalarType(int i) {
        this.value = i;
    }
}

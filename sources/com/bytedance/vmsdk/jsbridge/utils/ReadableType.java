package com.bytedance.vmsdk.jsbridge.utils;

import X.V0N;

/* loaded from: classes7.dex */
public enum ReadableType {
    Null,
    Boolean,
    Int,
    Number,
    String,
    Map,
    Array,
    Long,
    ByteArray,
    NativeHostObject;

    public static ReadableType valueOf(String str) {
        return (ReadableType) V0N.LJJJ(ReadableType.class, str);
    }
}

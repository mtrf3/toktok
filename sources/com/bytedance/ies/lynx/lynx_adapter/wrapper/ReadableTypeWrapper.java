package com.bytedance.ies.lynx.lynx_adapter.wrapper;

import X.V0N;

/* loaded from: classes7.dex */
public enum ReadableTypeWrapper {
    Null,
    Boolean,
    Int,
    Number,
    String,
    Map,
    Array,
    Long,
    ByteArray;

    public static ReadableTypeWrapper valueOf(String str) {
        return (ReadableTypeWrapper) V0N.LJJJ(ReadableTypeWrapper.class, str);
    }
}

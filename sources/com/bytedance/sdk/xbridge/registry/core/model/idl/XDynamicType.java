package com.bytedance.sdk.xbridge.registry.core.model.idl;

import X.V0N;

/* loaded from: classes14.dex */
public enum XDynamicType {
    Null,
    Boolean,
    Int,
    Number,
    String,
    Map,
    Array,
    Long,
    ByteArray;

    public static XDynamicType valueOf(String str) {
        return (XDynamicType) V0N.LJJJ(XDynamicType.class, str);
    }
}

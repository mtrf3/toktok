package com.kakao.sdk.user.model;

import X.V0N;

/* loaded from: classes2.dex */
public enum ShippingAddressType {
    OLD,
    NEW,
    UNKNOWN;

    public static ShippingAddressType valueOf(String str) {
        return (ShippingAddressType) V0N.LJJJ(ShippingAddressType.class, str);
    }
}

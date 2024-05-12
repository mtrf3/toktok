package com.amazon.device.iap.model;

import X.V0N;

/* loaded from: classes.dex */
public enum ProductType {
    CONSUMABLE,
    ENTITLED,
    SUBSCRIPTION;

    public static ProductType valueOf(String str) {
        return (ProductType) V0N.LJJJ(ProductType.class, str);
    }
}

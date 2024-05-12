package com.amazon.device.iap.model;

import X.V0N;

/* loaded from: classes.dex */
public enum FulfillmentResult {
    FULFILLED,
    UNAVAILABLE;

    public static FulfillmentResult valueOf(String str) {
        return (FulfillmentResult) V0N.LJJJ(FulfillmentResult.class, str);
    }
}

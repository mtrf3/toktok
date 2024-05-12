package com.bytedance.globalpayment.iap.common.ability.model.enums;

import X.V0N;

/* loaded from: classes14.dex */
public enum PayType {
    UNKNOWN,
    PRE,
    NOMAL,
    EXTRA_TOKEN,
    EXTRA_QUERY,
    CAIJING_CALLBACK,
    CAIJING_TOKEN;

    public static PayType valueOf(String str) {
        return (PayType) V0N.LJJJ(PayType.class, str);
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto;

import X.V0N;

/* loaded from: classes6.dex */
public enum OrderEntranceType {
    UNKNOWN,
    OPEN,
    CLOSE;

    public static OrderEntranceType valueOf(String str) {
        return (OrderEntranceType) V0N.LJJJ(OrderEntranceType.class, str);
    }
}

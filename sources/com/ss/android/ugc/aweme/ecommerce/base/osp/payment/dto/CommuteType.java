package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.V0N;

/* loaded from: classes11.dex */
public enum CommuteType {
    APP,
    WAP,
    SDK,
    SECRET_FREE,
    WAP_TO_APP,
    WAP_FILTER_APP,
    SECRET_FREE_APP,
    WAP_BOLETO_PIX;

    public static CommuteType valueOf(String str) {
        return (CommuteType) V0N.LJJJ(CommuteType.class, str);
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.V0N;

/* loaded from: classes13.dex */
public enum PayResult {
    DONE,
    REDIRECT,
    NEED_INFO,
    IS_DEEPLINK,
    ERROR,
    PENDING,
    NEED_VERIFY;

    public static PayResult valueOf(String str) {
        return (PayResult) V0N.LJJJ(PayResult.class, str);
    }
}

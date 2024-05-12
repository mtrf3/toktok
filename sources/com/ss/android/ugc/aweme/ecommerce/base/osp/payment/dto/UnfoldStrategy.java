package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.V0N;

/* loaded from: classes5.dex */
public enum UnfoldStrategy {
    NOT_SUB_PAYMENT,
    SUB_PAYMENT_FOLD_BELOW,
    SUB_PAYMENT_FOLD_SEPARATE;

    public static UnfoldStrategy valueOf(String str) {
        return (UnfoldStrategy) V0N.LJJJ(UnfoldStrategy.class, str);
    }
}

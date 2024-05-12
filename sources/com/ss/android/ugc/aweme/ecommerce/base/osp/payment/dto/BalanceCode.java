package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.V0N;

/* loaded from: classes3.dex */
public enum BalanceCode {
    NO_BALANCE,
    BALANCE_SUFFICIENT,
    BALANCE_INSUFFICIENT;

    public static BalanceCode valueOf(String str) {
        return (BalanceCode) V0N.LJJJ(BalanceCode.class, str);
    }
}

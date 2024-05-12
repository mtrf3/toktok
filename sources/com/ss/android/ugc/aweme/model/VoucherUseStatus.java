package com.ss.android.ugc.aweme.model;

import X.V0N;

/* loaded from: classes5.dex */
public enum VoucherUseStatus {
    NO_VOUCHER_USED,
    VOUCHER_UNAVAILABLE,
    VOUCHER_SUCCESS;

    public static VoucherUseStatus valueOf(String str) {
        return (VoucherUseStatus) V0N.LJJJ(VoucherUseStatus.class, str);
    }
}

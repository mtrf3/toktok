package com.ss.android.ugc.aweme.model;

import X.V0N;

/* loaded from: classes5.dex */
public enum VoucherStatus {
    UNKNOWN,
    UNCLAIMED,
    CLAIMED,
    USED,
    EXPIRED;

    public static VoucherStatus valueOf(String str) {
        return (VoucherStatus) V0N.LJJJ(VoucherStatus.class, str);
    }
}

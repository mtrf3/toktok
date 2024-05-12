package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.V0N;

/* loaded from: classes2.dex */
public enum BindStatusCode {
    SUCCESS,
    ERROR,
    BINDING,
    UNKNOWN;

    public static BindStatusCode valueOf(String str) {
        return (BindStatusCode) V0N.LJJJ(BindStatusCode.class, str);
    }
}

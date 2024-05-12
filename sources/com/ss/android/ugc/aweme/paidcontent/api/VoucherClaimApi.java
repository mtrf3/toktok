package com.ss.android.ugc.aweme.paidcontent.api;

import X.A3J;
import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public interface VoucherClaimApi {
    public static final A3J LIZ = A3J.LIZ;

    @E4T("tiktok/v1/paid_content/voucher/claim")
    AbstractC73672Svk<BaseResponse> publishVoucherClaim(@InterfaceC64989Pez("voucher_id") Long l, @InterfaceC64989Pez("collection_id") Long l2);
}

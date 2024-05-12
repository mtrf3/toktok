package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ClaimVoucherResponse extends Response<ClaimVoucherResponseData> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimVoucherResponse(int i, String message, ClaimVoucherResponseData claimVoucherResponseData) {
        super(i, message, claimVoucherResponseData, null, 8, null);
        o.LJIIIZ(message, "message");
    }
}

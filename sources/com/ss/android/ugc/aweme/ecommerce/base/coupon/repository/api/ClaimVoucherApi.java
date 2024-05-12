package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.api;

import X.AbstractC73672Svk;
import X.C69961Rcz;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FollowAndClaimVoucherRequest;

/* loaded from: classes13.dex */
public interface ClaimVoucherApi {
    public static final C69961Rcz LIZ = C69961Rcz.LIZ;

    @E4T("/api/v1/shop/voucher/claim")
    Object claimPlatformVoucher(@InterfaceC27211Am7 ClaimVoucherRequest claimVoucherRequest, InterfaceC67352kd<? super ClaimVoucherResponse> interfaceC67352kd);

    @E4T("/api/v1/shop/voucher/claim")
    AbstractC73672Svk<ClaimVoucherResponse> claimVoucher(@InterfaceC27211Am7 ClaimVoucherRequest claimVoucherRequest);

    @E4T("aweme/v1/oec/live/short_touch/interactive_voucher/claim")
    AbstractC73672Svk<ClaimVoucherResponse> followAndClaimVoucher(@InterfaceC27211Am7 FollowAndClaimVoucherRequest followAndClaimVoucherRequest);
}

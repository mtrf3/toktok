package com.ss.android.ugc.aweme.qrcode.api;

import X.C76L;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes2.dex */
public interface CouponRedeemApi$RetroApi {
    @E8L("/aweme/v2/coupon/qrcode/detail/")
    C76L<Object> getCouponDetail(@InterfaceC64986Pew("code_id") String str, @InterfaceC64986Pew("source") int i);

    @E8L("/aweme/v2/coupon/validate/")
    C76L<Object> redeemCoupon(@InterfaceC64986Pew("code_id") String str);
}

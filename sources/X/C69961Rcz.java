package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.api.ClaimVoucherApi;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherRequest;

/* renamed from: X.Rcz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69961Rcz {
    public static final /* synthetic */ C69961Rcz LIZ = new C69961Rcz();
    public static final InterfaceC789838c LIZIZ = C40084FoG.LIZIZ("https://oec-api.tiktokv.com/");

    public static C73454SsE LIZ(ClaimVoucherRequest claimVoucherRequest) {
        return ((ClaimVoucherApi) LIZIZ.create(ClaimVoucherApi.class)).claimVoucher(claimVoucherRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }
}

package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CouponDetailData_ProtoDecoder implements InterfaceC31105CIr<CouponDetailData> {
    public static CouponDetailData LIZIZ(Q9H q9h) {
        CouponDetailData couponDetailData = new CouponDetailData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        couponDetailData.deprecated2 = Q9J.LIZIZ(q9h);
                    }
                } else {
                    couponDetailData.deprecated1 = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return couponDetailData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CouponDetailData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

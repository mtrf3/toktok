package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.QueryOrderResult;

/* loaded from: classes14.dex */
public final class _QueryOrderResult_CouponDetailData_ProtoDecoder implements InterfaceC31105CIr<QueryOrderResult.CouponDetailData> {
    public static QueryOrderResult.CouponDetailData LIZIZ(Q9H q9h) {
        QueryOrderResult.CouponDetailData couponDetailData = new QueryOrderResult.CouponDetailData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        couponDetailData.discount = Q9J.LIZIZ(q9h);
                    }
                } else {
                    couponDetailData.product = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return couponDetailData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QueryOrderResult.CouponDetailData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

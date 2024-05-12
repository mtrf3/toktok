package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.wallet.tiktok.QueryOrderResult;

/* loaded from: classes14.dex */
public final class _QueryOrderResult_ChargeOrderExtra_ProtoDecoder implements InterfaceC31105CIr<QueryOrderResult.ChargeOrderExtra> {
    public static QueryOrderResult.ChargeOrderExtra LIZIZ(Q9H q9h) {
        QueryOrderResult.ChargeOrderExtra chargeOrderExtra = new QueryOrderResult.ChargeOrderExtra();
        chargeOrderExtra.couponDetail = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    chargeOrderExtra.kycIncentive = _QueryOrderResult_KYCIncentive_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                chargeOrderExtra.couponDetail.add(_QueryOrderResult_CouponDetailData_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            chargeOrderExtra.couponDescription = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        chargeOrderExtra.coupon = Q9J.LIZIZ(q9h);
                    }
                } else {
                    chargeOrderExtra.ployId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return chargeOrderExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QueryOrderResult.ChargeOrderExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.QueryOrderResult;

/* loaded from: classes14.dex */
public final class _QueryOrderResult_ChargeOrderData_ProtoDecoder implements InterfaceC31105CIr<QueryOrderResult.ChargeOrderData> {
    public static QueryOrderResult.ChargeOrderData LIZIZ(Q9H q9h) {
        QueryOrderResult.ChargeOrderData chargeOrderData = new QueryOrderResult.ChargeOrderData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        chargeOrderData.extra = Q9J.LIZIZ(q9h);
                    }
                } else {
                    chargeOrderData.status = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return chargeOrderData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QueryOrderResult.ChargeOrderData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

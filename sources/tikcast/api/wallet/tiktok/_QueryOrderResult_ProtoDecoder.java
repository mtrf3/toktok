package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _QueryOrderResult_ProtoDecoder implements InterfaceC31105CIr<QueryOrderResult> {
    @Override // X.InterfaceC31105CIr
    public final QueryOrderResult LIZ(Q9H q9h) {
        QueryOrderResult queryOrderResult = new QueryOrderResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        queryOrderResult.extra = _QueryOrderResult_ChargeOrderExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    queryOrderResult.data = _QueryOrderResult_ChargeOrderData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return queryOrderResult;
            }
        }
    }
}

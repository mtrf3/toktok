package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _QueryOrderRequestParams_ProtoDecoder implements InterfaceC31105CIr<QueryOrderRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final QueryOrderRequestParams LIZ(Q9H q9h) {
        QueryOrderRequestParams queryOrderRequestParams = new QueryOrderRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        queryOrderRequestParams.transactionId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    queryOrderRequestParams.orderId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return queryOrderRequestParams;
            }
        }
    }
}

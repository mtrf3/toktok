package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.QueryOrderResult;

/* loaded from: classes14.dex */
public final class _QueryOrderResult_KYCIncentive_ProtoDecoder implements InterfaceC31105CIr<QueryOrderResult.KYCIncentive> {
    public static QueryOrderResult.KYCIncentive LIZIZ(Q9H q9h) {
        QueryOrderResult.KYCIncentive kYCIncentive = new QueryOrderResult.KYCIncentive();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    kYCIncentive.isShowEntrance = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return kYCIncentive;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QueryOrderResult.KYCIncentive LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

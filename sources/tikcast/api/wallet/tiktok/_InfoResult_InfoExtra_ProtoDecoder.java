package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.wallet.tiktok.InfoResult;

/* loaded from: classes17.dex */
public final class _InfoResult_InfoExtra_ProtoDecoder implements InterfaceC31105CIr<InfoResult.InfoExtra> {
    public static InfoResult.InfoExtra LIZIZ(Q9H q9h) {
        InfoResult.InfoExtra infoExtra = new InfoResult.InfoExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    infoExtra.isWebRechargeAllowed = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return infoExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InfoResult.InfoExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _InfoResult_ProtoDecoder implements InterfaceC31105CIr<InfoResult> {
    @Override // X.InterfaceC31105CIr
    public final InfoResult LIZ(Q9H q9h) {
        InfoResult infoResult = new InfoResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        infoResult.extra = _InfoResult_InfoExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    infoResult.data = _InfoResult_InfoData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return infoResult;
            }
        }
    }
}

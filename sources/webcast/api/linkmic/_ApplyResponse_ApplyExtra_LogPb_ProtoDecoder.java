package webcast.api.linkmic;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.linkmic.ApplyResponse;

/* loaded from: classes14.dex */
public final class _ApplyResponse_ApplyExtra_LogPb_ProtoDecoder implements InterfaceC31105CIr<ApplyResponse.ApplyExtra.LogPb> {
    public static ApplyResponse.ApplyExtra.LogPb LIZIZ(Q9H q9h) {
        ApplyResponse.ApplyExtra.LogPb logPb = new ApplyResponse.ApplyExtra.LogPb();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    logPb.clientLogId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return logPb;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ApplyResponse.ApplyExtra.LogPb LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package webcast.api.linkmic;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.linkmic.ApplyResponse;

/* loaded from: classes14.dex */
public final class _ApplyResponse_ApplyExtra_ProtoDecoder implements InterfaceC31105CIr<ApplyResponse.ApplyExtra> {
    public static ApplyResponse.ApplyExtra LIZIZ(Q9H q9h) {
        ApplyResponse.ApplyExtra applyExtra = new ApplyResponse.ApplyExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    applyExtra.logPb = _ApplyResponse_ApplyExtra_LogPb_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return applyExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ApplyResponse.ApplyExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

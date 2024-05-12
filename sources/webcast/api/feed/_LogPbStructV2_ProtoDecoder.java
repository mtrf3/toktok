package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _LogPbStructV2_ProtoDecoder implements InterfaceC31105CIr<LogPbStructV2> {
    public static LogPbStructV2 LIZIZ(Q9H q9h) {
        LogPbStructV2 logPbStructV2 = new LogPbStructV2();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    Q9J.LIZJ(q9h);
                } else {
                    logPbStructV2.imprId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return logPbStructV2;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LogPbStructV2 LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

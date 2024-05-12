package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ABInfos_ProtoDecoder implements InterfaceC31105CIr<ABInfos> {
    public static ABInfos LIZIZ(Q9H q9h) {
        ABInfos aBInfos = new ABInfos();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        aBInfos.params = Q9J.LIZIZ(q9h);
                    }
                } else {
                    aBInfos.cdid = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return aBInfos;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ABInfos LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

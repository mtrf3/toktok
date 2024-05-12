package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RealtimeLiveCenterTips_ProtoDecoder implements InterfaceC31105CIr<RealtimeLiveCenterTips> {
    public static RealtimeLiveCenterTips LIZIZ(Q9H q9h) {
        RealtimeLiveCenterTips realtimeLiveCenterTips = new RealtimeLiveCenterTips();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                realtimeLiveCenterTips.randomTipKey = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            realtimeLiveCenterTips.tipType = q9h.LJIIJ();
                        }
                    } else {
                        realtimeLiveCenterTips.tipText = Q9J.LIZIZ(q9h);
                    }
                } else {
                    realtimeLiveCenterTips.showTips = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return realtimeLiveCenterTips;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RealtimeLiveCenterTips LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

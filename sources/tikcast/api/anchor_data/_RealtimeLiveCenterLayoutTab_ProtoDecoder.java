package tikcast.api.anchor_data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RealtimeLiveCenterLayoutTab_ProtoDecoder implements InterfaceC31105CIr<RealtimeLiveCenterLayoutTab> {
    public static RealtimeLiveCenterLayoutTab LIZIZ(Q9H q9h) {
        RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab = new RealtimeLiveCenterLayoutTab();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        realtimeLiveCenterLayoutTab.lynxUrl = Q9J.LIZIZ(q9h);
                    }
                } else {
                    realtimeLiveCenterLayoutTab.layoutName = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return realtimeLiveCenterLayoutTab;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RealtimeLiveCenterLayoutTab LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

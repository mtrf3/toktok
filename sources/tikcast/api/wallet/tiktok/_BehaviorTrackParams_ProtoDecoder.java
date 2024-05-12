package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _BehaviorTrackParams_ProtoDecoder implements InterfaceC31105CIr<BehaviorTrackParams> {
    @Override // X.InterfaceC31105CIr
    public final BehaviorTrackParams LIZ(Q9H q9h) {
        BehaviorTrackParams behaviorTrackParams = new BehaviorTrackParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        behaviorTrackParams.behavior = q9h.LJIIJ();
                    }
                } else {
                    behaviorTrackParams.scenario = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return behaviorTrackParams;
            }
        }
    }
}

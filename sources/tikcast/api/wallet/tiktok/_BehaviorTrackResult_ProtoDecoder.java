package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BehaviorTrackResult_ProtoDecoder implements InterfaceC31105CIr<BehaviorTrackResult> {
    @Override // X.InterfaceC31105CIr
    public final BehaviorTrackResult LIZ(Q9H q9h) {
        BehaviorTrackResult behaviorTrackResult = new BehaviorTrackResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        behaviorTrackResult.behaviorData = _BehaviorData_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    behaviorTrackResult.resp = _BehaviorTrackResult_Response_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return behaviorTrackResult;
            }
        }
    }
}

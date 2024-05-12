package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LiveStreamSubGoal_ProtoDecoder implements InterfaceC31105CIr<LiveStreamSubGoal> {
    public static LiveStreamSubGoal LIZIZ(Q9H q9h) {
        LiveStreamSubGoal liveStreamSubGoal = new LiveStreamSubGoal();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        liveStreamSubGoal.type = q9h.LJIIJ();
                        break;
                    case 2:
                        liveStreamSubGoal.id = q9h.LJIIJJI();
                        break;
                    case 3:
                        liveStreamSubGoal.progress = q9h.LJIIJJI();
                        break;
                    case 4:
                        liveStreamSubGoal.target = q9h.LJIIJJI();
                        break;
                    case 5:
                        liveStreamSubGoal.gift = _LiveStreamSubGoalGift_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        liveStreamSubGoal.idStr = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return liveStreamSubGoal;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveStreamSubGoal LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

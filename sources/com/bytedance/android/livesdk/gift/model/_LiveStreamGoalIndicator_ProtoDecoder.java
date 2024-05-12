package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _LiveStreamGoalIndicator_ProtoDecoder implements InterfaceC31105CIr<LiveStreamGoalIndicator> {
    public static LiveStreamGoalIndicator LIZIZ(Q9H q9h) {
        LiveStreamGoalIndicator liveStreamGoalIndicator = new LiveStreamGoalIndicator();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        liveStreamGoalIndicator.op = q9h.LJIIJ();
                    }
                } else {
                    liveStreamGoalIndicator.key = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveStreamGoalIndicator;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveStreamGoalIndicator LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

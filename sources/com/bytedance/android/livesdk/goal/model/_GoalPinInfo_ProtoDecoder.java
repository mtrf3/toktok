package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GoalPinInfo_ProtoDecoder implements InterfaceC31105CIr<GoalPinInfo> {
    public static GoalPinInfo LIZIZ(Q9H q9h) {
        GoalPinInfo goalPinInfo = new GoalPinInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            goalPinInfo.pinEndTime = q9h.LJIIJJI();
                        }
                    } else {
                        goalPinInfo.unpin = Q9J.LIZ(q9h);
                    }
                } else {
                    goalPinInfo.pin = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return goalPinInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GoalPinInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GoalComparison_ProtoDecoder implements InterfaceC31105CIr<GoalComparison> {
    public static GoalComparison LIZIZ(Q9H q9h) {
        GoalComparison goalComparison = new GoalComparison();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        goalComparison.contributorIncr = q9h.LJIIJJI();
                    }
                } else {
                    goalComparison.coinsIncr = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return goalComparison;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GoalComparison LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GoalOwner_ProtoDecoder implements InterfaceC31105CIr<GoalOwner> {
    public static GoalOwner LIZIZ(Q9H q9h) {
        GoalOwner goalOwner = new GoalOwner();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        goalOwner.legalLimit = Q9J.LIZ(q9h);
                    }
                } else {
                    goalOwner.needCommitGuide = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return goalOwner;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GoalOwner LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

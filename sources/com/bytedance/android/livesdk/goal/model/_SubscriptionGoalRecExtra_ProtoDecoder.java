package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SubscriptionGoalRecExtra_ProtoDecoder implements InterfaceC31105CIr<SubscriptionGoalRecExtra> {
    public static SubscriptionGoalRecExtra LIZIZ(Q9H q9h) {
        SubscriptionGoalRecExtra subscriptionGoalRecExtra = new SubscriptionGoalRecExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    subscriptionGoalRecExtra.subscriptionCount = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subscriptionGoalRecExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubscriptionGoalRecExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

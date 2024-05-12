package com.bytedance.android.livesdk.boostcard;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BoostedUsersPoint_ProtoDecoder implements InterfaceC31105CIr<BoostedUsersPoint> {
    public static BoostedUsersPoint LIZIZ(Q9H q9h) {
        BoostedUsersPoint boostedUsersPoint = new BoostedUsersPoint();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        boostedUsersPoint.mTotalUsers = q9h.LJIIJJI();
                    }
                } else {
                    boostedUsersPoint.mPointTimeStamp = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return boostedUsersPoint;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BoostedUsersPoint LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

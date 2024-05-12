package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _AnchorOnBoardPermit_ProtoDecoder implements InterfaceC31105CIr<AnchorOnBoardPermit> {
    public static AnchorOnBoardPermit LIZIZ(Q9H q9h) {
        AnchorOnBoardPermit anchorOnBoardPermit = new AnchorOnBoardPermit();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        anchorOnBoardPermit.permitTips = Q9J.LIZIZ(q9h);
                    }
                } else {
                    anchorOnBoardPermit.anchorOnboardPermit = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorOnBoardPermit;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorOnBoardPermit LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

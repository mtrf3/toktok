package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _CohostABTest_ProtoDecoder implements InterfaceC31105CIr<CohostABTest> {
    public static CohostABTest LIZIZ(Q9H q9h) {
        CohostABTest cohostABTest = new CohostABTest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        cohostABTest.group = q9h.LJIIJJI();
                    }
                } else {
                    cohostABTest.abTestType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostABTest;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CohostABTest LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleABTest_ProtoDecoder implements InterfaceC31105CIr<BattleABTest> {
    public static BattleABTest LIZIZ(Q9H q9h) {
        BattleABTest battleABTest = new BattleABTest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleABTest.group = (int) q9h.LJIIJJI();
                    }
                } else {
                    battleABTest.abTestType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleABTest;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleABTest LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

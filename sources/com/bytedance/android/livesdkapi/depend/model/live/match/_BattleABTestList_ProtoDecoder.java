package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _BattleABTestList_ProtoDecoder implements InterfaceC31105CIr<BattleABTestList> {
    public static BattleABTestList LIZIZ(Q9H q9h) {
        BattleABTestList battleABTestList = new BattleABTestList();
        battleABTestList.abTestList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    battleABTestList.abTestList.add(_BattleABTest_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return battleABTestList;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleABTestList LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

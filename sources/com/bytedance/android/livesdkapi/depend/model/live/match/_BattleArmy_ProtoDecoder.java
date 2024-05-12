package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _BattleArmy_ProtoDecoder implements InterfaceC31105CIr<BattleArmy> {
    public static BattleArmy LIZIZ(Q9H q9h) {
        BattleArmy battleArmy = new BattleArmy();
        battleArmy.rankList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            battleArmy.anchorIdStr = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        battleArmy.rankList.add(_BattleArmy_RankUser_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    battleArmy.anchorId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return battleArmy;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleArmy LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

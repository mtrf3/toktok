package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _BattleUserArmies_ProtoDecoder implements InterfaceC31105CIr<BattleUserArmies> {
    public static BattleUserArmies LIZIZ(Q9H q9h) {
        BattleUserArmies battleUserArmies = new BattleUserArmies();
        battleUserArmies.userArmies = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleUserArmies.hostScore = (int) q9h.LJIIJJI();
                    }
                } else {
                    battleUserArmies.userArmies.add(_BattleUserArmy_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return battleUserArmies;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleUserArmies LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

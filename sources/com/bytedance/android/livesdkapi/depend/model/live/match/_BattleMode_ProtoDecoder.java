package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _BattleMode_ProtoDecoder implements InterfaceC31105CIr<BattleMode> {
    public static BattleMode LIZIZ(Q9H q9h) {
        BattleMode battleMode = new BattleMode();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleMode.stealTowerData = _BattleMode_StealTowerData_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    battleMode.mode = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return battleMode;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleMode LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

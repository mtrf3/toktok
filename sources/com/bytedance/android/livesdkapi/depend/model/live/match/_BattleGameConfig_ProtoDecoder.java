package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _BattleGameConfig_ProtoDecoder implements InterfaceC31105CIr<BattleGameConfig> {
    @Override // X.InterfaceC31105CIr
    public final BattleGameConfig LIZ(Q9H q9h) {
        BattleGameConfig battleGameConfig = new BattleGameConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            battleGameConfig.extra = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        battleGameConfig.propId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    battleGameConfig.gameId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return battleGameConfig;
            }
        }
    }
}

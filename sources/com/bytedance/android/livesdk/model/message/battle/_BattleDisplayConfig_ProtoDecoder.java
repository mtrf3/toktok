package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleDisplayConfig_ProtoDecoder implements InterfaceC31105CIr<BattleDisplayConfig> {
    public static BattleDisplayConfig LIZIZ(Q9H q9h) {
        BattleDisplayConfig battleDisplayConfig = new BattleDisplayConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    battleDisplayConfig.exemptStrategy = _ExemptStrategy_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                battleDisplayConfig.diffText = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            battleDisplayConfig.diffThreshold = (int) q9h.LJIIJJI();
                        }
                    } else {
                        battleDisplayConfig.text = Q9J.LIZIZ(q9h);
                    }
                } else {
                    battleDisplayConfig.threshold = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleDisplayConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleDisplayConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

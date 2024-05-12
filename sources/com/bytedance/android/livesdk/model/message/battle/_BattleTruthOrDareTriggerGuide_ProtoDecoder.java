package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleTruthOrDareTriggerGuide_ProtoDecoder implements InterfaceC31105CIr<BattleTruthOrDareTriggerGuide> {
    public static BattleTruthOrDareTriggerGuide LIZIZ(Q9H q9h) {
        BattleTruthOrDareTriggerGuide battleTruthOrDareTriggerGuide = new BattleTruthOrDareTriggerGuide();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                battleTruthOrDareTriggerGuide.ruleDetailUrl = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            battleTruthOrDareTriggerGuide.guideDurationSecond = q9h.LJIIJ();
                        }
                    } else {
                        battleTruthOrDareTriggerGuide.audienceContentKey = Q9J.LIZIZ(q9h);
                    }
                } else {
                    battleTruthOrDareTriggerGuide.anchorContentKey = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTruthOrDareTriggerGuide;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTruthOrDareTriggerGuide LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

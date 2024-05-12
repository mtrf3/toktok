package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _BattleTruthOrDareTriggerGuideV2_ProtoDecoder implements InterfaceC31105CIr<BattleTruthOrDareTriggerGuideV2> {
    public static BattleTruthOrDareTriggerGuideV2 LIZIZ(Q9H q9h) {
        BattleTruthOrDareTriggerGuideV2 battleTruthOrDareTriggerGuideV2 = new BattleTruthOrDareTriggerGuideV2();
        battleTruthOrDareTriggerGuideV2.tips = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        battleTruthOrDareTriggerGuideV2.anchorContentKey = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        battleTruthOrDareTriggerGuideV2.audienceContentKey = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        battleTruthOrDareTriggerGuideV2.tips.add(_BattleTruthOrDareTriggerGuideV2_TruthOrDareTip_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        battleTruthOrDareTriggerGuideV2.guideDurationSecond = q9h.LJIIJ();
                        break;
                    case 5:
                        battleTruthOrDareTriggerGuideV2.tipDurationSecond = q9h.LJIIJ();
                        break;
                    case 6:
                        battleTruthOrDareTriggerGuideV2.ruleDetailUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        battleTruthOrDareTriggerGuideV2.lapGuideKey = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        battleTruthOrDareTriggerGuideV2.lapGuideDurationSecond = q9h.LJIIJ();
                        break;
                    case 9:
                        battleTruthOrDareTriggerGuideV2.isFirstTime = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTruthOrDareTriggerGuideV2;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTruthOrDareTriggerGuideV2 LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

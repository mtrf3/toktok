package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;

/* loaded from: classes14.dex */
public final class _BattleTruthOrDareTriggerGuideV2_TruthOrDareTip_ProtoDecoder implements InterfaceC31105CIr<BattleTruthOrDareTriggerGuideV2.TruthOrDareTip> {
    public static BattleTruthOrDareTriggerGuideV2.TruthOrDareTip LIZIZ(Q9H q9h) {
        BattleTruthOrDareTriggerGuideV2.TruthOrDareTip truthOrDareTip = new BattleTruthOrDareTriggerGuideV2.TruthOrDareTip();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        truthOrDareTip.tipContentKey = Q9J.LIZIZ(q9h);
                    }
                } else {
                    truthOrDareTip.tipTypeKey = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return truthOrDareTip;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTruthOrDareTriggerGuideV2.TruthOrDareTip LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
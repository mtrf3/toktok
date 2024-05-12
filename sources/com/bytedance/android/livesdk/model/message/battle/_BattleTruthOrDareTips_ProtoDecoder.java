package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _BattleTruthOrDareTips_ProtoDecoder implements InterfaceC31105CIr<BattleTruthOrDareTips> {
    public static BattleTruthOrDareTips LIZIZ(Q9H q9h) {
        BattleTruthOrDareTips battleTruthOrDareTips = new BattleTruthOrDareTips();
        battleTruthOrDareTips.truthOrDareTips = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleTruthOrDareTips.giftGuideKey = Q9J.LIZIZ(q9h);
                    }
                } else {
                    battleTruthOrDareTips.truthOrDareTips.add(_TruthOrDareTip_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTruthOrDareTips;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTruthOrDareTips LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

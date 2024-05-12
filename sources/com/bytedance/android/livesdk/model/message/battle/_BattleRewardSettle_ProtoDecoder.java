package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattlePrompt_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _BattleRewardSettle_ProtoDecoder implements InterfaceC31105CIr<BattleRewardSettle> {
    public static BattleRewardSettle LIZIZ(Q9H q9h) {
        BattleRewardSettle battleRewardSettle = new BattleRewardSettle();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    battleRewardSettle.rewardSettlePrompt = _BattlePrompt_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleRewardSettle;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleRewardSettle LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

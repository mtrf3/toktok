package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleBonusConfig_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _BattleTaskStart_ProtoDecoder implements InterfaceC31105CIr<BattleTaskStart> {
    public static BattleTaskStart LIZIZ(Q9H q9h) {
        BattleTaskStart battleTaskStart = new BattleTaskStart();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    battleTaskStart.battleBonusConfig = _BattleBonusConfig_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTaskStart;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTaskStart LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

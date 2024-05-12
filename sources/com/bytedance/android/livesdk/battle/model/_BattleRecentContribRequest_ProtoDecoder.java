package com.bytedance.android.livesdk.battle.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _BattleRecentContribRequest_ProtoDecoder implements InterfaceC31105CIr<BattleRecentContribRequest> {
    @Override // X.InterfaceC31105CIr
    public final BattleRecentContribRequest LIZ(Q9H q9h) {
        BattleRecentContribRequest battleRecentContribRequest = new BattleRecentContribRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleRecentContribRequest.battleId = q9h.LJIIJJI();
                    }
                } else {
                    battleRecentContribRequest.channelId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleRecentContribRequest;
            }
        }
    }
}

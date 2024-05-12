package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleTeamUser_ProtoDecoder implements InterfaceC31105CIr<BattleTeamUser> {
    public static BattleTeamUser LIZIZ(Q9H q9h) {
        BattleTeamUser battleTeamUser = new BattleTeamUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleTeamUser.score = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    battleTeamUser.userId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTeamUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTeamUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

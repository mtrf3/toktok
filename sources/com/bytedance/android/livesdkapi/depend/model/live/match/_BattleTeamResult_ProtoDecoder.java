package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _BattleTeamResult_ProtoDecoder implements InterfaceC31105CIr<BattleTeamResult> {
    public static BattleTeamResult LIZIZ(Q9H q9h) {
        BattleTeamResult battleTeamResult = new BattleTeamResult();
        battleTeamResult.teamUsers = new ArrayList();
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
                                battleTeamResult.totalScore = q9h.LJIIJJI();
                            }
                        } else {
                            battleTeamResult.result = q9h.LJIIJ();
                        }
                    } else {
                        battleTeamResult.teamUsers.add(_BattleTeamUser_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    battleTeamResult.teamId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTeamResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTeamResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

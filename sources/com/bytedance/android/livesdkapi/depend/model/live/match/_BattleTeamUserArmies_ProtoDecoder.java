package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmies_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _BattleTeamUserArmies_ProtoDecoder implements InterfaceC31105CIr<BattleTeamUserArmies> {
    public static BattleTeamUserArmies LIZIZ(Q9H q9h) {
        BattleTeamUserArmies battleTeamUserArmies = new BattleTeamUserArmies();
        battleTeamUserArmies.teamUsers = new ArrayList();
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
                                battleTeamUserArmies.userArmies = _BattleUserArmies_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            battleTeamUserArmies.teamTotalScore = q9h.LJIIJJI();
                        }
                    } else {
                        battleTeamUserArmies.teamUsers.add(_BattleTeamUser_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    battleTeamUserArmies.teamId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTeamUserArmies;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTeamUserArmies LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

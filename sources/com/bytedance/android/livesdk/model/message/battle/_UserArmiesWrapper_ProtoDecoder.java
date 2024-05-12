package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _UserArmiesWrapper_ProtoDecoder implements InterfaceC31105CIr<UserArmiesWrapper> {
    public static UserArmiesWrapper LIZIZ(Q9H q9h) {
        UserArmiesWrapper userArmiesWrapper = new UserArmiesWrapper();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        userArmiesWrapper.userArmies = _BattleUserArmies_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    userArmiesWrapper.userId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return userArmiesWrapper;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserArmiesWrapper LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

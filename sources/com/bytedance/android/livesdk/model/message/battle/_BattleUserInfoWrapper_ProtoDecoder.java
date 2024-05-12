package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleUserInfo_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _BattleUserInfoWrapper_ProtoDecoder implements InterfaceC31105CIr<BattleUserInfoWrapper> {
    public static BattleUserInfoWrapper LIZIZ(Q9H q9h) {
        BattleUserInfoWrapper battleUserInfoWrapper = new BattleUserInfoWrapper();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleUserInfoWrapper.userInfo = _BattleUserInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    battleUserInfoWrapper.userId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return battleUserInfoWrapper;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleUserInfoWrapper LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

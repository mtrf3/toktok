package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _BattleUserArmy_ProtoDecoder implements InterfaceC31105CIr<BattleUserArmy> {
    public static BattleUserArmy LIZIZ(Q9H q9h) {
        BattleUserArmy battleUserArmy = new BattleUserArmy();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    battleUserArmy.diamondScore = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                battleUserArmy.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            battleUserArmy.nickname = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        battleUserArmy.score = (int) q9h.LJIIJJI();
                    }
                } else {
                    battleUserArmy.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleUserArmy;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleUserArmy LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

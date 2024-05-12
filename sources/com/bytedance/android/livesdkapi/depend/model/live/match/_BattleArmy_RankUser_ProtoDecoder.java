package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleArmy;

/* loaded from: classes17.dex */
public final class _BattleArmy_RankUser_ProtoDecoder implements InterfaceC31105CIr<BattleArmy.RankUser> {
    public static BattleArmy.RankUser LIZIZ(Q9H q9h) {
        BattleArmy.RankUser rankUser = new BattleArmy.RankUser();
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
                                    rankUser.userIdStr = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                rankUser.score = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            rankUser.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        rankUser.nickname = Q9J.LIZIZ(q9h);
                    }
                } else {
                    rankUser.userId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return rankUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleArmy.RankUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

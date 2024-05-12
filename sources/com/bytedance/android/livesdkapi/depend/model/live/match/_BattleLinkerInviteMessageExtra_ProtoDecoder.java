package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _BattleLinkerInviteMessageExtra_ProtoDecoder implements InterfaceC31105CIr<BattleLinkerInviteMessageExtra> {
    @Override // X.InterfaceC31105CIr
    public final BattleLinkerInviteMessageExtra LIZ(Q9H q9h) {
        BattleLinkerInviteMessageExtra battleLinkerInviteMessageExtra = new BattleLinkerInviteMessageExtra();
        battleLinkerInviteMessageExtra.tags = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        battleLinkerInviteMessageExtra.matchType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        battleLinkerInviteMessageExtra.tips = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        battleLinkerInviteMessageExtra.inviteType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        battleLinkerInviteMessageExtra.subType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        battleLinkerInviteMessageExtra.scene = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        battleLinkerInviteMessageExtra.theme = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        battleLinkerInviteMessageExtra.duration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 8:
                        battleLinkerInviteMessageExtra.extra = _BattleLinkerInviteMessageExtra_InviterRivalExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        battleLinkerInviteMessageExtra.tags.add(_BattleRivalTag_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return battleLinkerInviteMessageExtra;
            }
        }
    }
}

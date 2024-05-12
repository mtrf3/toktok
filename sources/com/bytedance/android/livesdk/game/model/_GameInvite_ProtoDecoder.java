package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GameInvite_ProtoDecoder implements InterfaceC31105CIr<GameInvite> {
    @Override // X.InterfaceC31105CIr
    public final GameInvite LIZ(Q9H q9h) {
        GameInvite gameInvite = new GameInvite();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        gameInvite.id = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        gameInvite.kind = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        gameInvite.createTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        gameInvite.nowTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        gameInvite.expireTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        gameInvite.status = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        gameInvite.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 8:
                        gameInvite.idStr = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return gameInvite;
            }
        }
    }
}

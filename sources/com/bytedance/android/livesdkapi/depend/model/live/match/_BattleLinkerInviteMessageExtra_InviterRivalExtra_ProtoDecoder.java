package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleLinkerInviteMessageExtra;

/* loaded from: classes14.dex */
public final class _BattleLinkerInviteMessageExtra_InviterRivalExtra_ProtoDecoder implements InterfaceC31105CIr<BattleLinkerInviteMessageExtra.InviterRivalExtra> {
    public static BattleLinkerInviteMessageExtra.InviterRivalExtra LIZIZ(Q9H q9h) {
        BattleLinkerInviteMessageExtra.InviterRivalExtra inviterRivalExtra = new BattleLinkerInviteMessageExtra.InviterRivalExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            inviterRivalExtra.label = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        inviterRivalExtra.webcastDataText = Q9J.LIZIZ(q9h);
                    }
                } else {
                    inviterRivalExtra.texttype = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return inviterRivalExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleLinkerInviteMessageExtra.InviterRivalExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

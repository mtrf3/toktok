package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _UserFanTicket_ProtoDecoder implements InterfaceC31105CIr<UserFanTicket> {
    public static UserFanTicket LIZIZ(Q9H q9h) {
        UserFanTicket userFanTicket = new UserFanTicket();
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
                                userFanTicket.matchRank = q9h.LJIIJ();
                            }
                        } else {
                            userFanTicket.matchTotalScore = q9h.LJIIJJI();
                        }
                    } else {
                        userFanTicket.fanTicket = q9h.LJIIJJI();
                    }
                } else {
                    userFanTicket.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return userFanTicket;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserFanTicket LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

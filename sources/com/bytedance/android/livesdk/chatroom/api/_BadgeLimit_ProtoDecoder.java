package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _BadgeLimit_ProtoDecoder implements InterfaceC31105CIr<BadgeLimit> {
    public static BadgeLimit LIZIZ(Q9H q9h) {
        BadgeLimit badgeLimit = new BadgeLimit();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        badgeLimit.descCharCntLmt = q9h.LJIIJ();
                    }
                } else {
                    badgeLimit.abbrCharCntLmt = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return badgeLimit;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BadgeLimit LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

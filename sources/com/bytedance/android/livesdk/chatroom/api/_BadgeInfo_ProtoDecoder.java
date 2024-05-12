package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BadgeInfo_ProtoDecoder implements InterfaceC31105CIr<BadgeInfo> {
    public static BadgeInfo LIZIZ(Q9H q9h) {
        BadgeInfo badgeInfo = new BadgeInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    badgeInfo.currentStatus = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return badgeInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BadgeInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _BadgeConfig_ProtoDecoder implements InterfaceC31105CIr<BadgeConfig> {
    public static BadgeConfig LIZIZ(Q9H q9h) {
        BadgeConfig badgeConfig = new BadgeConfig();
        badgeConfig.originBadgeImgList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        badgeConfig.originBadgeImgList.add(_OriginBadgeInfo_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    badgeConfig.badgeLmt = _BadgeLimit_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return badgeConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BadgeConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

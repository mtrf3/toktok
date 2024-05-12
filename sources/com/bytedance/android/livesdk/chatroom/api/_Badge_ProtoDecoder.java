package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _Badge_ProtoDecoder implements InterfaceC31105CIr<Badge> {
    public static Badge LIZIZ(Q9H q9h) {
        Badge badge = new Badge();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        badge.badgeAbbr = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        badge.badgeDesc = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        badge.badgeEmoji = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        badge.badgeIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        badge.badgeType = q9h.LJIIJ();
                        break;
                    case 6:
                        badge.badgeId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return badge;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Badge LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

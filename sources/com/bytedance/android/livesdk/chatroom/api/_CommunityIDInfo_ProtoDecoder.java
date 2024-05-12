package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CommunityIDInfo_ProtoDecoder implements InterfaceC31105CIr<CommunityIDInfo> {
    public static CommunityIDInfo LIZIZ(Q9H q9h) {
        CommunityIDInfo communityIDInfo = new CommunityIDInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            communityIDInfo.emoteInfo = _EmoteInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        communityIDInfo.badgeInfo = _BadgeInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    communityIDInfo.figures = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return communityIDInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CommunityIDInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

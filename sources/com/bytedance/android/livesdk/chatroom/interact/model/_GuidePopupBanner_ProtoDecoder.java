package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GuidePopupBanner_ProtoDecoder implements InterfaceC31105CIr<GuidePopupBanner> {
    public static GuidePopupBanner LIZIZ(Q9H q9h) {
        GuidePopupBanner guidePopupBanner = new GuidePopupBanner();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    guidePopupBanner.bannerStyle = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return guidePopupBanner;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GuidePopupBanner LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ActivityBannerParams_ProtoDecoder implements InterfaceC31105CIr<ActivityBannerParams> {
    @Override // X.InterfaceC31105CIr
    public final ActivityBannerParams LIZ(Q9H q9h) {
        ActivityBannerParams activityBannerParams = new ActivityBannerParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    activityBannerParams.activityName = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return activityBannerParams;
            }
        }
    }
}

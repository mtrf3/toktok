package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.ActivityBannerResponse;

/* loaded from: classes14.dex */
public final class _ActivityBannerResponse_BannerInfo_ProtoDecoder implements InterfaceC31105CIr<ActivityBannerResponse.BannerInfo> {
    public static ActivityBannerResponse.BannerInfo LIZIZ(Q9H q9h) {
        ActivityBannerResponse.BannerInfo bannerInfo = new ActivityBannerResponse.BannerInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            bannerInfo.activityUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        bannerInfo.bannerUrl = Q9J.LIZIZ(q9h);
                    }
                } else {
                    bannerInfo.showBanner = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bannerInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ActivityBannerResponse.BannerInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

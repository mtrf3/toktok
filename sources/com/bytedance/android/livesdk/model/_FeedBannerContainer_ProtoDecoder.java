package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _FeedBannerContainer_ProtoDecoder implements InterfaceC31105CIr<FeedBannerContainer> {
    public static FeedBannerContainer LIZIZ(Q9H q9h) {
        FeedBannerContainer feedBannerContainer = new FeedBannerContainer();
        feedBannerContainer.bannerList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        feedBannerContainer.bannerList.add(_FeedBanner_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 2:
                        feedBannerContainer.total = (int) q9h.LJIIJJI();
                        break;
                    case 3:
                        feedBannerContainer.background = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        feedBannerContainer.title = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        feedBannerContainer.switchType = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        feedBannerContainer.bannersType = (int) q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return feedBannerContainer;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FeedBannerContainer LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

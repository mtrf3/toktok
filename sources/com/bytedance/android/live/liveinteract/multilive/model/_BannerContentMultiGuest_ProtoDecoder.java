package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _BannerContentMultiGuest_ProtoDecoder implements InterfaceC31105CIr<BannerContentMultiGuest> {
    public static BannerContentMultiGuest LIZIZ(Q9H q9h) {
        BannerContentMultiGuest bannerContentMultiGuest = new BannerContentMultiGuest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bannerContentMultiGuest.title = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        bannerContentMultiGuest.subTitle = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        bannerContentMultiGuest.textColor = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        bannerContentMultiGuest.leftColor = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        bannerContentMultiGuest.rightColor = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        bannerContentMultiGuest.coreImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        bannerContentMultiGuest.backgroundImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bannerContentMultiGuest;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BannerContentMultiGuest LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

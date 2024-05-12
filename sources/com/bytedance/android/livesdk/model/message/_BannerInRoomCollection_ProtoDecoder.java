package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BannerInRoomCollection_ProtoDecoder implements InterfaceC31105CIr<BannerInRoomCollection> {
    public static BannerInRoomCollection LIZIZ(Q9H q9h) {
        BannerInRoomCollection bannerInRoomCollection = new BannerInRoomCollection();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bannerInRoomCollection.topRightBanner = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        bannerInRoomCollection.bottomRightBanner = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        bannerInRoomCollection.giftPanelBanner = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        bannerInRoomCollection.middleBanner = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        bannerInRoomCollection.activityTopRightBanner = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        bannerInRoomCollection.topLeft = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        bannerInRoomCollection.liveScene = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bannerInRoomCollection;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BannerInRoomCollection LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

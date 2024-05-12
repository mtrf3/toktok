package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model._BannerInRoom_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _BannerInRoomCollection_BannerInfo_ProtoDecoder implements InterfaceC31105CIr<BannerInRoomCollection.BannerInfo> {
    public static BannerInRoomCollection.BannerInfo LIZIZ(Q9H q9h) {
        BannerInRoomCollection.BannerInfo bannerInfo = new BannerInRoomCollection.BannerInfo();
        bannerInfo.bannerList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bannerInfo.url = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        bannerInfo.bannerList.add(_BannerInRoom_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        bannerInfo.animationImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        bannerInfo.collapseInfo = _BannerCollapseInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        bannerInfo.height = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        bannerInfo.width = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                        bannerInfo.lynxContainerUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        bannerInfo.containerType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bannerInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BannerInRoomCollection.BannerInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

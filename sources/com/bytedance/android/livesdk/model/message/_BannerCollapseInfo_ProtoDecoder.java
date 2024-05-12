package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _BannerCollapseInfo_ProtoDecoder implements InterfaceC31105CIr<BannerCollapseInfo> {
    public static BannerCollapseInfo LIZIZ(Q9H q9h) {
        BannerCollapseInfo bannerCollapseInfo = new BannerCollapseInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bannerCollapseInfo.title = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        bannerCollapseInfo.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        bannerCollapseInfo.enabled = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        bannerCollapseInfo.backgroundColor = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        bannerCollapseInfo.collapseHeight = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        bannerCollapseInfo.verticalLineColor = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bannerCollapseInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BannerCollapseInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

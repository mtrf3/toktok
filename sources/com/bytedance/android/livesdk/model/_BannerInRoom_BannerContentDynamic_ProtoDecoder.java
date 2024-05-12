package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.BannerInRoom;

/* loaded from: classes6.dex */
public final class _BannerInRoom_BannerContentDynamic_ProtoDecoder implements InterfaceC31105CIr<BannerInRoom.BannerContentDynamic> {
    public static BannerInRoom.BannerContentDynamic LIZIZ(Q9H q9h) {
        BannerInRoom.BannerContentDynamic bannerContentDynamic = new BannerInRoom.BannerContentDynamic();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bannerContentDynamic.jsonResource = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bannerContentDynamic;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BannerInRoom.BannerContentDynamic LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

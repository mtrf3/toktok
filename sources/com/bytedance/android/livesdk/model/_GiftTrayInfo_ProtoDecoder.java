package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftTrayInfo_ProtoDecoder implements InterfaceC31105CIr<GiftTrayInfo> {
    public static GiftTrayInfo LIZIZ(Q9H q9h) {
        GiftTrayInfo giftTrayInfo = new GiftTrayInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        giftTrayInfo.canMirror = Q9J.LIZ(q9h);
                    }
                } else {
                    giftTrayInfo.mDynamicImg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftTrayInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftTrayInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

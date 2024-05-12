package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PriceTierInfo_ProtoDecoder implements InterfaceC31105CIr<PriceTierInfo> {
    public static PriceTierInfo LIZIZ(Q9H q9h) {
        PriceTierInfo priceTierInfo = new PriceTierInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        priceTierInfo.localPrice = Q9J.LIZIZ(q9h);
                    }
                } else {
                    priceTierInfo.usdPrice = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return priceTierInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PriceTierInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

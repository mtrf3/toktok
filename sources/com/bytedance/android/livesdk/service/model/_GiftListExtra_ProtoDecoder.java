package com.bytedance.android.livesdk.service.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GiftListExtra_ProtoDecoder implements InterfaceC31105CIr<GiftListExtra> {
    public static GiftListExtra LIZIZ(Q9H q9h) {
        GiftListExtra giftListExtra = new GiftListExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    giftListExtra.logId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftListExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftListExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

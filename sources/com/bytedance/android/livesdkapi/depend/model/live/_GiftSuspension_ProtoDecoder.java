package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GiftSuspension_ProtoDecoder implements InterfaceC31105CIr<GiftSuspension> {
    public static GiftSuspension LIZIZ(Q9H q9h) {
        GiftSuspension giftSuspension = new GiftSuspension();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            giftSuspension.endTime = q9h.LJIIJJI();
                        }
                    } else {
                        giftSuspension.toast = Q9J.LIZIZ(q9h);
                    }
                } else {
                    giftSuspension.status = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return giftSuspension;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftSuspension LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

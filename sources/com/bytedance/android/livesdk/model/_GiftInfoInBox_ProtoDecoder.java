package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GiftInfoInBox_ProtoDecoder implements InterfaceC31105CIr<GiftInfoInBox> {
    public static GiftInfoInBox LIZIZ(Q9H q9h) {
        GiftInfoInBox giftInfoInBox = new GiftInfoInBox();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                giftInfoInBox.remainTimes = q9h.LJIIJ();
                            }
                        } else {
                            giftInfoInBox.colorId = q9h.LJIIJJI();
                        }
                    } else {
                        giftInfoInBox.effectId = q9h.LJIIJJI();
                    }
                } else {
                    giftInfoInBox.giftId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return giftInfoInBox;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftInfoInBox LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

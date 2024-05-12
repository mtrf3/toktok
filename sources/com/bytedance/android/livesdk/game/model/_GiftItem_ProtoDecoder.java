package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GiftItem_ProtoDecoder implements InterfaceC31105CIr<GiftItem> {
    public static GiftItem LIZIZ(Q9H q9h) {
        GiftItem giftItem = new GiftItem();
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
                                giftItem.iconUrl = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            giftItem.count = q9h.LJIIJJI();
                        }
                    } else {
                        giftItem.name = Q9J.LIZIZ(q9h);
                    }
                } else {
                    giftItem.idStr = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

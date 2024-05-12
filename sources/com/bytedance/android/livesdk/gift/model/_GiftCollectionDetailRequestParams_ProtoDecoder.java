package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GiftCollectionDetailRequestParams_ProtoDecoder implements InterfaceC31105CIr<GiftCollectionDetailRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final GiftCollectionDetailRequestParams LIZ(Q9H q9h) {
        GiftCollectionDetailRequestParams giftCollectionDetailRequestParams = new GiftCollectionDetailRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            giftCollectionDetailRequestParams.roomId = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        giftCollectionDetailRequestParams.anchorId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    giftCollectionDetailRequestParams.giftId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return giftCollectionDetailRequestParams;
            }
        }
    }
}

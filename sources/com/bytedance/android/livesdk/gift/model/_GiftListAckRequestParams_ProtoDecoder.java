package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GiftListAckRequestParams_ProtoDecoder implements InterfaceC31105CIr<GiftListAckRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final GiftListAckRequestParams LIZ(Q9H q9h) {
        GiftListAckRequestParams giftListAckRequestParams = new GiftListAckRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            giftListAckRequestParams.secAnchorId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        giftListAckRequestParams.roomId = q9h.LJIIJJI();
                    }
                } else {
                    giftListAckRequestParams.giftsAckInfoList = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftListAckRequestParams;
            }
        }
    }
}

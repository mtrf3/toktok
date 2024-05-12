package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GiftSendResponse_ProtoDecoder implements InterfaceC31105CIr<GiftSendResponse> {
    @Override // X.InterfaceC31105CIr
    public final GiftSendResponse LIZ(Q9H q9h) {
        GiftSendResponse giftSendResponse = new GiftSendResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        giftSendResponse.extra = _GiftSendResponse_GiftExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    giftSendResponse.data = _SendGiftResult_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftSendResponse;
            }
        }
    }
}

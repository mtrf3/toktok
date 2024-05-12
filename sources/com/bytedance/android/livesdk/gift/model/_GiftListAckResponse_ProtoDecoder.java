package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GiftListAckResponse_ProtoDecoder implements InterfaceC31105CIr<GiftListAckResponse> {
    @Override // X.InterfaceC31105CIr
    public final GiftListAckResponse LIZ(Q9H q9h) {
        GiftListAckResponse giftListAckResponse = new GiftListAckResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    Q9J.LIZJ(q9h);
                } else {
                    giftListAckResponse.extra = _GiftListAckResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftListAckResponse;
            }
        }
    }
}

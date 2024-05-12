package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GiftHintResponse_ProtoDecoder implements InterfaceC31105CIr<GiftHintResponse> {
    @Override // X.InterfaceC31105CIr
    public final GiftHintResponse LIZ(Q9H q9h) {
        GiftHintResponse giftHintResponse = new GiftHintResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    giftHintResponse.data = _GiftHintResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftHintResponse;
            }
        }
    }
}

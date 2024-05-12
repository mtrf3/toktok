package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GiftCollectionDetailResponse_ProtoDecoder implements InterfaceC31105CIr<GiftCollectionDetailResponse> {
    @Override // X.InterfaceC31105CIr
    public final GiftCollectionDetailResponse LIZ(Q9H q9h) {
        GiftCollectionDetailResponse giftCollectionDetailResponse = new GiftCollectionDetailResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    giftCollectionDetailResponse.data = _GiftCollectionDetailResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftCollectionDetailResponse;
            }
        }
    }
}

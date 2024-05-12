package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.service.model._GiftListExtra_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _GiftListResponse_ProtoDecoder implements InterfaceC31105CIr<GiftListResponse> {
    @Override // X.InterfaceC31105CIr
    public final GiftListResponse LIZ(Q9H q9h) {
        GiftListResponse giftListResponse = new GiftListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        giftListResponse.extra = _GiftListExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    giftListResponse.data = _GiftListResult_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftListResponse;
            }
        }
    }
}

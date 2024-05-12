package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _DynamicGiftListResponse_ProtoDecoder implements InterfaceC31105CIr<DynamicGiftListResponse> {
    @Override // X.InterfaceC31105CIr
    public final DynamicGiftListResponse LIZ(Q9H q9h) {
        DynamicGiftListResponse dynamicGiftListResponse = new DynamicGiftListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        dynamicGiftListResponse.extra = _DynamicGiftListResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    dynamicGiftListResponse.data = _DynamicGiftListResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dynamicGiftListResponse;
            }
        }
    }
}

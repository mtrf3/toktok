package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _StaticGiftListResponse_ProtoDecoder implements InterfaceC31105CIr<StaticGiftListResponse> {
    @Override // X.InterfaceC31105CIr
    public final StaticGiftListResponse LIZ(Q9H q9h) {
        StaticGiftListResponse staticGiftListResponse = new StaticGiftListResponse();
        staticGiftListResponse.gifts = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        staticGiftListResponse.metadata = _StaticGiftListResponse_Metadata_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    staticGiftListResponse.gifts.add(_Gift_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return staticGiftListResponse;
            }
        }
    }
}

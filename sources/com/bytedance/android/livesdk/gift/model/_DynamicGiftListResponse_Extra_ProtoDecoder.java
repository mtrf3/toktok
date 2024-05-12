package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.DynamicGiftListResponse;

/* loaded from: classes14.dex */
public final class _DynamicGiftListResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<DynamicGiftListResponse.Extra> {
    public static DynamicGiftListResponse.Extra LIZIZ(Q9H q9h) {
        DynamicGiftListResponse.Extra extra = new DynamicGiftListResponse.Extra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    extra.logId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return extra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DynamicGiftListResponse.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

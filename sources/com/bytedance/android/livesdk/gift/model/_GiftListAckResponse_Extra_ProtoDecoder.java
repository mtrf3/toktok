package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.GiftListAckResponse;

/* loaded from: classes6.dex */
public final class _GiftListAckResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<GiftListAckResponse.Extra> {
    public static GiftListAckResponse.Extra LIZIZ(Q9H q9h) {
        GiftListAckResponse.Extra extra = new GiftListAckResponse.Extra();
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
    public final GiftListAckResponse.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

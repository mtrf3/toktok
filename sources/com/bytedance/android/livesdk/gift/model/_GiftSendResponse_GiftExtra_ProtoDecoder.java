package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _GiftSendResponse_GiftExtra_ProtoDecoder implements InterfaceC31105CIr<GiftSendResponse.GiftExtra> {
    public static GiftSendResponse.GiftExtra LIZIZ(Q9H q9h) {
        GiftSendResponse.GiftExtra giftExtra = new GiftSendResponse.GiftExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    giftExtra.customError = _RechargeCustomError_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftSendResponse.GiftExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

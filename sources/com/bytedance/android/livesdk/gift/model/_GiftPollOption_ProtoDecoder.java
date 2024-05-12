package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftPollOption_ProtoDecoder implements InterfaceC31105CIr<GiftPollOption> {
    public static GiftPollOption LIZIZ(Q9H q9h) {
        GiftPollOption giftPollOption = new GiftPollOption();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        giftPollOption.resultImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    giftPollOption.giftId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return giftPollOption;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftPollOption LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

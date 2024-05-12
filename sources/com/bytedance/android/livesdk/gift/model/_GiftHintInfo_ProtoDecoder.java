package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftHintInfo_ProtoDecoder implements InterfaceC31105CIr<GiftHintInfo> {
    public static GiftHintInfo LIZIZ(Q9H q9h) {
        GiftHintInfo giftHintInfo = new GiftHintInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftHintInfo.hintId = q9h.LJIIJ();
                        break;
                    case 2:
                        giftHintInfo.hintIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        giftHintInfo.hintText = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        giftHintInfo.hintShowDelayMs = q9h.LJIIJJI();
                        break;
                    case 5:
                        giftHintInfo.giftId = q9h.LJIIJJI();
                        break;
                    case 6:
                        giftHintInfo.hasGiftHistory = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftHintInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftHintInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _GiftMode_ProtoDecoder implements InterfaceC31105CIr<GiftMode> {
    public static GiftMode LIZIZ(Q9H q9h) {
        GiftMode giftMode = new GiftMode();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftMode.giftId = q9h.LJIIJJI();
                        break;
                    case 2:
                        giftMode.giftName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        giftMode.giftIconImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        giftMode.giftPrice = q9h.LJIIJJI();
                        break;
                    case 5:
                        giftMode.giftBackgroundImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        giftMode.releaseVersion = q9h.LJIIJJI();
                        break;
                    case 7:
                        giftMode.hasFlashEffect = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        giftMode.eventIconImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftMode;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftMode LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

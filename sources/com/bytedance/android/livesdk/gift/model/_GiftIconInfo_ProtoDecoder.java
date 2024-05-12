package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftIconInfo_ProtoDecoder implements InterfaceC31105CIr<GiftIconInfo> {
    public static GiftIconInfo LIZIZ(Q9H q9h) {
        GiftIconInfo giftIconInfo = new GiftIconInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftIconInfo.mIconId = q9h.LJIIJJI();
                        break;
                    case 2:
                        giftIconInfo.mName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        giftIconInfo.mValidStartAt = q9h.LJIIJJI();
                        break;
                    case 4:
                        giftIconInfo.mValidEndAt = q9h.LJIIJJI();
                        break;
                    case 5:
                        giftIconInfo.mIconUri = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        giftIconInfo.mIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        giftIconInfo.mWith_effect = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 8:
                        giftIconInfo.mEffectUri = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        giftIconInfo.mEffect = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftIconInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftIconInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

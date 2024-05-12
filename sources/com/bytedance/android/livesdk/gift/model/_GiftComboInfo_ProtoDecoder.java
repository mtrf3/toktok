package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftComboInfo_ProtoDecoder implements InterfaceC31105CIr<GiftComboInfo> {
    public static GiftComboInfo LIZIZ(Q9H q9h) {
        GiftComboInfo giftComboInfo = new GiftComboInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        giftComboInfo.comboEffectImg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    giftComboInfo.comboCount = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return giftComboInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftComboInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

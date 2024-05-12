package com.bytedance.android.livesdk.gift.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes6.dex */
public final class _GiftColorInfo_ProtoEncoder implements InterfaceC64604PXc<GiftColorInfo> {
    public static int LIZJ(GiftColorInfo giftColorInfo) {
        int LJIIL = C30957CCz.LJIIL(2, giftColorInfo.colorName) + C30957CCz.LJIIJ(1, giftColorInfo.colorId);
        List<String> list = giftColorInfo.colorValues;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftColorInfo.colorValues.size(); i++) {
                LJIIL += C30957CCz.LJIIL(3, (String) ListProtector.get(giftColorInfo.colorValues, i));
            }
        }
        return C30957CCz.LJ(7) + C30957CCz.LJIIJ(6, giftColorInfo.colorEffectId) + _ImageModel_ProtoEncoder.LJ(5, giftColorInfo.giftImage) + _ImageModel_ProtoEncoder.LJ(4, giftColorInfo.colorImage) + LJIIL;
    }

    public static void LIZIZ(CD6 cd6, GiftColorInfo giftColorInfo) {
        C30957CCz.LIZJ(cd6, 1, giftColorInfo.colorId);
        C30957CCz.LIZLLL(cd6, 2, giftColorInfo.colorName);
        List<String> list = giftColorInfo.colorValues;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftColorInfo.colorValues.size(); i++) {
                C30957CCz.LIZLLL(cd6, 3, (String) ListProtector.get(giftColorInfo.colorValues, i));
            }
        }
        _ImageModel_ProtoEncoder.LIZJ(cd6, 4, giftColorInfo.colorImage);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 5, giftColorInfo.giftImage);
        C30957CCz.LIZJ(cd6, 6, giftColorInfo.colorEffectId);
        boolean z = giftColorInfo.isDefault;
        cd6.LIZLLL(7, 0);
        cd6.LJ(z ? 1 : 0);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, GiftColorInfo giftColorInfo) {
        LIZIZ(cd6, giftColorInfo);
    }
}

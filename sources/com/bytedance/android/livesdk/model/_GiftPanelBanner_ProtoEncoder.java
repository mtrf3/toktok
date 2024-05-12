package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes6.dex */
public final class _GiftPanelBanner_ProtoEncoder implements InterfaceC64604PXc<GiftPanelBanner> {
    public static int LIZJ(GiftPanelBanner giftPanelBanner) {
        int LIZ;
        if (giftPanelBanner == null) {
            return 0;
        }
        Text text = giftPanelBanner.displayText;
        if (text == null) {
            LIZ = 0;
        } else {
            int LIZJ = _Text_ProtoEncoder.LIZJ(text);
            LIZ = CD6.LIZ(1) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        int LJIIL = C30957CCz.LJIIL(3, giftPanelBanner.schemaUrl) + _ImageModel_ProtoEncoder.LJ(2, giftPanelBanner.leftIcon) + LIZ;
        List<String> list = giftPanelBanner.bgColors;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftPanelBanner.bgColors.size(); i++) {
                LJIIL += C30957CCz.LJIIL(5, (String) ListProtector.get(giftPanelBanner.bgColors, i));
            }
        }
        return C30957CCz.LJI(7, giftPanelBanner.bannerPriority) + C30957CCz.LJIIL(6, giftPanelBanner.bannerLynxUrl) + LJIIL;
    }

    public static void LIZIZ(CD6 cd6, GiftPanelBanner giftPanelBanner) {
        Text text = giftPanelBanner.displayText;
        if (text != null) {
            cd6.LIZLLL(1, 2);
            cd6.LJ(_Text_ProtoEncoder.LIZJ(text));
            _Text_ProtoEncoder.LIZIZ(cd6, text);
        }
        _ImageModel_ProtoEncoder.LIZJ(cd6, 2, giftPanelBanner.leftIcon);
        C30957CCz.LIZLLL(cd6, 3, giftPanelBanner.schemaUrl);
        List<String> list = giftPanelBanner.bgColors;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftPanelBanner.bgColors.size(); i++) {
                C30957CCz.LIZLLL(cd6, 5, (String) ListProtector.get(giftPanelBanner.bgColors, i));
            }
        }
        C30957CCz.LIZLLL(cd6, 6, giftPanelBanner.bannerLynxUrl);
        int i2 = giftPanelBanner.bannerPriority;
        cd6.LIZLLL(7, 0);
        cd6.LIZJ(i2);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, GiftPanelBanner giftPanelBanner) {
        LIZIZ(cd6, giftPanelBanner);
    }
}

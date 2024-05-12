package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes6.dex */
public final class _RandomGiftPanelBanner_ProtoEncoder implements InterfaceC64604PXc<RandomGiftPanelBanner> {
    public static int LIZJ(RandomGiftPanelBanner randomGiftPanelBanner) {
        int LJIIL = C30957CCz.LJIIL(7, randomGiftPanelBanner.schemaUrl) + _ImageModel_ProtoEncoder.LJ(6, randomGiftPanelBanner.leftIcon) + C30957CCz.LJIIL(5, randomGiftPanelBanner.displayText) + C30957CCz.LJIIIZ(4, randomGiftPanelBanner.collectNum) + C30957CCz.LJIIIZ(3, randomGiftPanelBanner.targetNum) + _ImageModel_ProtoEncoder.LJ(2, randomGiftPanelBanner.shadingImage);
        List<String> list = randomGiftPanelBanner.bgColors;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < randomGiftPanelBanner.bgColors.size(); i++) {
                LJIIL += C30957CCz.LJIIL(8, (String) ListProtector.get(randomGiftPanelBanner.bgColors, i));
            }
        }
        return C30957CCz.LJI(10, randomGiftPanelBanner.bannerPriority) + C30957CCz.LJIIIZ(9, randomGiftPanelBanner.round) + LJIIL;
    }

    public static void LIZIZ(CD6 cd6, RandomGiftPanelBanner randomGiftPanelBanner) {
        _ImageModel_ProtoEncoder.LIZJ(cd6, 2, randomGiftPanelBanner.shadingImage);
        long j = randomGiftPanelBanner.targetNum;
        cd6.LIZLLL(3, 0);
        cd6.LJFF(j);
        long j2 = randomGiftPanelBanner.collectNum;
        cd6.LIZLLL(4, 0);
        cd6.LJFF(j2);
        C30957CCz.LIZLLL(cd6, 5, randomGiftPanelBanner.displayText);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 6, randomGiftPanelBanner.leftIcon);
        C30957CCz.LIZLLL(cd6, 7, randomGiftPanelBanner.schemaUrl);
        List<String> list = randomGiftPanelBanner.bgColors;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < randomGiftPanelBanner.bgColors.size(); i++) {
                C30957CCz.LIZLLL(cd6, 8, (String) ListProtector.get(randomGiftPanelBanner.bgColors, i));
            }
        }
        long j3 = randomGiftPanelBanner.round;
        cd6.LIZLLL(9, 0);
        cd6.LJFF(j3);
        int i2 = randomGiftPanelBanner.bannerPriority;
        cd6.LIZLLL(10, 0);
        cd6.LIZJ(i2);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, RandomGiftPanelBanner randomGiftPanelBanner) {
        LIZIZ(cd6, randomGiftPanelBanner);
    }
}

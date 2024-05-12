package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _RandomGiftPanelBanner_ProtoDecoder implements InterfaceC31105CIr<RandomGiftPanelBanner> {
    public static RandomGiftPanelBanner LIZIZ(Q9H q9h) {
        RandomGiftPanelBanner randomGiftPanelBanner = new RandomGiftPanelBanner();
        randomGiftPanelBanner.bgColors = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 2:
                        randomGiftPanelBanner.shadingImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        randomGiftPanelBanner.targetNum = q9h.LJIIJJI();
                        break;
                    case 4:
                        randomGiftPanelBanner.collectNum = q9h.LJIIJJI();
                        break;
                    case 5:
                        randomGiftPanelBanner.displayText = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        randomGiftPanelBanner.leftIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        randomGiftPanelBanner.schemaUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        randomGiftPanelBanner.bgColors.add(Q9J.LIZIZ(q9h));
                        break;
                    case 9:
                        randomGiftPanelBanner.round = q9h.LJIIJJI();
                        break;
                    case 10:
                        randomGiftPanelBanner.bannerPriority = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return randomGiftPanelBanner;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RandomGiftPanelBanner LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

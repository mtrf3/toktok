package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GiftPanelBanner_ProtoDecoder implements InterfaceC31105CIr<GiftPanelBanner> {
    public static GiftPanelBanner LIZIZ(Q9H q9h) {
        GiftPanelBanner giftPanelBanner = new GiftPanelBanner();
        giftPanelBanner.bgColors = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 5) {
                                if (LJI != 6) {
                                    if (LJI != 7) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        giftPanelBanner.bannerPriority = q9h.LJIIJ();
                                    }
                                } else {
                                    giftPanelBanner.bannerLynxUrl = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                giftPanelBanner.bgColors.add(Q9J.LIZIZ(q9h));
                            }
                        } else {
                            giftPanelBanner.schemaUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        giftPanelBanner.leftIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    giftPanelBanner.displayText = _Text_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftPanelBanner;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftPanelBanner LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

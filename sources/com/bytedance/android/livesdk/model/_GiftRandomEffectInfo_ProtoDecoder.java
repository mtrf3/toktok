package com.bytedance.android.livesdk.model;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GiftRandomEffectInfo_ProtoDecoder implements InterfaceC31105CIr<GiftRandomEffectInfo> {
    public static GiftRandomEffectInfo LIZIZ(Q9H q9h) {
        GiftRandomEffectInfo giftRandomEffectInfo = new GiftRandomEffectInfo();
        giftRandomEffectInfo.effectIds = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    giftRandomEffectInfo.randomGiftBubble = _RandomGiftBubble_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                giftRandomEffectInfo.audienceKey = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            giftRandomEffectInfo.hostKey = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        C29991Fr.LIZ(q9h, giftRandomEffectInfo.effectIds);
                    }
                } else {
                    giftRandomEffectInfo.randomGiftPanelBanner = _RandomGiftPanelBanner_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftRandomEffectInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftRandomEffectInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

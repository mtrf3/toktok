package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _GiftKeywords_ProtoDecoder implements InterfaceC31105CIr<GiftKeywords> {
    public static GiftKeywords LIZIZ(Q9H q9h) {
        GiftKeywords giftKeywords = new GiftKeywords();
        giftKeywords.keywords = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        giftKeywords.keywords.add(Q9J.LIZIZ(q9h));
                    }
                } else {
                    giftKeywords.giftId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return giftKeywords;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftKeywords LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

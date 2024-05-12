package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _KeywordsLibrary_ProtoDecoder implements InterfaceC31105CIr<KeywordsLibrary> {
    public static KeywordsLibrary LIZIZ(Q9H q9h) {
        KeywordsLibrary keywordsLibrary = new KeywordsLibrary();
        keywordsLibrary.giftKeywords = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            keywordsLibrary.hasSpace = Q9J.LIZ(q9h);
                        }
                    } else {
                        keywordsLibrary.giftKeywords.add(_GiftKeywords_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    keywordsLibrary.locale = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return keywordsLibrary;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final KeywordsLibrary LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

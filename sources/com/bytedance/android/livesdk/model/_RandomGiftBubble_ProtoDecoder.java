package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _RandomGiftBubble_ProtoDecoder implements InterfaceC31105CIr<RandomGiftBubble> {
    public static RandomGiftBubble LIZIZ(Q9H q9h) {
        RandomGiftBubble randomGiftBubble = new RandomGiftBubble();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        randomGiftBubble.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    randomGiftBubble.bubbleDisplayText = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return randomGiftBubble;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RandomGiftBubble LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

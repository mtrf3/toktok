package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BubbleInfo_ProtoDecoder implements InterfaceC31105CIr<BubbleInfo> {
    public static BubbleInfo LIZIZ(Q9H q9h) {
        BubbleInfo bubbleInfo = new BubbleInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        bubbleInfo.bubbleList = _SubscribeBubbleList_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    bubbleInfo.bubbleType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return bubbleInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BubbleInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubscribeBubbleList_ProtoDecoder implements InterfaceC31105CIr<SubscribeBubbleList> {
    public static SubscribeBubbleList LIZIZ(Q9H q9h) {
        SubscribeBubbleList subscribeBubbleList = new SubscribeBubbleList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        subscribeBubbleList.optionalText = Q9J.LIZIZ(q9h);
                    }
                } else {
                    subscribeBubbleList.defaultText = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subscribeBubbleList;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubscribeBubbleList LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

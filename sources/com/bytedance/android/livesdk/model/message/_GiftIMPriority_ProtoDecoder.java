package com.bytedance.android.livesdk.model.message;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GiftIMPriority_ProtoDecoder implements InterfaceC31105CIr<GiftIMPriority> {
    public static GiftIMPriority LIZIZ(Q9H q9h) {
        GiftIMPriority giftIMPriority = new GiftIMPriority();
        giftIMPriority.queueSizes = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            giftIMPriority.priority = (int) q9h.LJIIJJI();
                        }
                    } else {
                        giftIMPriority.selfQueuePriority = q9h.LJIIJJI();
                    }
                } else {
                    C29991Fr.LIZ(q9h, giftIMPriority.queueSizes);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftIMPriority;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftIMPriority LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

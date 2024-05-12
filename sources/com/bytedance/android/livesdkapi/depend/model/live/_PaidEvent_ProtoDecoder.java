package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PaidEvent_ProtoDecoder implements InterfaceC31105CIr<PaidEvent> {
    public static PaidEvent LIZIZ(Q9H q9h) {
        PaidEvent paidEvent = new PaidEvent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        paidEvent.paidType = q9h.LJIIJ();
                    }
                } else {
                    paidEvent.eventId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return paidEvent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PaidEvent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

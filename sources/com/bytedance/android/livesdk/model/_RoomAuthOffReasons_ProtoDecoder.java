package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _RoomAuthOffReasons_ProtoDecoder implements InterfaceC31105CIr<RoomAuthOffReasons> {
    public static RoomAuthOffReasons LIZIZ(Q9H q9h) {
        RoomAuthOffReasons roomAuthOffReasons = new RoomAuthOffReasons();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        roomAuthOffReasons.unAvailableClickReason = (int) q9h.LJIIJJI();
                    }
                } else {
                    roomAuthOffReasons.gift = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return roomAuthOffReasons;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomAuthOffReasons LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

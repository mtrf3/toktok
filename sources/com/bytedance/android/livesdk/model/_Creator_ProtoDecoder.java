package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _Creator_ProtoDecoder implements InterfaceC31105CIr<Creator> {
    public static Creator LIZIZ(Q9H q9h) {
        Creator creator = new Creator();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    creator.roomContinue = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return creator;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Creator LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
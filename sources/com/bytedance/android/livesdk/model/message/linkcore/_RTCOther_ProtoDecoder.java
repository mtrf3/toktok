package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _RTCOther_ProtoDecoder implements InterfaceC31105CIr<RTCOther> {
    public static RTCOther LIZIZ(Q9H q9h) {
        RTCOther rTCOther = new RTCOther();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rTCOther.transCodingSecond = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rTCOther;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RTCOther LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

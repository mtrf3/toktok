package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PinInfo_ProtoDecoder implements InterfaceC31105CIr<PinInfo> {
    public static PinInfo LIZIZ(Q9H q9h) {
        PinInfo pinInfo = new PinInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        pinInfo.displayDuration = q9h.LJIIJJI();
                    }
                } else {
                    pinInfo.pinEnabled = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pinInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PinInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

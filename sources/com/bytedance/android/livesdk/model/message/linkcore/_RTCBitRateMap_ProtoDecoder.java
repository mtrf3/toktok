package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _RTCBitRateMap_ProtoDecoder implements InterfaceC31105CIr<RTCBitRateMap> {
    public static RTCBitRateMap LIZIZ(Q9H q9h) {
        RTCBitRateMap rTCBitRateMap = new RTCBitRateMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                rTCBitRateMap.xx_4 = q9h.LJIIJ();
                            }
                        } else {
                            rTCBitRateMap.xx_3 = q9h.LJIIJ();
                        }
                    } else {
                        rTCBitRateMap.xx_2 = q9h.LJIIJ();
                    }
                } else {
                    rTCBitRateMap.xx_1 = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rTCBitRateMap;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RTCBitRateMap LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

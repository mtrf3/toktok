package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _RTCVideoParam_ProtoDecoder implements InterfaceC31105CIr<RTCVideoParam> {
    public static RTCVideoParam LIZIZ(Q9H q9h) {
        RTCVideoParam rTCVideoParam = new RTCVideoParam();
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
                                rTCVideoParam.bitRate = q9h.LJIIJ();
                            }
                        } else {
                            rTCVideoParam.fps = q9h.LJIIJ();
                        }
                    } else {
                        rTCVideoParam.height = q9h.LJIIJ();
                    }
                } else {
                    rTCVideoParam.width = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rTCVideoParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RTCVideoParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

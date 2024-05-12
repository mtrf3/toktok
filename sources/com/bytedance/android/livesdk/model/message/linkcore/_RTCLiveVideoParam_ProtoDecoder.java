package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _RTCLiveVideoParam_ProtoDecoder implements InterfaceC31105CIr<RTCLiveVideoParam> {
    public static RTCLiveVideoParam LIZIZ(Q9H q9h) {
        RTCLiveVideoParam rTCLiveVideoParam = new RTCLiveVideoParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        rTCLiveVideoParam.serverDefineParam = _RTCVideoParam_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    rTCLiveVideoParam.strategyId = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rTCLiveVideoParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RTCLiveVideoParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

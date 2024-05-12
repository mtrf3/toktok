package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes12.dex */
public final class _RTCMixParam_ProtoDecoder implements InterfaceC31105CIr<RTCMixParam> {
    @Override // X.InterfaceC31105CIr
    public final RTCMixParam LIZ(Q9H q9h) {
        RTCMixParam rTCMixParam = new RTCMixParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rTCMixParam.videoBitRate = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rTCMixParam;
            }
        }
    }
}

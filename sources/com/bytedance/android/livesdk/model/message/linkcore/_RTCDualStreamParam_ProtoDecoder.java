package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _RTCDualStreamParam_ProtoDecoder implements InterfaceC31105CIr<RTCDualStreamParam> {
    @Override // X.InterfaceC31105CIr
    public final RTCDualStreamParam LIZ(Q9H q9h) {
        RTCDualStreamParam rTCDualStreamParam = new RTCDualStreamParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    rTCDualStreamParam.sdVideoParam = _RTCVideoParam_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                rTCDualStreamParam.hdVideoParam = _RTCVideoParam_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            rTCDualStreamParam.autoSwitchUserNum = q9h.LJIIJ();
                        }
                    } else {
                        rTCDualStreamParam.autoSwitch = q9h.LJIIJ();
                    }
                } else {
                    rTCDualStreamParam.defaultStreamType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rTCDualStreamParam;
            }
        }
    }
}

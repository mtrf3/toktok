package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes12.dex */
public final class _RTCEngineConfig_ProtoDecoder implements InterfaceC31105CIr<RTCEngineConfig> {
    public static RTCEngineConfig LIZIZ(Q9H q9h) {
        RTCEngineConfig rTCEngineConfig = new RTCEngineConfig();
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
                                rTCEngineConfig.rtcChannelId = q9h.LJIIJJI();
                            }
                        } else {
                            rTCEngineConfig.rtcToken = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        rTCEngineConfig.rtcUserId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    rTCEngineConfig.rtcAppId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rTCEngineConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RTCEngineConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

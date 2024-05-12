package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class _RTCExtraInfo_ProtoDecoder implements InterfaceC31105CIr<RTCExtraInfo> {
    public static RTCExtraInfo LIZIZ(Q9H q9h) {
        RTCExtraInfo rTCExtraInfo = new RTCExtraInfo();
        rTCExtraInfo.rtcVideoParam = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rTCExtraInfo.config = _RTCEngineConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        rTCExtraInfo.rtcVideoParam.add(_RTCLiveVideoParam_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        rTCExtraInfo.rtcBitRateMap = _RTCBitRateMap_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        rTCExtraInfo.rtcFps = q9h.LJIIJ();
                        break;
                    case 5:
                        rTCExtraInfo.rtcMixBase = _RTCMixBase_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        rTCExtraInfo.byteRtcExtInfo = _ByteRTCExtInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        rTCExtraInfo.rtcInfoExtra = _RTCInfoExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        rTCExtraInfo.rtcBusinessId = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        rTCExtraInfo.rtcOther = _RTCOther_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        rTCExtraInfo.interactClientType = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rTCExtraInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RTCExtraInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

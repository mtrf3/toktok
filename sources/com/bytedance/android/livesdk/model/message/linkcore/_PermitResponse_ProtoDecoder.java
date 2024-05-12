package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _PermitResponse_ProtoDecoder implements InterfaceC31105CIr<PermitResponse> {
    @Override // X.InterfaceC31105CIr
    public final PermitResponse LIZ(Q9H q9h) {
        PermitResponse permitResponse = new PermitResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        permitResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        permitResponse.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        permitResponse.linkMicId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        permitResponse.position = _MicPositionData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        permitResponse.applier = _Player_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        permitResponse.applierLinkMicId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return permitResponse;
            }
        }
    }
}

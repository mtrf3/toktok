package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizApplyResponse_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ApplyRequestResponse_ProtoDecoder implements InterfaceC31105CIr<ApplyRequestResponse> {
    @Override // X.InterfaceC31105CIr
    public final ApplyRequestResponse LIZ(Q9H q9h) {
        ApplyRequestResponse applyRequestResponse = new ApplyRequestResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 9527) {
                                Q9J.LIZJ(q9h);
                            } else {
                                applyRequestResponse.multiGuestRespExtra = _BizApplyResponse_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            applyRequestResponse.applicantLinkMicId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        applyRequestResponse.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    applyRequestResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return applyRequestResponse;
            }
        }
    }
}

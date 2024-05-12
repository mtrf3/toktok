package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizReplyResponse_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ReplyResponse_ProtoDecoder implements InterfaceC31105CIr<ReplyResponse> {
    @Override // X.InterfaceC31105CIr
    public final ReplyResponse LIZ(Q9H q9h) {
        ReplyResponse replyResponse = new ReplyResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 9527) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    replyResponse.multiGuestRespExtra = _BizReplyResponse_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                replyResponse.position = _MicPositionData_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            replyResponse.inviteeLinkMicId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        replyResponse.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    replyResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return replyResponse;
            }
        }
    }
}

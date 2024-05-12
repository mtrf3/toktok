package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _InviteResponse_ProtoDecoder implements InterfaceC31105CIr<InviteResponse> {
    @Override // X.InterfaceC31105CIr
    public final InviteResponse LIZ(Q9H q9h) {
        InviteResponse inviteResponse = new InviteResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        inviteResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        inviteResponse.channelId = q9h.LJIIJJI();
                        break;
                    case 3:
                        inviteResponse.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        inviteResponse.inviterLinkMicId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        inviteResponse.inviteeLinkMicId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        inviteResponse.inviteSeqId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return inviteResponse;
            }
        }
    }
}

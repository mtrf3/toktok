package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _InviteContent_ProtoDecoder implements InterfaceC31105CIr<InviteContent> {
    public static InviteContent LIZIZ(Q9H q9h) {
        InviteContent inviteContent = new InviteContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        inviteContent.inviter = _Player_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        inviteContent.inviteeRTCInfo = _RTCExtraInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        inviteContent.inviterLinkMicId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        inviteContent.inviteeLinkMicId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        inviteContent.isOwner = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        inviteContent.positionData = _MicPositionData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        inviteContent.dsl = _DSLConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        inviteContent.invitee = _Player_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        inviteContent.operator = _Player_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return inviteContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InviteContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

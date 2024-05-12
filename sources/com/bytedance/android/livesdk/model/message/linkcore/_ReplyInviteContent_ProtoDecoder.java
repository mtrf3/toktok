package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ReplyInviteContent_ProtoDecoder implements InterfaceC31105CIr<ReplyInviteContent> {
    public static ReplyInviteContent LIZIZ(Q9H q9h) {
        ReplyInviteContent replyInviteContent = new ReplyInviteContent();
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
                                    replyInviteContent.inviteOperatorUser = _Player_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                replyInviteContent.positionData = _MicPositionData_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            replyInviteContent.inviteeLinkMicId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        replyInviteContent.replyStatus = q9h.LJIIJ();
                    }
                } else {
                    replyInviteContent.invitee = _Player_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return replyInviteContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReplyInviteContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

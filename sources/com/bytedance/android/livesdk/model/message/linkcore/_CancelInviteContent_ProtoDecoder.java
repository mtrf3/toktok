package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _CancelInviteContent_ProtoDecoder implements InterfaceC31105CIr<CancelInviteContent> {
    public static CancelInviteContent LIZIZ(Q9H q9h) {
        CancelInviteContent cancelInviteContent = new CancelInviteContent();
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
                                    cancelInviteContent.invitee = _Player_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                cancelInviteContent.inviteSeqId = q9h.LJIIJJI();
                            }
                        } else {
                            cancelInviteContent.inviteeLinkMicId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        cancelInviteContent.inviterLinkMicId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    cancelInviteContent.inviter = _Player_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cancelInviteContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CancelInviteContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

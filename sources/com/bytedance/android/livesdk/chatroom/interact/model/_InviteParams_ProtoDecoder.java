package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _InviteParams_ProtoDecoder implements InterfaceC31105CIr<InviteParams> {
    @Override // X.InterfaceC31105CIr
    public final InviteParams LIZ(Q9H q9h) {
        InviteParams inviteParams = new InviteParams();
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
                                inviteParams.invitationMicIdx = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            inviteParams.effectiveSeconds = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        inviteParams.toUserId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    inviteParams.roomId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return inviteParams;
            }
        }
    }
}
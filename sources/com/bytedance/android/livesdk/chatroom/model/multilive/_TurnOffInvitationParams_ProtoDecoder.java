package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _TurnOffInvitationParams_ProtoDecoder implements InterfaceC31105CIr<TurnOffInvitationParams> {
    @Override // X.InterfaceC31105CIr
    public final TurnOffInvitationParams LIZ(Q9H q9h) {
        TurnOffInvitationParams turnOffInvitationParams = new TurnOffInvitationParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    turnOffInvitationParams.roomId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return turnOffInvitationParams;
            }
        }
    }
}

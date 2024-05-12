package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multilive.TurnOffInvitationResponse;

/* loaded from: classes14.dex */
public final class _TurnOffInvitationResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<TurnOffInvitationResponse.Extra> {
    public static TurnOffInvitationResponse.Extra LIZIZ(Q9H q9h) {
        TurnOffInvitationResponse.Extra extra = new TurnOffInvitationResponse.Extra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    extra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return extra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TurnOffInvitationResponse.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

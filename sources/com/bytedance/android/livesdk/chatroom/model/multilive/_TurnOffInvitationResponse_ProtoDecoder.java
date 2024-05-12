package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multilive.TurnOffInvitationResponse;

/* loaded from: classes14.dex */
public final class _TurnOffInvitationResponse_ProtoDecoder implements InterfaceC31105CIr<TurnOffInvitationResponse> {
    @Override // X.InterfaceC31105CIr
    public final TurnOffInvitationResponse LIZ(Q9H q9h) {
        TurnOffInvitationResponse turnOffInvitationResponse = new TurnOffInvitationResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        turnOffInvitationResponse.extra = _TurnOffInvitationResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    TurnOffInvitationResponse.ResponseData responseData = new TurnOffInvitationResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    turnOffInvitationResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return turnOffInvitationResponse;
            }
        }
    }
}

package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multilive.TurnOffInvitationResponse;

/* loaded from: classes14.dex */
public final class _TurnOffInvitationResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<TurnOffInvitationResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final TurnOffInvitationResponse.ResponseData LIZ(Q9H q9h) {
        TurnOffInvitationResponse.ResponseData responseData = new TurnOffInvitationResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}

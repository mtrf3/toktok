package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.SharedInvitationCallbackResponse;

/* loaded from: classes14.dex */
public final class _SharedInvitationCallbackResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<SharedInvitationCallbackResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final SharedInvitationCallbackResponse.ResponseData LIZ(Q9H q9h) {
        SharedInvitationCallbackResponse.ResponseData responseData = new SharedInvitationCallbackResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}

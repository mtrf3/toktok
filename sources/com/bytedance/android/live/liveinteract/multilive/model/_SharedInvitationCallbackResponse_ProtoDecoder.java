package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.SharedInvitationCallbackResponse;

/* loaded from: classes14.dex */
public final class _SharedInvitationCallbackResponse_ProtoDecoder implements InterfaceC31105CIr<SharedInvitationCallbackResponse> {
    @Override // X.InterfaceC31105CIr
    public final SharedInvitationCallbackResponse LIZ(Q9H q9h) {
        SharedInvitationCallbackResponse sharedInvitationCallbackResponse = new SharedInvitationCallbackResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    SharedInvitationCallbackResponse.ResponseData responseData = new SharedInvitationCallbackResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    sharedInvitationCallbackResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return sharedInvitationCallbackResponse;
            }
        }
    }
}

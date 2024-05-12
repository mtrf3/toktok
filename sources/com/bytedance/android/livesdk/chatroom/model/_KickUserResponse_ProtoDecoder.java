package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _KickUserResponse_ProtoDecoder implements InterfaceC31105CIr<KickUserResponse> {
    @Override // X.InterfaceC31105CIr
    public final KickUserResponse LIZ(Q9H q9h) {
        KickUserResponse kickUserResponse = new KickUserResponse();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return kickUserResponse;
    }
}

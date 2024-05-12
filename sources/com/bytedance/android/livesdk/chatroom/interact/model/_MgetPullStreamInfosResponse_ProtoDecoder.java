package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _MgetPullStreamInfosResponse_ProtoDecoder implements InterfaceC31105CIr<MgetPullStreamInfosResponse> {
    @Override // X.InterfaceC31105CIr
    public final MgetPullStreamInfosResponse LIZ(Q9H q9h) {
        MgetPullStreamInfosResponse mgetPullStreamInfosResponse = new MgetPullStreamInfosResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    mgetPullStreamInfosResponse.data = _MgetPullStreamInfosResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return mgetPullStreamInfosResponse;
            }
        }
    }
}

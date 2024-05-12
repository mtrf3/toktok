package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LikeResponse_ProtoDecoder implements InterfaceC31105CIr<LikeResponse> {
    @Override // X.InterfaceC31105CIr
    public final LikeResponse LIZ(Q9H q9h) {
        LikeResponse likeResponse = new LikeResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    likeResponse.data = _LikeResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return likeResponse;
            }
        }
    }
}

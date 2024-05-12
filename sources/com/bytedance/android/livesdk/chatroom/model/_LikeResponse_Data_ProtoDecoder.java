package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.LikeResponse;

/* loaded from: classes6.dex */
public final class _LikeResponse_Data_ProtoDecoder implements InterfaceC31105CIr<LikeResponse.Data> {
    public static LikeResponse.Data LIZIZ(Q9H q9h) {
        LikeResponse.Data data = new LikeResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.result = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LikeResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

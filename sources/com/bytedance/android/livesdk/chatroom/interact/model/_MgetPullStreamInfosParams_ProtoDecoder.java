package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _MgetPullStreamInfosParams_ProtoDecoder implements InterfaceC31105CIr<MgetPullStreamInfosParams> {
    @Override // X.InterfaceC31105CIr
    public final MgetPullStreamInfosParams LIZ(Q9H q9h) {
        MgetPullStreamInfosParams mgetPullStreamInfosParams = new MgetPullStreamInfosParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    mgetPullStreamInfosParams.roomIds = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return mgetPullStreamInfosParams;
            }
        }
    }
}

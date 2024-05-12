package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.interact._LinkInitResult_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _InitResponse_ProtoDecoder implements InterfaceC31105CIr<InitResponse> {
    @Override // X.InterfaceC31105CIr
    public final InitResponse LIZ(Q9H q9h) {
        InitResponse initResponse = new InitResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    initResponse.data = _LinkInitResult_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return initResponse;
            }
        }
    }
}

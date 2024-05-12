package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model._ApplyResult_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ApplyResponse_ProtoDecoder implements InterfaceC31105CIr<ApplyResponse> {
    @Override // X.InterfaceC31105CIr
    public final ApplyResponse LIZ(Q9H q9h) {
        ApplyResponse applyResponse = new ApplyResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    applyResponse.data = _ApplyResult_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return applyResponse;
            }
        }
    }
}

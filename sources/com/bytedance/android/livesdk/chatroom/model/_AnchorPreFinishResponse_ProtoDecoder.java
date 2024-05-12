package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _AnchorPreFinishResponse_ProtoDecoder implements InterfaceC31105CIr<AnchorPreFinishResponse> {
    @Override // X.InterfaceC31105CIr
    public final AnchorPreFinishResponse LIZ(Q9H q9h) {
        AnchorPreFinishResponse anchorPreFinishResponse = new AnchorPreFinishResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    anchorPreFinishResponse.data = _AnchorPreFinishData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorPreFinishResponse;
            }
        }
    }
}

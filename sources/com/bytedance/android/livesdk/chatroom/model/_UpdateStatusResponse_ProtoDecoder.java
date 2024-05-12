package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _UpdateStatusResponse_ProtoDecoder implements InterfaceC31105CIr<UpdateStatusResponse> {
    @Override // X.InterfaceC31105CIr
    public final UpdateStatusResponse LIZ(Q9H q9h) {
        UpdateStatusResponse updateStatusResponse = new UpdateStatusResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    updateStatusResponse.data = _UpdateStatusResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return updateStatusResponse;
            }
        }
    }
}

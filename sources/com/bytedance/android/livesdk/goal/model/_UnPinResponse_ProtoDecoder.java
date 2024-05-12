package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _UnPinResponse_ProtoDecoder implements InterfaceC31105CIr<UnPinResponse> {
    @Override // X.InterfaceC31105CIr
    public final UnPinResponse LIZ(Q9H q9h) {
        UnPinResponse unPinResponse = new UnPinResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    unPinResponse.data = _UnPinResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return unPinResponse;
            }
        }
    }
}

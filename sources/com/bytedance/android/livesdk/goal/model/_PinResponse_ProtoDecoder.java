package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PinResponse_ProtoDecoder implements InterfaceC31105CIr<PinResponse> {
    @Override // X.InterfaceC31105CIr
    public final PinResponse LIZ(Q9H q9h) {
        PinResponse pinResponse = new PinResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    pinResponse.data = _PinResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pinResponse;
            }
        }
    }
}

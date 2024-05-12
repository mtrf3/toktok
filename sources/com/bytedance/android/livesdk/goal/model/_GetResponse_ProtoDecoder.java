package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetResponse_ProtoDecoder implements InterfaceC31105CIr<GetResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetResponse LIZ(Q9H q9h) {
        GetResponse getResponse = new GetResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getResponse.data = _GetResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getResponse;
            }
        }
    }
}

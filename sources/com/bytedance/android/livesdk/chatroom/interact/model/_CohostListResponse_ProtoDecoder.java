package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _CohostListResponse_ProtoDecoder implements InterfaceC31105CIr<CohostListResponse> {
    @Override // X.InterfaceC31105CIr
    public final CohostListResponse LIZ(Q9H q9h) {
        CohostListResponse cohostListResponse = new CohostListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    cohostListResponse.data = _CohostListResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostListResponse;
            }
        }
    }
}

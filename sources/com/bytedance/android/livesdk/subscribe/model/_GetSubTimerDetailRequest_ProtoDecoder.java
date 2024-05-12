package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GetSubTimerDetailRequest_ProtoDecoder implements InterfaceC31105CIr<GetSubTimerDetailRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetSubTimerDetailRequest LIZ(Q9H q9h) {
        GetSubTimerDetailRequest getSubTimerDetailRequest = new GetSubTimerDetailRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getSubTimerDetailRequest.secAnchorId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    getSubTimerDetailRequest.forAnchor = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getSubTimerDetailRequest;
            }
        }
    }
}

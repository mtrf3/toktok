package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetSubTimerDetailResponse_ProtoDecoder implements InterfaceC31105CIr<GetSubTimerDetailResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetSubTimerDetailResponse LIZ(Q9H q9h) {
        GetSubTimerDetailResponse getSubTimerDetailResponse = new GetSubTimerDetailResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getSubTimerDetailResponse.extra = _GetSubTimerDetailResponse_ResponseExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    getSubTimerDetailResponse.data = _GetSubTimerDetailResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getSubTimerDetailResponse;
            }
        }
    }
}

package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _MultiGuestReserveResponse_ProtoDecoder implements InterfaceC31105CIr<MultiGuestReserveResponse> {
    @Override // X.InterfaceC31105CIr
    public final MultiGuestReserveResponse LIZ(Q9H q9h) {
        MultiGuestReserveResponse multiGuestReserveResponse = new MultiGuestReserveResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        multiGuestReserveResponse.extra = _MultiGuestReserveResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    multiGuestReserveResponse.data = _MultiGuestReserveResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return multiGuestReserveResponse;
            }
        }
    }
}

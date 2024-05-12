package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _FinishShowingGuestResponse_ProtoDecoder implements InterfaceC31105CIr<FinishShowingGuestResponse> {
    @Override // X.InterfaceC31105CIr
    public final FinishShowingGuestResponse LIZ(Q9H q9h) {
        FinishShowingGuestResponse finishShowingGuestResponse = new FinishShowingGuestResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    finishShowingGuestResponse.data = _FinishShowingGuestResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return finishShowingGuestResponse;
            }
        }
    }
}

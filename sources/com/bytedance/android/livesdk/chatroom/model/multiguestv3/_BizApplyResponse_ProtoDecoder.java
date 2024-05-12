package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizApplyResponse_ProtoDecoder implements InterfaceC31105CIr<BizApplyResponse> {
    public static BizApplyResponse LIZIZ(Q9H q9h) {
        BizApplyResponse bizApplyResponse = new BizApplyResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizApplyResponse.responseData = _BizApplyResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bizApplyResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizApplyResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

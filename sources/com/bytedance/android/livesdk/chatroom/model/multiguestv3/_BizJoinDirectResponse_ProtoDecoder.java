package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizJoinDirectResponse_ProtoDecoder implements InterfaceC31105CIr<BizJoinDirectResponse> {
    public static BizJoinDirectResponse LIZIZ(Q9H q9h) {
        BizJoinDirectResponse bizJoinDirectResponse = new BizJoinDirectResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizJoinDirectResponse.responseData = _BizJoinDirectResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bizJoinDirectResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizJoinDirectResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

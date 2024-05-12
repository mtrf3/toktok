package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizReplyResponse_ProtoDecoder implements InterfaceC31105CIr<BizReplyResponse> {
    public static BizReplyResponse LIZIZ(Q9H q9h) {
        BizReplyResponse bizReplyResponse = new BizReplyResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizReplyResponse.responseData = _BizReplyResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bizReplyResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizReplyResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

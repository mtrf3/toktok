package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizCreateChannelResponse_ProtoDecoder implements InterfaceC31105CIr<BizCreateChannelResponse> {
    public static BizCreateChannelResponse LIZIZ(Q9H q9h) {
        BizCreateChannelResponse bizCreateChannelResponse = new BizCreateChannelResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizCreateChannelResponse.responseData = _BizCreateChannelResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bizCreateChannelResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizCreateChannelResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

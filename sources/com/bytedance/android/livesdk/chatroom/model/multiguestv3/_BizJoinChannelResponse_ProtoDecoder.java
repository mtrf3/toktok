package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizJoinChannelResponse_ProtoDecoder implements InterfaceC31105CIr<BizJoinChannelResponse> {
    public static BizJoinChannelResponse LIZIZ(Q9H q9h) {
        BizJoinChannelResponse bizJoinChannelResponse = new BizJoinChannelResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizJoinChannelResponse.responseData = _BizJoinChannelResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return bizJoinChannelResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizJoinChannelResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

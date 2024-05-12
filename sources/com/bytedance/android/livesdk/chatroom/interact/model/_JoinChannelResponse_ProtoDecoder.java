package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.JoinChannelResponse;

/* loaded from: classes14.dex */
public final class _JoinChannelResponse_ProtoDecoder implements InterfaceC31105CIr<JoinChannelResponse> {
    @Override // X.InterfaceC31105CIr
    public final JoinChannelResponse LIZ(Q9H q9h) {
        JoinChannelResponse joinChannelResponse = new JoinChannelResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    JoinChannelResponse.ResponseData responseData = new JoinChannelResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    joinChannelResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return joinChannelResponse;
            }
        }
    }
}

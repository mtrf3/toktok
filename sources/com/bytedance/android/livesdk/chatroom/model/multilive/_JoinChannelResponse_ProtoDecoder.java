package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

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
                    joinChannelResponse.data = _MultiLiveLayoutInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return joinChannelResponse;
            }
        }
    }
}

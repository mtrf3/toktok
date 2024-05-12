package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizJoinChannelResponse_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _JoinChannelResp_ProtoDecoder implements InterfaceC31105CIr<JoinChannelResp> {
    @Override // X.InterfaceC31105CIr
    public final JoinChannelResp LIZ(Q9H q9h) {
        JoinChannelResp joinChannelResp = new JoinChannelResp();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 9527) {
                            Q9J.LIZJ(q9h);
                        } else {
                            joinChannelResp.multiGuestRespExtra = _BizJoinChannelResponse_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        joinChannelResp.linkLayerListUser = _LinkLayerListUser_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    joinChannelResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return joinChannelResp;
            }
        }
    }
}

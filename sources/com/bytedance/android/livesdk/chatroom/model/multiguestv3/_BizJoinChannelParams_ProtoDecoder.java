package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizJoinChannelParams_ProtoDecoder implements InterfaceC31105CIr<BizJoinChannelParams> {
    @Override // X.InterfaceC31105CIr
    public final BizJoinChannelParams LIZ(Q9H q9h) {
        BizJoinChannelParams bizJoinChannelParams = new BizJoinChannelParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    bizJoinChannelParams.anchorId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizJoinChannelParams;
            }
        }
    }
}
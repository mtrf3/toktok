package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizJoinChannelResponseData_ProtoDecoder implements InterfaceC31105CIr<BizJoinChannelResponseData> {
    public static BizJoinChannelResponseData LIZIZ(Q9H q9h) {
        BizJoinChannelResponseData bizJoinChannelResponseData = new BizJoinChannelResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        bizJoinChannelResponseData.fixMicNumAction = q9h.LJIIJ();
                    }
                } else {
                    bizJoinChannelResponseData.layoutTypeAction = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizJoinChannelResponseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizJoinChannelResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizReplyResponseData_ProtoDecoder implements InterfaceC31105CIr<BizReplyResponseData> {
    public static BizReplyResponseData LIZIZ(Q9H q9h) {
        BizReplyResponseData bizReplyResponseData = new BizReplyResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            bizReplyResponseData.fixMicNumAction = q9h.LJIIJ();
                        }
                    } else {
                        bizReplyResponseData.layoutTypeAction = q9h.LJIIJ();
                    }
                } else {
                    bizReplyResponseData.linkTypePermission = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizReplyResponseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizReplyResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _BizApplyResponseData_ProtoDecoder implements InterfaceC31105CIr<BizApplyResponseData> {
    public static BizApplyResponseData LIZIZ(Q9H q9h) {
        BizApplyResponseData bizApplyResponseData = new BizApplyResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        bizApplyResponseData.perceptionInfo = _PerceptionMessage_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    bizApplyResponseData.linkTypePermission = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizApplyResponseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizApplyResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

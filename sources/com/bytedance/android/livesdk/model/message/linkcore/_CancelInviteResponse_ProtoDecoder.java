package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _CancelInviteResponse_ProtoDecoder implements InterfaceC31105CIr<CancelInviteResponse> {
    @Override // X.InterfaceC31105CIr
    public final CancelInviteResponse LIZ(Q9H q9h) {
        CancelInviteResponse cancelInviteResponse = new CancelInviteResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    cancelInviteResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cancelInviteResponse;
            }
        }
    }
}

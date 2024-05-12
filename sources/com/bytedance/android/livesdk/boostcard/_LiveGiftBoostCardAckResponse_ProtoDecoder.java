package com.bytedance.android.livesdk.boostcard;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LiveGiftBoostCardAckResponse_ProtoDecoder implements InterfaceC31105CIr<LiveGiftBoostCardAckResponse> {
    @Override // X.InterfaceC31105CIr
    public final LiveGiftBoostCardAckResponse LIZ(Q9H q9h) {
        LiveGiftBoostCardAckResponse liveGiftBoostCardAckResponse = new LiveGiftBoostCardAckResponse();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return liveGiftBoostCardAckResponse;
    }
}

package com.bytedance.android.livesdk.boostcard;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _LiveGiftBoostCardUserStatusResponse_ProtoDecoder implements InterfaceC31105CIr<LiveGiftBoostCardUserStatusResponse> {
    @Override // X.InterfaceC31105CIr
    public final LiveGiftBoostCardUserStatusResponse LIZ(Q9H q9h) {
        LiveGiftBoostCardUserStatusResponse liveGiftBoostCardUserStatusResponse = new LiveGiftBoostCardUserStatusResponse();
        liveGiftBoostCardUserStatusResponse.mPoints = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        liveGiftBoostCardUserStatusResponse.mPoints.add(_BoostedUsersPoint_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    liveGiftBoostCardUserStatusResponse.mTotalUsers = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return liveGiftBoostCardUserStatusResponse;
            }
        }
    }
}

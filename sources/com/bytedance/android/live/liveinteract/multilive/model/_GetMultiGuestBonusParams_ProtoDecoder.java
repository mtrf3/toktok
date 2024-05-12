package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GetMultiGuestBonusParams_ProtoDecoder implements InterfaceC31105CIr<GetMultiGuestBonusParams> {
    @Override // X.InterfaceC31105CIr
    public final GetMultiGuestBonusParams LIZ(Q9H q9h) {
        GetMultiGuestBonusParams getMultiGuestBonusParams = new GetMultiGuestBonusParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getMultiGuestBonusParams.anchorId = q9h.LJIIJJI();
                    }
                } else {
                    getMultiGuestBonusParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return getMultiGuestBonusParams;
            }
        }
    }
}

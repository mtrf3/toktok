package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _FinishShowingGuestParams_ProtoDecoder implements InterfaceC31105CIr<FinishShowingGuestParams> {
    @Override // X.InterfaceC31105CIr
    public final FinishShowingGuestParams LIZ(Q9H q9h) {
        FinishShowingGuestParams finishShowingGuestParams = new FinishShowingGuestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                finishShowingGuestParams.targetUserId = q9h.LJIIJJI();
                            }
                        } else {
                            finishShowingGuestParams.showId = q9h.LJIIJJI();
                        }
                    } else {
                        finishShowingGuestParams.channelId = q9h.LJIIJJI();
                    }
                } else {
                    finishShowingGuestParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return finishShowingGuestParams;
            }
        }
    }
}

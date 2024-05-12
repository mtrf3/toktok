package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ShowAgainGuestParams_ProtoDecoder implements InterfaceC31105CIr<ShowAgainGuestParams> {
    @Override // X.InterfaceC31105CIr
    public final ShowAgainGuestParams LIZ(Q9H q9h) {
        ShowAgainGuestParams showAgainGuestParams = new ShowAgainGuestParams();
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
                                showAgainGuestParams.targetUserId = q9h.LJIIJJI();
                            }
                        } else {
                            showAgainGuestParams.showId = q9h.LJIIJJI();
                        }
                    } else {
                        showAgainGuestParams.channelId = q9h.LJIIJJI();
                    }
                } else {
                    showAgainGuestParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return showAgainGuestParams;
            }
        }
    }
}

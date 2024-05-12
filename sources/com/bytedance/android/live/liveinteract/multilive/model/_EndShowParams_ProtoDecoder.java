package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _EndShowParams_ProtoDecoder implements InterfaceC31105CIr<EndShowParams> {
    @Override // X.InterfaceC31105CIr
    public final EndShowParams LIZ(Q9H q9h) {
        EndShowParams endShowParams = new EndShowParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            endShowParams.showId = q9h.LJIIJJI();
                        }
                    } else {
                        endShowParams.channelId = q9h.LJIIJJI();
                    }
                } else {
                    endShowParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return endShowParams;
            }
        }
    }
}

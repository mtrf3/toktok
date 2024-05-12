package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BEFViewRenderSize_ProtoDecoder implements InterfaceC31105CIr<BEFViewRenderSize> {
    public static BEFViewRenderSize LIZIZ(Q9H q9h) {
        BEFViewRenderSize bEFViewRenderSize = new BEFViewRenderSize();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        bEFViewRenderSize.height = q9h.LJIIJ();
                    }
                } else {
                    bEFViewRenderSize.with = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return bEFViewRenderSize;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BEFViewRenderSize LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

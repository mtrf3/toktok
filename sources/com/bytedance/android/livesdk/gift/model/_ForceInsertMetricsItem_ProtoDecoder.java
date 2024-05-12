package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ForceInsertMetricsItem_ProtoDecoder implements InterfaceC31105CIr<ForceInsertMetricsItem> {
    public static ForceInsertMetricsItem LIZIZ(Q9H q9h) {
        ForceInsertMetricsItem forceInsertMetricsItem = new ForceInsertMetricsItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        forceInsertMetricsItem.forceIndexConfig = q9h.LJIIJ();
                    }
                } else {
                    forceInsertMetricsItem.forceInsertType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return forceInsertMetricsItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ForceInsertMetricsItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

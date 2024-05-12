package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _PopSeries_ProtoDecoder implements InterfaceC31105CIr<PopSeries> {
    public static PopSeries LIZIZ(Q9H q9h) {
        PopSeries popSeries = new PopSeries();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    popSeries.collectionId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return popSeries;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PopSeries LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

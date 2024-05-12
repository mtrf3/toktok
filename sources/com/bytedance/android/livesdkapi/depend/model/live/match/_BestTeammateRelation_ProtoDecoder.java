package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BestTeammateRelation_ProtoDecoder implements InterfaceC31105CIr<BestTeammateRelation> {
    public static BestTeammateRelation LIZIZ(Q9H q9h) {
        BestTeammateRelation bestTeammateRelation = new BestTeammateRelation();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        bestTeammateRelation.bestTeammateId = q9h.LJIIJJI();
                    }
                } else {
                    bestTeammateRelation.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bestTeammateRelation;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BestTeammateRelation LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

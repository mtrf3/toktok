package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattleTruthOrDareOptOutNotice_ProtoDecoder implements InterfaceC31105CIr<BattleTruthOrDareOptOutNotice> {
    public static BattleTruthOrDareOptOutNotice LIZIZ(Q9H q9h) {
        BattleTruthOrDareOptOutNotice battleTruthOrDareOptOutNotice = new BattleTruthOrDareOptOutNotice();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    battleTruthOrDareOptOutNotice.closeContentKey = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTruthOrDareOptOutNotice;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTruthOrDareOptOutNotice LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

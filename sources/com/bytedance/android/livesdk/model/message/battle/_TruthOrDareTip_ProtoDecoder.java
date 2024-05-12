package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _TruthOrDareTip_ProtoDecoder implements InterfaceC31105CIr<TruthOrDareTip> {
    public static TruthOrDareTip LIZIZ(Q9H q9h) {
        TruthOrDareTip truthOrDareTip = new TruthOrDareTip();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        truthOrDareTip.tipContent = Q9J.LIZIZ(q9h);
                    }
                } else {
                    truthOrDareTip.tipType = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return truthOrDareTip;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TruthOrDareTip LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

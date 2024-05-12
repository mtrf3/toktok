package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _PictionaryStatistics_ProtoDecoder implements InterfaceC31105CIr<PictionaryStatistics> {
    public static PictionaryStatistics LIZIZ(Q9H q9h) {
        PictionaryStatistics pictionaryStatistics = new PictionaryStatistics();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            pictionaryStatistics.firstUser = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        pictionaryStatistics.guessTotalPv = q9h.LJIIJJI();
                    }
                } else {
                    pictionaryStatistics.guessCorrectUv = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return pictionaryStatistics;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PictionaryStatistics LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

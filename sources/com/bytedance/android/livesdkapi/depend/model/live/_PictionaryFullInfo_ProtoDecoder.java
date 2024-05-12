package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PictionaryInfo_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _PictionaryFullInfo_ProtoDecoder implements InterfaceC31105CIr<PictionaryFullInfo> {
    public static PictionaryFullInfo LIZIZ(Q9H q9h) {
        PictionaryFullInfo pictionaryFullInfo = new PictionaryFullInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            pictionaryFullInfo.guessCorrect = Q9J.LIZ(q9h);
                        }
                    } else {
                        pictionaryFullInfo.pictionaryStatistics = _PictionaryStatistics_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    pictionaryFullInfo.pictionaryInfo = _PictionaryInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pictionaryFullInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PictionaryFullInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

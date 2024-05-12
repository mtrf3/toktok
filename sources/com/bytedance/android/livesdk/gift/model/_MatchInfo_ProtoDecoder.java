package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _MatchInfo_ProtoDecoder implements InterfaceC31105CIr<MatchInfo> {
    public static MatchInfo LIZIZ(Q9H q9h) {
        MatchInfo matchInfo = new MatchInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    matchInfo.critical = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return matchInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MatchInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

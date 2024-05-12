package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _LiveFragmentShowInfo_ProtoDecoder implements InterfaceC31105CIr<LiveFragmentShowInfo> {
    public static LiveFragmentShowInfo LIZIZ(Q9H q9h) {
        LiveFragmentShowInfo liveFragmentShowInfo = new LiveFragmentShowInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        liveFragmentShowInfo.desc = Q9J.LIZIZ(q9h);
                    }
                } else {
                    liveFragmentShowInfo.icon = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveFragmentShowInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveFragmentShowInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _CoverQuality_ProtoDecoder implements InterfaceC31105CIr<CoverQuality> {
    @Override // X.InterfaceC31105CIr
    public final CoverQuality LIZ(Q9H q9h) {
        CoverQuality coverQuality = new CoverQuality();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                coverQuality.uri = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            coverQuality.popTip = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        coverQuality.bubbleTip = Q9J.LIZIZ(q9h);
                    }
                } else {
                    coverQuality.level = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return coverQuality;
            }
        }
    }
}
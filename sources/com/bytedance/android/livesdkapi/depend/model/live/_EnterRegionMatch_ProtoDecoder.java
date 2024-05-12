package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class _EnterRegionMatch_ProtoDecoder implements InterfaceC31105CIr<EnterRegionMatch> {
    public static EnterRegionMatch LIZIZ(Q9H q9h) {
        EnterRegionMatch enterRegionMatch = new EnterRegionMatch();
        enterRegionMatch.denyList = new ArrayList();
        enterRegionMatch.allowList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            enterRegionMatch.denyList.add(Q9J.LIZIZ(q9h));
                        }
                    } else {
                        enterRegionMatch.allowList.add(Q9J.LIZIZ(q9h));
                    }
                } else {
                    enterRegionMatch.type = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return enterRegionMatch;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EnterRegionMatch LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _RegionalRestricted_ProtoDecoder implements InterfaceC31105CIr<RegionalRestricted> {
    public static RegionalRestricted LIZIZ(Q9H q9h) {
        RegionalRestricted regionalRestricted = new RegionalRestricted();
        regionalRestricted.blockList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    regionalRestricted.blockList.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return regionalRestricted;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RegionalRestricted LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

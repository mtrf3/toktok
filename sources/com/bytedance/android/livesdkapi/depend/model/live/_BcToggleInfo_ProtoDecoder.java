package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BcToggleInfo_ProtoDecoder implements InterfaceC31105CIr<BcToggleInfo> {
    public static BcToggleInfo LIZIZ(Q9H q9h) {
        BcToggleInfo bcToggleInfo = new BcToggleInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            bcToggleInfo.showInterval = (int) q9h.LJIIJJI();
                        }
                    } else {
                        bcToggleInfo.toggleText = Q9J.LIZIZ(q9h);
                    }
                } else {
                    bcToggleInfo.status = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bcToggleInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BcToggleInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

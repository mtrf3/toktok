package com.bytedance.android.livesdk.wallet;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _NoticesRequestParams_ProtoDecoder implements InterfaceC31105CIr<NoticesRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final NoticesRequestParams LIZ(Q9H q9h) {
        NoticesRequestParams noticesRequestParams = new NoticesRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        noticesRequestParams.currency = Q9J.LIZIZ(q9h);
                    }
                } else {
                    noticesRequestParams.viewName = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return noticesRequestParams;
            }
        }
    }
}

package com.bytedance.android.livesdk.wallet;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.wallet.NoticesResult;

/* loaded from: classes14.dex */
public final class _NoticesResult_Style_ProtoDecoder implements InterfaceC31105CIr<NoticesResult.Style> {
    public static NoticesResult.Style LIZIZ(Q9H q9h) {
        NoticesResult.Style style = new NoticesResult.Style();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            style.notificationStyle = q9h.LJIIJ();
                        }
                    } else {
                        style.icon = q9h.LJIIJ();
                    }
                } else {
                    style.backgroundColorCode = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return style;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NoticesResult.Style LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

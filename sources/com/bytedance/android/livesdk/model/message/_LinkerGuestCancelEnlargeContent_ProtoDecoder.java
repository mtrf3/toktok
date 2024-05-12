package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerGuestCancelEnlargeContent_ProtoDecoder implements InterfaceC31105CIr<LinkerGuestCancelEnlargeContent> {
    public static LinkerGuestCancelEnlargeContent LIZIZ(Q9H q9h) {
        LinkerGuestCancelEnlargeContent linkerGuestCancelEnlargeContent = new LinkerGuestCancelEnlargeContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            linkerGuestCancelEnlargeContent.cancelLinkmicId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        linkerGuestCancelEnlargeContent.isRejectEnlarge = q9h.LJIIJ();
                    }
                } else {
                    linkerGuestCancelEnlargeContent.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerGuestCancelEnlargeContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerGuestCancelEnlargeContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

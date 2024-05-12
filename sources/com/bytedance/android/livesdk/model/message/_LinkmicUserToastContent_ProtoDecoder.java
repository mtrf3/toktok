package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkmicUserToastContent_ProtoDecoder implements InterfaceC31105CIr<LinkmicUserToastContent> {
    public static LinkmicUserToastContent LIZIZ(Q9H q9h) {
        LinkmicUserToastContent linkmicUserToastContent = new LinkmicUserToastContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            linkmicUserToastContent.displayText = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        linkmicUserToastContent.roomId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    linkmicUserToastContent.userId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return linkmicUserToastContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkmicUserToastContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

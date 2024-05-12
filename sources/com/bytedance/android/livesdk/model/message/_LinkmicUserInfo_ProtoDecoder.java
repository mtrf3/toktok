package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkmicUserInfo_ProtoDecoder implements InterfaceC31105CIr<LinkmicUserInfo> {
    public static LinkmicUserInfo LIZIZ(Q9H q9h) {
        LinkmicUserInfo linkmicUserInfo = new LinkmicUserInfo();
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
                                linkmicUserInfo.linkedTime = q9h.LJIIJJI();
                            }
                        } else {
                            linkmicUserInfo.roomId = q9h.LJIIJJI();
                        }
                    } else {
                        linkmicUserInfo.linkmicIdStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    linkmicUserInfo.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkmicUserInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkmicUserInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

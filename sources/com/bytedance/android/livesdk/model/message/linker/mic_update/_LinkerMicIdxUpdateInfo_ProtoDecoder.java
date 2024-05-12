package com.bytedance.android.livesdk.model.message.linker.mic_update;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkerMicIdxUpdateInfo_ProtoDecoder implements InterfaceC31105CIr<LinkerMicIdxUpdateInfo> {
    public static LinkerMicIdxUpdateInfo LIZIZ(Q9H q9h) {
        LinkerMicIdxUpdateInfo linkerMicIdxUpdateInfo = new LinkerMicIdxUpdateInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            linkerMicIdxUpdateInfo.micIndex = q9h.LJIIJJI();
                        }
                    } else {
                        linkerMicIdxUpdateInfo.userID = q9h.LJIIJJI();
                    }
                } else {
                    linkerMicIdxUpdateInfo.operation = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerMicIdxUpdateInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerMicIdxUpdateInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

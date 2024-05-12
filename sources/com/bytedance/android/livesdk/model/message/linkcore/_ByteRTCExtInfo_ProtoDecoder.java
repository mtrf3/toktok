package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ByteRTCExtInfo_ProtoDecoder implements InterfaceC31105CIr<ByteRTCExtInfo> {
    public static ByteRTCExtInfo LIZIZ(Q9H q9h) {
        ByteRTCExtInfo byteRTCExtInfo = new ByteRTCExtInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    byteRTCExtInfo.defaultSignaling = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return byteRTCExtInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ByteRTCExtInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

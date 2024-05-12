package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ExtraInfo_ProtoDecoder implements InterfaceC31105CIr<ExtraInfo> {
    @Override // X.InterfaceC31105CIr
    public final ExtraInfo LIZ(Q9H q9h) {
        ExtraInfo extraInfo = new ExtraInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        extraInfo.value = Q9J.LIZIZ(q9h);
                    }
                } else {
                    extraInfo.key = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return extraInfo;
            }
        }
    }
}

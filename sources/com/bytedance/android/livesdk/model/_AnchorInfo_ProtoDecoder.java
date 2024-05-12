package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _AnchorInfo_ProtoDecoder implements InterfaceC31105CIr<AnchorInfo> {
    public static AnchorInfo LIZIZ(Q9H q9h) {
        AnchorInfo anchorInfo = new AnchorInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    anchorInfo.level = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

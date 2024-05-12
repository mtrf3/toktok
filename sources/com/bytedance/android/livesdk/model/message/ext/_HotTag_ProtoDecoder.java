package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _HotTag_ProtoDecoder implements InterfaceC31105CIr<HotTag> {
    public static HotTag LIZIZ(Q9H q9h) {
        HotTag hotTag = new HotTag();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        hotTag.hotCount = q9h.LJIIJJI();
                    }
                } else {
                    hotTag.productId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return hotTag;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final HotTag LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

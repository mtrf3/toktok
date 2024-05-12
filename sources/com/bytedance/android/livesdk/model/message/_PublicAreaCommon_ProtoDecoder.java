package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _PublicAreaCommon_ProtoDecoder implements InterfaceC31105CIr<PublicAreaCommon> {
    public static PublicAreaCommon LIZIZ(Q9H q9h) {
        PublicAreaCommon publicAreaCommon = new PublicAreaCommon();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        publicAreaCommon.userConsumeInRoom = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    publicAreaCommon.userLabel = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return publicAreaCommon;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PublicAreaCommon LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

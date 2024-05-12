package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PromoteOtherMessage_ProtoDecoder implements InterfaceC31105CIr<PromoteOtherMessage> {
    public static PromoteOtherMessage LIZIZ(Q9H q9h) {
        PromoteOtherMessage promoteOtherMessage = new PromoteOtherMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    promoteOtherMessage.recallToast = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return promoteOtherMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PromoteOtherMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

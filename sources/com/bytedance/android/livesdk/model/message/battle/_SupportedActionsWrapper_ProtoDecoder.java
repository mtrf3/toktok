package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _SupportedActionsWrapper_ProtoDecoder implements InterfaceC31105CIr<SupportedActionsWrapper> {
    public static SupportedActionsWrapper LIZIZ(Q9H q9h) {
        SupportedActionsWrapper supportedActionsWrapper = new SupportedActionsWrapper();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    supportedActionsWrapper.actionType = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return supportedActionsWrapper;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SupportedActionsWrapper LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

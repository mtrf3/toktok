package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PerceptionFeedbackOption_ProtoDecoder implements InterfaceC31105CIr<PerceptionFeedbackOption> {
    public static PerceptionFeedbackOption LIZIZ(Q9H q9h) {
        PerceptionFeedbackOption perceptionFeedbackOption = new PerceptionFeedbackOption();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        perceptionFeedbackOption.contentKey = Q9J.LIZIZ(q9h);
                    }
                } else {
                    perceptionFeedbackOption.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return perceptionFeedbackOption;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PerceptionFeedbackOption LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

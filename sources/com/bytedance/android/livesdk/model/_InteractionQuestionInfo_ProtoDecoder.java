package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _InteractionQuestionInfo_ProtoDecoder implements InterfaceC31105CIr<InteractionQuestionInfo> {
    public static InteractionQuestionInfo LIZIZ(Q9H q9h) {
        InteractionQuestionInfo interactionQuestionInfo = new InteractionQuestionInfo();
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
                                interactionQuestionInfo.hasLightingStrengthen = Boolean.valueOf(Q9J.LIZ(q9h));
                            }
                        } else {
                            interactionQuestionInfo.qaEntryType = Integer.valueOf(q9h.LJIIJ());
                        }
                    } else {
                        interactionQuestionInfo.hasQuickAnswer = Q9J.LIZ(q9h);
                    }
                } else {
                    interactionQuestionInfo.hasRecommend = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return interactionQuestionInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InteractionQuestionInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CapsuleBizParamsCommentFlaggedPrompt_ProtoDecoder implements InterfaceC31105CIr<CapsuleBizParamsCommentFlaggedPrompt> {
    public static CapsuleBizParamsCommentFlaggedPrompt LIZIZ(Q9H q9h) {
        CapsuleBizParamsCommentFlaggedPrompt capsuleBizParamsCommentFlaggedPrompt = new CapsuleBizParamsCommentFlaggedPrompt();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    capsuleBizParamsCommentFlaggedPrompt.trigger = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return capsuleBizParamsCommentFlaggedPrompt;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CapsuleBizParamsCommentFlaggedPrompt LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

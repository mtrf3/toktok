package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CapsuleBizParams_ProtoDecoder implements InterfaceC31105CIr<CapsuleBizParams> {
    public static CapsuleBizParams LIZIZ(Q9H q9h) {
        CapsuleBizParams capsuleBizParams = new CapsuleBizParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 3) {
                        if (LJI != 4) {
                            if (LJI != 5) {
                                Q9J.LIZJ(q9h);
                            } else {
                                capsuleBizParams.commentFlaggedPrompt = _CapsuleBizParamsCommentFlaggedPrompt_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            capsuleBizParams.effectParams = _CapsuleBizParamsNewAnchorEffect_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        capsuleBizParams.randomGift = _CapsuleBizParamsRandomGift_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    capsuleBizParams.cohost = _CapsuleBizParamsCohost_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return capsuleBizParams;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CapsuleBizParams LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

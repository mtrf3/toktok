package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SubBenefit_ProtoDecoder implements InterfaceC31105CIr<SubBenefit> {
    public static SubBenefit LIZIZ(Q9H q9h) {
        SubBenefit subBenefit = new SubBenefit();
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
                                subBenefit.backgroundColor = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            subBenefit.benefitDescription = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        subBenefit.benefitImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    subBenefit.benefitType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return subBenefit;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubBenefit LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

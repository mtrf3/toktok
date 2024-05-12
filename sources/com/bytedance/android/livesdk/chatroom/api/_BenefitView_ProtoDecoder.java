package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _BenefitView_ProtoDecoder implements InterfaceC31105CIr<BenefitView> {
    public static BenefitView LIZIZ(Q9H q9h) {
        BenefitView benefitView = new BenefitView();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    benefitView.navIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                benefitView.backgroundColor = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            benefitView.benefitDescription = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        benefitView.benefitImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    benefitView.benefitType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return benefitView;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BenefitView LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

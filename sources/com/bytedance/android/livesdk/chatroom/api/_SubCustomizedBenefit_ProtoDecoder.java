package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubCustomizedBenefit_ProtoDecoder implements InterfaceC31105CIr<SubCustomizedBenefit> {
    public static SubCustomizedBenefit LIZIZ(Q9H q9h) {
        SubCustomizedBenefit subCustomizedBenefit = new SubCustomizedBenefit();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 10) {
                                if (LJI != 11) {
                                    switch (LJI) {
                                        case 20:
                                            subCustomizedBenefit.auditStatus = q9h.LJIIJ();
                                            break;
                                        case 21:
                                            subCustomizedBenefit.configStatus = q9h.LJIIJ();
                                            break;
                                        case 22:
                                            subCustomizedBenefit.enableStatus = q9h.LJIIJ();
                                            break;
                                        case 23:
                                            subCustomizedBenefit.blockStatus = q9h.LJIIJ();
                                            break;
                                        case 24:
                                            subCustomizedBenefit.userConfigStatus = q9h.LJIIJ();
                                            break;
                                        default:
                                            Q9J.LIZJ(q9h);
                                            break;
                                    }
                                } else {
                                    subCustomizedBenefit.benefitMedia = _SubCustomizedBenefitMedia_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                subCustomizedBenefit.benefitType = q9h.LJIIJ();
                            }
                        } else {
                            subCustomizedBenefit.officialTemplateIdStr = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        subCustomizedBenefit.originalBenefitIdStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    subCustomizedBenefit.benefitIdStr = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subCustomizedBenefit;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubCustomizedBenefit LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

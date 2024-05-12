package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _BenefitDetail_ProtoDecoder implements InterfaceC31105CIr<BenefitDetail> {
    public static BenefitDetail LIZIZ(Q9H q9h) {
        BenefitDetail benefitDetail = new BenefitDetail();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        benefitDetail.giftInfo = _PartnershipGiftInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        benefitDetail.activityIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        benefitDetail.taskStatus = q9h.LJIIJ();
                        break;
                    case 4:
                        benefitDetail.isOutOfStock = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        benefitDetail.startTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        benefitDetail.endTime = q9h.LJIIJJI();
                        break;
                    case 7:
                        benefitDetail.rule = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        benefitDetail.platform = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return benefitDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BenefitDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

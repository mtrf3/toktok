package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _BenefitRecord_ProtoDecoder implements InterfaceC31105CIr<BenefitRecord> {
    public static BenefitRecord LIZIZ(Q9H q9h) {
        BenefitRecord benefitRecord = new BenefitRecord();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            benefitRecord.activityIdStr = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        benefitRecord.briefGame = _BriefGame_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    benefitRecord.giftInfo = _PartnershipGiftInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return benefitRecord;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BenefitRecord LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

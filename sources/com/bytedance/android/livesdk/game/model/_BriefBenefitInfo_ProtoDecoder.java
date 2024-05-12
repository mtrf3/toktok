package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _BriefBenefitInfo_ProtoDecoder implements InterfaceC31105CIr<BriefBenefitInfo> {
    public static BriefBenefitInfo LIZIZ(Q9H q9h) {
        BriefBenefitInfo briefBenefitInfo = new BriefBenefitInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        briefBenefitInfo.briefGiftInfo = _BriefGiftInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        briefBenefitInfo.activityIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        briefBenefitInfo.taskStatus = q9h.LJIIJ();
                        break;
                    case 4:
                        briefBenefitInfo.isOutOfStock = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        briefBenefitInfo.startTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        briefBenefitInfo.endTime = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return briefBenefitInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BriefBenefitInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

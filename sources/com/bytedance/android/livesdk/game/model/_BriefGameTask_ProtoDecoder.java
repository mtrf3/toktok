package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _BriefGameTask_ProtoDecoder implements InterfaceC31105CIr<BriefGameTask> {
    public static BriefGameTask LIZIZ(Q9H q9h) {
        BriefGameTask briefGameTask = new BriefGameTask();
        briefGameTask.acceptedBenefitList = new ArrayList();
        briefGameTask.unacceptedBenefitList = new ArrayList();
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
                                briefGameTask.unacceptedBenefitList.add(_BriefBenefitInfo_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            briefGameTask.acceptedBenefitList.add(_BriefBenefitInfo_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        briefGameTask.task = _PartnershipTask_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    briefGameTask.briefGame = _BriefGame_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return briefGameTask;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BriefGameTask LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _GameTask_ProtoDecoder implements InterfaceC31105CIr<GameTask> {
    @Override // X.InterfaceC31105CIr
    public final GameTask LIZ(Q9H q9h) {
        GameTask gameTask = new GameTask();
        gameTask.acceptedBenefitList = new ArrayList();
        gameTask.unacceptedBenefitList = new ArrayList();
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
                                gameTask.unacceptedBenefitList.add(_BriefBenefitInfo_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            gameTask.acceptedBenefitList.add(_BriefBenefitInfo_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        gameTask.task = _PartnershipTask_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    gameTask.game = _PartnershipGame_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameTask;
            }
        }
    }
}

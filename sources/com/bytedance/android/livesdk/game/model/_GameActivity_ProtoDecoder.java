package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _GameActivity_ProtoDecoder implements InterfaceC31105CIr<GameActivity> {
    public static GameActivity LIZIZ(Q9H q9h) {
        GameActivity gameActivity = new GameActivity();
        gameActivity.acceptedBenefitList = new ArrayList();
        gameActivity.activityGroups = new ArrayList();
        gameActivity.unacceptedBenefitList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            gameActivity.activityGroups.add(_OuterActivityGroup_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        gameActivity.unacceptedBenefitList.add(_BriefBenefitInfo_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    gameActivity.acceptedBenefitList.add(_BriefBenefitInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return gameActivity;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameActivity LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package com.bytedance.android.livesdk.subscribe.model.goal;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubGoalInfo_ProtoDecoder implements InterfaceC31105CIr<SubGoalInfo> {
    public static SubGoalInfo LIZIZ(Q9H q9h) {
        SubGoalInfo subGoalInfo = new SubGoalInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        subGoalInfo.hasGoalEntrance = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        subGoalInfo.setGoalNotice = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        subGoalInfo.subGoalTargetUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        subGoalInfo.auditStatus = q9h.LJIIJ();
                        break;
                    case 5:
                        subGoalInfo.target = q9h.LJIIJJI();
                        break;
                    case 6:
                        subGoalInfo.progress = q9h.LJIIJJI();
                        break;
                    case 7:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 8:
                        subGoalInfo.subGoalScene = q9h.LJIIJ();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return subGoalInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubGoalInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

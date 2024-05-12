package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _LevelTask_ProtoDecoder implements InterfaceC31105CIr<LevelTask> {
    public static LevelTask LIZIZ(Q9H q9h) {
        LevelTask levelTask = new LevelTask();
        levelTask.componentTasks = new ArrayList();
        levelTask.levelRewards = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            levelTask.levelRewards.add(_ComponentInfo_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        levelTask.componentTasks.add(_ComponentTask_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    levelTask.level = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return levelTask;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LevelTask LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FansTask_ProtoDecoder implements InterfaceC31105CIr<FansTask> {
    public static FansTask LIZIZ(Q9H q9h) {
        FansTask fansTask = new FansTask();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 10) {
                    switch (LJI) {
                        case 1:
                            fansTask.taskType = q9h.LJIIJ();
                            break;
                        case 2:
                            fansTask.isDone = Q9J.LIZ(q9h);
                            break;
                        case 3:
                            fansTask.taskTotalProgress = q9h.LJIIJJI();
                            break;
                        case 4:
                            fansTask.taskCurProgress = q9h.LJIIJJI();
                            break;
                        case 5:
                            fansTask.stepProgress = q9h.LJIIJJI();
                            break;
                        case 6:
                            fansTask.stepReward = q9h.LJIIJJI();
                            break;
                        case 7:
                            fansTask.isTodayComplete = Q9J.LIZ(q9h);
                            break;
                        default:
                            Q9J.LIZJ(q9h);
                            break;
                    }
                } else {
                    fansTask.taskConfig = _FansTaskConfig_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansTask;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansTask LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

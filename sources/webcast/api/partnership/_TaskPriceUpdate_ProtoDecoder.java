package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _TaskPriceUpdate_ProtoDecoder implements InterfaceC31105CIr<TaskPriceUpdate> {
    public static TaskPriceUpdate LIZIZ(Q9H q9h) {
        TaskPriceUpdate taskPriceUpdate = new TaskPriceUpdate();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        taskPriceUpdate.priceUpdateTimestamp = q9h.LJIIJJI();
                    }
                } else {
                    taskPriceUpdate.taskId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return taskPriceUpdate;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TaskPriceUpdate LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.DropsTaskEditResponse;

/* loaded from: classes17.dex */
public final class _DropsTaskEditResponse_TaskResult_ProtoDecoder implements InterfaceC31105CIr<DropsTaskEditResponse.TaskResult> {
    public static DropsTaskEditResponse.TaskResult LIZIZ(Q9H q9h) {
        DropsTaskEditResponse.TaskResult taskResult = new DropsTaskEditResponse.TaskResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        taskResult.errCode = q9h.LJIIJJI();
                    }
                } else {
                    taskResult.taskId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return taskResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DropsTaskEditResponse.TaskResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

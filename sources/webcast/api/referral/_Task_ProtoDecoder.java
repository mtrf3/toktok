package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _Task_ProtoDecoder implements InterfaceC31105CIr<Task> {
    public static Task LIZIZ(Q9H q9h) {
        Task task = new Task();
        task.subTask = new ArrayList();
        task.rewards = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    if (LJI != 100) {
                                        if (LJI != 101) {
                                            if (LJI != 201) {
                                                if (LJI != 202) {
                                                    Q9J.LIZJ(q9h);
                                                } else {
                                                    task.receiveDiamondsProcess = q9h.LJIIJJI();
                                                }
                                            } else {
                                                task.liveDurationProcess = q9h.LJIIJJI();
                                            }
                                        } else {
                                            task.receiveDiamondsThreshold = q9h.LJIIJJI();
                                        }
                                    } else {
                                        task.liveDurationThreshold = q9h.LJIIJJI();
                                    }
                                } else {
                                    task.taskStatus = q9h.LJIIJ();
                                }
                            } else {
                                task.expire = q9h.LJIIJJI();
                            }
                        } else {
                            task.subTask.add(LIZIZ(q9h));
                        }
                    } else {
                        task.rewards.add(_Task_Reward_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    task.taskType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return task;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Task LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

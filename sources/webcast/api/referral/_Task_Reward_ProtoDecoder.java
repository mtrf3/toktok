package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.referral.Task;

/* loaded from: classes17.dex */
public final class _Task_Reward_ProtoDecoder implements InterfaceC31105CIr<Task.Reward> {
    public static Task.Reward LIZIZ(Q9H q9h) {
        Task.Reward reward = new Task.Reward();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 100) {
                            Q9J.LIZJ(q9h);
                        } else {
                            reward.sharePercent = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        reward.roleType = q9h.LJIIJ();
                    }
                } else {
                    reward.rewardType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return reward;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Task.Reward LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FansTaskLevelRewardConfig_ProtoDecoder implements InterfaceC31105CIr<FansTaskLevelRewardConfig> {
    public static FansTaskLevelRewardConfig LIZIZ(Q9H q9h) {
        FansTaskLevelRewardConfig fansTaskLevelRewardConfig = new FansTaskLevelRewardConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        fansTaskLevelRewardConfig.targetReward = q9h.LJIIJJI();
                    }
                } else {
                    fansTaskLevelRewardConfig.targetProgress = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return fansTaskLevelRewardConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansTaskLevelRewardConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

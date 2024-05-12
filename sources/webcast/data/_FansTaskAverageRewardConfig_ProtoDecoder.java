package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FansTaskAverageRewardConfig_ProtoDecoder implements InterfaceC31105CIr<FansTaskAverageRewardConfig> {
    public static FansTaskAverageRewardConfig LIZIZ(Q9H q9h) {
        FansTaskAverageRewardConfig fansTaskAverageRewardConfig = new FansTaskAverageRewardConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        fansTaskAverageRewardConfig.stepReward = q9h.LJIIJJI();
                    }
                } else {
                    fansTaskAverageRewardConfig.stepProgress = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return fansTaskAverageRewardConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansTaskAverageRewardConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

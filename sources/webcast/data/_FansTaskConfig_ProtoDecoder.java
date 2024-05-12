package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _FansTaskConfig_ProtoDecoder implements InterfaceC31105CIr<FansTaskConfig> {
    public static FansTaskConfig LIZIZ(Q9H q9h) {
        FansTaskConfig fansTaskConfig = new FansTaskConfig();
        fansTaskConfig.levelRewardConfig = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    switch (LJI) {
                        case 10:
                            fansTaskConfig.rewardType = q9h.LJIIJ();
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            fansTaskConfig.averageRewardConfig = _FansTaskAverageRewardConfig_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 12:
                            fansTaskConfig.levelRewardConfig.add(_FansTaskLevelRewardConfig_ProtoDecoder.LIZIZ(q9h));
                            break;
                        default:
                            Q9J.LIZJ(q9h);
                            break;
                    }
                } else {
                    fansTaskConfig.durationType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return fansTaskConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansTaskConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

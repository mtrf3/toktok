package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RewardPeriodConfig_ProtoDecoder implements InterfaceC31105CIr<RewardPeriodConfig> {
    public static RewardPeriodConfig LIZIZ(Q9H q9h) {
        RewardPeriodConfig rewardPeriodConfig = new RewardPeriodConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 11) {
                                if (LJI != 12) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    rewardPeriodConfig.rewardingPrompt = _BattlePrompt_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                rewardPeriodConfig.rewardPraparePrompt = _BattlePrompt_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            rewardPeriodConfig.rewardMultiple = (int) q9h.LJIIJJI();
                        }
                    } else {
                        rewardPeriodConfig.duration = q9h.LJIIJJI();
                    }
                } else {
                    rewardPeriodConfig.rewardStartTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return rewardPeriodConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RewardPeriodConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

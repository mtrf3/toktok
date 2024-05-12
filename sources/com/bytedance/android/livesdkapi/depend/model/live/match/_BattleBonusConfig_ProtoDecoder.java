package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _BattleBonusConfig_ProtoDecoder implements InterfaceC31105CIr<BattleBonusConfig> {
    public static BattleBonusConfig LIZIZ(Q9H q9h) {
        BattleBonusConfig battleBonusConfig = new BattleBonusConfig();
        battleBonusConfig.previewPeriodConfig = new ArrayList();
        battleBonusConfig.taskGiftGuide = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    long LIZJ2 = q9h.LIZJ();
                                    Long l = null;
                                    BattleTaskGiftAmountGuide battleTaskGiftAmountGuide = null;
                                    while (true) {
                                        int LJI2 = q9h.LJI();
                                        if (LJI2 == -1) {
                                            break;
                                        }
                                        if (LJI2 != 1) {
                                            if (LJI2 == 2) {
                                                battleTaskGiftAmountGuide = _BattleTaskGiftAmountGuide_ProtoDecoder.LIZIZ(q9h);
                                            }
                                        } else {
                                            l = Long.valueOf(q9h.LJIIJJI());
                                        }
                                    }
                                    q9h.LJ(LIZJ2);
                                    if (l != null) {
                                        if (battleTaskGiftAmountGuide != null) {
                                            battleBonusConfig.taskGiftGuide.put(l, battleTaskGiftAmountGuide);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                battleBonusConfig.rewardPeriodConfig = _RewardPeriodConfig_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            battleBonusConfig.taskPeriodConfig = _TaskPeriodConfig_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        battleBonusConfig.previewPeriodConfig.add(_PreviewPeriod_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    battleBonusConfig.previewStartTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return battleBonusConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleBonusConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

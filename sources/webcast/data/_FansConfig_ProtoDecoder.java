package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _FansConfig_ProtoDecoder implements InterfaceC31105CIr<FansConfig> {
    public static FansConfig LIZIZ(Q9H q9h) {
        FansConfig fansConfig = new FansConfig();
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
                                    fansConfig.bannerConfig = _FansBannerConfig_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                fansConfig.showConfig = _FansLevelShowConfig_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            fansConfig.updateBarrageEffect = _FansUpgradeBarrageEffectConfig_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        fansConfig.updateDynamicEffect = _FansUpgradeDynamicEffectConfig_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    fansConfig.fansScoreRule = _FansScoreRule_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

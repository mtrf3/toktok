package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _FansUpgradeBarrageEffectConfig_ProtoDecoder implements InterfaceC31105CIr<FansUpgradeBarrageEffectConfig> {
    public static FansUpgradeBarrageEffectConfig LIZIZ(Q9H q9h) {
        FansUpgradeBarrageEffectConfig fansUpgradeBarrageEffectConfig = new FansUpgradeBarrageEffectConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        fansUpgradeBarrageEffectConfig.displayConfig = q9h.LJIIJ();
                    }
                } else {
                    fansUpgradeBarrageEffectConfig.level = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return fansUpgradeBarrageEffectConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansUpgradeBarrageEffectConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

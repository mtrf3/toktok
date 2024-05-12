package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _UpgradeBarrageEffectConfig_ProtoDecoder implements InterfaceC31105CIr<UpgradeBarrageEffectConfig> {
    public static UpgradeBarrageEffectConfig LIZIZ(Q9H q9h) {
        UpgradeBarrageEffectConfig upgradeBarrageEffectConfig = new UpgradeBarrageEffectConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        upgradeBarrageEffectConfig.displayConfig = q9h.LJIIJ();
                    }
                } else {
                    upgradeBarrageEffectConfig.grade = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return upgradeBarrageEffectConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpgradeBarrageEffectConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

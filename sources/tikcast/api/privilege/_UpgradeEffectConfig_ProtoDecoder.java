package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _UpgradeEffectConfig_ProtoDecoder implements InterfaceC31105CIr<UpgradeEffectConfig> {
    public static UpgradeEffectConfig LIZIZ(Q9H q9h) {
        UpgradeEffectConfig upgradeEffectConfig = new UpgradeEffectConfig();
        upgradeEffectConfig.privileges = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        upgradeEffectConfig.privileges.add(_UpgradePrivilege_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    upgradeEffectConfig.grade = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return upgradeEffectConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpgradeEffectConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

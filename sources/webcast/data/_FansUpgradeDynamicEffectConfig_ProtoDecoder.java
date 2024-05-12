package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _FansUpgradeDynamicEffectConfig_ProtoDecoder implements InterfaceC31105CIr<FansUpgradeDynamicEffectConfig> {
    public static FansUpgradeDynamicEffectConfig LIZIZ(Q9H q9h) {
        FansUpgradeDynamicEffectConfig fansUpgradeDynamicEffectConfig = new FansUpgradeDynamicEffectConfig();
        fansUpgradeDynamicEffectConfig.privileges = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        fansUpgradeDynamicEffectConfig.privileges.add(_FansUpgradePrivilege_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    fansUpgradeDynamicEffectConfig.level = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return fansUpgradeDynamicEffectConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansUpgradeDynamicEffectConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

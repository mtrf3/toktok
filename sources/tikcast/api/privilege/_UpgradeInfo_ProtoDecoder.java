package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _UpgradeInfo_ProtoDecoder implements InterfaceC31105CIr<UpgradeInfo> {
    public static UpgradeInfo LIZIZ(Q9H q9h) {
        UpgradeInfo upgradeInfo = new UpgradeInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        upgradeInfo.toGrade = q9h.LJIIJ();
                    }
                } else {
                    upgradeInfo.isUpgrade = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return upgradeInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpgradeInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

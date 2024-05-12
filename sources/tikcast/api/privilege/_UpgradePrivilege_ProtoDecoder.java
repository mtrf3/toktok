package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _UpgradePrivilege_ProtoDecoder implements InterfaceC31105CIr<UpgradePrivilege> {
    public static UpgradePrivilege LIZIZ(Q9H q9h) {
        UpgradePrivilege upgradePrivilege = new UpgradePrivilege();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            upgradePrivilege.privilegeType = q9h.LJIIJ();
                        }
                    } else {
                        upgradePrivilege.description = Q9J.LIZIZ(q9h);
                    }
                } else {
                    upgradePrivilege.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return upgradePrivilege;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpgradePrivilege LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

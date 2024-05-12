package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PayGradeInfo_ProtoDecoder implements InterfaceC31105CIr<PayGradeInfo> {
    public static PayGradeInfo LIZIZ(Q9H q9h) {
        PayGradeInfo payGradeInfo = new PayGradeInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        payGradeInfo.upgradeInfo = _UpgradeInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    payGradeInfo.userGrade = _UserGrade_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return payGradeInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PayGradeInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _UserGradeParam_ProtoDecoder implements InterfaceC31105CIr<UserGradeParam> {
    public static UserGradeParam LIZIZ(Q9H q9h) {
        UserGradeParam userGradeParam = new UserGradeParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    userGradeParam.userGrade = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return userGradeParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserGradeParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.privilege.GradePrivilegesResponse;

/* loaded from: classes17.dex */
public final class _GradePrivilegesResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GradePrivilegesResponse.Data> {
    public static GradePrivilegesResponse.Data LIZIZ(Q9H q9h) {
        GradePrivilegesResponse.Data data = new GradePrivilegesResponse.Data();
        data.tabList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.tabList.add(_GradeTab_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    data.userGrade = _UserGrade_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GradePrivilegesResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

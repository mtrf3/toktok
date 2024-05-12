package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.privilege.GradeInfoResponse;

/* loaded from: classes6.dex */
public final class _GradeInfoResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GradeInfoResponse.Data> {
    public static GradeInfoResponse.Data LIZIZ(Q9H q9h) {
        GradeInfoResponse.Data data = new GradeInfoResponse.Data();
        data.gradeConfig = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.gradeConfig.add(_GradeConfig_ProtoDecoder.LIZIZ(q9h));
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
    public final GradeInfoResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GradeInfoRequest_ProtoDecoder implements InterfaceC31105CIr<GradeInfoRequest> {
    @Override // X.InterfaceC31105CIr
    public final GradeInfoRequest LIZ(Q9H q9h) {
        GradeInfoRequest gradeInfoRequest = new GradeInfoRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    gradeInfoRequest.needConfig = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gradeInfoRequest;
            }
        }
    }
}

package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GradePrivilegesRequest_ProtoDecoder implements InterfaceC31105CIr<GradePrivilegesRequest> {
    @Override // X.InterfaceC31105CIr
    public final GradePrivilegesRequest LIZ(Q9H q9h) {
        GradePrivilegesRequest gradePrivilegesRequest = new GradePrivilegesRequest();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return gradePrivilegesRequest;
    }
}

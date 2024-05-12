package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _QueryUserPrivilegesRequest_ProtoDecoder implements InterfaceC31105CIr<QueryUserPrivilegesRequest> {
    @Override // X.InterfaceC31105CIr
    public final QueryUserPrivilegesRequest LIZ(Q9H q9h) {
        QueryUserPrivilegesRequest queryUserPrivilegesRequest = new QueryUserPrivilegesRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        queryUserPrivilegesRequest.privilegeType = q9h.LJIIJ();
                        break;
                    case 2:
                        queryUserPrivilegesRequest.needPrivilegeDetail = Q9J.LIZ(q9h);
                        break;
                    case 3:
                        queryUserPrivilegesRequest.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        queryUserPrivilegesRequest.anchorId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        queryUserPrivilegesRequest.requestFrom = q9h.LJIIJ();
                        break;
                    case 6:
                        queryUserPrivilegesRequest.requestScene = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return queryUserPrivilegesRequest;
            }
        }
    }
}

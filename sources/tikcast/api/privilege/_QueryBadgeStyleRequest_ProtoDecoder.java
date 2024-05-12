package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes12.dex */
public final class _QueryBadgeStyleRequest_ProtoDecoder implements InterfaceC31105CIr<QueryBadgeStyleRequest> {
    @Override // X.InterfaceC31105CIr
    public final QueryBadgeStyleRequest LIZ(Q9H q9h) {
        QueryBadgeStyleRequest queryBadgeStyleRequest = new QueryBadgeStyleRequest();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return queryBadgeStyleRequest;
    }
}

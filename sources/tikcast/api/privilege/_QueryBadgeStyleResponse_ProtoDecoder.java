package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _QueryBadgeStyleResponse_ProtoDecoder implements InterfaceC31105CIr<QueryBadgeStyleResponse> {
    @Override // X.InterfaceC31105CIr
    public final QueryBadgeStyleResponse LIZ(Q9H q9h) {
        QueryBadgeStyleResponse queryBadgeStyleResponse = new QueryBadgeStyleResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    queryBadgeStyleResponse.data = _QueryBadgeStyleResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return queryBadgeStyleResponse;
            }
        }
    }
}

package webcast.api.activity_quiz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _QueryUserIdentityParams_ProtoDecoder implements InterfaceC31105CIr<QueryUserIdentityParams> {
    @Override // X.InterfaceC31105CIr
    public final QueryUserIdentityParams LIZ(Q9H q9h) {
        QueryUserIdentityParams queryUserIdentityParams = new QueryUserIdentityParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    queryUserIdentityParams.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return queryUserIdentityParams;
            }
        }
    }
}

package webcast.api.interaction;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _QueryVoteUserResponse_ProtoDecoder implements InterfaceC31105CIr<QueryVoteUserResponse> {
    @Override // X.InterfaceC31105CIr
    public final QueryVoteUserResponse LIZ(Q9H q9h) {
        QueryVoteUserResponse queryVoteUserResponse = new QueryVoteUserResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    queryVoteUserResponse.data = _QueryVoteUserResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return queryVoteUserResponse;
            }
        }
    }
}

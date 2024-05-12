package webcast.api.interaction;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _QueryVoteUserRequest_ProtoDecoder implements InterfaceC31105CIr<QueryVoteUserRequest> {
    @Override // X.InterfaceC31105CIr
    public final QueryVoteUserRequest LIZ(Q9H q9h) {
        QueryVoteUserRequest queryVoteUserRequest = new QueryVoteUserRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                queryVoteUserRequest.limit = q9h.LJIIJJI();
                            }
                        } else {
                            queryVoteUserRequest.offset = q9h.LJIIJJI();
                        }
                    } else {
                        queryVoteUserRequest.optionIndex = q9h.LJIIJJI();
                    }
                } else {
                    queryVoteUserRequest.pollId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return queryVoteUserRequest;
            }
        }
    }
}

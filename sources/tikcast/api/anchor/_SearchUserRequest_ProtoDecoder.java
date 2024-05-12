package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SearchUserRequest_ProtoDecoder implements InterfaceC31105CIr<SearchUserRequest> {
    @Override // X.InterfaceC31105CIr
    public final SearchUserRequest LIZ(Q9H q9h) {
        SearchUserRequest searchUserRequest = new SearchUserRequest();
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
                                searchUserRequest.roomId = q9h.LJIIJJI();
                            }
                        } else {
                            searchUserRequest.count = q9h.LJIIJ();
                        }
                    } else {
                        searchUserRequest.offset = q9h.LJIIJ();
                    }
                } else {
                    searchUserRequest.keyword = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return searchUserRequest;
            }
        }
    }
}

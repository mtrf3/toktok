package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SearchTagRequest_ProtoDecoder implements InterfaceC31105CIr<SearchTagRequest> {
    @Override // X.InterfaceC31105CIr
    public final SearchTagRequest LIZ(Q9H q9h) {
        SearchTagRequest searchTagRequest = new SearchTagRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        searchTagRequest.userId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        searchTagRequest.searchId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        searchTagRequest.queryString = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        searchTagRequest.lan = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        searchTagRequest.offset = q9h.LJIIJ();
                        break;
                    case 6:
                        searchTagRequest.limit = q9h.LJIIJ();
                        break;
                    case 7:
                        searchTagRequest.needDetail = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        searchTagRequest.country = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return searchTagRequest;
            }
        }
    }
}

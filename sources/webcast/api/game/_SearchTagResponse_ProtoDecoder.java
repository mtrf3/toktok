package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SearchTagResponse_ProtoDecoder implements InterfaceC31105CIr<SearchTagResponse> {
    @Override // X.InterfaceC31105CIr
    public final SearchTagResponse LIZ(Q9H q9h) {
        SearchTagResponse searchTagResponse = new SearchTagResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    searchTagResponse.data = _SearchTagResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return searchTagResponse;
            }
        }
    }
}

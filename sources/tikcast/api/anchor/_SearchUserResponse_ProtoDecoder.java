package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SearchUserResponse_ProtoDecoder implements InterfaceC31105CIr<SearchUserResponse> {
    @Override // X.InterfaceC31105CIr
    public final SearchUserResponse LIZ(Q9H q9h) {
        SearchUserResponse searchUserResponse = new SearchUserResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    searchUserResponse.data = _SearchUserResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return searchUserResponse;
            }
        }
    }
}

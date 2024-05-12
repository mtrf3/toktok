package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ListSugPollResponse_ProtoDecoder implements InterfaceC31105CIr<ListSugPollResponse> {
    @Override // X.InterfaceC31105CIr
    public final ListSugPollResponse LIZ(Q9H q9h) {
        ListSugPollResponse listSugPollResponse = new ListSugPollResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    listSugPollResponse.data = _ListSugPollResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return listSugPollResponse;
            }
        }
    }
}

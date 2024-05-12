package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetGoodyBagWinnerListResponse_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagWinnerListResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagWinnerListResponse LIZ(Q9H q9h) {
        GetGoodyBagWinnerListResponse getGoodyBagWinnerListResponse = new GetGoodyBagWinnerListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getGoodyBagWinnerListResponse.data = _GetGoodyBagWinnerListResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getGoodyBagWinnerListResponse;
            }
        }
    }
}

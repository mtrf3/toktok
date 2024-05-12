package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FansGetAnchorPageResponse_ProtoDecoder implements InterfaceC31105CIr<FansGetAnchorPageResponse> {
    @Override // X.InterfaceC31105CIr
    public final FansGetAnchorPageResponse LIZ(Q9H q9h) {
        FansGetAnchorPageResponse fansGetAnchorPageResponse = new FansGetAnchorPageResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    fansGetAnchorPageResponse.data = _FansGetAnchorPageResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansGetAnchorPageResponse;
            }
        }
    }
}

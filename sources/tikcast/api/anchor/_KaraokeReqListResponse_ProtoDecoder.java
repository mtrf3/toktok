package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _KaraokeReqListResponse_ProtoDecoder implements InterfaceC31105CIr<KaraokeReqListResponse> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeReqListResponse LIZ(Q9H q9h) {
        KaraokeReqListResponse karaokeReqListResponse = new KaraokeReqListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    karaokeReqListResponse.data = _KaraokeReqListResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeReqListResponse;
            }
        }
    }
}

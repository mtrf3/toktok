package webcast.api.linkmic;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.linkmic.KickOutResponse;

/* loaded from: classes14.dex */
public final class _KickOutResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<KickOutResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final KickOutResponse.ResponseData LIZ(Q9H q9h) {
        KickOutResponse.ResponseData responseData = new KickOutResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}

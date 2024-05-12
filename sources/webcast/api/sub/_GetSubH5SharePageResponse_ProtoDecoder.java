package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetSubH5SharePageResponse_ProtoDecoder implements InterfaceC31105CIr<GetSubH5SharePageResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetSubH5SharePageResponse LIZ(Q9H q9h) {
        GetSubH5SharePageResponse getSubH5SharePageResponse = new GetSubH5SharePageResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getSubH5SharePageResponse.data = _GetSubH5SharePageResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getSubH5SharePageResponse;
            }
        }
    }
}

package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GetSubH5SharePageRequest_ProtoDecoder implements InterfaceC31105CIr<GetSubH5SharePageRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetSubH5SharePageRequest LIZ(Q9H q9h) {
        GetSubH5SharePageRequest getSubH5SharePageRequest = new GetSubH5SharePageRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getSubH5SharePageRequest.secAnchorId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getSubH5SharePageRequest;
            }
        }
    }
}

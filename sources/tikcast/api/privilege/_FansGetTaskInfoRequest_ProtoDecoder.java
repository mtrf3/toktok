package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _FansGetTaskInfoRequest_ProtoDecoder implements InterfaceC31105CIr<FansGetTaskInfoRequest> {
    @Override // X.InterfaceC31105CIr
    public final FansGetTaskInfoRequest LIZ(Q9H q9h) {
        FansGetTaskInfoRequest fansGetTaskInfoRequest = new FansGetTaskInfoRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    fansGetTaskInfoRequest.secAnchorId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansGetTaskInfoRequest;
            }
        }
    }
}
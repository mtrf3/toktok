package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _CheckDetectPermissionRequest_ProtoDecoder implements InterfaceC31105CIr<CheckDetectPermissionRequest> {
    @Override // X.InterfaceC31105CIr
    public final CheckDetectPermissionRequest LIZ(Q9H q9h) {
        CheckDetectPermissionRequest checkDetectPermissionRequest = new CheckDetectPermissionRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    checkDetectPermissionRequest.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return checkDetectPermissionRequest;
            }
        }
    }
}
package tikcast.api.perception;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _MultiViolationStatusResponse_ProtoDecoder implements InterfaceC31105CIr<MultiViolationStatusResponse> {
    @Override // X.InterfaceC31105CIr
    public final MultiViolationStatusResponse LIZ(Q9H q9h) {
        MultiViolationStatusResponse multiViolationStatusResponse = new MultiViolationStatusResponse();
        multiViolationStatusResponse.data = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        multiViolationStatusResponse.extra = _MultiViolationStatusResponse_ResponseExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    multiViolationStatusResponse.data.add(_MultiViolationStatusResponse_ViolationData_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return multiViolationStatusResponse;
            }
        }
    }
}

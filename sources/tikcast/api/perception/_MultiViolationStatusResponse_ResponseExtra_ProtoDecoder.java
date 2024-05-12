package tikcast.api.perception;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.perception.MultiViolationStatusResponse;

/* loaded from: classes6.dex */
public final class _MultiViolationStatusResponse_ResponseExtra_ProtoDecoder implements InterfaceC31105CIr<MultiViolationStatusResponse.ResponseExtra> {
    public static MultiViolationStatusResponse.ResponseExtra LIZIZ(Q9H q9h) {
        MultiViolationStatusResponse.ResponseExtra responseExtra = new MultiViolationStatusResponse.ResponseExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiViolationStatusResponse.ResponseExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

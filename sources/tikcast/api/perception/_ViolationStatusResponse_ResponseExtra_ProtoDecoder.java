package tikcast.api.perception;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.perception.ViolationStatusResponse;

/* loaded from: classes6.dex */
public final class _ViolationStatusResponse_ResponseExtra_ProtoDecoder implements InterfaceC31105CIr<ViolationStatusResponse.ResponseExtra> {
    public static ViolationStatusResponse.ResponseExtra LIZIZ(Q9H q9h) {
        ViolationStatusResponse.ResponseExtra responseExtra = new ViolationStatusResponse.ResponseExtra();
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
    public final ViolationStatusResponse.ResponseExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.room.CppAgeVerifyResponse;

/* loaded from: classes6.dex */
public final class _CppAgeVerifyResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<CppAgeVerifyResponse.Extra> {
    public static CppAgeVerifyResponse.Extra LIZIZ(Q9H q9h) {
        CppAgeVerifyResponse.Extra extra = new CppAgeVerifyResponse.Extra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    extra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return extra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CppAgeVerifyResponse.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

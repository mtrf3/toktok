package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CppAgeVerifyResponse_ProtoDecoder implements InterfaceC31105CIr<CppAgeVerifyResponse> {
    @Override // X.InterfaceC31105CIr
    public final CppAgeVerifyResponse LIZ(Q9H q9h) {
        CppAgeVerifyResponse cppAgeVerifyResponse = new CppAgeVerifyResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        cppAgeVerifyResponse.extra = _CppAgeVerifyResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    cppAgeVerifyResponse.data = _CppAgeVerifyResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cppAgeVerifyResponse;
            }
        }
    }
}

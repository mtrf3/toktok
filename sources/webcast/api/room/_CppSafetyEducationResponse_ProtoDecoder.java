package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CppSafetyEducationResponse_ProtoDecoder implements InterfaceC31105CIr<CppSafetyEducationResponse> {
    @Override // X.InterfaceC31105CIr
    public final CppSafetyEducationResponse LIZ(Q9H q9h) {
        CppSafetyEducationResponse cppSafetyEducationResponse = new CppSafetyEducationResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        cppSafetyEducationResponse.extra = _CppSafetyEducationResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    cppSafetyEducationResponse.data = _CppSafetyEducationResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cppSafetyEducationResponse;
            }
        }
    }
}

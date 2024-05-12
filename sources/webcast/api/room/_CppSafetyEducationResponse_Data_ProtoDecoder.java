package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.room.CppSafetyEducationResponse;

/* loaded from: classes6.dex */
public final class _CppSafetyEducationResponse_Data_ProtoDecoder implements InterfaceC31105CIr<CppSafetyEducationResponse.Data> {
    public static CppSafetyEducationResponse.Data LIZIZ(Q9H q9h) {
        CppSafetyEducationResponse.Data data = new CppSafetyEducationResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.examStatus = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CppSafetyEducationResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

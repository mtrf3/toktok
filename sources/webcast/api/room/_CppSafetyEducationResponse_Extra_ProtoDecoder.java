package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.room.CppSafetyEducationResponse;

/* loaded from: classes6.dex */
public final class _CppSafetyEducationResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<CppSafetyEducationResponse.Extra> {
    public static CppSafetyEducationResponse.Extra LIZIZ(Q9H q9h) {
        CppSafetyEducationResponse.Extra extra = new CppSafetyEducationResponse.Extra();
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
    public final CppSafetyEducationResponse.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
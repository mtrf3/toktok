package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.message.proto._CppAgeVerificationInfo_ProtoDecoder;
import webcast.api.room.CppAgeVerifyResponse;

/* loaded from: classes6.dex */
public final class _CppAgeVerifyResponse_Data_ProtoDecoder implements InterfaceC31105CIr<CppAgeVerifyResponse.Data> {
    public static CppAgeVerifyResponse.Data LIZIZ(Q9H q9h) {
        CppAgeVerifyResponse.Data data = new CppAgeVerifyResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.ageVerificationInfo = _CppAgeVerificationInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CppAgeVerifyResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.message.proto._CppAgeVerificationInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._CppTaskInfo_ProtoDecoder;
import webcast.api.room.CppTaskInfoResponse;

/* loaded from: classes17.dex */
public final class _CppTaskInfoResponse_Data_ProtoDecoder implements InterfaceC31105CIr<CppTaskInfoResponse.Data> {
    public static CppTaskInfoResponse.Data LIZIZ(Q9H q9h) {
        CppTaskInfoResponse.Data data = new CppTaskInfoResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.cppTaskInfo = _CppTaskInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        data.permissionLevel = q9h.LJIIJ();
                        break;
                    case 3:
                        data.cppVersion = q9h.LJIIJ();
                        break;
                    case 4:
                        data.cppAgeVerificationInfo = _CppAgeVerificationInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        data.banStatus = _CppTaskInfoResponse_Data_BanStatus_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        data.advancedLiveBanStatus = _CppTaskInfoResponse_Data_BanStatus_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        data.examStatus = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CppTaskInfoResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

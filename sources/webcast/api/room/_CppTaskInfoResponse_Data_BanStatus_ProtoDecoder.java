package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.room.CppTaskInfoResponse;

/* loaded from: classes17.dex */
public final class _CppTaskInfoResponse_Data_BanStatus_ProtoDecoder implements InterfaceC31105CIr<CppTaskInfoResponse.Data.BanStatus> {
    public static CppTaskInfoResponse.Data.BanStatus LIZIZ(Q9H q9h) {
        CppTaskInfoResponse.Data.BanStatus banStatus = new CppTaskInfoResponse.Data.BanStatus();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        banStatus.endTime = q9h.LJIIJJI();
                    }
                } else {
                    banStatus.isBan = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return banStatus;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CppTaskInfoResponse.Data.BanStatus LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

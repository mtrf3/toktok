package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CppTaskInfoResponse_ProtoDecoder implements InterfaceC31105CIr<CppTaskInfoResponse> {
    @Override // X.InterfaceC31105CIr
    public final CppTaskInfoResponse LIZ(Q9H q9h) {
        CppTaskInfoResponse cppTaskInfoResponse = new CppTaskInfoResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        cppTaskInfoResponse.extra = _CppTaskInfoResponse_Extra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    cppTaskInfoResponse.data = _CppTaskInfoResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cppTaskInfoResponse;
            }
        }
    }
}

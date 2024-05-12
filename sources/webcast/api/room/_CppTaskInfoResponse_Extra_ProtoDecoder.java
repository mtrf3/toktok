package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.room.CppTaskInfoResponse;

/* loaded from: classes17.dex */
public final class _CppTaskInfoResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<CppTaskInfoResponse.Extra> {
    public static CppTaskInfoResponse.Extra LIZIZ(Q9H q9h) {
        CppTaskInfoResponse.Extra extra = new CppTaskInfoResponse.Extra();
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
    public final CppTaskInfoResponse.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

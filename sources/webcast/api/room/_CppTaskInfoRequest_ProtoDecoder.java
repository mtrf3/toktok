package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _CppTaskInfoRequest_ProtoDecoder implements InterfaceC31105CIr<CppTaskInfoRequest> {
    @Override // X.InterfaceC31105CIr
    public final CppTaskInfoRequest LIZ(Q9H q9h) {
        CppTaskInfoRequest cppTaskInfoRequest = new CppTaskInfoRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        cppTaskInfoRequest.scene = q9h.LJIIJ();
                    }
                } else {
                    cppTaskInfoRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return cppTaskInfoRequest;
            }
        }
    }
}
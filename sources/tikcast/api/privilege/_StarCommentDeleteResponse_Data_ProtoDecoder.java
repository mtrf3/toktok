package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.StarCommentDeleteResponse;

/* loaded from: classes6.dex */
public final class _StarCommentDeleteResponse_Data_ProtoDecoder implements InterfaceC31105CIr<StarCommentDeleteResponse.Data> {
    public static StarCommentDeleteResponse.Data LIZIZ(Q9H q9h) {
        StarCommentDeleteResponse.Data data = new StarCommentDeleteResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.serverCurMsgStartTimeMs = q9h.LJIIJJI();
                    }
                } else {
                    data.queue = _StarCommentQueue_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StarCommentDeleteResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

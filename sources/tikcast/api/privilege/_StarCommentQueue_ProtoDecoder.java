package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _StarCommentQueue_ProtoDecoder implements InterfaceC31105CIr<StarCommentQueue> {
    public static StarCommentQueue LIZIZ(Q9H q9h) {
        StarCommentQueue starCommentQueue = new StarCommentQueue();
        starCommentQueue.starCommentList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        starCommentQueue.queueVersion = q9h.LJIIJ();
                    }
                } else {
                    starCommentQueue.starCommentList.add(_StarCommentItem_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentQueue;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StarCommentQueue LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

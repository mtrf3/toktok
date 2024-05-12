package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _CommentCheckRequest_ProtoDecoder implements InterfaceC31105CIr<CommentCheckRequest> {
    @Override // X.InterfaceC31105CIr
    public final CommentCheckRequest LIZ(Q9H q9h) {
        CommentCheckRequest commentCheckRequest = new CommentCheckRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        commentCheckRequest.comment = Q9J.LIZIZ(q9h);
                    }
                } else {
                    commentCheckRequest.type = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return commentCheckRequest;
            }
        }
    }
}

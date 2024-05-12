package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CommentFlaggedPrompt_ProtoDecoder implements InterfaceC31105CIr<CommentFlaggedPrompt> {
    public static CommentFlaggedPrompt LIZIZ(Q9H q9h) {
        CommentFlaggedPrompt commentFlaggedPrompt = new CommentFlaggedPrompt();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            commentFlaggedPrompt.action = q9h.LJIIJJI();
                        }
                    } else {
                        commentFlaggedPrompt.trigger = q9h.LJIIJJI();
                    }
                } else {
                    commentFlaggedPrompt.show = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return commentFlaggedPrompt;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CommentFlaggedPrompt LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.77C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C77C extends AbstractC65781Prl implements InterfaceC88472Yns<Comment, User> {
    public static final C77C LJLIL = new C77C();

    public C77C() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final User invoke(Comment comment) {
        Comment comment2 = comment;
        if (comment2 != null) {
            return comment2.getUser();
        }
        return null;
    }
}

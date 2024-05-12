package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.73C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73C extends AbstractC65781Prl implements InterfaceC88472Yns<Comment, User> {
    public static final C73C LJLIL = new C73C();

    public C73C() {
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

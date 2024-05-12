package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81083Ge extends AbstractC65781Prl implements InterfaceC88472Yns<C109544Rq, CharSequence> {
    public static final C81083Ge LJLIL = new C81083Ge();

    public C81083Ge() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(C109544Rq c109544Rq) {
        C109544Rq it = c109544Rq;
        o.LJIIIZ(it, "it");
        EnumC110124Tw.Companion.getClass();
        BaseContent LIZJ = C110134Tx.LIZJ(it);
        o.LJII(LIZJ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent");
        String commentId = ((CommentContent) LIZJ).getCommentId();
        if (commentId == null) {
            return "";
        }
        return commentId;
    }
}

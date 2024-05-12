package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.interaction.assem.NowCommentAssem;
import com.ss.android.ugc.now.interaction.api.CommentCountState;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7A3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7A3 extends AbstractC65781Prl implements InterfaceC88471Ynr<NowCommentAssem, CommentCountState, C76800UCe> {
    public static final C7A3 LJLIL = new C7A3();

    public C7A3() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowCommentAssem nowCommentAssem, CommentCountState commentCountState) {
        String str;
        NowCommentAssem selectSubscribe = nowCommentAssem;
        CommentCountState commentCountState2 = commentCountState;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (commentCountState2 != null) {
            Aweme aweme = ((C7ML) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C79146V4k.LJIJJLI(commentCountState2, str, new AqS150S0200000_3(selectSubscribe, commentCountState2, 45));
        }
        return C76800UCe.LIZ;
    }
}

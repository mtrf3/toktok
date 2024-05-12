package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7OO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7OO extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCommentAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C7OO LJLIL = new C7OO();

    public C7OO() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCommentAssem videoCommentAssem, C43I<? extends Integer> c43i) {
        VideoCommentAssem selectSubscribe = videoCommentAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIIL = true;
            VideoCommentVM u4 = selectSubscribe.u4();
            u4.getClass();
            u4.setState(new AqS169S0100000_3(u4, 829));
        }
        return C76800UCe.LIZ;
    }
}

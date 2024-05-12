package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7OQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7OQ extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCommentAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C7OQ LJLIL = new C7OQ();

    public C7OQ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCommentAssem videoCommentAssem, C43I<? extends C195357lb> c43i) {
        VideoCommentAssem selectSubscribe = videoCommentAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIIL = false;
        }
        return C76800UCe.LIZ;
    }
}

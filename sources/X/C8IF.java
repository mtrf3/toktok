package X;

import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8IF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IF extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFeedMultiTagAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C8IF LJLIL = new C8IF();

    public C8IF() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFeedMultiTagAssem videoFeedMultiTagAssem, C43I<? extends C195357lb> c43i) {
        VideoItemParams gv0;
        C7G8 c7g8;
        C8IM c8im;
        VideoFeedMultiTagAssem selectSubscribe = videoFeedMultiTagAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if ((!C53324KwK.LIZ() || c43i != null) && (gv0 = selectSubscribe.q4().gv0()) != null && gv0.getAweme() != null && (c7g8 = selectSubscribe.LLFZ) != null) {
            c7g8.LJLIL.LIZLLL();
            C8IM c8im2 = c7g8.LJLJJL;
            if (c8im2 != null && c8im2.getParent() != null && (c8im = c7g8.LJLJJL) != null) {
                c8im.LIZIZ();
            }
        }
        return C76800UCe.LIZ;
    }
}

package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7OK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7OK extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCommentAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C7OK LJLIL = new C7OK();

    public C7OK() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCommentAssem videoCommentAssem, C43I<? extends Boolean> c43i) {
        VideoCommentAssem selectSubscribeOnAsync = videoCommentAssem;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (!C53324KwK.LIZ() || c43i != null) {
            C174206sa.LIZ = Boolean.TRUE;
            selectSubscribeOnAsync.r4().callOnClick();
        }
        return C76800UCe.LIZ;
    }
}

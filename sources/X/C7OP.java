package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7OP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7OP extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCommentAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C7OP LJLIL = new C7OP();

    public C7OP() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCommentAssem videoCommentAssem, C43I<? extends Integer> c43i) {
        VideoCommentAssem selectSubscribeOnAsync = videoCommentAssem;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (!C53324KwK.LIZ() || c43i != null) {
            VideoCommentVM u4 = selectSubscribeOnAsync.u4();
            u4.getClass();
            u4.withState(new AqS169S0100000_3(u4, 828));
            C201847w4 c201847w4 = selectSubscribeOnAsync.LLIL;
            if (c201847w4 != null) {
                c201847w4.LIZIZ = false;
            }
        }
        return C76800UCe.LIZ;
    }
}

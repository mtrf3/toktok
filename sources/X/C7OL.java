package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7OL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7OL extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCommentAssem, Integer, C76800UCe> {
    public static final C7OL LJLIL = new C7OL();

    public C7OL() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCommentAssem videoCommentAssem, Integer num) {
        VideoCommentAssem selectSubscribe = videoCommentAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.r4().setVisibility(intValue);
        return C76800UCe.LIZ;
    }
}

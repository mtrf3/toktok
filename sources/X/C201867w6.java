package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7w6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201867w6 extends AbstractC65781Prl implements InterfaceC88473Ynt<VideoCommentAssem, String, Integer, C76800UCe> {
    public static final C201867w6 LJLIL = new C201867w6();

    public C201867w6() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(VideoCommentAssem videoCommentAssem, String str, Integer num) {
        VideoCommentAssem selectSubscribe = videoCommentAssem;
        String text = str;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(text, "text");
        selectSubscribe.A4(intValue, text);
        return C76800UCe.LIZ;
    }
}

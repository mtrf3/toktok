package X;

import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7AN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7AN extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoQuickCommentAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C7AN LJLIL = new C7AN();

    public C7AN() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoQuickCommentAssem videoQuickCommentAssem, C43I<? extends C76800UCe> c43i) {
        String str;
        VideoQuickCommentAssem selectSubscribe = videoQuickCommentAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (selectSubscribe.LJLLL) {
            InterfaceC178516zX r4 = selectSubscribe.r4();
            Aweme commentInputAweme = selectSubscribe.getCommentInputAweme();
            if (commentInputAweme != null) {
                str = commentInputAweme.getAid();
            } else {
                str = null;
            }
            C7AL c7al = r4.get(str);
            if (!c7al.LJLIL) {
                selectSubscribe.u4(true, true, new AqS150S0200000_3(selectSubscribe, c7al, 104));
            }
        }
        return C76800UCe.LIZ;
    }
}

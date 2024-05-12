package X;

import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialTextViewTagAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8Qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211178Qn extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedSocialTextViewTagAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C211178Qn LJLIL = new C211178Qn();

    public C211178Qn() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedSocialTextViewTagAssem feedSocialTextViewTagAssem, C43I<? extends C195357lb> c43i) {
        FeedSocialTextViewTagAssem selectSubscribe = feedSocialTextViewTagAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        TagLayout tagLayout = selectSubscribe.LLI;
        if (tagLayout != null) {
            C253039wR.LIZIZ(tagLayout);
            return C76800UCe.LIZ;
        }
        o.LJIJI("tagLayout");
        throw null;
    }
}

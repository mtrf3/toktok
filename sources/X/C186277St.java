package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import kotlin.jvm.internal.o;

/* renamed from: X.7St, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186277St extends AbstractC65781Prl implements InterfaceC88472Yns<C186157Sh, C186157Sh> {
    public final /* synthetic */ TopicReviewVM LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186277St(TopicReviewVM topicReviewVM, C68322mC<String> c68322mC, int i, String str) {
        super(1);
        this.LJLIL = topicReviewVM;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = i;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C186157Sh invoke(C186157Sh c186157Sh) {
        C186157Sh setState = c186157Sh;
        o.LJIIIZ(setState, "$this$setState");
        TopicReviewVM topicReviewVM = this.LJLIL;
        String str = topicReviewVM.LJLIL;
        int i = topicReviewVM.LJLILLLLZI;
        String str2 = this.LJLILLLLZI.element;
        int i2 = this.LJLJI;
        String str3 = this.LJLJJI;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        return C186157Sh.L(setState, 0.0f, 0L, 0L, false, true, new C43I(new TopicReview(str, i, str2, i2, str3, 0, false, currentTimeMillis, curUser, true)), 15);
    }
}

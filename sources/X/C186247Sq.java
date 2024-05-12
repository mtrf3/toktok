package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM$publish$1$6", f = "TopicReviewVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186247Sq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DialogC25756A8y LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ TopicReviewVM LJLJI;
    public final /* synthetic */ TopicReview LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186247Sq(DialogC25756A8y dialogC25756A8y, Fragment fragment, TopicReviewVM topicReviewVM, TopicReview topicReview, int i, InterfaceC67352kd<? super C186247Sq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = dialogC25756A8y;
        this.LJLILLLLZI = fragment;
        this.LJLJI = topicReviewVM;
        this.LJLJJI = topicReview;
        this.LJLJJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C186247Sq(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C141335gf.LIZJ(obj);
        this.LJLIL.hide();
        ASQ.LJ(this.LJLILLLLZI, ASX.LIZ);
        TopicReviewVM topicReviewVM = this.LJLJI;
        TopicReview topicReview = this.LJLJJI;
        if (topicReview != null && topicReview.getTopicRating() == this.LJLJJL) {
            num = null;
        } else {
            num = new Integer(this.LJLJJL);
        }
        topicReviewVM.gv0(num, "success");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

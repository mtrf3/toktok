package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import fjb.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS169S0100000_3;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM$delete$1", f = "TopicReviewVM.kt", l = {199}, m = "invokeSuspend")
/* renamed from: X.7Sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186197Sl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TopicReviewVM LJLILLLLZI;
    public final /* synthetic */ TopicReview LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186197Sl(TopicReviewVM topicReviewVM, TopicReview topicReview, InterfaceC67352kd<? super C186197Sl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = topicReviewVM;
        this.LJLJI = topicReview;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C186197Sl(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            TopicReviewVM topicReviewVM = this.LJLILLLLZI;
            C186187Sk c186187Sk = topicReviewVM.LJLJJI.LIZIZ;
            String str = topicReviewVM.LJLIL;
            int i2 = topicReviewVM.LJLILLLLZI;
            String reviewId = this.LJLJI.getReviewId();
            this.LJLIL = 1;
            obj = c186187Sk.LJLIL.LIZ.deleteReview(str, i2, reviewId, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((BaseResponse) obj).status_code == 0) {
            this.LJLILLLLZI.setState(new AqS169S0100000_3(this.LJLJI, 649));
            Object obj2 = ((LinkedHashMap) this.LJLILLLLZI.LJLJI).get("previous_page");
            String LJJLIIIJ = C78983UzD.LJJLIIIJ(this.LJLILLLLZI.LJLILLLLZI);
            TopicReviewVM topicReviewVM2 = this.LJLILLLLZI;
            FMX.LJIIL("delete_topic_review", C113554cx.LJJLIIIJILLIZJL(C113554cx.LJJL(new OSZ("enter_from", "topic_detail"), new OSZ("previous_page", obj2), new OSZ("category", LJJLIIIJ), new OSZ("topic_id", topicReviewVM2.LJLIL), new OSZ("topic_title", ((LinkedHashMap) topicReviewVM2.LJLJI).get("topic_title")), new OSZ("to_user_id", this.LJLJI.getUser().getUid())), new LinkedHashMap()));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

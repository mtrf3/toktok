package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM;
import fjb.a;
import java.util.LinkedHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM$toggleDigg$1", f = "TopicReviewListVM.kt", l = {137, 139}, m = "invokeSuspend")
/* renamed from: X.7Sf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186137Sf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C186177Sj LJLILLLLZI;
    public final /* synthetic */ TopicReviewListVM LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186137Sf(C186177Sj c186177Sj, TopicReviewListVM topicReviewListVM, int i, InterfaceC67352kd<? super C186137Sf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c186177Sj;
        this.LJLJI = topicReviewListVM;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C186137Sf(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C141335gf.LIZJ(obj2);
                    baseResponse = (BaseResponse) obj2;
                } else {
                    C141335gf.LIZJ(obj2);
                    baseResponse = (BaseResponse) obj2;
                }
            } else {
                C141335gf.LIZJ(obj2);
                if (this.LJLILLLLZI.LJLIL.getUserDigged()) {
                    TopicReviewListVM topicReviewListVM = this.LJLJI;
                    C186187Sk c186187Sk = topicReviewListVM.LJLJJL.LIZIZ;
                    String str = topicReviewListVM.LJLIL;
                    int i2 = topicReviewListVM.LJLILLLLZI;
                    String reviewId = this.LJLILLLLZI.LJLIL.getReviewId();
                    this.LJLIL = 1;
                    obj2 = c186187Sk.LJLIL.LIZ.undiggReview(str, i2, reviewId, this);
                    if (obj2 == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                    baseResponse = (BaseResponse) obj2;
                } else {
                    TopicReviewListVM topicReviewListVM2 = this.LJLJI;
                    C186187Sk c186187Sk2 = topicReviewListVM2.LJLJJL.LIZIZ;
                    String str2 = topicReviewListVM2.LJLIL;
                    int i3 = topicReviewListVM2.LJLILLLLZI;
                    String reviewId2 = this.LJLILLLLZI.LJLIL.getReviewId();
                    this.LJLIL = 2;
                    obj2 = c186187Sk2.LJLIL.LIZ.diggReview(str2, i3, reviewId2, this);
                    if (obj2 == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                    baseResponse = (BaseResponse) obj2;
                }
            }
        } catch (Exception unused) {
            this.LJLJI.listSetItemAt(this.LJLJJI, (int) this.LJLILLLLZI);
        }
        if (baseResponse.status_code != 0) {
            throw new Exception("toggle digg failed");
        }
        if (this.LJLILLLLZI.LJLIL.getUserDigged()) {
            Object obj3 = ((LinkedHashMap) this.LJLJI.LJLJI).get("previous_page");
            String LJJLIIIJ = C78983UzD.LJJLIIIJ(this.LJLJI.LJLILLLLZI);
            TopicReviewListVM topicReviewListVM3 = this.LJLJI;
            FMX.LJIIL("cancel_like_topic_review", C113554cx.LJJLIIIJILLIZJL(C113554cx.LJJL(new OSZ("enter_from", "topic_detail"), new OSZ("previous_page", obj3), new OSZ("category", LJJLIIIJ), new OSZ("topic_id", topicReviewListVM3.LJLIL), new OSZ("topic_title", ((LinkedHashMap) topicReviewListVM3.LJLJI).get("topic_title")), new OSZ("to_user_id", this.LJLILLLLZI.LJLIL.getUser().getUid())), new LinkedHashMap()));
        } else {
            Object obj4 = ((LinkedHashMap) this.LJLJI.LJLJI).get("previous_page");
            String LJJLIIIJ2 = C78983UzD.LJJLIIIJ(this.LJLJI.LJLILLLLZI);
            TopicReviewListVM topicReviewListVM4 = this.LJLJI;
            FMX.LJIIL("like_topic_review", C113554cx.LJJLIIIJILLIZJL(C113554cx.LJJL(new OSZ("enter_from", "topic_detail"), new OSZ("previous_page", obj4), new OSZ("category", LJJLIIIJ2), new OSZ("topic_id", topicReviewListVM4.LJLIL), new OSZ("topic_title", ((LinkedHashMap) topicReviewListVM4.LJLJI).get("topic_title")), new OSZ("to_user_id", this.LJLILLLLZI.LJLIL.getUser().getUid())), new LinkedHashMap()));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

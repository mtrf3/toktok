package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReviewDetailsFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReviewDetailsFragment$onViewCreated$1$1$1$1", f = "PaidContentReviewDetailsFragment.kt", l = {SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.A2c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25578A2c extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CollectionDetailModel LJLILLLLZI;
    public final /* synthetic */ PaidContentReviewDetailsFragment LJLJI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25578A2c(CollectionDetailModel collectionDetailModel, PaidContentReviewDetailsFragment paidContentReviewDetailsFragment, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC67352kd<? super C25578A2c> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = collectionDetailModel;
        this.LJLJI = paidContentReviewDetailsFragment;
        this.LJLJJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25578A2c(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C79863Bm c79863Bm = A4S.LIZIZ;
            C25579A2d c25579A2d = new C25579A2d(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            this.LJLIL = 1;
            if (c79863Bm.collect(c25579A2d, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

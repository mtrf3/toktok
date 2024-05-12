package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM$requestFeedReachCfg$1$feedReachSsResponse$1", f = "EcVideoGuideVM.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ECK extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<Response<FeedReachResponse>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ EcVideoGuideVM LJLILLLLZI;
    public final /* synthetic */ FeedReachGetParams LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECK(EcVideoGuideVM ecVideoGuideVM, FeedReachGetParams feedReachGetParams, InterfaceC67352kd<? super ECK> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = ecVideoGuideVM;
        this.LJLJI = feedReachGetParams;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new ECK(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C64797Pbt<Response<FeedReachResponse>>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            ECE ece = (ECE) this.LJLILLLLZI.LJLILLLLZI.getValue().getOperator();
            FeedReachGetParams feedReachGetParams = this.LJLJI;
            this.LJLIL = 1;
            obj = ece.LJ(feedReachGetParams, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}

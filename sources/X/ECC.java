package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachUpdateParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.repository.FeedReachApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem$startInterest$19$updateResponse$1", f = "EcVideoGuideAssem.kt", l = {385}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ECC extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<Response<C76800UCe>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ ReachCfg LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECC(ReachCfg reachCfg, int i, InterfaceC67352kd<? super ECC> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = reachCfg;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new ECC(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C64797Pbt<Response<C76800UCe>>> interfaceC67352kd) {
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
            FeedReachUpdateParams feedReachUpdateParams = new FeedReachUpdateParams(1, C47261Igj.LJJIJ(this.LJLILLLLZI), this.LJLJI);
            FeedReachApi feedReachApi = (FeedReachApi) C67332kb.LIZ().create(FeedReachApi.class);
            this.LJLIL = 1;
            obj = feedReachApi.feedReachUpdate(feedReachUpdateParams, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}

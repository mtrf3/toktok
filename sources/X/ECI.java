package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachUpdateParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM$feedReachUpdate$1$1$1", f = "EcVideoGuideVM.kt", l = {387}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ECI extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<Response<C76800UCe>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ EcVideoGuideVM LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ List<ReachCfg> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECI(EcVideoGuideVM ecVideoGuideVM, int i, List<ReachCfg> list, int i2, InterfaceC67352kd<? super ECI> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = ecVideoGuideVM;
        this.LJLJI = i;
        this.LJLJJI = list;
        this.LJLJJL = i2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new ECI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            ECE ece = (ECE) this.LJLILLLLZI.LJLILLLLZI.getValue().getOperator();
            FeedReachUpdateParams feedReachUpdateParams = new FeedReachUpdateParams(this.LJLJI, this.LJLJJI, this.LJLJJL);
            this.LJLIL = 1;
            obj = ece.feedReachUpdate(feedReachUpdateParams, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}

package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem$startInterest$19", f = "EcVideoGuideAssem.kt", l = {383, 387}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ECN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ java.util.Map<String, Integer> LJLILLLLZI;
    public final /* synthetic */ EcVideoGuideAssem LJLJI;
    public final /* synthetic */ ReachCfg LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECN(java.util.Map<String, Integer> map, EcVideoGuideAssem ecVideoGuideAssem, ReachCfg reachCfg, int i, InterfaceC67352kd<? super ECN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = map;
        this.LJLJI = ecVideoGuideAssem;
        this.LJLJJI = reachCfg;
        this.LJLJJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ECN(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Response response;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    EcVideoGuideAssem.LLILLJJLI.getClass();
                    EcVideoGuideAssem.LLILZ.remove(((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLJI)).getAweme().getAid());
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            java.util.Map<String, Integer> map = this.LJLILLLLZI;
            ECC ecc = new ECC(this.LJLJJI, this.LJLJJL, null);
            this.LJLIL = 1;
            obj = C36669EaH.LIZLLL("homepage_hot", map, ecc, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C64797Pbt c64797Pbt = (C64797Pbt) obj;
        if (c64797Pbt != null && (response = (Response) c64797Pbt.LIZIZ) != null && response.isCodeOK()) {
            this.LJLIL = 2;
            if (C1JD.LIZJ(86400000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        EcVideoGuideAssem.LLILLJJLI.getClass();
        EcVideoGuideAssem.LLILZ.remove(((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLJI)).getAweme().getAid());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

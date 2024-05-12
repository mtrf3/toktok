package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.ForceFeed;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunViewModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS137S0200000_6;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunViewModel$getRacunPageData$1$1", f = "MallRacunViewModel.kt", l = {168}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EBR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MallRacunViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ List<ForceFeed> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBR(MallRacunViewModel mallRacunViewModel, boolean z, int i, Integer num, String str, String str2, List<ForceFeed> list, InterfaceC67352kd<? super EBR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mallRacunViewModel;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = num;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJLJ = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EBR(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Response response;
        MallRacunResponse mallRacunResponse;
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
            this.LJLILLLLZI.setState(new C35637Dyj(this.LJLJJI));
            this.LJLILLLLZI.setState(C35639Dyl.LJLIL);
            java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("is_retry", new Integer(this.LJLJI ? 1 : 0)));
            EBS ebs = new EBS(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, null);
            this.LJLIL = 1;
            obj = C36669EaH.LIZLLL("mall_racun_channel", LJJIIZI, ebs, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C64797Pbt c64797Pbt = (C64797Pbt) obj;
        if (c64797Pbt != null && (response = (Response) c64797Pbt.LIZIZ) != null && (mallRacunResponse = (MallRacunResponse) response.data) != null && response.isCodeOK()) {
            MallRacunViewModel mallRacunViewModel = this.LJLILLLLZI;
            mallRacunViewModel.setState(new AqS137S0200000_6(mallRacunResponse, this.LJLJJL, 6));
            mallRacunViewModel.setState(C35639Dyl.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

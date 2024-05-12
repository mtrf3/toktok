package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.ForceFeed;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunRequest;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.repository.api.MallRacunApi;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunViewModel$getRacunPageData$1$1$ssResp$1", f = "MallRacunViewModel.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EBS extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<Response<MallRacunResponse>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ List<ForceFeed> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBS(Integer num, String str, String str2, List<ForceFeed> list, InterfaceC67352kd<? super EBS> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = num;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new EBS(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C64797Pbt<Response<MallRacunResponse>>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            MallRacunApi.LIZ.getClass();
            MallRacunApi mallRacunApi = EBT.LIZIZ;
            Integer num = this.LJLILLLLZI;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 2;
            }
            MallRacunRequest mallRacunRequest = new MallRacunRequest(new Integer(i), this.LJLJI, this.LJLJJI, this.LJLJJL);
            this.LJLIL = 1;
            obj = mallRacunApi.getContentChannel(mallRacunRequest, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}

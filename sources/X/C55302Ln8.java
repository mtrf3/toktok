package X;

import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallFeedRequest;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallFeedResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.repository.api.MallFeedApi;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunFeedViewModel$loadMore$1$ssResp$1", f = "MallRacunFeedViewModel.kt", l = {67}, m = "invokeSuspend")
/* renamed from: X.Ln8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55302Ln8 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<MallFeedResponse>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C55289Lmv LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55302Ln8(int i, long j, C55289Lmv c55289Lmv, String str, InterfaceC67352kd interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c55289Lmv;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55302Ln8(this.LJLJJI, this.LJLJJL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C64797Pbt<MallFeedResponse>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            MallFeedApi.LIZ.getClass();
            MallFeedApi mallFeedApi = C55675Lt9.LIZIZ;
            List LLJI = ORZ.LLJI(this.LJLILLLLZI.LJLJJI);
            MallFeedRequest mallFeedRequest = new MallFeedRequest(this.LJLJI, 2, 6, this.LJLJJI, this.LJLILLLLZI.LJLJLJ, this.LJLJJL, null, LLJI, 64, null);
            this.LJLIL = 1;
            obj2 = mallFeedApi.getMallRecommendFeed(mallFeedRequest, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj2;
    }
}

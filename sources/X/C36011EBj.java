package X;

import com.google.gson.Gson;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultOrderViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import fjb.a;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultOrderViewModel$fetchData$3", f = "EcSearchResultOrderViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EBj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36011EBj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EcSearchResultOrderViewModel LJLILLLLZI;
    public final /* synthetic */ SearchResultParam LJLJI;
    public final /* synthetic */ C68322mC<Integer> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36011EBj(EcSearchResultOrderViewModel ecSearchResultOrderViewModel, SearchResultParam searchResultParam, C68322mC<Integer> c68322mC, InterfaceC67352kd<? super C36011EBj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ecSearchResultOrderViewModel;
        this.LJLJI = searchResultParam;
        this.LJLJJI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36011EBj c36011EBj = new C36011EBj(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c36011EBj.LJLIL = obj;
        return c36011EBj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        m LIZJ;
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        try {
            KFN copy$default = KFN.copy$default(this.LJLILLLLZI.LJLILLLLZI.LIZ(this.LJLJI), null, null, "order", 0, 0, null, null, 0L, 9, null, "tiktok_order", null, null, null, null, null, null, null, null, null, null, 0, this.LJLJJI.element, null, null, 29358843, null);
            KFQ kfq = this.LJLILLLLZI.LJLJJI;
            if (kfq != null) {
                KFQ.LIZJ(kfq, true, 0, 0, "/aweme/v1/search/ecom/order/", 20);
            }
            KFQ kfq2 = this.LJLILLLLZI.LJLJJI;
            if (kfq2 != null) {
                kfq2.LJI = System.currentTimeMillis();
            }
            KFQ kfq3 = this.LJLILLLLZI.LJLJJI;
            if (kfq3 != null) {
                kfq3.LJFF = false;
            }
            LIZJ = EcSearchApi.LIZJ(copy$default);
        } catch (Exception e) {
            this.LJLILLLLZI.setState(new AqS172S0100000_6(e, 33));
            KFQ kfq4 = this.LJLILLLLZI.LJLJJI;
            if (kfq4 != null) {
                KFQ.LIZJ(kfq4, false, 0, 0, "/aweme/v1/search/ecom/order/", 20);
            }
            KFQ kfq5 = this.LJLILLLLZI.LJLJJI;
            if (kfq5 != null) {
                kfq5.LJ("request_start_error");
            }
        }
        if (!C79146V4k.LJJJ(interfaceC70422pa.getCoroutineContext())) {
            return C76800UCe.LIZ;
        }
        EcSearchResultOrderViewModel ecSearchResultOrderViewModel = this.LJLILLLLZI;
        ecSearchResultOrderViewModel.setState(new AqS137S0200000_6(LIZJ, ecSearchResultOrderViewModel, 18));
        Gson gson = this.LJLILLLLZI.LJLJJLL;
        SearchApiResult orderResult = (SearchApiResult) gson.LJI(gson.LJIILJJIL(LIZJ), SearchApiResult.class);
        KE1 ke1 = this.LJLILLLLZI.LJLJI;
        o.LJIIIIZZ(orderResult, "orderResult");
        ke1.LIZ(orderResult, this.LJLJI);
        KFQ kfq6 = this.LJLILLLLZI.LJLJJI;
        if (kfq6 != null) {
            KFQ.LIZJ(kfq6, false, 1, 0, "/aweme/v1/search/ecom/order/", 16);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

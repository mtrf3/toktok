package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.result.common.core.model.EComMallLiveTabCardStruct;
import com.ss.android.ugc.aweme.result.common.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultLiveViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultLiveViewModel$fetchData$1", f = "EcSearchResultLiveViewModel.kt", l = {149}, m = "invokeSuspend")
/* renamed from: X.EBk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36012EBk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ EcSearchResultLiveViewModel LJLJI;
    public final /* synthetic */ SearchResultParam LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36012EBk(EcSearchResultLiveViewModel ecSearchResultLiveViewModel, SearchResultParam searchResultParam, InterfaceC67352kd<? super C36012EBk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = ecSearchResultLiveViewModel;
        this.LJLJJI = searchResultParam;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36012EBk c36012EBk = new C36012EBk(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c36012EBk.LJLILLLLZI = obj;
        return c36012EBk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        SearchLiveList searchLiveList;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        boolean z = false;
        boolean z2 = false;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj2);
            } else {
                C141335gf.LIZJ(obj2);
                InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                KFN LIZ = this.LJLJI.LJLILLLLZI.LIZ(this.LJLJJI);
                if (C36015EBn.LIZ()) {
                    i = 12;
                } else {
                    i = 6;
                }
                KFN copy$default = KFN.copy$default(LIZ, null, null, "mall_live_tab", 0, 0, null, null, 0L, i, null, "tiktok_mall_live_tab", null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 33553147, null);
                EcSearchResultLiveViewModel ecSearchResultLiveViewModel = this.LJLJI;
                KFQ kfq = ecSearchResultLiveViewModel.LJLJJI;
                if (kfq != null) {
                    z = false;
                    kfq.LIZIZ(0, 0, ecSearchResultLiveViewModel.LJLL, "/aweme/v1/search/mall_live/ecom/", true);
                }
                KFQ kfq2 = this.LJLJI.LJLJJI;
                if (kfq2 != null) {
                    kfq2.LJI = System.currentTimeMillis();
                }
                KFQ kfq3 = this.LJLJI.LJLJJI;
                if (kfq3 != null) {
                    kfq3.LJFF = z;
                }
                m LIZIZ = EcSearchApi.LIZIZ(copy$default);
                if (!C79146V4k.LJJJ(interfaceC70422pa.getCoroutineContext())) {
                    return C76800UCe.LIZ;
                }
                EcSearchResultLiveViewModel ecSearchResultLiveViewModel2 = this.LJLJI;
                ecSearchResultLiveViewModel2.setState(new AqS137S0200000_6(LIZIZ, ecSearchResultLiveViewModel2, 17));
                XIA xia = C78613UtF.LIZJ;
                C36006EBe c36006EBe = new C36006EBe(this.LJLJI, LIZIZ, null);
                this.LJLIL = 1;
                obj2 = XKX.LJI(xia, c36006EBe, this);
                z2 = z;
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            searchLiveList = (SearchLiveList) obj2;
        } catch (Exception e) {
            this.LJLJI.setState(new AqS172S0100000_6(e, 32));
            EcSearchResultLiveViewModel ecSearchResultLiveViewModel3 = this.LJLJI;
            KFQ kfq4 = ecSearchResultLiveViewModel3.LJLJJI;
            if (kfq4 != null) {
                kfq4.LIZIZ(0, 0, ecSearchResultLiveViewModel3.LJLL, "/aweme/v1/search/mall_live/ecom/", false);
            }
            KFQ kfq5 = this.LJLJI.LJLJJI;
            if (kfq5 != null) {
                kfq5.LJ("request_start_error");
            }
        }
        if (searchLiveList != null) {
            this.LJLJI.gv0(searchLiveList.liveCardItems);
            this.LJLJI.LJLJI.LIZ(searchLiveList, this.LJLJJI);
            KFQ kfq6 = this.LJLJI.LJLJJI;
            if (kfq6 != null) {
                List<EComMallLiveTabCardStruct> list = searchLiveList.liveCardItems;
                int i3 = z2;
                if (list != null) {
                    i3 = list.size();
                }
                kfq6.LIZIZ(1, i3, this.LJLJI.LJLL, "/aweme/v1/search/mall_live/ecom/", false);
            }
            EcSearchResultLiveViewModel ecSearchResultLiveViewModel4 = this.LJLJI;
            ecSearchResultLiveViewModel4.LJLL = searchLiveList.cursor;
            ecSearchResultLiveViewModel4.LJLJL = searchLiveList.hasMore;
            return C76800UCe.LIZ;
        }
        throw new Exception();
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

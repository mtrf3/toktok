package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchShopList;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultShopViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultShopViewModel$fetchData$1", f = "EcSearchResultShopViewModel.kt", l = {115}, m = "invokeSuspend")
/* renamed from: X.EBl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36013EBl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EcSearchResultShopViewModel LJLILLLLZI;
    public final /* synthetic */ SearchResultParam LJLJI;
    public final /* synthetic */ JSONObject LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36013EBl(EcSearchResultShopViewModel ecSearchResultShopViewModel, SearchResultParam searchResultParam, JSONObject jSONObject, InterfaceC67352kd<? super C36013EBl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ecSearchResultShopViewModel;
        this.LJLJI = searchResultParam;
        this.LJLJJI = jSONObject;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36013EBl(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        InterfaceC51365KDx LIZ;
        InterfaceC51365KDx LIZ2;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        String str9 = "/aweme/v1/search/stream/ecom/";
        boolean z = false;
        boolean z2 = false;
        try {
        } catch (Exception e) {
            this.LJLILLLLZI.setState(new AqS172S0100000_6(e, 59));
            EcSearchResultShopViewModel ecSearchResultShopViewModel = this.LJLILLLLZI;
            KFQ kfq = ecSearchResultShopViewModel.LJLJJI;
            if (kfq != null) {
                if (!((Boolean) ecSearchResultShopViewModel.LJLJLJ.getValue()).booleanValue()) {
                    str9 = "/aweme/v1/search/single/ecom/";
                }
                KFQ.LIZJ(kfq, false, 0, 0, str9, 16);
            }
            KFQ kfq2 = this.LJLILLLLZI.LJLJJI;
            if (kfq2 != null) {
                kfq2.LJ("request_start_error");
            }
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            KFN LIZ3 = this.LJLILLLLZI.LJLILLLLZI.LIZ(this.LJLJI);
            JSONObject jSONObject = this.LJLJJI;
            if (jSONObject == null || (str = jSONObject.optString("source")) == null) {
                str = "";
            }
            JSONObject jSONObject2 = this.LJLJJI;
            if (jSONObject2 != null) {
                str2 = jSONObject2.optString("search_channel");
            } else {
                str2 = null;
            }
            int LIZ4 = C2SL.LIZ();
            KEP kep = this.LJLILLLLZI.LJLJJL;
            if (kep != null && (LIZ2 = kep.LIZ()) != null) {
                str3 = LIZ2.LIZJ();
            } else {
                str3 = null;
            }
            KEP kep2 = this.LJLILLLLZI.LJLJJL;
            if (kep2 != null && (LIZ = kep2.LIZ()) != null) {
                str4 = LIZ.LJI();
            } else {
                str4 = null;
            }
            JSONObject jSONObject3 = this.LJLJJI;
            if (jSONObject3 != null) {
                str5 = jSONObject3.optString("sug_shop_id");
            } else {
                str5 = null;
            }
            JSONObject jSONObject4 = this.LJLJJI;
            if (jSONObject4 != null) {
                str6 = jSONObject4.optString("sug_creator_id");
            } else {
                str6 = null;
            }
            JSONObject jSONObject5 = this.LJLJJI;
            if (jSONObject5 != null) {
                str7 = jSONObject5.optString("attach_products");
            } else {
                str7 = null;
            }
            KFN copy$default = KFN.copy$default(LIZ3, null, null, str, 0, 0, null, null, 0L, LIZ4, null, str2, null, null, null, str6, str7, null, str5, str3, str4, null, 0, null, null, null, 32586491, null);
            EcSearchResultShopViewModel ecSearchResultShopViewModel2 = this.LJLILLLLZI;
            KFQ kfq3 = ecSearchResultShopViewModel2.LJLJJI;
            if (kfq3 != null) {
                if (((Boolean) ecSearchResultShopViewModel2.LJLJLJ.getValue()).booleanValue()) {
                    str8 = "/aweme/v1/search/stream/ecom/";
                } else {
                    str8 = "/aweme/v1/search/single/ecom/";
                }
                z = false;
                KFQ.LIZJ(kfq3, true, 0, 0, str8, 16);
            }
            KFQ kfq4 = this.LJLILLLLZI.LJLJJI;
            if (kfq4 != null) {
                kfq4.LJI = System.currentTimeMillis();
            }
            KFQ kfq5 = this.LJLILLLLZI.LJLJJI;
            if (kfq5 != null) {
                kfq5.LJFF = z;
            }
            EF7.LIZIZ();
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    if (((Boolean) this.LJLILLLLZI.LJLJLJ.getValue()).booleanValue()) {
                        this.LJLILLLLZI.gv0(copy$default, this.LJLJI);
                        return C76800UCe.LIZ;
                    }
                    m LIZLLL = EcSearchApi.LIZLLL(copy$default);
                    EcSearchResultShopViewModel ecSearchResultShopViewModel3 = this.LJLILLLLZI;
                    ecSearchResultShopViewModel3.setState(new AqS137S0200000_6(LIZLLL, ecSearchResultShopViewModel3, 25));
                    XIA xia = C78613UtF.LIZJ;
                    C36003EBb c36003EBb = new C36003EBb(this.LJLILLLLZI, LIZLLL, null);
                    this.LJLIL = 1;
                    obj2 = XKX.LJI(xia, c36003EBb, this);
                    z2 = z;
                    if (obj2 == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            } catch (Exception unused) {
            }
            throw new C64698PaI();
        }
        SearchShopList searchShopList = (SearchShopList) obj2;
        if (searchShopList != null) {
            this.LJLILLLLZI.LJLJI.LIZ(searchShopList, this.LJLJI);
            KFQ kfq6 = this.LJLILLLLZI.LJLJJI;
            if (kfq6 != null) {
                List<Object> list = searchShopList.searchEcomList;
                int i2 = z2;
                if (list != null) {
                    i2 = list.size();
                }
                KFQ.LIZJ(kfq6, false, 1, i2, "/aweme/v1/search/single/ecom/", 16);
            }
            return C76800UCe.LIZ;
        }
        throw new Exception();
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

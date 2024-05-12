package X;

import com.google.gson.Gson;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.OrderVerticalVM;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import fjb.a;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.OrderVerticalVM$fetchData$3", f = "OrderVerticalVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ECh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36035ECh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ JSONObject LJLILLLLZI;
    public final /* synthetic */ OrderVerticalVM LJLJI;
    public final /* synthetic */ C68322mC<Integer> LJLJJI;
    public final /* synthetic */ SearchResultParam LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36035ECh(JSONObject jSONObject, OrderVerticalVM orderVerticalVM, C68322mC<Integer> c68322mC, SearchResultParam searchResultParam, InterfaceC67352kd<? super C36035ECh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = jSONObject;
        this.LJLJI = orderVerticalVM;
        this.LJLJJI = c68322mC;
        this.LJLJJL = searchResultParam;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36035ECh c36035ECh = new C36035ECh(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c36035ECh.LJLIL = obj;
        return c36035ECh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Integer num;
        m LIZJ;
        ISearchVerticalContext iSearchVerticalContext;
        String str2;
        C50948Jz6 searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        try {
            String optString = this.LJLILLLLZI.optString("keyword");
            int optInt = this.LJLILLLLZI.optInt("query_correct_type");
            String optString2 = this.LJLILLLLZI.optString("enter_from");
            optString2.toString();
            String optString3 = this.LJLILLLLZI.optString("search_source");
            String optString4 = this.LJLILLLLZI.optString("last_search_id");
            String optString5 = this.LJLILLLLZI.optString("tag_text");
            String optString6 = this.LJLILLLLZI.optString("sug_type");
            String optString7 = this.LJLILLLLZI.optString("sug_query_state");
            String optString8 = this.LJLILLLLZI.optString("attach_products");
            String hv0 = this.LJLJI.hv0(this.LJLILLLLZI);
            String optString9 = this.LJLILLLLZI.optString("sug_creator_id");
            String LIZ = C39468FeK.LIZ("ec_search_session_id");
            String LIZ2 = C39468FeK.LIZ("search_session_id");
            Integer num2 = this.LJLJJI.element;
            SearchResultParam searchResultParam = this.LJLJJL;
            str = null;
            if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null && (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) != null) {
                num = new Integer(ecSearchEntranceData.getRootEnterFromType());
            } else {
                num = null;
            }
            String LIZIZ = KFS.LIZIZ(num);
            o.LJIIIIZZ(optString, "optString(\"keyword\")");
            o.LJIIIIZZ(optString3, "optString(\"search_source\")");
            KFN kfn = new KFN(optString, optString3, "order", 0, optInt, "", optString4, 0L, 9, optString2, "tiktok_order", optString5, optString6, optString7, optString9, optString8, hv0, null, null, LIZ, null, 0, num2, LIZIZ, LIZ2, 3538944, null);
            KFR kfr = this.LJLJI.LJLJI;
            if (kfr != null) {
                KFR.LIZJ(kfr, this.LJLJJL.getSearchEnterParam(), true, 0, 40);
            }
            KFR kfr2 = this.LJLJI.LJLJI;
            if (kfr2 != null) {
                kfr2.LJ = System.currentTimeMillis();
            }
            KFR kfr3 = this.LJLJI.LJLJI;
            if (kfr3 != null) {
                kfr3.LIZLLL = false;
            }
            LIZJ = EcSearchApi.LIZJ(kfn);
        } catch (Exception e) {
            this.LJLJI.setState(new AqS172S0100000_6(e, 18));
            KFR kfr4 = this.LJLJI.LJLJI;
            if (kfr4 != null) {
                KFR.LIZJ(kfr4, this.LJLJJL.getSearchEnterParam(), false, 0, 40);
            }
            KFR kfr5 = this.LJLJI.LJLJI;
            if (kfr5 != null) {
                kfr5.LJ("request_start_error");
            }
        }
        if (!C79146V4k.LJJJ(interfaceC70422pa.getCoroutineContext())) {
            return C76800UCe.LIZ;
        }
        OrderVerticalVM orderVerticalVM = this.LJLJI;
        orderVerticalVM.setState(new AqS137S0200000_6(LIZJ, orderVerticalVM, 15));
        Gson gson = this.LJLJI.LJLIL;
        SearchApiResult searchApiResult = (SearchApiResult) gson.LJI(gson.LJIILJJIL(LIZJ), SearchApiResult.class);
        String imprId = searchApiResult.logPb.getImprId();
        if (imprId != null) {
            C3A5.LIZ.LJFF(imprId, searchApiResult.logPb);
            ISearchService LLLZI = SearchServiceImpl.LLLZI();
            LogPbBean logPbBean = searchApiResult.logPb;
            if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
                str2 = "";
            }
            LLLZI.LLIIIJ(str2);
        }
        InterfaceC55235Lm3 interfaceC55235Lm3 = this.LJLJI.LJLJJI;
        if (interfaceC55235Lm3 != null && (iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(interfaceC55235Lm3, ISearchVerticalContext.class, null)) != null) {
            SearchResultParam searchResultParam2 = this.LJLJJL;
            if (searchResultParam2 != null) {
                str = searchResultParam2.getKeyword();
            }
            iSearchVerticalContext.Bf(str, searchApiResult, KAK.ECOM_LIVE);
        }
        KFR kfr6 = this.LJLJI.LJLJI;
        if (kfr6 != null) {
            KFR.LIZJ(kfr6, this.LJLJJL.getSearchEnterParam(), false, 1, 32);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.result.common.core.model.EComMallLiveTabCardStruct;
import com.ss.android.ugc.aweme.result.common.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel$fetchData$1", f = "LiveVerticalViewModel.kt", l = {202}, m = "invokeSuspend")
/* renamed from: X.ECg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36034ECg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ LiveVerticalViewModel LJLJJI;
    public final /* synthetic */ SearchResultParam LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36034ECg(JSONObject jSONObject, LiveVerticalViewModel liveVerticalViewModel, SearchResultParam searchResultParam, InterfaceC67352kd<? super C36034ECg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = jSONObject;
        this.LJLJJI = liveVerticalViewModel;
        this.LJLJJL = searchResultParam;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36034ECg c36034ECg = new C36034ECg(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c36034ECg.LJLILLLLZI = obj;
        return c36034ECg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        Integer num;
        C50948Jz6 c50948Jz6;
        C50948Jz6 searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        SearchLiveList searchLiveList;
        C50948Jz6 c50948Jz62;
        ISearchVerticalContext iSearchVerticalContext;
        String str;
        String str2;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        boolean z = false;
        boolean z2 = false;
        C50948Jz6 c50948Jz63 = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj2);
            } else {
                C141335gf.LIZJ(obj2);
                InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                String optString = this.LJLJI.optString("keyword");
                int optInt = this.LJLJI.optInt("query_correct_type");
                String optString2 = this.LJLJI.optString("enter_from");
                optString2.toString();
                String optString3 = this.LJLJI.optString("search_source");
                String optString4 = this.LJLJI.optString("last_search_id");
                String optString5 = this.LJLJI.optString("tag_text");
                String optString6 = this.LJLJI.optString("sug_type");
                String optString7 = this.LJLJI.optString("sug_query_state");
                String optString8 = this.LJLJI.optString("attach_products");
                String jv0 = this.LJLJJI.jv0(this.LJLJI);
                String optString9 = this.LJLJI.optString("sug_creator_id");
                String LIZ = C39468FeK.LIZ("ec_search_session_id");
                String LIZ2 = C39468FeK.LIZ("search_session_id");
                if (C36015EBn.LIZ()) {
                    i = 12;
                } else {
                    i = 6;
                }
                SearchResultParam searchResultParam = this.LJLJJL;
                if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null && (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) != null) {
                    num = new Integer(ecSearchEntranceData.getRootEnterFromType());
                } else {
                    num = null;
                }
                String LIZIZ = KFS.LIZIZ(num);
                o.LJIIIIZZ(optString, "optString(\"keyword\")");
                o.LJIIIIZZ(optString3, "optString(\"search_source\")");
                KFN kfn = new KFN(optString, optString3, "mall_live_tab", 0, optInt, "", optString4, 0L, i, optString2, "tiktok_mall_live_tab", optString5, optString6, optString7, optString9, optString8, jv0, null, null, LIZ, null, 0, null, LIZIZ, LIZ2, 7733248, null);
                kfn.setSearchContext(this.LJLJI.optString("search_context"));
                KFR kfr = this.LJLJJI.LJLLILLLL;
                if (kfr != null) {
                    SearchResultParam searchResultParam2 = this.LJLJJL;
                    if (searchResultParam2 != null) {
                        c50948Jz6 = searchResultParam2.getSearchEnterParam();
                    } else {
                        c50948Jz6 = null;
                    }
                    z = false;
                    kfr.LIZIZ(c50948Jz6, true, 0, 0, "/aweme/v1/search/mall_live/ecom/", this.LJLJJI.LJLJJLL);
                }
                KFR kfr2 = this.LJLJJI.LJLLILLLL;
                if (kfr2 != null) {
                    kfr2.LJ = System.currentTimeMillis();
                }
                KFR kfr3 = this.LJLJJI.LJLLILLLL;
                if (kfr3 != null) {
                    kfr3.LIZLLL = z;
                }
                m LIZIZ2 = EcSearchApi.LIZIZ(kfn);
                if (!C79146V4k.LJJJ(interfaceC70422pa.getCoroutineContext())) {
                    return C76800UCe.LIZ;
                }
                LiveVerticalViewModel liveVerticalViewModel = this.LJLJJI;
                liveVerticalViewModel.setState(new AqS137S0200000_6(LIZIZ2, liveVerticalViewModel, 14));
                XIA xia = C78613UtF.LIZJ;
                C36005EBd c36005EBd = new C36005EBd(this.LJLJJI, LIZIZ2, null);
                this.LJLIL = 1;
                obj2 = XKX.LJI(xia, c36005EBd, this);
                z2 = z;
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            searchLiveList = (SearchLiveList) obj2;
        } catch (Exception e) {
            this.LJLJJI.setState(new AqS172S0100000_6(e, 17));
            KFR kfr4 = this.LJLJJI.LJLLILLLL;
            if (kfr4 != null) {
                SearchResultParam searchResultParam3 = this.LJLJJL;
                if (searchResultParam3 != null) {
                    c50948Jz63 = searchResultParam3.getSearchEnterParam();
                }
                kfr4.LIZIZ(c50948Jz63, false, 0, 0, "/aweme/v1/search/mall_live/ecom/", this.LJLJJI.LJLJJLL);
            }
            KFR kfr5 = this.LJLJJI.LJLLILLLL;
            if (kfr5 != null) {
                kfr5.LJ("request_start_error");
            }
        }
        if (searchLiveList != null) {
            this.LJLJJI.gv0(searchLiveList.liveCardItems);
            String imprId = searchLiveList.logPb.getImprId();
            if (imprId != null) {
                C3A5.LIZ.LJFF(imprId, searchLiveList.logPb);
                ISearchService LLLZI = SearchServiceImpl.LLLZI();
                LogPbBean logPbBean = searchLiveList.logPb;
                if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
                    str2 = "";
                }
                LLLZI.LLIIIJ(str2);
            }
            InterfaceC55235Lm3 interfaceC55235Lm3 = this.LJLJJI.LJLLI;
            if (interfaceC55235Lm3 != null && (iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(interfaceC55235Lm3, ISearchVerticalContext.class, null)) != null) {
                SearchResultParam searchResultParam4 = this.LJLJJL;
                if (searchResultParam4 != null) {
                    str = searchResultParam4.getKeyword();
                } else {
                    str = null;
                }
                iSearchVerticalContext.Bf(str, searchLiveList, KAK.ECOM_LIVE);
            }
            KFR kfr6 = this.LJLJJI.LJLLILLLL;
            if (kfr6 != null) {
                SearchResultParam searchResultParam5 = this.LJLJJL;
                if (searchResultParam5 != null) {
                    c50948Jz62 = searchResultParam5.getSearchEnterParam();
                } else {
                    c50948Jz62 = null;
                }
                List<EComMallLiveTabCardStruct> list = searchLiveList.liveCardItems;
                int i3 = z2;
                if (list != null) {
                    i3 = list.size();
                }
                kfr6.LIZIZ(c50948Jz62, false, 1, i3, "/aweme/v1/search/mall_live/ecom/", this.LJLJJI.LJLJJLL);
            }
            LiveVerticalViewModel liveVerticalViewModel2 = this.LJLJJI;
            liveVerticalViewModel2.LJLJJLL = searchLiveList.cursor;
            liveVerticalViewModel2.LJLJI = searchLiveList.hasMore;
            return C76800UCe.LIZ;
        }
        throw new Exception();
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

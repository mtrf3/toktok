package com.ss.android.ugc.aweme.search.ecommerce.middle;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1A7;
import X.C2U8;
import X.C36922EeM;
import X.C39849FkT;
import X.C48658J7u;
import X.C50221JnN;
import X.C50345JpN;
import X.C50545Jsb;
import X.C50546Jsc;
import X.C50605JtZ;
import X.C50668Jua;
import X.C50699Jv5;
import X.C50773JwH;
import X.C50948Jz6;
import X.C60605NqT;
import X.C78857UxB;
import X.C78983UzD;
import X.C84763XOl;
import X.EF7;
import X.EnumC50341JpJ;
import X.F3T;
import X.IGF;
import X.InterfaceC37120EhY;
import X.InterfaceC37146Ehy;
import X.InterfaceC50547Jsd;
import X.InterfaceC50548Jse;
import X.InterfaceC51113K4f;
import X.JTO;
import X.JYS;
import X.K56;
import X.KB1;
import X.WM7;
import X.X1D;
import X.Z9N;
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchKeywordChangeMethodNew extends BaseBridgeMethod {
    public final String LJLIL;
    public final C50345JpN LJLILLLLZI;
    public InterfaceC37120EhY LJLJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchKeywordChangeMethodNew(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "searchKeywordChange";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "searchKeywordChange", EnumC50341JpJ.STABLE);
    }

    public final boolean LIZJ(String str) {
        switch (str.hashCode()) {
            case -1816950631:
                if (!str.equals("recom_search")) {
                    return false;
                }
                return true;
            case -1247995386:
                if (!str.equals("recom_search_under_bar")) {
                    return false;
                }
                return true;
            case 122189028:
                if (!str.equals("recom_search_pic")) {
                    return false;
                }
                return true;
            case 1081985277:
                if (!str.equals("search_history")) {
                    return false;
                }
                return true;
            case 1661687189:
                if (!str.equals("trending_topic")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static void LIZLLL(String str, JSONObject jSONObject) {
        JSONObject LJJIIZ = C78983UzD.LJJIIZ("ecomSearchParams", jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (LJJIIZ != null) {
            try {
                for (Map.Entry<String, Object> entry : JsonExtKt.toMap(LJJIIZ).entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
            }
            C2U8.LIZ(new JYS(C50605JtZ.LIZLLL(str), linkedHashMap));
            return;
        }
        C2U8.LIZ(new JYS(C50605JtZ.LIZLLL(str)));
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        int i;
        boolean LJII;
        String str;
        int i2;
        InterfaceC51113K4f interfaceC51113K4f;
        C50773JwH LIZ;
        int i3;
        InterfaceC51113K4f interfaceC51113K4f2;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        try {
            String enterMethod = params.optString("enterMethod");
            String keyword = params.optString("keyword");
            String optString = params.optString("type");
            String optString2 = params.optString("words_type");
            String optString3 = params.optString("event_id");
            String optString4 = params.optString("is_sar_recall");
            String tabName = params.optString("tab_name");
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (optString.equals("top_entity") && LJIIIIZZ != null && (LJIIIIZZ instanceof ActivityC45651qj)) {
                JSONObject optJSONObject = params.optJSONObject("logParams");
                SearchHubVM searchHubVM = (SearchHubVM) ViewModelProviders.of((ActivityC45651qj) LJIIIIZZ).get(SearchHubVM.class);
                if (optJSONObject != null) {
                    optJSONObject.put("keyword", keyword);
                    searchHubVM.LJLIL.setValue(JsonExtKt.toMap(optJSONObject));
                    return;
                }
                return;
            }
            if (params.has("avoid_record_history") && params.optInt("avoid_record_history") == 1) {
                i = 0;
            } else {
                i = 1;
            }
            if (LJIIIIZZ instanceof ActivityC45651qj) {
                try {
                    C50948Jz6 LIZIZ = JTO.LIZIZ((ActivityC45651qj) LJIIIIZZ);
                    LJII = KB1.LJII(KB1.LIZ(LIZIZ));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(WM7.SCENE_SERVICE, "jsb");
                    if (LIZIZ == null || (str = LIZIZ.getEnterSearchFrom()) == null) {
                        str = "";
                    }
                    jSONObject.put("enter_from", str);
                    jSONObject.put("enter_method", enterMethod);
                    C48658J7u.LIZIZ("rd_ec_search_request_trace", jSONObject);
                } catch (Exception e) {
                    e = e;
                    IGF.LIZ(e, "SearchKeywordChangeMethodNew");
                    iReturn.LIZ(0, e.getMessage());
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            } else {
                LJII = false;
            }
            if (LJIIIIZZ != null && (LJIIIIZZ instanceof SearchResultActivity)) {
                SearchIntermediateViewModelNew searchIntermediateViewModelNew = (SearchIntermediateViewModelNew) ViewModelProviders.of((ActivityC45651qj) LJIIIIZZ).get(SearchIntermediateViewModelNew.class);
                SearchStartViewModel searchStartViewModel = (SearchStartViewModel) ViewModelProviders.of((ActivityC45651qj) LJIIIIZZ).get(SearchStartViewModel.class);
                searchStartViewModel.LLFF.clear();
                HashMap<String, Long> hashMap = searchStartViewModel.LLFF;
                o.LJIIIIZZ(enterMethod, "enterMethod");
                hashMap.put(enterMethod, Long.valueOf(System.currentTimeMillis()));
                Integer value = searchStartViewModel.iv0().getValue();
                if (value == null) {
                    value = 0;
                }
                String LJFF = C50605JtZ.LJFF(value.intValue());
                if (enterMethod.equals("search_history")) {
                    K56.LJIIIIZZ(5);
                    new C50545Jsb(getContext()).LIZIZ(new C50546Jsc());
                }
                SearchResultParam param = new SearchResultParam();
                param.setSearchFrom(enterMethod);
                param.setKeyword(keyword);
                param.setEnterMethod(enterMethod);
                param.setWordType(optString2);
                param.setShouldRecordInHistory(i);
                param.setIsSarRecall(optString4);
                param.setAppTheme("light");
                param.setAppName(EF7.LIZ());
                param.setScreenWidth(C60605NqT.LJIIJ(C60605NqT.LJFF(C39849FkT.LIZ()), C39849FkT.LIZ()));
                param.setScreenHeight(C60605NqT.LJIIJ(C60605NqT.LIZJ(C39849FkT.LIZ()), C39849FkT.LIZ()));
                if (LJII && C78857UxB.LJJJIL(tabName)) {
                    o.LJIIIIZZ(tabName, "tabName");
                    param.setIndex(C50605JtZ.LIZLLL(tabName));
                    param.setForceIndex(C50605JtZ.LIZLLL(tabName));
                    optString = tabName;
                } else {
                    param.setIndex(C50605JtZ.LIZLLL(optString));
                }
                if (params.has("ecomSearchParams")) {
                    o.LJIIIIZZ(param, "param");
                    C1A7.LIZJ(param, params, enterMethod);
                }
                Z9N z9n = Z9N.LIZIZ;
                o.LJIIIIZZ(param, "param");
                z9n.LIZ.LJLLI(LJIIIIZZ, param);
                if (!LIZJ(enterMethod)) {
                    if (TextUtils.equals("click_more_general_list", enterMethod) || TextUtils.equals("click_card_name", enterMethod) || TextUtils.equals("swipe_more_general_list", enterMethod)) {
                        LIZLLL(optString, params);
                    } else if (TextUtils.equals(LJFF, optString) || TextUtils.isEmpty(optString)) {
                        C2U8.LIZ(new C50221JnN(param));
                    }
                } else {
                    InterfaceC50548Jse interfaceC50548Jse = searchStartViewModel.LJLZ;
                    if (interfaceC50548Jse == null || interfaceC50548Jse.LIZ() != 0) {
                        ((NextLiveData) searchIntermediateViewModelNew.LJLILLLLZI.getValue()).setValue(param);
                        InterfaceC50548Jse interfaceC50548Jse2 = searchStartViewModel.LJLZ;
                        if (interfaceC50548Jse2 != null) {
                            i3 = 0;
                            interfaceC50548Jse2.LIZJ(0);
                        } else {
                            i3 = 0;
                        }
                        InterfaceC50547Jsd interfaceC50547Jsd = searchStartViewModel.LJZ;
                        if (interfaceC50547Jsd != null) {
                            interfaceC50547Jsd.LIZ(i3);
                        }
                        InterfaceC50548Jse interfaceC50548Jse3 = searchStartViewModel.LJLZ;
                        if ((interfaceC50548Jse3 == null || interfaceC50548Jse3.getInnerState() != 0) && (interfaceC51113K4f2 = searchStartViewModel.LJLLLLLL) != null) {
                            interfaceC51113K4f2.LIZ(param);
                        }
                        InterfaceC50548Jse interfaceC50548Jse4 = searchStartViewModel.LJLZ;
                        if (interfaceC50548Jse4 != null) {
                            interfaceC50548Jse4.LIZLLL();
                        }
                    }
                }
            } else if (LJIIIIZZ != null && (LJIIIIZZ instanceof ActivityC45651qj)) {
                SearchIntermediateViewModelNew searchIntermediateViewModelNew2 = (SearchIntermediateViewModelNew) ViewModelProviders.of((ActivityC45651qj) LJIIIIZZ).get(SearchIntermediateViewModelNew.class);
                SearchStartViewModel searchStartViewModel2 = (SearchStartViewModel) ViewModelProviders.of((ActivityC45651qj) LJIIIIZZ).get(SearchStartViewModel.class);
                searchStartViewModel2.LLFF.clear();
                HashMap<String, Long> hashMap2 = searchStartViewModel2.LLFF;
                o.LJIIIIZZ(enterMethod, "enterMethod");
                hashMap2.put(enterMethod, Long.valueOf(System.currentTimeMillis()));
                SearchResultParam searchResultParam = new SearchResultParam();
                searchResultParam.setSearchFrom(enterMethod);
                searchResultParam.setKeyword(keyword);
                searchResultParam.setEnterMethod(enterMethod);
                searchResultParam.setIndex(C50605JtZ.LIZLLL(optString));
                searchResultParam.setWordType(optString2);
                searchResultParam.setTrendingEventId(optString3);
                searchResultParam.setShouldRecordInHistory(i);
                searchResultParam.setIsSarRecall(optString4);
                ((NextLiveData) searchIntermediateViewModelNew2.LJLILLLLZI.getValue()).setValue(searchResultParam);
                if (!TextUtils.isEmpty(searchResultParam.getKeyword())) {
                    Z9N.LIZIZ.LIZ.LJLLI(LJIIIIZZ, searchResultParam);
                    InterfaceC50548Jse interfaceC50548Jse5 = searchStartViewModel2.LJLZ;
                    if (interfaceC50548Jse5 != null) {
                        i2 = 0;
                        interfaceC50548Jse5.LIZJ(0);
                    } else {
                        i2 = 0;
                    }
                    InterfaceC50547Jsd interfaceC50547Jsd2 = searchStartViewModel2.LJZ;
                    if (interfaceC50547Jsd2 != null) {
                        interfaceC50547Jsd2.LIZ(i2);
                    }
                    InterfaceC50548Jse interfaceC50548Jse6 = searchStartViewModel2.LJLZ;
                    if ((interfaceC50548Jse6 == null || interfaceC50548Jse6.getInnerState() != 0) && (interfaceC51113K4f = searchStartViewModel2.LJLLLLLL) != null) {
                        interfaceC51113K4f.LIZ(searchResultParam);
                    }
                    InterfaceC50548Jse interfaceC50548Jse7 = searchStartViewModel2.LJLZ;
                    if (interfaceC50548Jse7 != null) {
                        interfaceC50548Jse7.LIZLLL();
                    }
                }
            }
            o.LJIIIIZZ(enterMethod, "enterMethod");
            if (LIZJ(enterMethod)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("SearchKeywordChangeMethodNew, params = ");
                LIZ2.append(params);
                C36922EeM.LIZLLL(4, "Search_history_middle_page_jsb", X1D.LIZIZ(LIZ2));
                if (o.LJ(enterMethod, "search_history") && (LIZ = C50668Jua.LIZ(LJII)) != null) {
                    o.LJIIIIZZ(keyword, "keyword");
                    LIZ.LJIIJJI(keyword);
                    LIZ.LJ = params.optString("icon_type");
                }
            }
            iReturn.onSuccess(new JSONArray());
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, X.InterfaceC38186Eyk
    public final void handle(JSONObject params, InterfaceC37120EhY callback) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        super.handle(params, callback);
        this.LJLJI = callback;
        String imprId = params.optString("impr_id");
        C50699Jv5 c50699Jv5 = new C50699Jv5(getContext());
        o.LJIIIIZZ(imprId, "imprId");
        c50699Jv5.LJII(imprId);
    }
}

package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.refactor.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcDynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class K8K extends K8M {
    public static final boolean LJIIJ(String str) {
        switch (str.hashCode()) {
            case -1816950631:
                if (!str.equals("recom_search")) {
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

    public final void LJIIIIZZ(K8L k8l) {
        Number number;
        String str;
        K75 k75;
        InterfaceC51113K4f LJI;
        HashMap<String, Long> LIZIZ;
        HashMap<String, Long> LIZIZ2;
        EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew;
        String str2;
        String enterMethod = k8l.getEnterMethod();
        String keyword = k8l.getKeyword();
        String type = k8l.getType();
        String str3 = "";
        if (type == null) {
            type = "";
        }
        String wordsType = k8l.getWordsType();
        if (wordsType == null) {
            wordsType = "";
        }
        String eventId = k8l.getEventId();
        if (eventId == null) {
            eventId = "";
        }
        String isSarRecall = k8l.isSarRecall();
        if (isSarRecall == null) {
            isSarRecall = "";
        }
        String tabName = k8l.getTabName();
        if (tabName != null) {
            str3 = tabName;
        }
        if (k8l.getAvoidRecordHistory() != null) {
            number = k8l.getAvoidRecordHistory();
        } else {
            number = 0;
        }
        int i = !o.LJ(number, 1) ? 1 : 0;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            if (LJIIIIZZ instanceof EcSearchResultActivity) {
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) LJIIIIZZ;
                EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = (EcSearchIntermediateViewModelNew) ViewModelProviders.of(activityC45651qj).get(EcSearchIntermediateViewModelNew.class);
                EcSearchStartViewModel ecSearchStartViewModel = (EcSearchStartViewModel) ViewModelProviders.of(activityC45651qj).get(EcSearchStartViewModel.class);
                Integer value = ecSearchStartViewModel.hv0().getValue();
                if (value == null) {
                    value = 0;
                }
                String LJ = C51214K8c.LJ(value.intValue());
                if (enterMethod.equals("search_history")) {
                    C51307KBr.LIZ(5);
                    K4W.LIZJ = false;
                }
                ecSearchStartViewModel.LJZI.clear();
                ecSearchStartViewModel.LJZI.put(enterMethod, Long.valueOf(System.currentTimeMillis()));
                SearchResultParam param = new SearchResultParam();
                param.setSearchFrom(enterMethod);
                param.setKeyword(keyword);
                param.setEnterMethod(enterMethod);
                param.setWordType(wordsType);
                param.setShouldRecordInHistory(i);
                param.setIsSarRecall(isSarRecall);
                if (C78857UxB.LJJJIL(str3)) {
                    param.setIndex(C51214K8c.LIZIZ(str3));
                    param.setForceIndex(C51214K8c.LIZIZ(str3));
                    type = str3;
                } else {
                    param.setIndex(C51214K8c.LIZIZ(type));
                }
                if (k8l.getEcomSearchParams() != null) {
                    o.LJIIIIZZ(param, "param");
                    LJII(param, k8l, enterMethod);
                }
                if (!LJIIJ(enterMethod)) {
                    if (TextUtils.equals("click_more_general_list", enterMethod)) {
                        LJIIJJI(type, k8l, activityC45651qj);
                    } else if (TextUtils.equals(LJ, type) || TextUtils.isEmpty(type)) {
                        o.LJIIIIZZ(param, "param");
                        C2U8.LIZ(new C51194K7i(param));
                    }
                } else {
                    K7X k7x = ecSearchStartViewModel.LJLLLL;
                    if (k7x == null || k7x.LIZ() != 0) {
                        ((LiveData) ecSearchIntermediateViewModelNew.LJLILLLLZI.getValue()).setValue(param);
                        K7X k7x2 = ecSearchStartViewModel.LJLLLL;
                        if (k7x2 != null) {
                            k7x2.LIZJ(0);
                        }
                        C51207K7v c51207K7v = ecSearchStartViewModel.LJLLLLLL;
                        if (c51207K7v != null) {
                            c51207K7v.LIZ(0);
                        }
                        K7X k7x3 = ecSearchStartViewModel.LJLLLL;
                        if (k7x3 == null || k7x3.getInnerState() != 0) {
                            ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = (ISearchSuggestContextAbilityNew) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj, null), ISearchSuggestContextAbilityNew.class, null);
                            if (iSearchSuggestContextAbilityNew != null) {
                                o.LJIIIIZZ(param, "param");
                                iSearchSuggestContextAbilityNew.LJJIL(param);
                            } else {
                                K7V k7v = ecSearchStartViewModel.LJLLL;
                                if (k7v != null) {
                                    o.LJIIIIZZ(param, "param");
                                    k7v.LIZ(param);
                                }
                            }
                        }
                        K7X k7x4 = ecSearchStartViewModel.LJLLLL;
                        if (k7x4 != null) {
                            k7x4.LIZLLL();
                        }
                    }
                }
                JSONObject LIZIZ3 = C1B8.LIZIZ(WM7.SCENE_SERVICE, "middle_click", "is_native_request", 1);
                LIZIZ3.put("enter_method", param.getEnterMethod());
                C50948Jz6 searchEnterParam = param.getSearchEnterParam();
                if (searchEnterParam != null) {
                    str2 = searchEnterParam.getEnterSearchFrom();
                } else {
                    str2 = null;
                }
                LIZIZ3.put("enter_from", str2);
                C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZIZ3);
                return;
            }
            if (LJIIIIZZ instanceof EcSearchActivity) {
                Fragment LJJJIL = ((ActivityC45651qj) LJIIIIZZ).getSupportFragmentManager().LJJJIL("tag_intermediate_ec");
                if ((LJJJIL instanceof EcDynamicSingleIntermediateFragmentNew) && (ecAbstractSearchIntermediateFragmentNew = (EcAbstractSearchIntermediateFragmentNew) LJJJIL) != null) {
                    k75 = ecAbstractSearchIntermediateFragmentNew.LJLZ;
                } else {
                    k75 = null;
                }
                if (enterMethod.equals("search_history")) {
                    C51307KBr.LIZ(5);
                    K4W.LIZJ = false;
                }
                if (k75 != null) {
                    InterfaceC51113K4f LJI2 = k75.LJI();
                    if (LJI2 != null && (LIZIZ2 = LJI2.LIZIZ()) != null) {
                        LIZIZ2.clear();
                    }
                    InterfaceC51113K4f LJI3 = k75.LJI();
                    if (LJI3 != null && (LIZIZ = LJI3.LIZIZ()) != null) {
                        LIZIZ.put(enterMethod, Long.valueOf(System.currentTimeMillis()));
                    }
                }
                SearchResultParam finalSearchParam = new SearchResultParam();
                finalSearchParam.setSearchFrom(enterMethod);
                finalSearchParam.setKeyword(keyword);
                finalSearchParam.setEnterMethod(enterMethod);
                finalSearchParam.setWordType(wordsType);
                finalSearchParam.setShouldRecordInHistory(i);
                finalSearchParam.setIsSarRecall(isSarRecall);
                if (C78857UxB.LJJJIL(str3)) {
                    finalSearchParam.setIndex(C51214K8c.LIZIZ(str3));
                    finalSearchParam.setForceIndex(C51214K8c.LIZIZ(str3));
                    if (o.LJ(enterMethod, "recom_search")) {
                        KAK.Companion.getClass();
                        finalSearchParam.setEcomTargetTab(C51298KBi.LIZ(str3));
                    }
                } else {
                    finalSearchParam.setIndex(C51214K8c.LIZIZ(type));
                }
                if (k8l.getEcomSearchParams() != null && (!r0.isEmpty())) {
                    o.LJIIIIZZ(finalSearchParam, "param");
                    LJII(finalSearchParam, k8l, enterMethod);
                }
                ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) LJIIIIZZ;
                String str4 = null;
                K9C LIZ = K8T.LIZ(C55230Lly.LIZLLL(activityC45651qj2, null));
                if (LIZ != null) {
                    o.LJIIIIZZ(finalSearchParam, "param");
                    LIZ.LIZJ(finalSearchParam);
                }
                ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2 = (ISearchSuggestContextAbilityNew) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj2, null), ISearchSuggestContextAbilityNew.class, null);
                if (iSearchSuggestContextAbilityNew2 != null) {
                    o.LJIIIIZZ(finalSearchParam, "finalSearchParam");
                    iSearchSuggestContextAbilityNew2.LJJIL(finalSearchParam);
                } else if (k75 != null && (LJI = k75.LJI()) != null) {
                    o.LJIIIIZZ(finalSearchParam, "finalSearchParam");
                    LJI.LIZ(finalSearchParam);
                }
                JSONObject LIZIZ4 = C1B8.LIZIZ(WM7.SCENE_SERVICE, "middle_click", "is_native_request", 2);
                LIZIZ4.put("enter_method", finalSearchParam.getEnterMethod());
                C50948Jz6 searchEnterParam2 = finalSearchParam.getSearchEnterParam();
                if (searchEnterParam2 != null) {
                    str4 = searchEnterParam2.getEnterSearchFrom();
                }
                LIZIZ4.put("enter_from", str4);
                C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZIZ4);
                return;
            }
            if (LJIIIIZZ == null || !(LJIIIIZZ instanceof ActivityC45651qj)) {
                return;
            }
            ActivityC45651qj activityC45651qj3 = (ActivityC45651qj) LJIIIIZZ;
            EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew2 = (EcSearchIntermediateViewModelNew) ViewModelProviders.of(activityC45651qj3).get(EcSearchIntermediateViewModelNew.class);
            EcSearchStartViewModel ecSearchStartViewModel2 = (EcSearchStartViewModel) ViewModelProviders.of(activityC45651qj3).get(EcSearchStartViewModel.class);
            SearchResultParam searchResultParam = new SearchResultParam();
            searchResultParam.setSearchFrom(enterMethod);
            searchResultParam.setKeyword(keyword);
            searchResultParam.setEnterMethod(enterMethod);
            searchResultParam.setIndex(C51214K8c.LIZIZ(type));
            searchResultParam.setWordType(wordsType);
            searchResultParam.setTrendingEventId(eventId);
            searchResultParam.setShouldRecordInHistory(i);
            searchResultParam.setIsSarRecall(isSarRecall);
            ecSearchStartViewModel2.LJZI.clear();
            ecSearchStartViewModel2.LJZI.put(enterMethod, Long.valueOf(System.currentTimeMillis()));
            ((LiveData) ecSearchIntermediateViewModelNew2.LJLILLLLZI.getValue()).setValue(searchResultParam);
            if (TextUtils.isEmpty(searchResultParam.getKeyword())) {
                return;
            }
            K7X k7x5 = ecSearchStartViewModel2.LJLLLL;
            if (k7x5 != null) {
                k7x5.LIZJ(0);
            }
            C51207K7v c51207K7v2 = ecSearchStartViewModel2.LJLLLLLL;
            if (c51207K7v2 != null) {
                c51207K7v2.LIZ(0);
            }
            K7X k7x6 = ecSearchStartViewModel2.LJLLLL;
            if (k7x6 == null || k7x6.getInnerState() != 0) {
                K7V k7v2 = ecSearchStartViewModel2.LJLLL;
                if (k7v2 != null) {
                    k7v2.LIZ(searchResultParam);
                }
                JSONObject LIZIZ5 = C1B8.LIZIZ(WM7.SCENE_SERVICE, "middle_click", "is_native_request", 3);
                LIZIZ5.put("enter_method", searchResultParam.getEnterMethod());
                C50948Jz6 searchEnterParam3 = searchResultParam.getSearchEnterParam();
                if (searchEnterParam3 != null) {
                    str = searchEnterParam3.getEnterSearchFrom();
                } else {
                    str = null;
                }
                LIZIZ5.put("enter_from", str);
                C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZIZ5);
            }
            K7X k7x7 = ecSearchStartViewModel2.LJLLLL;
            if (k7x7 == null) {
                return;
            }
            k7x7.LIZLLL();
        }
    }

    public final void LJIIIZ(K8L k8l) {
        Number number;
        String str;
        int i;
        InterfaceC51113K4f LJJJ;
        int i2;
        String str2;
        boolean z;
        InterfaceC51113K4f LJJJ2;
        String enterMethod = k8l.getEnterMethod();
        String keyword = k8l.getKeyword();
        String type = k8l.getType();
        String wordsType = k8l.getWordsType();
        String eventId = k8l.getEventId();
        String isSarRecall = k8l.isSarRecall();
        String tabName = k8l.getTabName();
        if (k8l.getAvoidRecordHistory() != null) {
            number = k8l.getAvoidRecordHistory();
        } else {
            number = 0;
        }
        int i3 = !o.LJ(number, 1) ? 1 : 0;
        if (type == null) {
            str = "";
        } else {
            str = type;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        ISearchMiddleForECService LJJJJLI = SearchMiddleForEcService.LJJJJLI();
        if (LJIIIIZZ != null) {
            if (LJIIIIZZ instanceof ActivityC45651qj) {
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) LJIIIIZZ;
                if (LJJJJLI.LJIL(activityC45651qj) || (LJIIIIZZ instanceof EcSearchActivity)) {
                    EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = (EcSearchIntermediateViewModelNew) ViewModelProviders.of(activityC45651qj).get(EcSearchIntermediateViewModelNew.class);
                    InterfaceC178696zp LJJJJJ = LJJJJLI.LJJJJJ(activityC45651qj);
                    if (LJJJJJ != null) {
                        i2 = LJJJJJ.LIZIZ();
                    } else {
                        i2 = 0;
                    }
                    String LIZJ = LJJJJLI.LIZJ(i2);
                    if (LIZJ == null) {
                        LIZJ = "";
                    }
                    if (enterMethod.equals("search_history")) {
                        C51307KBr.LIZ(5);
                        SearchMiddleForEcService.LJJJJLI().LIZIZ();
                        K4W.LIZJ = false;
                    }
                    HashMap<String, Long> LJJII = LJJJJLI.LJJII(activityC45651qj);
                    if (LJJII != null) {
                        LJJII.clear();
                    }
                    HashMap<String, Long> LJJII2 = LJJJJLI.LJJII(activityC45651qj);
                    if (LJJII2 != null) {
                        LJJII2.put(enterMethod, Long.valueOf(System.currentTimeMillis()));
                    }
                    SearchResultParam param = new SearchResultParam();
                    param.setSearchFrom(enterMethod);
                    param.setKeyword(keyword);
                    param.setEnterMethod(enterMethod);
                    param.setWordType(wordsType);
                    param.setShouldRecordInHistory(i3);
                    param.setIsSarRecall(isSarRecall);
                    if (C78857UxB.LJJJIL(tabName)) {
                        param.setIndex(LJJJJLI.LJJIZ(tabName));
                        param.setForceIndex(LJJJJLI.LJJIZ(tabName));
                    } else {
                        if (type == null) {
                            str2 = "";
                        } else {
                            str2 = type;
                        }
                        param.setIndex(LJJJJLI.LJJIZ(str2));
                        if (type == null) {
                            type = "";
                        }
                        tabName = type;
                    }
                    if (k8l.getEcomSearchParams() != null && (!r4.isEmpty())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        o.LJIIIIZZ(param, "param");
                        LJII(param, k8l, enterMethod);
                    }
                    if (!LJIIJ(enterMethod)) {
                        if (TextUtils.equals("click_more_general_list", enterMethod)) {
                            LJIIJJI(tabName, k8l, activityC45651qj);
                            return;
                        } else {
                            if (!TextUtils.equals(LIZJ, tabName) && !TextUtils.isEmpty(tabName)) {
                                return;
                            }
                            o.LJIIIIZZ(param, "param");
                            LJJJJLI.LJIIJJI(param);
                            return;
                        }
                    }
                    InterfaceC50548Jse LJJIJ = LJJJJLI.LJJIJ(activityC45651qj);
                    if (LJJIJ != null && LJJIJ.LIZ() == 0) {
                        return;
                    }
                    ((LiveData) ecSearchIntermediateViewModelNew.LJLILLLLZI.getValue()).setValue(param);
                    InterfaceC50548Jse LJJIJ2 = LJJJJLI.LJJIJ(activityC45651qj);
                    if (LJJIJ2 != null) {
                        LJJIJ2.LIZJ(0);
                    }
                    InterfaceC50547Jsd LJIILL = LJJJJLI.LJIILL(activityC45651qj);
                    if (LJIILL != null) {
                        LJIILL.LIZ(0);
                    }
                    InterfaceC50548Jse LJJIJ3 = LJJJJLI.LJJIJ(activityC45651qj);
                    if ((LJJIJ3 == null || LJJIJ3.getInnerState() != 0) && (LJJJ2 = LJJJJLI.LJJJ(activityC45651qj)) != null) {
                        o.LJIIIIZZ(param, "param");
                        LJJJ2.LIZ(param);
                    }
                    InterfaceC50548Jse LJJIJ4 = LJJJJLI.LJJIJ(activityC45651qj);
                    if (LJJIJ4 == null) {
                        return;
                    }
                    LJJIJ4.LIZLLL();
                    return;
                }
            }
            if (!(LJIIIIZZ instanceof ActivityC45651qj)) {
                return;
            }
            ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) LJIIIIZZ;
            EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew2 = (EcSearchIntermediateViewModelNew) ViewModelProviders.of(activityC45651qj2).get(EcSearchIntermediateViewModelNew.class);
            SearchResultParam searchResultParam = new SearchResultParam();
            searchResultParam.setSearchFrom(enterMethod);
            searchResultParam.setKeyword(keyword);
            searchResultParam.setEnterMethod(enterMethod);
            if (LJJJJLI != null) {
                i = LJJJJLI.LJJIZ(str);
            } else {
                i = 0;
            }
            searchResultParam.setIndex(i);
            searchResultParam.setWordType(wordsType);
            searchResultParam.setTrendingEventId(eventId);
            searchResultParam.setShouldRecordInHistory(i3);
            searchResultParam.setIsSarRecall(isSarRecall);
            if (LJJJJLI != null) {
                HashMap<String, Long> LJJII3 = LJJJJLI.LJJII(activityC45651qj2);
                if (LJJII3 != null) {
                    LJJII3.clear();
                }
                HashMap<String, Long> LJJII4 = LJJJJLI.LJJII(activityC45651qj2);
                if (LJJII4 != null) {
                    LJJII4.put(enterMethod, Long.valueOf(System.currentTimeMillis()));
                }
            }
            ((LiveData) ecSearchIntermediateViewModelNew2.LJLILLLLZI.getValue()).setValue(searchResultParam);
            if (TextUtils.isEmpty(searchResultParam.getKeyword())) {
                return;
            }
            Z9N.LIZIZ.LIZ.LJLLI(LJIIIIZZ, searchResultParam);
            if (LJJJJLI == null) {
                return;
            }
            InterfaceC50548Jse LJJIJ5 = LJJJJLI.LJJIJ(activityC45651qj2);
            if (LJJIJ5 != null) {
                LJJIJ5.LIZJ(0);
            }
            InterfaceC50547Jsd LJIILL2 = LJJJJLI.LJIILL(activityC45651qj2);
            if (LJIILL2 != null) {
                LJIILL2.LIZ(0);
            }
            InterfaceC50548Jse LJJIJ6 = LJJJJLI.LJJIJ(activityC45651qj2);
            if ((LJJIJ6 == null || LJJIJ6.getInnerState() != 0) && (LJJJ = LJJJJLI.LJJJ(activityC45651qj2)) != null) {
                LJJJ.LIZ(searchResultParam);
            }
            InterfaceC50548Jse LJJIJ7 = LJJJJLI.LJJIJ(activityC45651qj2);
            if (LJJIJ7 == null) {
                return;
            }
            LJJIJ7.LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(SearchResultParam searchResultParam, K8L k8l, String str) {
        String str2;
        String str3;
        java.util.Map<String, Object> ecomSearchParams = k8l.getEcomSearchParams();
        if (ecomSearchParams != null) {
            try {
                for (Map.Entry entry : C113554cx.LJJLIIIJLLLLLLLZ(ecomSearchParams).entrySet()) {
                    java.util.Map<String, Object> ecomRecomSearchParamMap = searchResultParam.getEcomRecomSearchParamMap();
                    o.LJIIIIZZ(ecomRecomSearchParamMap, "ecomRecomSearchParamMap");
                    ecomRecomSearchParamMap.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
            Object obj = ecomSearchParams.get("attach_products");
            String str4 = null;
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = null;
            }
            if (C78857UxB.LJJJIL(str2)) {
                searchResultParam.setResultAttachCard(new C51244K9g(KBE.PRODUCT_CARD, str2, null, null, null, 28, null));
            }
            if (o.LJ(str, "recom_search") || o.LJ(str, "recom_search_pic")) {
                String searchSourcePage = k8l.getSearchSourcePage();
                if (C78857UxB.LJJJIL(searchSourcePage) && o.LJ(searchSourcePage, "ecom_search_transfer")) {
                    Object obj2 = ecomSearchParams.get("sug_query_state");
                    if (obj2 instanceof String) {
                        str3 = (String) obj2;
                    } else {
                        str3 = null;
                    }
                    Object obj3 = ecomSearchParams.get("sug_creator_id");
                    if (obj3 instanceof String) {
                        str4 = (String) obj3;
                    }
                    if (C78857UxB.LJJJIL(str3)) {
                        searchResultParam.setQueryState(str3);
                    }
                    if (C78857UxB.LJJJIL(str4)) {
                        searchResultParam.setSugUserId(str4);
                    }
                }
            }
        }
    }

    public static void LJIIJJI(String str, K8L k8l, ActivityC45651qj activityC45651qj) {
        java.util.Map<String, Object> ecomSearchParams = k8l.getEcomSearchParams();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (ecomSearchParams != null) {
            try {
                for (Map.Entry entry : C113554cx.LJJLIIIJLLLLLLLZ(ecomSearchParams).entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
            }
            C51141K5h.LIZ.getClass();
            if (C51141K5h.LIZ(activityC45651qj)) {
                SearchMiddleForEcService.LJJJJLI().LJJIII(str, linkedHashMap);
                return;
            } else {
                C2U8.LIZ(new K8R(C51214K8c.LIZIZ(str), linkedHashMap));
                return;
            }
        }
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZ(activityC45651qj)) {
            SearchMiddleForEcService.LJJJJLI().LJJIII(str, null);
        } else {
            C2U8.LIZ(new K8R(C51214K8c.LIZIZ(str)));
        }
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String str = "";
        K8L k8l = (K8L) xBaseParamModel;
        o.LJIIIZ(type, "type");
        try {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ instanceof ActivityC45651qj) {
                C51141K5h.LIZ.getClass();
                if (C51141K5h.LIZ((ActivityC45651qj) LJIIIIZZ)) {
                    LJIIIZ(k8l);
                    c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(K8W.class, null), "");
                }
            }
            LJIIIIZZ(k8l);
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(K8W.class, null), "");
        } catch (Exception e) {
            IGE.LIZ(e, "EcSearchKeywordChangeMethodNew");
            String message = e.getMessage();
            if (message != null) {
                str = message;
            }
            C31626Cb8.LIZ(c37356ElM, 0, str, 4);
            C16880lQ.LLLLIIL(e);
        }
    }
}

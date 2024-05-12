package com.ss.android.ugc.aweme.ecommerce.search.result;

import X.ActivityC45651qj;
import X.AnonymousClass977;
import X.C16880lQ;
import X.C1B8;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C2K0;
import X.C35O;
import X.C39468FeK;
import X.C48658J7u;
import X.C50948Jz6;
import X.C51193K7h;
import X.C51214K8c;
import X.C51222K8k;
import X.C51244K9g;
import X.C51360KDs;
import X.C51379KEl;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YN;
import X.EnumC51268KAe;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.K8R;
import X.K9C;
import X.KAK;
import X.KAU;
import X.KBE;
import X.KEE;
import X.KJL;
import X.KOV;
import X.QD3;
import X.TBT;
import X.WM7;
import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.EcSearchPagerItem;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.IDqS433S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class EcSearchResultContainerAssem extends UISlotAssem implements ISearchResultSubPageAbility, InterfaceC55102Lju {
    public long LJLJLLL;
    public SearchResultParam LJLL;
    public C51360KDs LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public final C214298b3 LJLLL;
    public boolean LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    @Override // X.KCT
    public final void I1(KAU kau, KAU curPageState) {
        o.LJIIIZ(curPageState, "curPageState");
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1672577172) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.aon;
    }

    public EcSearchResultContainerAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(EcSearchContainerVM.class);
        this.LJLLL = new C214298b3(new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 62), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), KEE.INSTANCE, LIZ);
        this.LJLLLL = true;
    }

    public final EcSearchContainerVM H3() {
        return (EcSearchContainerVM) this.LJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        String str;
        C50948Jz6 searchEnterParam;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", System.currentTimeMillis() - this.LJLJLLL);
            jSONObject.put("enter_method", "destroy");
            jSONObject.put("next_tab", "");
            SearchResultParam searchResultParam = this.LJLL;
            String str2 = null;
            if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
                str = searchEnterParam.getEnterSearchFrom();
            } else {
                str = null;
            }
            jSONObject.put("search_entrance", str);
            jSONObject.put("search_id", SearchServiceImpl.LLLZI().LIZ());
            SearchResultParam searchResultParam2 = this.LJLL;
            if (searchResultParam2 != null) {
                str2 = searchResultParam2.getKeyword();
            }
            jSONObject.put("search_keyword", str2);
            jSONObject.put("current_tab", C51214K8c.LJ(this.LJLLILLLL));
            C48658J7u.LIZIZ("rd_ec_search_switch_tab_finish", jSONObject);
        } catch (Exception unused) {
        }
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final KAK Gi0() {
        return H3().LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final int LLLZLL() {
        return ((KOV) _$_findCachedViewById(R.id.i09)).getCurrentItem();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final C51193K7h f60() {
        return H3().LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void hide() {
        _$_findCachedViewById(R.id.fla).setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final KAU Jc0() {
        return KAU.RESULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final boolean ip() {
        return this.LJLLLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final SearchResultParam k5() {
        return this.LJLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void DV(SearchResultParam searchResultParam) {
        KAK kak;
        EcSearchPagerItem ecSearchPagerItem;
        Map<KAK, Boolean> map;
        KAK kak2;
        KAK kak3;
        EcSearchPagerItem ecSearchPagerItem2;
        Map<KAK, Boolean> map2;
        KAK kak4;
        boolean z;
        K9C LLLILZLLLI;
        C51222K8k c51222K8k;
        o.LJIIIZ(searchResultParam, "searchResultParam");
        C51193K7h c51193K7h = H3().LJLIL;
        String str = null;
        if (c51193K7h != null && (c51222K8k = c51193K7h.LIZ) != null) {
            c51222K8k.setShopId(null);
            c51222K8k.setCreatorId(null);
        }
        C51360KDs c51360KDs = H3().LJLILLLLZI;
        if (c51360KDs != null) {
            Iterator it = ((LinkedHashMap) c51360KDs.LIZIZ).entrySet().iterator();
            while (it.hasNext()) {
                ((Map.Entry) it.next()).setValue(Boolean.FALSE);
            }
        }
        this.LJLL = searchResultParam;
        String keyword = searchResultParam.getKeyword();
        o.LJIIIIZZ(keyword, "searchResultParam.keyword");
        C39468FeK.LJIIL("query", keyword);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        int i = 0;
        if (LIZ != null) {
            if (!this.LJLLLL && searchResultParam.getCapsuleWords() == null && C35O.LIZ(LIZ)) {
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS44S0100000_8(LIZ, 136), 500L);
            }
            this.LJLLLL = false;
            EcSearchStartViewModel ecSearchStartViewModel = (EcSearchStartViewModel) ViewModelProviders.of(LIZ).get(EcSearchStartViewModel.class);
            ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility = (ISearchResultSubPageContextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchResultSubPageContextAbility.class, null);
            if (iSearchResultSubPageContextAbility != null && (LLLILZLLLI = iSearchResultSubPageContextAbility.LLLILZLLLI()) != null && LLLILZLLLI.LIZ() != null) {
                z = true;
            } else {
                z = false;
            }
            ecSearchStartViewModel.LJLJI = z;
        }
        if (!this.LJLLJ) {
            EcSearchContainerVM H3 = H3();
            H3.getClass();
            H3.LJLILLLLZI = new C51360KDs(searchResultParam.getSearchEnterParam());
            H3.setState(new AqS174S0100000_8(H3, 239));
        } else if (searchResultParam.getEcomTargetTab() != null) {
            C51360KDs c51360KDs2 = this.LJLLI;
            if (c51360KDs2 != null) {
                KAK ecomTargetTab = searchResultParam.getEcomTargetTab();
                o.LJIIIIZZ(ecomTargetTab, "searchResultParam.ecomTargetTab");
                int indexOf = ((ArrayList) c51360KDs2.LIZ).indexOf(ecomTargetTab);
                if (indexOf >= 0) {
                    i = indexOf;
                }
            }
            if (((KOV) _$_findCachedViewById(R.id.i09)).getCurrentItem() == i) {
                Fragment LJ = ((KOV) _$_findCachedViewById(R.id.i09)).getFragmentItemOperator().LJ(i);
                if (LJ instanceof EcSearchPagerItem) {
                    ecSearchPagerItem2 = (EcSearchPagerItem) LJ;
                } else {
                    ecSearchPagerItem2 = null;
                }
                C51360KDs c51360KDs3 = H3().LJLILLLLZI;
                if (c51360KDs3 != null && (map2 = c51360KDs3.LIZIZ) != null) {
                    if (ecSearchPagerItem2 == null || (kak4 = ecSearchPagerItem2.LJLIL) == null) {
                        kak4 = KAK.SHOP;
                    }
                    map2.put(kak4, Boolean.TRUE);
                }
                if (ecSearchPagerItem2 != null) {
                    ecSearchPagerItem2.vl();
                }
            } else {
                ((KOV) _$_findCachedViewById(R.id.i09)).LIZ(i);
            }
        } else {
            C51360KDs c51360KDs4 = H3().LJLILLLLZI;
            if (c51360KDs4 != null) {
                kak = c51360KDs4.LIZ(0);
            } else {
                kak = null;
            }
            searchResultParam.setEcomTargetTab(kak);
            if (C51379KEl.LIZ()) {
                C51360KDs c51360KDs5 = H3().LJLILLLLZI;
                if (c51360KDs5 != null) {
                    kak3 = c51360KDs5.LIZ(((KOV) _$_findCachedViewById(R.id.i09)).getCurrentItem());
                } else {
                    kak3 = null;
                }
                searchResultParam.setEcomTargetTab(kak3);
                i = ((KOV) _$_findCachedViewById(R.id.i09)).getCurrentItem();
            }
            if (((KOV) _$_findCachedViewById(R.id.i09)).getCurrentItem() == i) {
                Fragment LJ2 = ((KOV) _$_findCachedViewById(R.id.i09)).getFragmentItemOperator().LJ(i);
                if (LJ2 instanceof EcSearchPagerItem) {
                    ecSearchPagerItem = (EcSearchPagerItem) LJ2;
                } else {
                    ecSearchPagerItem = null;
                }
                C51360KDs c51360KDs6 = H3().LJLILLLLZI;
                if (c51360KDs6 != null && (map = c51360KDs6.LIZIZ) != null) {
                    if (ecSearchPagerItem == null || (kak2 = ecSearchPagerItem.LJLIL) == null) {
                        kak2 = KAK.SHOP;
                    }
                    map.put(kak2, Boolean.TRUE);
                }
                if (ecSearchPagerItem != null) {
                    ecSearchPagerItem.vl();
                }
            } else {
                ((KOV) _$_findCachedViewById(R.id.i09)).LIZ(i);
            }
        }
        JSONObject LIZIZ = C1B8.LIZIZ(WM7.SCENE_SERVICE, "result_realSearch", "is_native_request", 1);
        LIZIZ.put("enter_method", searchResultParam.getEnterMethod());
        C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam != null) {
            str = searchEnterParam.getEnterSearchFrom();
        }
        LIZIZ.put("enter_from", str);
        C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void Ff(EnumC51268KAe actionType) {
        C50948Jz6 Wa0;
        o.LJIIIZ(actionType, "actionType");
        _$_findCachedViewById(R.id.fla).setVisibility(0);
        ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility = (ISearchResultSubPageContextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchResultSubPageContextAbility.class, null);
        if (iSearchResultSubPageContextAbility == null || (Wa0 = iSearchResultSubPageContextAbility.Wa0()) == null) {
            return;
        }
        Wa0.setLastSearchPosition(null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final boolean Gg(KAK kak) {
        Map<KAK, Boolean> map;
        Boolean bool;
        C51360KDs c51360KDs = H3().LJLILLLLZI;
        if (c51360KDs != null && (map = c51360KDs.LIZIZ) != null && (bool = (Boolean) ((LinkedHashMap) map).get(kak)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void Pd0(KAK kak) {
        H3().LJLJI = kak;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void dr0(KAK kak) {
        C51360KDs c51360KDs;
        Map<KAK, Boolean> map;
        if (kak != null && (c51360KDs = H3().LJLILLLLZI) != null && (map = c51360KDs.LIZIZ) != null) {
            map.put(kak, Boolean.TRUE);
        }
    }

    @QD3
    public final void onSearchViewAllEvent(K8R k8r) {
        SearchResultParam searchResultParam;
        Map<String, Object> ecomRecomSearchParamMap;
        if (this.LJLLJ && k8r != null && k8r.LJLJI != null) {
            Map<String, Object> map = k8r.LJLJI;
            o.LJIIIIZZ(map, "event.ecomSearchParams");
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                SearchResultParam searchResultParam2 = this.LJLL;
                if (searchResultParam2 != null && (ecomRecomSearchParamMap = searchResultParam2.getEcomRecomSearchParamMap()) != null) {
                    ecomRecomSearchParamMap.put(key, value);
                }
                if (o.LJ(key, "attach_products") && (value instanceof String) && (searchResultParam = this.LJLL) != null) {
                    searchResultParam.setResultAttachCard(new C51244K9g(KBE.PRODUCT_CARD, (String) value, null, null, null));
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AnonymousClass977.LIZ(view).LJLILLLLZI = new KJL((ViewGroup) _$_findCachedViewById(R.id.gko), view, (ViewGroup) _$_findCachedViewById(R.id.j66), new AqS174S0100000_8(this, 18));
        C8YN.LJIIJ(this, H3(), new TBT() { // from class: X.KEF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((KEB) obj).LJLIL;
            }
        }, new TBT() { // from class: X.KEC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((KEB) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new IDqS433S0100000_8(this, 5), 8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void VT(String str, String str2) {
        EcSearchContainerVM H3 = H3();
        H3.getClass();
        C51193K7h c51193K7h = H3.LJLIL;
        if (c51193K7h != null) {
            c51193K7h.LIZ = null;
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        H3.LJLIL = new C51193K7h(null);
    }
}

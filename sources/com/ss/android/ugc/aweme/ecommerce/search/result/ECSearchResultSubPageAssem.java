package com.ss.android.ugc.aweme.ecommerce.search.result;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1B3;
import X.C1B8;
import X.C212428Vi;
import X.C29615Bjn;
import X.C35O;
import X.C48658J7u;
import X.C50431Jql;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50948Jz6;
import X.C51193K7h;
import X.C51214K8c;
import X.C51224K8m;
import X.C51379KEl;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65232Piu;
import X.C78685UuP;
import X.EnumC51268KAe;
import X.K87;
import X.K9C;
import X.KAK;
import X.KAU;
import X.WM7;
import Y.ARunnableS44S0100000_8;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchContainerFragment;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchTabViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class ECSearchResultSubPageAssem extends UISlotAssem implements ISearchResultSubPageAbility {
    public ISearchResultSubPageContextAbility LJLJLLL;
    public C51224K8m LJLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public boolean LJLLI = true;

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final boolean Gg(KAK kak) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final KAK Gi0() {
        return null;
    }

    @Override // X.KCT
    public final void I1(KAU kau, KAU curPageState) {
        o.LJIIIZ(curPageState, "curPageState");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void Pd0(KAK kak) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void VT(String str, String str2) {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLILLLL;
        Integer valueOf = Integer.valueOf(R.id.jh9);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.jh9)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final void dr0(KAK kak) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final C51193K7h f60() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final SearchResultParam k5() {
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.ap6;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final int LLLZLL() {
        EcSearchContainerFragment ecSearchContainerFragment;
        C51224K8m c51224K8m = this.LJLL;
        if (c51224K8m == null || (ecSearchContainerFragment = c51224K8m.LIZJ) == null) {
            return -1;
        }
        return ecSearchContainerFragment.LJLLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void hide() {
        _$_findCachedViewById(R.id.jh9).setVisibility(8);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), this, ISearchResultSubPageAbility.class, null);
        }
        ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility = (ISearchResultSubPageContextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchResultSubPageContextAbility.class, null);
        if (iSearchResultSubPageContextAbility != null) {
            this.LJLJLLL = iSearchResultSubPageContextAbility;
        }
        ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility2 = this.LJLJLLL;
        if (iSearchResultSubPageContextAbility2 != null) {
            this.LJLL = new C51224K8m(iSearchResultSubPageContextAbility2, C212428Vi.LIZ(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final KAU Jc0() {
        return KAU.RESULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility
    public final boolean ip() {
        return this.LJLLI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void DV(SearchResultParam searchResultParam) {
        int i;
        String str;
        String str2;
        EcSearchContainerFragment ecSearchContainerFragment;
        NextLiveData<C29615Bjn> nextLiveData;
        boolean z;
        K9C LLLILZLLLI;
        o.LJIIIZ(searchResultParam, "searchResultParam");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        int i2 = 1;
        String str3 = null;
        if (LIZ != null) {
            if (!this.LJLLI && searchResultParam.getCapsuleWords() == null && C35O.LIZ(LIZ)) {
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS44S0100000_8(LIZ, 136), 500L);
            }
            this.LJLLI = false;
            EcSearchStartViewModel ecSearchStartViewModel = (EcSearchStartViewModel) ViewModelProviders.of(LIZ).get(EcSearchStartViewModel.class);
            ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility = this.LJLJLLL;
            if (iSearchResultSubPageContextAbility != null && (LLLILZLLLI = iSearchResultSubPageContextAbility.LLLILZLLLI()) != null && LLLILZLLLI.LIZ() != null) {
                z = true;
            } else {
                z = false;
            }
            ecSearchStartViewModel.LJLJI = z;
        }
        JSONObject LIZJ = C65232Piu.LIZJ(WM7.SCENE_SERVICE, "result_realSearch");
        if (this.LJLL != null) {
            i = 1;
        } else {
            i = 0;
        }
        LIZJ.put("is_native_request", i);
        LIZJ.put("enter_method", searchResultParam.getEnterMethod());
        C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam != null) {
            str = searchEnterParam.getEnterSearchFrom();
        } else {
            str = null;
        }
        LIZJ.put("enter_from", str);
        C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ);
        C51224K8m c51224K8m = this.LJLL;
        if (c51224K8m != null) {
            if (!C51379KEl.LIZ()) {
                C50651JuJ c50651JuJ = C50652JuK.Companion;
                ActivityC45651qj activityC45651qj = c51224K8m.LIZIZ;
                c50651JuJ.getClass();
                C50431Jql LJFF = C50651JuJ.LJFF(activityC45651qj);
                if (LJFF != null) {
                    LJFF.setLastShowingPageIndex(0);
                }
                EcSearchTabViewModel ecSearchTabViewModel = K87.LIZ;
                if (ecSearchTabViewModel != null && (nextLiveData = ecSearchTabViewModel.LJLIL) != null) {
                    nextLiveData.setValue(new C29615Bjn());
                }
            }
            EcSearchContainerFragment ecSearchContainerFragment2 = c51224K8m.LIZJ;
            if (ecSearchContainerFragment2 != null) {
                ecSearchContainerFragment2.Al(searchResultParam);
                if (searchResultParam.isOpenNewSearchContainer()) {
                    EcSearchContainerFragment ecSearchContainerFragment3 = c51224K8m.LIZJ;
                    if (ecSearchContainerFragment3 != null) {
                        ecSearchContainerFragment3.xl(0);
                    }
                } else {
                    int forceIndex = searchResultParam.getForceIndex();
                    if (forceIndex >= 0 && (ecSearchContainerFragment = c51224K8m.LIZJ) != null) {
                        ecSearchContainerFragment.xl(forceIndex);
                    }
                }
                i2 = 0;
            } else {
                Bundle bundle = new Bundle();
                bundle.putSerializable("search_param", searchResultParam);
                EcSearchContainerFragment ecSearchContainerFragment4 = new EcSearchContainerFragment();
                ecSearchContainerFragment4.setArguments(bundle);
                FragmentManager fragmentManager = c51224K8m.LIZ.getFragmentManager();
                fragmentManager.getClass();
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJIIJ(ecSearchContainerFragment4, "Container", R.id.izc);
                c1b3.LJII();
                c51224K8m.LIZJ = ecSearchContainerFragment4;
            }
            JSONObject LIZIZ = C1B8.LIZIZ(WM7.SCENE_SERVICE, "result_show_ui", "is_native_request", i2);
            LIZIZ.put("enter_method", searchResultParam.getEnterMethod());
            C50948Jz6 searchEnterParam2 = searchResultParam.getSearchEnterParam();
            if (searchEnterParam2 != null) {
                str2 = searchEnterParam2.getEnterSearchFrom();
            } else {
                str2 = null;
            }
            LIZIZ.put("enter_from", str2);
            C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZIZ);
            if (C78685UuP.LJJJZ(searchResultParam.getSugHint())) {
                String landTap = searchResultParam.getLandTap();
                o.LJIIIIZZ(landTap, "searchResultParam.landTap");
                if (C51214K8c.LIZIZ(landTap) >= 0) {
                    EcSearchContainerFragment ecSearchContainerFragment5 = c51224K8m.LIZJ;
                    if (ecSearchContainerFragment5 != null) {
                        String landTap2 = searchResultParam.getLandTap();
                        o.LJIIIIZZ(landTap2, "searchResultParam.landTap");
                        ecSearchContainerFragment5.xl(C51214K8c.LIZIZ(landTap2));
                    }
                    JSONObject LIZIZ2 = C1B8.LIZIZ(WM7.SCENE_SERVICE, "result_show_ui_landtap", "is_native_request", i2);
                    LIZIZ2.put("enter_method", searchResultParam.getEnterMethod());
                    C50948Jz6 searchEnterParam3 = searchResultParam.getSearchEnterParam();
                    if (searchEnterParam3 != null) {
                        str3 = searchEnterParam3.getEnterSearchFrom();
                    }
                    LIZIZ2.put("enter_from", str3);
                    C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZIZ2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility
    public final void Ff(EnumC51268KAe actionType) {
        C50948Jz6 Wa0;
        o.LJIIIZ(actionType, "actionType");
        _$_findCachedViewById(R.id.jh9).setVisibility(0);
        ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility = this.LJLJLLL;
        if (iSearchResultSubPageContextAbility == null || (Wa0 = iSearchResultSubPageContextAbility.Wa0()) == null) {
            return;
        }
        Wa0.setLastSearchPosition(null);
    }
}

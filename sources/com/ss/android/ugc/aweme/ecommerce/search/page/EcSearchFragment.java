package com.ss.android.ugc.aweme.ecommerce.search.page;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C221108m2;
import X.C28019Az9;
import X.C29S;
import X.C3C5;
import X.C50433Jqn;
import X.C50650JuI;
import X.C50948Jz6;
import X.C51254K9q;
import X.C51257K9t;
import X.C51355KDn;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C76800UCe;
import X.C78685UuP;
import X.C90903hW;
import X.EF7;
import X.EnumC50961JzJ;
import X.EnumC72807Shn;
import X.InterfaceC55235Lm3;
import X.K7H;
import X.K9C;
import X.KA6;
import X.KA8;
import X.KAU;
import X.KAV;
import X.ORZ;
import X.W5F;
import X.W5U;
import X.X1D;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ISearchSuggestContextAbility;
import com.ss.android.ugc.aweme.ecomsearch.config.EcomSearchThemeBackgroundSettings;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcSearchFragment extends ECBaseFragment {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public KAV LJLIL;
    public ISearchBarAbility LJLILLLLZI;
    public ISearchResultSubPageAbility LJLJI;
    public C50948Jz6 LJLJJL;
    public SearchResultParam LJLJJLL;
    public boolean LJLJLJ;
    public C51254K9q LJLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 55));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 54));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 53));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 58));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 59));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 57));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 56));

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final K9C LLLILZLLLI() {
        return (K9C) this.LJLJL.getValue();
    }

    public final C50650JuI vl() {
        return (C50650JuI) this.LJLJJI.getValue();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        C55096Ljo.LJIILLIIL(this, ECSearchPageScope.class, ISearchBarContextAbility.class);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ECSearchEntranceData eCSearchEntranceData;
        String str;
        String str2;
        ECSearchEntranceData ecSearchEntranceData;
        ECSearchEntranceData ecSearchEntranceData2;
        int i;
        ECSearchEntranceData eCSearchEntranceData2;
        KAV c51257K9t;
        KAU kau;
        String keyword;
        EnumC50961JzJ initDirectPage;
        C50433Jqn searchCommonModel;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C50948Jz6 c50948Jz6 = this.LJLJJL;
        IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
        C50948Jz6 c50948Jz62 = null;
        if (c50948Jz6 != null) {
            eCSearchEntranceData = c50948Jz6.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData = null;
        }
        if (!LJJJJZI.LJIIIZ(eCSearchEntranceData)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("flash sale bg url = ");
            if (c50948Jz6 != null && (ecSearchEntranceData2 = c50948Jz6.getEcSearchEntranceData()) != null) {
                str = ecSearchEntranceData2.getResultBgUrl();
            } else {
                str = null;
            }
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            if (c50948Jz6 == null || (ecSearchEntranceData = c50948Jz6.getEcSearchEntranceData()) == null || (str2 = ecSearchEntranceData.getResultBgUrl()) == null) {
                SettingsManager LIZLLL = SettingsManager.LIZLLL();
                EcomSearchThemeBackgroundSettings.EcomSearchThemeBackgroundModel ecomSearchThemeBackgroundModel = EcomSearchThemeBackgroundSettings.LIZ;
                EcomSearchThemeBackgroundSettings.EcomSearchThemeBackgroundModel ecomSearchThemeBackgroundModel2 = (EcomSearchThemeBackgroundSettings.EcomSearchThemeBackgroundModel) LIZLLL.LJIIIIZZ("ecom_search_theme_background", EcomSearchThemeBackgroundSettings.EcomSearchThemeBackgroundModel.class, ecomSearchThemeBackgroundModel);
                if (ecomSearchThemeBackgroundModel2 != null) {
                    ecomSearchThemeBackgroundModel = ecomSearchThemeBackgroundModel2;
                }
                str2 = (String) ORZ.LJLLJ(ecomSearchThemeBackgroundModel.ecomSearchDefaultBackground);
            }
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
            LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_START;
            LJIIIIZZ.LIZIZ("ECS_EcSearchActivity");
            LJIIIIZZ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.bs_);
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        C50650JuI vl = vl();
        if (vl != null && (searchCommonModel = vl.getSearchCommonModel()) != null) {
            i = searchCommonModel.getBackPressFlag();
        } else {
            i = 2;
        }
        KA8 ka8 = new KA8(this, new C28019Az9(LIZJ, i));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLL = new C51254K9q((ISearchSuggestContextAbility) this.LJLLI.getValue(), mo49getActivity);
        }
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 589);
        AqS158S0100000_8 aqS158S0100000_82 = new AqS158S0100000_8(this, 591);
        AqS158S0100000_8 aqS158S0100000_83 = new AqS158S0100000_8(this, 590);
        AqS158S0100000_8 aqS158S0100000_84 = new AqS158S0100000_8(this, 588);
        IEcomSearchService LJJIJL = C63081OpJ.LJJIJL();
        C50948Jz6 c50948Jz63 = this.LJLJJL;
        if (c50948Jz63 != null) {
            eCSearchEntranceData2 = c50948Jz63.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData2 = null;
        }
        if (LJJIJL.LJI(eCSearchEntranceData2)) {
            c51257K9t = new KA6(ka8, aqS158S0100000_8, aqS158S0100000_82, aqS158S0100000_83, aqS158S0100000_84);
        } else {
            c51257K9t = new C51257K9t(ka8, aqS158S0100000_8, aqS158S0100000_82, aqS158S0100000_83, aqS158S0100000_84);
        }
        this.LJLIL = c51257K9t;
        SearchResultParam searchResultParam = this.LJLJJLL;
        if (searchResultParam != null) {
            c50948Jz62 = searchResultParam.getSearchEnterParam();
        }
        if (c50948Jz62 != null && (initDirectPage = c50948Jz62.getInitDirectPage()) != null && K7H.LIZ[initDirectPage.ordinal()] == 1 && c50948Jz62.getInitSugWord() != null) {
            kau = KAU.SUG;
        } else {
            SearchResultParam searchResultParam2 = this.LJLJJLL;
            if (searchResultParam2 != null && (keyword = searchResultParam2.getKeyword()) != null && C78685UuP.LJJJZ(keyword)) {
                kau = KAU.RESULT;
            } else {
                kau = KAU.SUGGEST;
            }
        }
        KAV kav = this.LJLIL;
        if (kav != null) {
            kav.LJ(kau, this.LJLJJLL, view);
        }
        ((C51355KDn) _$_findCachedViewById(R.id.kp0)).setTouchHandle(new AqS174S0100000_8(this, 16));
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            _$_findCachedViewById(R.id.c42).setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LIZJ = C16970lZ.LIZJ(R.layout.ap5, requireActivity(), viewGroup, false);
        C29S c29s = null;
        if (!(LIZJ instanceof View)) {
            LIZJ = null;
        }
        if (LIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZJ, this);
                C10A.LIZIZ(LIZJ, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LIZJ;
    }
}

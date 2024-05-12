package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C1B3;
import X.C29S;
import X.C30591Hz;
import X.C39468FeK;
import X.C3C5;
import X.C48658J7u;
import X.C50948Jz6;
import X.C51362KDu;
import X.C51378KEk;
import X.C76800UCe;
import X.C78685UuP;
import X.C90903hW;
import X.EnumC51280KAq;
import X.EnumC51281KAr;
import X.EnumC62182cI;
import X.EnumC63755P0l;
import X.InterfaceC18010nF;
import X.KE2;
import X.KEK;
import X.KEL;
import X.KEO;
import X.KF5;
import X.OSZ;
import Y.IDTListenerS117S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.HalfVerticalAdapter;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.Au2S17S0100000_8;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class HalfDynamicSearchShopFragment extends Fragment implements InterfaceC18010nF {
    public KEO LJLIL;
    public KEL LJLILLLLZI;
    public Map<String, ? extends Object> LJLJI;
    public KE2 LJLJJI;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public float LJLJJL = -1.0f;
    public float LJLJJLL = -1.0f;

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return EnumC63755P0l.HALF_SEARCH_SHOP_PAGE.getPageCode();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EcUgPopupService.LJIILJJIL().LJIIL(mo49getActivity(), this.LJLJI);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        Map<String, Object> LJJJLIIL;
        SearchResultParam LJIILLIIL;
        C50948Jz6 searchEnterParam;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        KE2 ke2 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("ec_result_immutable_data");
        } else {
            serializable = null;
        }
        if (serializable instanceof KE2) {
            ke2 = (KE2) serializable;
        }
        this.LJLJJI = ke2;
        if (ke2 != null) {
            this.LJLIL = new KEO(ke2, this);
            this.LJLILLLLZI = new KEL(ke2, this);
        }
        KEO keo = this.LJLIL;
        if (keo == null || (LJIILLIIL = ((C51362KDu) keo.LIZ()).LJIILLIIL()) == null || (searchEnterParam = LJIILLIIL.getSearchEnterParam()) == null || (LJJJLIIL = searchEnterParam.getHalfSearchForMallParams()) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        this.LJLJI = LJJJLIIL;
        EcUgPopupService.LJIILJJIL().LJIIJJI(mo49getActivity(), this.LJLJI);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SearchResultParam searchResultParam;
        String str;
        String str2;
        String str3;
        KEL kel;
        AmeBaseFragment ameBaseFragment;
        SearchResultParam searchResultParam2;
        View view2;
        C50948Jz6 searchEnterParam;
        ECSearchEntranceData eCSearchEntranceData;
        SearchResultParam searchResultParam3;
        C50948Jz6 searchEnterParam2;
        SearchResultParam searchResultParam4;
        C50948Jz6 searchEnterParam3;
        String num;
        C50948Jz6 searchEnterParam4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        KE2 ke2 = this.LJLJJI;
        if (ke2 != null) {
            searchResultParam = ke2.getSearchResultParam();
        } else {
            searchResultParam = null;
        }
        OSZ[] oszArr = new OSZ[2];
        String str4 = "";
        if (searchResultParam == null || (searchEnterParam4 = searchResultParam.getSearchEnterParam()) == null || (str = searchEnterParam4.getEnterSearchFrom()) == null) {
            str = "";
        }
        oszArr[0] = new OSZ("enter_from", str);
        if (searchResultParam != null && (searchEnterParam3 = searchResultParam.getSearchEnterParam()) != null && (num = Integer.valueOf(searchEnterParam3.getEcSearchEntranceValue()).toString()) != null) {
            str4 = num;
        }
        oszArr[1] = new OSZ("root_enter_from_type", str4);
        C48658J7u.LIZ("rd_tiktokec_popup_search_show", C113554cx.LJJLIIIIJ(oszArr));
        C12460eI.LJIIIIZZ(this, null);
        KE2 ke22 = this.LJLJJI;
        if (ke22 != null) {
            str2 = ke22.getEcSearchSessionId();
        } else {
            str2 = null;
        }
        if (C78685UuP.LJJJZ(str2) && str2 != null) {
            C39468FeK.LJIIL("ec_search_session_id", str2);
        }
        Long valueOf = Long.valueOf(C17N.LJJJJJL(this).IO().LIZJ().LJLIL);
        if (C30591Hz.LJIJJLI(Long.valueOf(valueOf.longValue()))) {
            C39468FeK.LJIIL("search_session_id", String.valueOf(valueOf.longValue()));
        }
        KE2 ke23 = this.LJLJJI;
        if (ke23 != null && (searchResultParam4 = ke23.getSearchResultParam()) != null) {
            str3 = searchResultParam4.getKeyword();
        } else {
            str3 = null;
        }
        if (C78685UuP.LJJJZ(str3) && str3 != null) {
            ISearchService LLLZI = SearchServiceImpl.LLLZI();
            Integer valueOf2 = Integer.valueOf(EnumC51281KAr.HALF_SHOP.getValue());
            KE2 ke24 = this.LJLJJI;
            if (ke24 != null && (searchResultParam3 = ke24.getSearchResultParam()) != null && (searchEnterParam2 = searchResultParam3.getSearchEnterParam()) != null) {
                eCSearchEntranceData = searchEnterParam2.getEcSearchEntranceData();
            } else {
                eCSearchEntranceData = null;
            }
            LLLZI.LJJLJLI(eCSearchEntranceData, valueOf2).LIZJ(new SearchHistory(str3, 0));
        }
        Context context = getContext();
        if (context != null) {
            KE2 ke25 = this.LJLJJI;
            if (ke25 != null) {
                searchResultParam2 = ke25.getSearchResultParam();
            } else {
                searchResultParam2 = null;
            }
            IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
            EnumC51280KAq enumC51280KAq = EnumC51280KAq.HALF_SHOP;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            ECSearchEntranceData eCSearchEntranceData2 = new ECSearchEntranceData(EnumC51280KAq.FROM_HALF_SHOP.getValue(), null, EnumC62182cI.TO_SUG.getValue(), null, null, null, "1", null, null, "shop", null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 268434874, null);
            if (searchResultParam2 != null) {
                str7 = searchResultParam2.getKeyword();
            }
            KF5 kf5 = KF5.FILL_STYLE;
            if (searchResultParam2 != null && (searchEnterParam = searchResultParam2.getSearchEnterParam()) != null) {
                str5 = searchEnterParam.getEnterSearchFrom();
            }
            KE2 ke26 = this.LJLJJI;
            if (ke26 != null) {
                str6 = ke26.getTrafficSourceList();
            }
            Object LJJJJL = LJJJJZI.LJJJJL(context, enumC51280KAq, eCSearchEntranceData2, new KEK(str5, null, null, str6, str7, kf5, Integer.valueOf(enumC51280KAq.getValue()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 134217606), C51378KEk.LJLIL);
            if ((LJJJJL instanceof View) && (view2 = (View) LJJJJL) != null) {
                ((ViewGroup) _$_findCachedViewById(R.id.ckr)).addView(view2);
            }
        }
        KEO keo = this.LJLIL;
        if (keo != null && (kel = this.LJLILLLLZI) != null) {
            if (e1.LIZ(31744, "ec_search_result_refactor", true, false)) {
                ameBaseFragment = new HalfVerticalAdapter();
            } else {
                EcDynamicSearchShopFragment ecDynamicSearchShopFragment = new EcDynamicSearchShopFragment();
                ecDynamicSearchShopFragment.LJLLI = keo;
                ecDynamicSearchShopFragment.LJLL = kel;
                ameBaseFragment = ecDynamicSearchShopFragment;
            }
            SearchResultParam LJIILLIIL = ((C51362KDu) keo.LIZ()).LJIILLIIL();
            if (LJIILLIIL != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("search_key", LJIILLIIL);
                ameBaseFragment.setArguments(bundle2);
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJIIJ(ameBaseFragment, null, R.id.ckv);
            c1b3.LJI();
        }
        _$_findCachedViewById(R.id.ckr).setOnTouchListener(new IDTListenerS117S0100000_8(this, 5));
        View search_clear_icon = _$_findCachedViewById(R.id.jeo);
        o.LJIIIIZZ(search_clear_icon, "search_clear_icon");
        C16880lQ.LJIIJ(new Au2S17S0100000_8(this, 2), search_clear_icon);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aoq, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}

package com.ss.android.ugc.aweme.ecommerce.search.page;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C2K0;
import X.C3C5;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50948Jz6;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.InterfaceC50670Juc;
import X.InterfaceC51505KJh;
import X.JTO;
import X.K6B;
import X.K75;
import X.KAB;
import X.KAU;
import X.KB1;
import X.KCT;
import Y.AObserverS76S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.refactor.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel;
import com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class EcSearchMiddleAdapterFragment extends AmeBaseFragment implements K6B, InterfaceC51505KJh {
    public final K75 LJLIL;
    public ISearchSuggestSubPageAbility LJLILLLLZI;
    public ISearchSugSubPageAbility LJLJI;
    public EcSearchIntermediateViewModelNew LJLJJI;
    public SearchStateViewModel LJLJJL;
    public SearchKeywordPresenter LJLJJLL;
    public SugKeywordPresenter LJLJL;
    public SearchEditTextViewModel LJLJLJ;
    public final InterfaceC50670Juc LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final List<KCT> LJLLILLLL;
    public int LJLLJ;
    public final Map<Integer, View> LJLLL;

    public EcSearchMiddleAdapterFragment() {
        this(null);
    }

    @Override // X.K6B
    public final void LLIIIJ(int i, SearchSugEntity entity, String requestId) {
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(requestId, "requestId");
    }

    @Override // X.K6B
    public final int N6() {
        return 0;
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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

    @Override // X.K6B
    public final void g3(SearchSugEntity entity) {
        o.LJIIIZ(entity, "entity");
    }

    @Override // X.K6B
    public final void xc(SearchSugEntity entity) {
        o.LJIIIZ(entity, "entity");
    }

    public final C50650JuI wl() {
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        return C50651JuJ.LJII(mo49getActivity);
    }

    @Override // X.K6B
    public final void z2() {
        ISearchSugSubPageAbility iSearchSugSubPageAbility = this.LJLJI;
        if (iSearchSugSubPageAbility != null) {
            iSearchSugSubPageAbility.z2();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLL).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean xl() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchMiddleAdapterFragment.xl():boolean");
    }

    public EcSearchMiddleAdapterFragment(K75 k75) {
        ECSearchEntranceData eCSearchEntranceData;
        this.LJLLL = new LinkedHashMap();
        this.LJLIL = k75;
        ISearchService LLLZI = SearchServiceImpl.LLLZI();
        Integer valueOf = Integer.valueOf(KB1.LIZ(JTO.LIZIZ(mo49getActivity())));
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz6 != null) {
            eCSearchEntranceData = c50948Jz6.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData = null;
        }
        this.LJLJLLL = LLLZI.LJJLJLI(eCSearchEntranceData, valueOf);
        this.LJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 60));
        this.LJLLI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 61));
        this.LJLLILLLL = new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLJJI = (EcSearchIntermediateViewModelNew) ViewModelProviders.of(mo49getActivity).get(EcSearchIntermediateViewModelNew.class);
            this.LJLJJL = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity).get(SearchStateViewModel.class);
            this.LJLJJLL = new SearchKeywordPresenter(mo49getActivity);
            SugKeywordPresenter sugKeywordPresenter = new SugKeywordPresenter(mo49getActivity);
            this.LJLJL = sugKeywordPresenter;
            SearchKeywordPresenter searchKeywordPresenter = this.LJLJJLL;
            if (searchKeywordPresenter != null) {
                sugKeywordPresenter.LIZJ(searchKeywordPresenter.getEditText());
                this.LJLJLJ = (SearchEditTextViewModel) ViewModelProviders.of(mo49getActivity).get(SearchEditTextViewModel.class);
            } else {
                o.LJIJI("keywordPresenter");
                throw null;
            }
        }
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LJLJJI;
        if (ecSearchIntermediateViewModelNew != null) {
            ecSearchIntermediateViewModelNew.gv0().observe(this, new AObserverS76S0100000_8(this, 8));
            EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew2 = this.LJLJJI;
            if (ecSearchIntermediateViewModelNew2 != null) {
                ((LiveData) ecSearchIntermediateViewModelNew2.LJLJI.getValue()).observe(this, new AObserverS76S0100000_8(this, 9));
                KAB LIZ = KAB.LIZIZ.LIZ();
                List<SearchHistory> LJFF = this.LJLJLLL.LJFF(0);
                o.LJIIIIZZ(LJFF, "historyManager.getSearchHistoryByType(0)");
                LIZ.LIZ = LJFF;
                return;
            }
            o.LJIJI("intermediateViewModel");
            throw null;
        }
        o.LJIJI("intermediateViewModel");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        ISearchSugSubPageAbility iSearchSugSubPageAbility = null;
        if (mo49getActivity != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(mo49getActivity, null), (C2K0) this.LJLL.getValue(), ISearchSuggestContextAbilityNew.class, null);
            C8VV.LIZ(this, false, new AqS174S0100000_8(this, 226));
            ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility = (ISearchSuggestSubPageAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(mo49getActivity, null), ISearchSuggestSubPageAbility.class, null);
            if (iSearchSuggestSubPageAbility != null) {
                ((ArrayList) this.LJLLILLLL).add(iSearchSuggestSubPageAbility);
            } else {
                iSearchSuggestSubPageAbility = null;
            }
            this.LJLILLLLZI = iSearchSuggestSubPageAbility;
        }
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), (C2K0) this.LJLLI.getValue(), ISearchSugContextAbility.class, null);
        C8VV.LIZ(this, false, new AqS174S0100000_8(this, 227));
        ISearchSugSubPageAbility iSearchSugSubPageAbility2 = (ISearchSugSubPageAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ISearchSugSubPageAbility.class, null);
        if (iSearchSugSubPageAbility2 != null) {
            ((ArrayList) this.LJLLILLLL).add(iSearchSugSubPageAbility2);
            iSearchSugSubPageAbility = iSearchSugSubPageAbility2;
        }
        this.LJLJI = iSearchSugSubPageAbility;
        _$_findCachedViewById(R.id.uz).setVisibility(0);
        _$_findCachedViewById(R.id.uy).setVisibility(0);
        xl();
    }

    public final void vl(KAU kau, KAU kau2) {
        Iterator<KCT> it = this.LJLLILLLL.iterator();
        while (it.hasNext()) {
            it.next().I1(kau, kau2);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aot, viewGroup, false);
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

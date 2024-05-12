package com.ss.android.ugc.aweme.search.pages.core.ui.fragment;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C00F;
import X.C0C3;
import X.C0CJ;
import X.C0CM;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C27740Aue;
import X.C29S;
import X.C2L4;
import X.C31610Cas;
import X.C3C5;
import X.C48054ItW;
import X.C49446Jas;
import X.C49503Jbn;
import X.C49804Jge;
import X.C49814Jgo;
import X.C49950Jj0;
import X.C50238Jne;
import X.C50240Jng;
import X.C50287JoR;
import X.C50368Jpk;
import X.C50370Jpm;
import X.C50431Jql;
import X.C50558Jso;
import X.C50605JtZ;
import X.C50622Jtq;
import X.C50642JuA;
import X.C50650JuI;
import X.C50652JuK;
import X.C50675Juh;
import X.C50676Jui;
import X.C50902JyM;
import X.C50929Jyn;
import X.C50948Jz6;
import X.C51061K2f;
import X.C51062K2g;
import X.C51065K2j;
import X.C51066K2k;
import X.C51067K2l;
import X.C51068K2m;
import X.C51069K2n;
import X.C51070K2o;
import X.C51071K2p;
import X.C51072K2q;
import X.C51074K2s;
import X.C51075K2t;
import X.C51076K2u;
import X.C51080K2y;
import X.C51107K3z;
import X.C51217K8f;
import X.C51244K9g;
import X.C51633KOf;
import X.C68182ly;
import X.C74053T4n;
import X.C76800UCe;
import X.C76965UIn;
import X.C79045V0n;
import X.C80675VlP;
import X.C8VV;
import X.C90903hW;
import X.C9XU;
import X.G27;
import X.InterfaceC50157JmL;
import X.JYS;
import X.K0M;
import X.K5W;
import X.KAK;
import X.KB1;
import X.KBE;
import X.KEM;
import X.KEZ;
import X.QD3;
import X.QZP;
import X.VW3;
import Y.ACListenerS43S0200000_8;
import Y.AObjectS42S0101000_5;
import Y.AObjectS44S0101000_8;
import Y.AObserverS58S0101000_2;
import Y.AObserverS70S0100000_2;
import Y.AObserverS71S0100000_3;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS11S0201000_8;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS8S0201000_5;
import Y.AgS130S0100000_14;
import Y.IDObserverS9S0101000;
import Y.IDRunnableS0S0201000;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager2.adapter.AdapterStateViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.keyword.SearchKeywordViewModel;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.common.theme.ThemeViewModel;
import com.ss.android.ugc.aweme.search.pages.core.ui.assem.SearchContainerFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewController;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.viewmodel.SearchTabViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public class SearchContainerFragment extends AmeBaseFragment implements G27, C2L4 {
    public static final /* synthetic */ int LLI = 0;
    public SearchResultParam LJLIL;
    public boolean LJLILLLLZI = true;
    public boolean LJLJI = true;
    public VW3 LJLJJI;
    public C0CM LJLJJL;
    public C50370Jpm<AbsSearchBaseFragment> LJLJJLL;
    public C50368Jpk<AbsSearchBaseFragment> LJLJL;
    public C80675VlP LJLJLJ;
    public C74053T4n LJLJLLL;
    public View LJLL;
    public TuxIconView LJLLI;
    public C2068389v LJLLILLLL;
    public C0C3 LJLLJ;
    public C0CJ LJLLL;
    public SearchStartViewModel LJLLLL;
    public SearchKeywordViewModel LJLLLLLL;
    public int LJLZ;
    public ThemeViewModel LJZ;
    public boolean LJZI;
    public SurveyViewController LJZL;
    public SurveyViewModel LL;
    public SearchEnterViewModel LLD;
    public AdapterStateViewModel LLF;
    public KEM LLFF;
    public SearchContainerHeaderVM LLFFF;
    public boolean LLFII;
    public K5W LLFZ;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("search");
        return analysis;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(SearchContainerFragmentScope.class);
    }

    public final AbsSearchBaseFragment vl() {
        int i;
        if (this.LJLLLL.iv0().getValue() != null) {
            i = this.LJLLLL.iv0().getValue().intValue();
        } else {
            i = 0;
        }
        AbsSearchBaseFragment absSearchBaseFragment = null;
        if (C48054ItW.LIZ()) {
            C50368Jpk<AbsSearchBaseFragment> c50368Jpk = this.LJLJL;
            if (c50368Jpk == null) {
                return null;
            }
            return c50368Jpk.LJLZ.get(Integer.valueOf(i));
        }
        C50370Jpm<AbsSearchBaseFragment> c50370Jpm = this.LJLJJLL;
        if (c50370Jpm == null) {
            return null;
        }
        HashMap<Integer, AbsSearchBaseFragment> hashMap = c50370Jpm.LJLJLJ;
        if (hashMap != null && hashMap.size() != 0) {
            absSearchBaseFragment = c50370Jpm.LJLJLJ.get(Integer.valueOf(i));
        }
        return absSearchBaseFragment;
    }

    public final C2068389v wl() {
        Boolean value = this.LJLLLL.jv0().getValue();
        if (value != null && value.booleanValue()) {
            this.LJLLILLLL.LJ = Integer.valueOf(R.attr.eb);
            return this.LJLLILLLL;
        }
        if (this.LJZI) {
            this.LJLLILLLL.LJ = Integer.valueOf(R.attr.dj);
        } else {
            this.LJLLILLLL.LJ = Integer.valueOf(R.attr.go);
        }
        return this.LJLLILLLL;
    }

    public SearchContainerFragment() {
        new ArgbEvaluator();
        this.LLFII = false;
    }

    public final void Al() {
        if (vl() != null) {
            if (mo49getActivity() != null) {
                C50558Jso.LIZIZ(mo49getActivity(), vl());
            }
            C50652JuK.updateContextSource(mo49getActivity(), new AObjectS44S0101000_8(3, this, 1));
        }
    }

    public final void Gl() {
        if (C48054ItW.LIZ()) {
            C51071K2p c51071K2p = new C51071K2p(this.LJLJLLL, this.LJLJJL, new C51217K8f(2, this), this.LJLJI);
            if (!c51071K2p.LJI) {
                AbstractC029409q<?> adapter = c51071K2p.LIZIZ.getAdapter();
                c51071K2p.LJFF = adapter;
                if (adapter != null) {
                    c51071K2p.LJI = true;
                    c51071K2p.LIZIZ.LIZIZ(new C51072K2q(c51071K2p.LIZ));
                    c51071K2p.LIZ.LIZ(new C51070K2o(c51071K2p.LIZIZ, c51071K2p.LJ));
                    if (c51071K2p.LIZJ) {
                        C51076K2u c51076K2u = new C51076K2u(c51071K2p);
                        AbstractC029409q<?> abstractC029409q = c51071K2p.LJFF;
                        if (abstractC029409q != null) {
                            abstractC029409q.registerAdapterDataObserver(c51076K2u);
                        }
                    }
                    c51071K2p.LIZ();
                    c51071K2p.LIZ.LJIILIIL(c51071K2p.LIZIZ.getCurrentItem(), 0.0f, true, true);
                    return;
                }
                "TabLayoutMediator attached before ViewPager2 has an adapter".toString();
                throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
            }
            "TabLayoutMediator is already attached".toString();
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        this.LJLJLLL.setupWithViewPager(this.LJLJJI);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        SearchContainerHeaderVM searchContainerHeaderVM = this.LLFFF;
        if (searchContainerHeaderVM != null) {
            ValueAnimator valueAnimator = searchContainerHeaderVM.LJLZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = searchContainerHeaderVM.LJZ;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        C49950Jj0.LJ.LIZJ(2, "SearchContainerFragment#onDetach");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLFII = true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLFII = false;
        C49446Jas.LIZ = (SearchTabViewModel) ViewModelProviders.of(mo49getActivity()).get(SearchTabViewModel.class);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (isRegisterEventBus()) {
            EventBus LIZJ = EventBus.LIZJ();
            if (!LIZJ.LJI(this)) {
                LIZJ.LJIILJJIL(this);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (isRegisterEventBus()) {
            EventBus LIZJ = EventBus.LIZJ();
            if (LIZJ.LJI(this)) {
                LIZJ.LJIJ(this);
            }
        }
    }

    public final void Dl(int i) {
        if (C48054ItW.LIZ()) {
            if (this.LJLJJL == null) {
                return;
            }
        } else if (this.LJLJJI == null) {
            return;
        }
        if (C48054ItW.LIZ()) {
            this.LJLJJL.LIZLLL(i, this.LJLJI);
        } else {
            this.LJLJJI.setCurrentItem(i);
        }
    }

    public final void Hl(int i) {
        AbsSearchBaseFragment absSearchBaseFragment;
        AbsSearchBaseFragment absSearchBaseFragment2;
        boolean z;
        C49814Jgo value = this.LJLLLLLL.gv0().getValue();
        if (value != null && !TextUtils.isEmpty(value.LJLIL)) {
            this.LJLLLLLL.gv0().setValue(new C49814Jgo(value.LJLIL, ""));
        }
        this.LJLLLL.iv0().setValue(Integer.valueOf(i));
        InterfaceC50157JmL LIZ = K0M.LIZ();
        if (LIZ != null) {
            LIZ.LIZ(i);
        }
        Al();
        if (C50675Juh.LIZ) {
            if (C48054ItW.LIZ()) {
                absSearchBaseFragment2 = this.LJLJL.LJLZ.get(Integer.valueOf(i));
            } else {
                C50370Jpm<AbsSearchBaseFragment> c50370Jpm = this.LJLJJLL;
                HashMap<Integer, AbsSearchBaseFragment> hashMap = c50370Jpm.LJLJLJ;
                if (hashMap == null || hashMap.size() == 0) {
                    absSearchBaseFragment = null;
                } else {
                    absSearchBaseFragment = c50370Jpm.LJLJLJ.get(Integer.valueOf(i));
                }
                absSearchBaseFragment2 = absSearchBaseFragment;
            }
            OptionConfigParams LIZJ = C51107K3z.LIZ.LIZJ(C50605JtZ.LJFF(i));
            if (absSearchBaseFragment2 != null) {
                C50287JoR c50287JoR = absSearchBaseFragment2.LJLJI;
                boolean z2 = false;
                if (c50287JoR != null) {
                    NextLiveData<Boolean> jv0 = this.LJLLLL.jv0();
                    if (!c50287JoR.isDefaultOption() && !c50287JoR.isFromSchema()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jv0.setValue(Boolean.valueOf(z));
                } else {
                    this.LJLLLL.jv0().setValue(Boolean.FALSE);
                }
                if (C50605JtZ.LJFF(i).equals("shop") && C00F.LIZ(31744, 0, "shop_vertical_search_filter_panel", true) == 1) {
                    NextLiveData<Boolean> gv0 = this.LJLLLL.gv0();
                    if (absSearchBaseFragment2.wl() && absSearchBaseFragment2.LJLILLLLZI) {
                        z2 = true;
                    }
                    gv0.setValue(Boolean.valueOf(z2));
                    return;
                }
                NextLiveData<Boolean> gv02 = this.LJLLLL.gv0();
                if (C51107K3z.LIZ(LIZJ) && absSearchBaseFragment2.wl() && absSearchBaseFragment2.LJLILLLLZI) {
                    z2 = true;
                }
                gv02.setValue(Boolean.valueOf(z2));
                return;
            }
            if (i == 0) {
                this.LJLLLL.gv0().setValue(Boolean.valueOf(C51107K3z.LIZ(LIZJ)));
            } else {
                this.LJLLLL.jv0().setValue(Boolean.FALSE);
                this.LJLLLL.gv0().setValue(Boolean.valueOf(C51107K3z.LIZ(LIZJ)));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        new AnalysisStayTimeFragmentComponent(this, true);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LJLIL == null && getArguments() != null) {
            this.LJLIL = (SearchResultParam) getArguments().getSerializable("search_param");
            C50642JuA.LIZ(mo49getActivity(), this.LJLIL);
        }
        this.LJLLLL = (SearchStartViewModel) ViewModelProviders.of(mo49getActivity()).get(SearchStartViewModel.class);
        this.LJLLLLLL = (SearchKeywordViewModel) ViewModelProviders.of(mo49getActivity()).get(SearchKeywordViewModel.class);
        this.LJZ = (ThemeViewModel) ViewModelProviders.of(mo49getActivity()).get(ThemeViewModel.class);
        this.LL = (SurveyViewModel) ViewModelProviders.of(mo49getActivity()).get(SurveyViewModel.class);
        this.LLD = (SearchEnterViewModel) ViewModelProviders.of(mo49getActivity()).get(SearchEnterViewModel.class);
        this.LLF = (AdapterStateViewModel) ViewModelProviders.of(mo49getActivity()).get(AdapterStateViewModel.class);
        if (C49804Jge.LJJIZ()) {
            this.LLFFF = (SearchContainerHeaderVM) ViewModelProviders.of(mo49getActivity()).get(SearchContainerHeaderVM.class);
        }
        new QZP();
        C51067K2l c51067K2l = new C51067K2l(this);
        C51066K2k c51066K2k = new C51066K2k(this);
        this.LLFF = new KEM(c51067K2l, new C50902JyM(this), new C50622Jtq(this), c51066K2k);
    }

    @QD3
    public void onSearchViewAllEvent(JYS jys) {
        if (C48054ItW.LIZ()) {
            if (this.LJLJJL == null) {
                return;
            }
        } else if (this.LJLJJI == null) {
            return;
        }
        C49503Jbn.LIZIZ = true;
        C49503Jbn.LIZJ = true;
        C49503Jbn.LIZLLL = true;
        if (jys.LJLILLLLZI != null) {
            this.LJLIL.setIsFilterFromSchema(true);
            this.LJLIL.setFilterOption(jys.LJLILLLLZI);
        }
        Map<String, Object> map = jys.LJLJI;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                this.LJLIL.getEcomRecomSearchParamMap().put(entry.getKey(), entry.getValue());
                if (entry.getKey().equals("attach_products") && (entry.getValue() instanceof String)) {
                    this.LJLIL.setResultAttachCard(new C51244K9g(KBE.PRODUCT_CARD, (String) entry.getValue(), null, null, null));
                }
            }
        }
        if (C48054ItW.LIZ()) {
            this.LJLJJL.post(new ARunnableS11S0201000_8(3, this, jys, 13));
        } else {
            this.LJLJJI.post(new ARunnableS8S0201000_5(1, this, jys, 2));
        }
    }

    public static void xl(SearchContainerFragment searchContainerFragment, C50240Jng c50240Jng) {
        searchContainerFragment.getClass();
        searchContainerFragment.LJZI = TextUtils.equals("dark", c50240Jng.LIZ);
        View view = searchContainerFragment.LJLL;
        int intValue = C79045V0n.LJI(R.attr.dz, searchContainerFragment.getView().getContext()).intValue();
        if (searchContainerFragment.LJZI) {
            intValue = c50240Jng.LIZIZ;
        }
        view.setBackgroundColor(intValue);
        searchContainerFragment.LJLLI.setBackgroundColor(c50240Jng.LIZIZ);
        Boolean valueOf = Boolean.valueOf(searchContainerFragment.LJZI);
        Boolean bool = c50240Jng.LIZLLL;
        if (bool != null && bool.booleanValue()) {
            searchContainerFragment.LJLJLLL.LJIILL(R.style.ux);
        } else if (valueOf.booleanValue()) {
            searchContainerFragment.LJLJLLL.LJIILL(R.style.ux);
        } else {
            searchContainerFragment.LJLJLLL.LJIILL(R.style.ul);
        }
        searchContainerFragment.LJLJLLL.setBackgroundColor(c50240Jng.LIZIZ);
        searchContainerFragment.Gl();
        searchContainerFragment.LJLLI.setTuxIcon(searchContainerFragment.wl());
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        VW3 vw3;
        if (!C48054ItW.LIZ() && (vw3 = this.LJLJJI) != null) {
            vw3.setOffscreenPageLimit(vw3.getCurrentItem());
        }
        C10K.LJII(300L).LJ(new AgS130S0100000_14(this, 2), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int currentItem;
        C50948Jz6 searchEnterParam;
        int LIZLLL;
        C50650JuI fetchOwnImmutableData;
        View view2;
        super.onViewCreated(view, bundle);
        this.LJLJJI = (VW3) view.findViewById(R.id.nd3);
        this.LJLJJL = (C0CM) view.findViewById(R.id.ncz);
        EcomSearchServiceImpl.LJJJJZI().LJ("query", this.LJLIL.getKeyword());
        if (C48054ItW.LIZ()) {
            C50368Jpk<AbsSearchBaseFragment> c50368Jpk = new C50368Jpk<>(this, mo49getActivity(), ((ArrayList) C50605JtZ.LIZIZ).size(), this.LLFF);
            this.LJLJL = c50368Jpk;
            c50368Jpk.LJZL = this.LJLIL;
            this.LJLJJL.setAdapter(c50368Jpk);
            this.LJLJJL.setSaveEnabled(false);
            this.LJLJJL.setVisibility(0);
            C0CJ c0cj = this.LJLLL;
            if (c0cj != null) {
                this.LJLJJL.LIZIZ(c0cj);
            }
            this.LJLJJL.LIZIZ(new C51075K2t(this));
        } else {
            C50370Jpm<AbsSearchBaseFragment> c50370Jpm = new C50370Jpm<>(getChildFragmentManager(), mo49getActivity(), ((ArrayList) C50605JtZ.LIZIZ).size(), this.LLFF);
            this.LJLJJLL = c50370Jpm;
            c50370Jpm.LJLLI = this.LJLIL;
            this.LJLJJI.setOffscreenPageLimit(0);
            this.LJLJJI.setAdapter(this.LJLJJLL);
            this.LJLJJI.setVisibility(0);
            C0C3 c0c3 = this.LJLLJ;
            if (c0c3 != null) {
                this.LJLJJI.addOnPageChangeListener(c0c3);
            }
        }
        if (C48054ItW.LIZ()) {
            this.LJLJI = false;
        } else {
            this.LJLJJI.setSmoothScrollEnabled(false);
        }
        this.LJLJLJ = (C80675VlP) view.findViewById(R.id.kyt);
        this.LJLJLLL = (C74053T4n) view.findViewById(R.id.h0f);
        if (((Number) C50929Jyn.LIZ.getValue()).intValue() == 2) {
            C51633KOf c51633KOf = new C51633KOf(mo49getActivity());
            if (C48054ItW.LIZ()) {
                view2 = this.LJLJJL;
            } else {
                view2 = this.LJLJJI;
            }
            c51633KOf.setLayoutPosition(view2);
        }
        C2068389v c2068389v = new C2068389v();
        this.LJLLILLLL = c2068389v;
        c2068389v.LIZ = R.raw.icon_control;
        this.LJLLI = (TuxIconView) view.findViewById(R.id.f_k);
        this.LJLL = view.findViewById(R.id.jgt);
        C16880lQ.LJJJ(this.LJLLI, new ACListenerS43S0200000_8(this, view, 6));
        if (KB1.LJII(KB1.LIZ(this.LJLIL.getSearchEnterParam())) && (fetchOwnImmutableData = C50652JuK.fetchOwnImmutableData(this)) != null && fetchOwnImmutableData.getSearchEcommerceModel().getSingleTabType().equals(KAK.SHOP.getTabName())) {
            view.findViewById(R.id.gko).setVisibility(8);
            this.LJLL.setVisibility(8);
        }
        this.LJZI = TextUtils.equals("dark", C50238Jne.LIZLLL());
        this.LJLJLLL.setVisibility(0);
        Gl();
        this.LJLJLLL.setHorizontalFadingEdgeEnabled(false);
        this.LJLJLLL.LIZ(new C51069K2n());
        this.LJLJLLL.LIZ(new C51068K2m(this));
        this.LJLJLLL.LIZ(new C51065K2j(this));
        if (C48054ItW.LIZ()) {
            currentItem = this.LJLJJL.getCurrentItem();
        } else {
            currentItem = this.LJLJJI.getCurrentItem();
        }
        Hl(currentItem);
        K5W k5w = this.LLFZ;
        if (k5w != null) {
            this.LJLJLLL.LIZ(k5w);
        }
        C50948Jz6 searchEnterParam2 = this.LJLIL.getSearchEnterParam();
        if (searchEnterParam2 != null && searchEnterParam2.getHideTabs()) {
            this.LJLJLJ.setVisibility(8);
            this.LJLL.setVisibility(8);
            if (C48054ItW.LIZ()) {
                this.LJLJJL.setUserInputEnabled(false);
            } else {
                this.LJLJJI.setSwipeable(false);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.jev);
        if (this.LLFFF != null && C49804Jge.LJJIZ()) {
            if (viewGroup != null) {
                viewGroup.post(new IDRunnableS0S0201000(2, this, viewGroup, 11));
            }
            this.LLFFF.LJLJLLL.observe(this, new AObserverS71S0100000_3(viewGroup, 34));
        }
        if (C48054ItW.LIZ()) {
            C51062K2g c51062K2g = new C51062K2g(this);
            this.LJLLL = c51062K2g;
            C0CM c0cm = this.LJLJJL;
            if (c0cm != null) {
                c0cm.LIZIZ(c51062K2g);
            }
        } else {
            C51061K2f c51061K2f = new C51061K2f(this);
            this.LJLLJ = c51061K2f;
            VW3 vw3 = this.LJLJJI;
            if (vw3 != null) {
                vw3.addOnPageChangeListener(c51061K2f);
            }
        }
        this.LJLLLL.jv0().observe(this, new AObserverS70S0100000_2(this, 211));
        AObjectS42S0101000_5 aObjectS42S0101000_5 = new AObjectS42S0101000_5(4, this, 38);
        Activity LIZIZ = C27740Aue.LIZIZ(view);
        o.LJII(LIZIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        com.bytedance.ies.sdk.widgets.NextLiveData<C31610Cas> nextLiveData = ((SearchTabViewModel) ViewModelProviders.of((ActivityC45651qj) LIZIZ).get(SearchTabViewModel.class)).LJLIL;
        C51074K2s c51074K2s = new C51074K2s();
        c51074K2s.LJLIL = aObjectS42S0101000_5;
        nextLiveData.observe(this, c51074K2s, true);
        SearchResultParam searchResultParam = this.LJLIL;
        if (searchResultParam != null) {
            String recreateTabName = searchResultParam.getRecreateTabName();
            if ((recreateTabName != null && !recreateTabName.isEmpty() && (LIZLLL = C50605JtZ.LIZLLL(recreateTabName)) >= 0) || ((searchEnterParam = this.LJLIL.getSearchEnterParam()) != null && searchEnterParam.getTargetTab() != null && (LIZLLL = C50605JtZ.LIZLLL(searchEnterParam.getTargetTab().getTabName())) >= 0)) {
                C50431Jql fetchOwnGlobalData = C50652JuK.fetchOwnGlobalData(this);
                if (fetchOwnGlobalData != null) {
                    fetchOwnGlobalData.setSearchLastShowPageIndex(LIZLLL);
                }
                SearchServiceImpl.LLLZI().LLLLLILLIL(this).j4(new KEZ(LIZLLL));
                ECommerceService.createIECommerceServicebyMonsterPlugin(false).setSearchResultTabNameFlag(C50676Jui.LIZIZ(LIZLLL));
                Dl(LIZLLL);
            } else {
                int index = this.LJLIL.getIndex();
                if (index != 0) {
                    ECommerceService.createIECommerceServicebyMonsterPlugin(false).setSearchResultTabNameFlag(C50676Jui.LIZJ(index));
                    Dl(index);
                }
            }
        }
        this.LJZ.gv0().observe(this, new IDObserverS9S0101000(2, this, 10));
        this.LJZ.hv0().observe(this, new AObserverS58S0101000_2(1, this, 17));
        this.LJZ.iv0().observe(this, new AObserverS58S0101000_2(2, this, 19));
        this.LJZL = new SurveyViewController();
        if (mo49getActivity() != null) {
            SurveyViewController surveyViewController = this.LJZL;
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.ji2);
            ActivityC45651qj activity = mo49getActivity();
            surveyViewController.getClass();
            o.LJIIIZ(viewStub, "viewStub");
            o.LJIIIZ(activity, "activity");
            surveyViewController.LJLIL = viewStub;
            surveyViewController.LJLILLLLZI = activity;
            C68182ly.LIZIZ(((SurveyViewModel) surveyViewController.LJLLL.getValue()).LJLILLLLZI, activity, new AObserverS76S0100000_8(surveyViewController, 145));
        }
        C9XU.LIZIZ(mo49getActivity(), this);
        this.LJLJLLL.post(new ARunnableS12S0101000_8(6, this, 5));
        if (((Number) C51080K2y.LIZ.getValue()).intValue() == 1) {
            C8VV.LIZ(this, false, new AqS174S0100000_8(this, 157));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LIZ;
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        if (C49804Jge.LJJIZ()) {
            LIZ = C50238Jne.LIZ(R.layout.cg1, inflater, viewGroup);
        } else {
            LIZ = C50238Jne.LIZ(R.layout.cg0, inflater, viewGroup);
        }
        try {
            ViewTreeLifecycleOwner.set(LIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZ, this);
            C10A.LIZIZ(LIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZ;
    }
}

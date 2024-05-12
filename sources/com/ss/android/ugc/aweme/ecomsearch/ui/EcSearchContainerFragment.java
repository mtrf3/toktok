package com.ss.android.ugc.aweme.ecomsearch.ui;

import X.AOY;
import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.AnonymousClass977;
import X.C0C3;
import X.C0CJ;
import X.C0CM;
import X.C10A;
import X.C10K;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C29615Bjn;
import X.C29S;
import X.C2L4;
import X.C39468FeK;
import X.C3C5;
import X.C48054ItW;
import X.C48658J7u;
import X.C49814Jgo;
import X.C50287JoR;
import X.C50431Jql;
import X.C50558Jso;
import X.C50650JuI;
import X.C50652JuK;
import X.C50948Jz6;
import X.C50990Jzm;
import X.C51193K7h;
import X.C51213K8b;
import X.C51214K8c;
import X.C51215K8d;
import X.C51216K8e;
import X.C51217K8f;
import X.C51219K8h;
import X.C51220K8i;
import X.C51221K8j;
import X.C51222K8k;
import X.C51223K8l;
import X.C51226K8o;
import X.C51227K8p;
import X.C51228K8q;
import X.C51229K8r;
import X.C51230K8s;
import X.C51231K8t;
import X.C51232K8u;
import X.C51244K9g;
import X.C74053T4n;
import X.C76800UCe;
import X.C76965UIn;
import X.C79045V0n;
import X.C90903hW;
import X.C9XU;
import X.G27;
import X.InterfaceC50157JmL;
import X.K0M;
import X.K7Z;
import X.K87;
import X.K8R;
import X.KAK;
import X.KBE;
import X.KEM;
import X.KEZ;
import X.KJL;
import X.KJZ;
import X.QD3;
import X.QZP;
import X.T1V;
import X.VW3;
import X.WM7;
import Y.AObjectS42S0101000_5;
import Y.AObjectS44S0101000_8;
import Y.ARunnableS8S0201000_5;
import Y.IDiS270S0100000_8;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager2.adapter.EcAdapterStateViewModel;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchTabViewModel;
import com.ss.android.ugc.aweme.keyword.SearchKeywordViewModel;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class EcSearchContainerFragment extends AmeBaseFragment implements G27, C2L4 {
    public static final /* synthetic */ int LL = 0;
    public SearchResultParam LJLIL;
    public boolean LJLILLLLZI = true;
    public boolean LJLJI = true;
    public VW3 LJLJJI;
    public C0CM LJLJJL;
    public C51219K8h<AbsSearchBaseFragment> LJLJJLL;
    public KJZ<AbsSearchBaseFragment> LJLJL;
    public C74053T4n LJLJLJ;
    public View LJLJLLL;
    public C0C3 LJLL;
    public C0CJ LJLLI;
    public EcSearchStartViewModel LJLLILLLL;
    public SearchKeywordViewModel LJLLJ;
    public int LJLLL;
    public SearchEnterViewModel LJLLLL;
    public EcAdapterStateViewModel LJLLLLLL;
    public KEM LJLZ;
    public Long LJZ;
    public boolean LJZI;
    public K7Z LJZL;

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
        return C76965UIn.LIZ(EcSearchContainerFragmentScope.class);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", System.currentTimeMillis() - this.LJZ.longValue());
            jSONObject.put("enter_method", "destroy");
            jSONObject.put("next_tab", "");
            jSONObject.put("search_entrance", this.LJLIL.getSearchEnterParam().getEnterSearchFrom());
            jSONObject.put("search_id", vl().LJLJJI.getSearchId());
            jSONObject.put("search_keyword", this.LJLIL.getKeyword());
            jSONObject.put("current_tab", C51214K8c.LJ(this.LJLLL));
            C48658J7u.LIZIZ("rd_ec_search_switch_tab_finish", jSONObject);
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    public final AbsSearchBaseFragment vl() {
        int i;
        AbsSearchBaseFragment absSearchBaseFragment;
        if (this.LJLLILLLL.hv0().getValue() != null) {
            i = this.LJLLILLLL.hv0().getValue().intValue();
        } else {
            i = 0;
        }
        if (C48054ItW.LIZ()) {
            return this.LJLJJLL.LJLZ.get(Integer.valueOf(i));
        }
        KJZ<AbsSearchBaseFragment> kjz = this.LJLJL;
        HashMap<Integer, AbsSearchBaseFragment> hashMap = kjz.LJLJLJ;
        if (hashMap == null || hashMap.size() == 0) {
            absSearchBaseFragment = null;
        } else {
            absSearchBaseFragment = kjz.LJLJLJ.get(Integer.valueOf(i));
        }
        return absSearchBaseFragment;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJZI = true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJZI = false;
        K87.LIZ = (EcSearchTabViewModel) ViewModelProviders.of(mo49getActivity()).get(EcSearchTabViewModel.class);
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

    public final void wl() {
        if (vl() != null) {
            if (mo49getActivity() != null) {
                C50558Jso.LIZIZ(mo49getActivity(), vl());
            }
            C50652JuK.updateContextSource(mo49getActivity(), new AObjectS44S0101000_8(2, this, 0));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
    }

    public final void Al(SearchResultParam searchResultParam) {
        ArrayList arrayList;
        C51222K8k c51222K8k;
        C51193K7h c51193K7h = this.LJLLILLLL.LJZ;
        if (c51193K7h != null && (c51222K8k = c51193K7h.LIZ) != null) {
            c51222K8k.setShopId(null);
            c51222K8k.setCreatorId(null);
        }
        this.LJLIL = searchResultParam;
        C39468FeK.LJIIL("query", searchResultParam.getKeyword());
        if (isViewValid()) {
            C51221K8j.LIZ(getContext(), searchResultParam);
            if (C48054ItW.LIZ()) {
                this.LJLJJLL.LJZL = this.LJLIL;
            } else {
                this.LJLJL.LJLLI = this.LJLIL;
            }
        }
        if (!isViewValid()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(WM7.SCENE_SERVICE, "shop_fragment_refreshData_error");
                jSONObject.put("enter_from", searchResultParam.getSearchEnterParam().getEnterSearchFrom());
                jSONObject.put("enter_method", searchResultParam.getEnterMethod());
                C48658J7u.LIZIZ("rd_ec_search_request_trace", jSONObject);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (C48054ItW.LIZ()) {
            C51219K8h<AbsSearchBaseFragment> c51219K8h = this.LJLJJLL;
            c51219K8h.getClass();
            arrayList = new ArrayList(c51219K8h.LJLZ.values());
        } else {
            KJZ<AbsSearchBaseFragment> kjz = this.LJLJL;
            kjz.getClass();
            arrayList = new ArrayList(kjz.LJLJLJ.values());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbsSearchBaseFragment) it.next()).Gl(this.LJLIL);
        }
    }

    public final void Dl(int i) {
        AbsSearchBaseFragment absSearchBaseFragment;
        AbsSearchBaseFragment absSearchBaseFragment2;
        boolean z;
        C49814Jgo value = this.LJLLJ.gv0().getValue();
        if (value != null && !TextUtils.isEmpty(value.LJLIL)) {
            this.LJLLJ.gv0().setValue(new C49814Jgo(value.LJLIL, ""));
        }
        this.LJLLILLLL.hv0().setValue(Integer.valueOf(i));
        InterfaceC50157JmL LIZ = K0M.LIZ();
        if (LIZ != null) {
            LIZ.LIZ(i);
        }
        wl();
        if (C48054ItW.LIZ()) {
            absSearchBaseFragment2 = this.LJLJJLL.LJLZ.get(Integer.valueOf(i));
        } else {
            KJZ<AbsSearchBaseFragment> kjz = this.LJLJL;
            HashMap<Integer, AbsSearchBaseFragment> hashMap = kjz.LJLJLJ;
            if (hashMap == null || hashMap.size() == 0) {
                absSearchBaseFragment = null;
            } else {
                absSearchBaseFragment = kjz.LJLJLJ.get(Integer.valueOf(i));
            }
            absSearchBaseFragment2 = absSearchBaseFragment;
        }
        if (absSearchBaseFragment2 != null) {
            C50287JoR c50287JoR = absSearchBaseFragment2.LJLJI;
            boolean z2 = false;
            if (c50287JoR != null) {
                NextLiveData<Boolean> iv0 = this.LJLLILLLL.iv0();
                if (!c50287JoR.isDefaultOption() && !c50287JoR.isFromSchema()) {
                    z = true;
                } else {
                    z = false;
                }
                iv0.setValue(Boolean.valueOf(z));
            } else {
                this.LJLLILLLL.iv0().setValue(Boolean.FALSE);
            }
            if (C51214K8c.LJ(i).equals("shop")) {
                NextLiveData<Boolean> gv0 = this.LJLLILLLL.gv0();
                if (absSearchBaseFragment2.wl() && absSearchBaseFragment2.LJLILLLLZI) {
                    z2 = true;
                }
                gv0.setValue(Boolean.valueOf(z2));
                return;
            }
            if (i == 0) {
                this.LJLLILLLL.gv0().setValue(Boolean.TRUE);
                return;
            }
            NextLiveData<Boolean> iv02 = this.LJLLILLLL.iv0();
            Boolean bool = Boolean.FALSE;
            iv02.setValue(bool);
            this.LJLLILLLL.gv0().setValue(bool);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LJLIL == null && getArguments() != null) {
            this.LJLIL = (SearchResultParam) getArguments().getSerializable("search_param");
            C51221K8j.LIZ(mo49getActivity(), this.LJLIL);
        }
        this.LJLLILLLL = (EcSearchStartViewModel) ViewModelProviders.of(mo49getActivity()).get(EcSearchStartViewModel.class);
        this.LJLLJ = (SearchKeywordViewModel) ViewModelProviders.of(mo49getActivity()).get(SearchKeywordViewModel.class);
        this.LJLLLL = (SearchEnterViewModel) ViewModelProviders.of(mo49getActivity()).get(SearchEnterViewModel.class);
        this.LJLLLLLL = (EcAdapterStateViewModel) ViewModelProviders.of(mo49getActivity()).get(EcAdapterStateViewModel.class);
        new QZP();
        C51226K8o c51226K8o = new C51226K8o(this);
        C51223K8l c51223K8l = new C51223K8l(this);
        this.LJLZ = new KEM(c51226K8o, new T1V(), new C51213K8b(this), c51223K8l);
    }

    @QD3
    public void onSearchViewAllEvent(K8R k8r) {
        if (C48054ItW.LIZ()) {
            if (this.LJLJJL == null) {
                return;
            }
        } else if (this.LJLJJI == null) {
            return;
        }
        C50990Jzm.LIZIZ = true;
        C50990Jzm.LIZJ = true;
        C50990Jzm.LIZLLL = true;
        if (k8r.LJLILLLLZI != null) {
            this.LJLIL.setIsFilterFromSchema(true);
            this.LJLIL.setFilterOption(k8r.LJLILLLLZI);
        }
        Map<String, Object> map = k8r.LJLJI;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                this.LJLIL.getEcomRecomSearchParamMap().put(entry.getKey(), entry.getValue());
                if (entry.getKey().equals("attach_products") && (entry.getValue() instanceof String)) {
                    this.LJLIL.setResultAttachCard(new C51244K9g(KBE.PRODUCT_CARD, (String) entry.getValue(), null, null, null));
                }
            }
        }
        if (C48054ItW.LIZ()) {
            this.LJLJJL.post(new ARunnableS8S0201000_5(2, this, k8r, 9));
        } else {
            this.LJLJJI.post(new ARunnableS8S0201000_5(1, this, k8r, 0));
        }
    }

    public final void xl(int i) {
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

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        VW3 vw3;
        if (!C48054ItW.LIZ() && (vw3 = this.LJLJJI) != null) {
            vw3.setOffscreenPageLimit(vw3.getCurrentItem());
        }
        C10K.LJII(300L).LJ(new AOY(0), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String str;
        int currentItem;
        C50948Jz6 searchEnterParam;
        int LIZIZ;
        super.onViewCreated(view, bundle);
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            SearchResultParam searchResultParam = this.LJLIL;
            String str2 = "";
            if (searchResultParam == null) {
                str = "";
            } else {
                String enterMethod = searchResultParam.getEnterMethod();
                C50948Jz6 searchEnterParam2 = searchResultParam.getSearchEnterParam();
                if (searchEnterParam2 != null) {
                    str2 = searchEnterParam2.getEnterSearchFrom();
                }
                str = str2;
                str2 = enterMethod;
            }
            jSONObject.put(WM7.SCENE_SERVICE, "container_view_create");
            jSONObject.put("is_native_request", i);
            jSONObject.put("enter_method", str2);
            jSONObject.put("enter_from", str);
            C48658J7u.LIZIZ("rd_ec_search_request_trace", jSONObject);
            VW3 vw3 = (VW3) view.findViewById(R.id.nd3);
            this.LJLJJI = vw3;
            vw3.setBackgroundColor(C79045V0n.LJI(R.attr.cl, getContext()).intValue());
            C0CM c0cm = (C0CM) view.findViewById(R.id.ncz);
            this.LJLJJL = c0cm;
            c0cm.setBackgroundColor(C79045V0n.LJI(R.attr.cl, getContext()).intValue());
            C39468FeK.LJIIL("query", this.LJLIL.getKeyword());
            C50948Jz6 searchEnterParam3 = this.LJLIL.getSearchEnterParam();
            if (searchEnterParam3 != null && searchEnterParam3.getEcSearchEntranceData() != null && searchEnterParam3.getEcSearchEntranceData().getResultBgUrl() != null) {
                this.LJLJJI.setBackgroundColor(0);
                this.LJLJJL.setBackgroundColor(0);
            }
            if (C48054ItW.LIZ()) {
                C51219K8h<AbsSearchBaseFragment> c51219K8h = new C51219K8h<>(this, mo49getActivity(), ((ArrayList) C51214K8c.LIZIZ).size(), this.LJLZ);
                this.LJLJJLL = c51219K8h;
                c51219K8h.LJZL = this.LJLIL;
                this.LJLJJL.setAdapter(c51219K8h);
                this.LJLJJL.setSaveEnabled(false);
                this.LJLJJL.setVisibility(0);
                C0CJ c0cj = this.LJLLI;
                if (c0cj != null) {
                    this.LJLJJL.LIZIZ(c0cj);
                }
                this.LJLJJL.LIZIZ(new C51230K8s(this));
            } else {
                FragmentManager childFragmentManager = getChildFragmentManager();
                ActivityC45651qj mo49getActivity = mo49getActivity();
                List<KAK> list = C51214K8c.LIZIZ;
                KJZ<AbsSearchBaseFragment> kjz = new KJZ<>(childFragmentManager, mo49getActivity, ((ArrayList) list).size(), this.LJLZ);
                this.LJLJL = kjz;
                kjz.LJLLI = this.LJLIL;
                this.LJLJJI.setOffscreenPageLimit(((ArrayList) list).size());
                this.LJLJJI.setAdapter(this.LJLJL);
                this.LJLJJI.setVisibility(0);
                C0C3 c0c3 = this.LJLL;
                if (c0c3 != null) {
                    this.LJLJJI.addOnPageChangeListener(c0c3);
                }
            }
            if (C48054ItW.LIZ()) {
                this.LJLJI = false;
            } else {
                this.LJLJJI.setSmoothScrollEnabled(false);
            }
            this.LJLJLJ = (C74053T4n) view.findViewById(R.id.h0f);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LJI = 0;
            this.LJLJLJ.setTabSelectedIndicator(c110614Vt.LIZ(getContext()));
            this.LJLJLJ.setBackgroundColor(0);
            new C2068389v();
            this.LJLJLLL = view.findViewById(R.id.jgt);
            C50650JuI fetchOwnImmutableData = C50652JuK.fetchOwnImmutableData(this);
            if (fetchOwnImmutableData != null && !fetchOwnImmutableData.getSearchEcommerceModel().getSingleTabType().isEmpty()) {
                view.findViewById(R.id.gko).setVisibility(8);
                this.LJLJLLL.setVisibility(8);
            }
            this.LJLJLJ.setVisibility(0);
            if (C48054ItW.LIZ()) {
                C51216K8e c51216K8e = new C51216K8e(this.LJLJLJ, this.LJLJJL, new C51217K8f(1, this), this.LJLJI);
                if (!c51216K8e.LJI) {
                    AbstractC029409q<?> adapter = c51216K8e.LIZIZ.getAdapter();
                    c51216K8e.LJFF = adapter;
                    if (adapter != null) {
                        c51216K8e.LJI = true;
                        c51216K8e.LIZIZ.LIZIZ(new C51220K8i(c51216K8e.LIZ));
                        c51216K8e.LIZ.LIZ(new C51227K8p(c51216K8e.LIZIZ, c51216K8e.LJ));
                        if (c51216K8e.LIZJ) {
                            C51229K8r c51229K8r = new C51229K8r(c51216K8e);
                            AbstractC029409q<?> abstractC029409q = c51216K8e.LJFF;
                            if (abstractC029409q != null) {
                                abstractC029409q.registerAdapterDataObserver(c51229K8r);
                            }
                        }
                        c51216K8e.LIZ();
                        c51216K8e.LIZ.LJIILIIL(c51216K8e.LIZIZ.getCurrentItem(), 0.0f, true, true);
                    } else {
                        "TabLayoutMediator attached before ViewPager2 has an adapter".toString();
                        throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
                    }
                } else {
                    "TabLayoutMediator is already attached".toString();
                    throw new IllegalStateException("TabLayoutMediator is already attached");
                }
            } else {
                this.LJLJLJ.setupWithViewPager(this.LJLJJI);
            }
            this.LJLJLJ.setHorizontalFadingEdgeEnabled(false);
            this.LJLJLJ.LIZ(new C51232K8u(this));
            this.LJLJLJ.LIZ(new C51215K8d(this));
            if (C48054ItW.LIZ()) {
                currentItem = this.LJLJJL.getCurrentItem();
            } else {
                currentItem = this.LJLJJI.getCurrentItem();
            }
            Dl(currentItem);
            K7Z k7z = this.LJZL;
            if (k7z != null) {
                this.LJLJLJ.LIZ(k7z);
            }
            C50948Jz6 searchEnterParam4 = this.LJLIL.getSearchEnterParam();
            if (searchEnterParam4 != null && searchEnterParam4.getHideTabs()) {
                this.LJLJLLL.setVisibility(8);
                if (C48054ItW.LIZ()) {
                    this.LJLJJL.setUserInputEnabled(false);
                } else {
                    this.LJLJJI.setSwipeable(false);
                }
            }
            if (C48054ItW.LIZ()) {
                C51231K8t c51231K8t = new C51231K8t(this);
                this.LJLLI = c51231K8t;
                C0CM c0cm2 = this.LJLJJL;
                if (c0cm2 != null) {
                    c0cm2.LIZIZ(c51231K8t);
                }
            } else {
                IDiS270S0100000_8 iDiS270S0100000_8 = new IDiS270S0100000_8(this, 0);
                this.LJLL = iDiS270S0100000_8;
                VW3 vw32 = this.LJLJJI;
                if (vw32 != null) {
                    vw32.addOnPageChangeListener(iDiS270S0100000_8);
                }
            }
            this.LJZ = Long.valueOf(System.currentTimeMillis());
            AObjectS42S0101000_5 aObjectS42S0101000_5 = new AObjectS42S0101000_5(4, this, 22);
            com.bytedance.ies.sdk.widgets.NextLiveData<C29615Bjn> nextLiveData = AnonymousClass977.LIZ(view).LJLIL;
            C51228K8q c51228K8q = new C51228K8q();
            c51228K8q.LJLIL = aObjectS42S0101000_5;
            nextLiveData.observe(this, c51228K8q, true);
            SearchResultParam searchResultParam2 = this.LJLIL;
            if (searchResultParam2 != null) {
                String recreateTabName = searchResultParam2.getRecreateTabName();
                if ((recreateTabName != null && !recreateTabName.isEmpty() && (LIZIZ = C51214K8c.LIZIZ(recreateTabName)) >= 0) || ((searchEnterParam = this.LJLIL.getSearchEnterParam()) != null && searchEnterParam.getTargetTab() != null && (LIZIZ = C51214K8c.LIZIZ(searchEnterParam.getTargetTab().getTabName())) >= 0)) {
                    C50431Jql fetchOwnGlobalData = C50652JuK.fetchOwnGlobalData(this);
                    if (fetchOwnGlobalData != null) {
                        fetchOwnGlobalData.setSearchLastShowPageIndex(LIZIZ);
                    }
                    SearchServiceImpl.LLLZI().LLLLLILLIL(this).j4(new KEZ(LIZIZ));
                    xl(LIZIZ);
                } else {
                    int index = this.LJLIL.getIndex();
                    if (index != 0) {
                        xl(index);
                    }
                }
            }
            C9XU.LIZIZ(mo49getActivity(), this);
            AnonymousClass977.LIZ(view).LJLILLLLZI = new KJL((ViewGroup) view.findViewById(R.id.gko), view, (ViewGroup) view.findViewById(R.id.j66), new AObjectS42S0101000_5(4, this, 23));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aos, viewGroup, false);
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

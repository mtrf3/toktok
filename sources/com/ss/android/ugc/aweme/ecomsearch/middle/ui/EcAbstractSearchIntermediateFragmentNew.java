package com.ss.android.ugc.aweme.ecomsearch.middle.ui;

import X.AbstractC029409q;
import X.AbstractC030309z;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C04270Et;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C37190Eig;
import X.C3A5;
import X.C3C5;
import X.C48658J7u;
import X.C50321Joz;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50948Jz6;
import X.C51090K3i;
import X.C51141K5h;
import X.C51203K7r;
import X.C51239K9b;
import X.C51249K9l;
import X.C51252K9o;
import X.C51299KBj;
import X.C55230Lly;
import X.C5H3;
import X.C5S1;
import X.C65232Piu;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78685UuP;
import X.C78840Uwu;
import X.C78866UxK;
import X.C7MY;
import X.C90903hW;
import X.FMX;
import X.InterfaceC178696zp;
import X.InterfaceC45601Hv3;
import X.InterfaceC50547Jsd;
import X.InterfaceC50548Jse;
import X.InterfaceC50670Juc;
import X.InterfaceC51113K4f;
import X.InterfaceC51505KJh;
import X.JTO;
import X.K6B;
import X.K75;
import X.K7B;
import X.K8T;
import X.K9C;
import X.KA2;
import X.KAB;
import X.KAH;
import X.KAI;
import X.KAK;
import X.KAL;
import X.KB1;
import X.KBQ;
import X.KBV;
import X.KCA;
import X.KCL;
import X.KCO;
import X.RunnableC51616KNo;
import X.WM7;
import X.Z9N;
import Y.ACallableS85S0200000_8;
import Y.AObjectS137S0100000_8;
import Y.AObserverS76S0100000_8;
import Y.AgS25S0210000_8;
import Y.IDrS13S0000000_8;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.ecomsearch.middle.utils.EcSearchSugMobHelper;
import com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.impl.OptimizerHelperServiceImpl;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class EcAbstractSearchIntermediateFragmentNew extends AmeBaseFragment implements K6B, KCL, InterfaceC51505KJh {
    public RecyclerView LJLIL;
    public ViewGroup LJLILLLLZI;
    public C51252K9o LJLJJI;
    public EcSearchIntermediateViewModelNew LJLJJL;
    public SearchStateViewModel LJLJJLL;
    public SearchKeywordPresenter LJLJL;
    public SugKeywordPresenter LJLJLJ;
    public int LJLJLLL;
    public EcSearchSugMobHelper LJLLI;
    public int LJLLL;
    public Integer LJLLLL;
    public boolean LJLLLLLL;
    public K75 LJLZ;
    public final ISearchMiddleForECService LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();
    public final C5H3 LJLJI = C78866UxK.LJJLIIIJLJLI(new AqS158S0100000_8(this, 75));
    public String LJLL = "";
    public final C5H3 LJLLILLLL = C78866UxK.LJJLIIIJLJLI(new AqS158S0100000_8(this, 74));
    public final C5H3 LJLLJ = C78866UxK.LJJLIIIJLJLI(C51299KBj.LJLIL);

    @Override // X.K6B
    public final int N6() {
        return 0;
    }

    public void Ol() {
        InterfaceC51113K4f LJI;
        this.LJLJLLL = 1;
        K75 k75 = this.LJLZ;
        if (k75 != null && (LJI = k75.LJI()) != null) {
            LJI.LIZLLL();
        }
        this.LJLL = "";
        ((CopyOnWriteArrayList) this.LJLLJ.getValue()).clear();
        List<SearchSugEntity> list = Ml().LJLIL;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        ((CopyOnWriteArrayList) this.LJLLJ.getValue()).addAll(xl());
        C51249K9l.LIZ(this.LJZ, mo49getActivity());
        OptimizerHelperServiceImpl.LJIIIZ().LIZLLL();
        if (K7B.LJLILLLLZI.LJJII() && (getContext() instanceof InterfaceC45601Hv3)) {
            Object context = getContext();
            o.LJII(context, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.AsyncInflaterOwner");
            InterfaceC45601Hv3 interfaceC45601Hv3 = (InterfaceC45601Hv3) context;
            if (KCO.LIZ(interfaceC45601Hv3.getInflater())) {
                C37190Eig.LIZ.post(new RunnableC51616KNo(2, interfaceC45601Hv3));
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.K6B
    public final void xc(SearchSugEntity entity) {
        o.LJIIIZ(entity, "entity");
    }

    public EcAbstractSearchIntermediateFragmentNew() {
        ISearchMiddleForECService LJJJJLI = SearchMiddleForEcService.LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "get().getService(ISearch…ForECService::class.java)");
        this.LJZ = LJJJJLI;
    }

    private final String f1() {
        SugKeywordPresenter sugKeywordPresenter = this.LJLJLJ;
        if (sugKeywordPresenter != null) {
            return sugKeywordPresenter.LIZ();
        }
        return "";
    }

    public final EcSearchIntermediateViewModelNew Al() {
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LJLJJL;
        if (ecSearchIntermediateViewModelNew != null) {
            return ecSearchIntermediateViewModelNew;
        }
        o.LJIJI("intermediateViewModel");
        throw null;
    }

    public final String Dl() {
        C51141K5h c51141K5h = C51141K5h.LIZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c51141K5h.getClass();
        if (C51141K5h.LIZ(mo49getActivity)) {
            return SearchMiddleForEcService.LJJJJLI().LJJJJI(Hl());
        }
        return KAI.LIZ(Hl());
    }

    public final RecyclerView Gl() {
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("listView");
        throw null;
    }

    public final int Hl() {
        InterfaceC178696zp LIZIZ;
        K75 k75 = this.LJLZ;
        if (k75 != null && (LIZIZ = k75.LIZIZ()) != null) {
            return LIZIZ.LIZIZ();
        }
        return -1;
    }

    public final ViewGroup Il() {
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("rnFragment");
        throw null;
    }

    public final String Ll() {
        C51141K5h c51141K5h = C51141K5h.LIZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c51141K5h.getClass();
        if (C51141K5h.LIZ(mo49getActivity)) {
            return SearchMiddleForEcService.LJJJJLI().LJJJJJL(Hl());
        }
        return KAI.LIZJ(Hl());
    }

    public final KBQ Ml() {
        return (KBQ) this.LJLJI.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
    
        if (r13 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Pl() {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew.Pl():void");
    }

    public final void Rl() {
        String LIZIZ = C3A5.LIZ.LIZIZ(Ml().LJLILLLLZI);
        C51203K7r c51203K7r = new C51203K7r();
        c51203K7r.LJIILL("action_type", "show");
        c51203K7r.LJIILL("sug_keyword", f1());
        c51203K7r.LJIILL("log_pb", LIZIZ);
        c51203K7r.LJIILL("search_type", Dl());
        c51203K7r.LJIILIIL();
    }

    public final List<SearchHistory> xl() {
        List<SearchHistory> LJFF = ((InterfaceC50670Juc) this.LJLLILLLL.getValue()).LJFF(0);
        o.LJIIIIZZ(LJFF, "historyManager.getSearch…yByType(getHistoryType())");
        return LJFF;
    }

    public final Integer Jl() {
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz6 != null) {
            return Integer.valueOf(c50948Jz6.getEcSearchEntranceValue());
        }
        return null;
    }

    public final String Kl() {
        String enterSearchFrom;
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz6 == null || TextUtils.isEmpty(c50948Jz6.getEnterSearchFrom()) || (enterSearchFrom = c50948Jz6.getEnterSearchFrom()) == null) {
            return "";
        }
        return enterSearchFrom;
    }

    public final String Nl() {
        if (Hl() == -1) {
            return Kl();
        }
        C51141K5h c51141K5h = C51141K5h.LIZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c51141K5h.getClass();
        if (C51141K5h.LIZ(mo49getActivity)) {
            String LJJJJI = SearchMiddleForEcService.LJJJJLI().LJJJJI(Hl());
            if (LJJJJI != null) {
                return LJJJJI;
            }
            return "";
        }
        return KAI.LIZ(Hl());
    }

    public boolean Ql() {
        K75 k75;
        InterfaceC50548Jse LIZ;
        InterfaceC50548Jse LIZ2;
        Integer valueOf;
        InterfaceC50548Jse LIZ3;
        if (!isViewValid() || !getUserVisibleHint()) {
            return false;
        }
        K75 k752 = this.LJLZ;
        if ((k752 == null || (LIZ3 = k752.LIZ()) == null || LIZ3.LIZ() != this.LJLJLLL) && (k75 = this.LJLZ) != null && (LIZ = k75.LIZ()) != null) {
            LIZ.LIZIZ(this.LJLJLLL);
        }
        K75 k753 = this.LJLZ;
        if (k753 == null || (LIZ2 = k753.LIZ()) == null || (valueOf = Integer.valueOf(LIZ2.LIZ())) == null) {
            return false;
        }
        if (valueOf.intValue() == 1) {
            Ol();
        } else if (valueOf.intValue() == 2) {
            Pl();
        } else if (valueOf.intValue() == 0) {
            this.LJLJLLL = 0;
        }
        return true;
    }

    public final boolean Sl() {
        boolean z;
        boolean z2;
        boolean z3;
        HashMap<?, ?> hashMap;
        InterfaceC51113K4f LJI;
        String Kl = Kl();
        C51141K5h c51141K5h = C51141K5h.LIZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c51141K5h.getClass();
        if (C51141K5h.LIZ(mo49getActivity)) {
            z = SearchMiddleForEcService.LJJJJLI().LJJIJIIJIL((EcDynamicSingleIntermediateFragmentNew) this);
        } else {
            String LIZ = C51090K3i.LIZ();
            LinkedHashMap linkedHashMap = (LinkedHashMap) C51090K3i.LIZIZ;
            KAL kal = (KAL) linkedHashMap.get(LIZ);
            long j = 0;
            if (kal == null || kal.LIZ != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                KAL kal2 = (KAL) linkedHashMap.get(LIZ);
                if (kal2 != null) {
                    j = kal2.LIZ;
                }
                if (currentTimeMillis - j <= C51090K3i.LIZ) {
                    z = true;
                }
            }
            z = false;
        }
        if (o.LJ(Kl, "homepage_hot") || o.LJ(Kl, "homepage_follow") || o.LJ(Kl, "homepage_friends") || o.LJ(Kl, "homepage_now")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C51141K5h.LIZ(mo49getActivity())) {
            z3 = SearchMiddleForEcService.LJJJJLI().LJJJI((EcDynamicSingleIntermediateFragmentNew) this);
        } else {
            KAL kal3 = (KAL) ((LinkedHashMap) C51090K3i.LIZIZ).get(C51090K3i.LIZ());
            if (kal3 != null && (hashMap = kal3.LIZJ) != null && hashMap.size() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (!z2) {
            return false;
        }
        K75 k75 = this.LJLZ;
        if ((k75 != null && (LJI = k75.LJI()) != null && LJI.LJ() && !KB1.LJII(KB1.LIZ(JTO.LIZ(mo49getActivity()).LJLIL))) || !z || z3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        OptimizerHelperServiceImpl.LJIIIZ().LIZLLL();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.LJLJLLL != 0 && (Gl().getAdapter() instanceof KBQ)) {
            AbstractC029409q adapter = Gl().getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecomsearch.middle.adapter.EcSearchSugAdapter");
            if (adapter.getItemCount() > 0) {
                Rl();
            }
        }
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
        C51249K9l.LIZ(this.LJZ, mo49getActivity());
        C51141K5h c51141K5h = C51141K5h.LIZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c51141K5h.getClass();
        if (C51141K5h.LIZ(mo49getActivity)) {
            SearchMiddleForEcService.LJJJJLI().LJJIIZI(this, "others");
        } else if (C51090K3i.LIZLLL != 0) {
            C51090K3i.LJ = System.currentTimeMillis();
            C51090K3i.LIZJ();
        }
        SearchStateViewModel searchStateViewModel = this.LJLJJLL;
        if (searchStateViewModel != null) {
            searchStateViewModel.setSearchPageVisible(false);
            SearchStateViewModel searchStateViewModel2 = this.LJLJJLL;
            if (searchStateViewModel2 != null) {
                searchStateViewModel2.setIsLeavingSearch(false);
                return;
            } else {
                o.LJIJI("searchStateViewModel");
                throw null;
            }
        }
        o.LJIJI("searchStateViewModel");
        throw null;
    }

    @Override // X.KCL
    public final void r0() {
        if (mo49getActivity() != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && mo49getActivity.isFinishing()) {
                return;
            }
            if (FMX.LIZJ("ttk_sug_success_rate")) {
                KAH kah = new KAH();
                kah.LJIILL("type", "no_data");
                kah.LJIILLIIL(Kl());
                kah.LJIJ(vl());
                String Ll = Ll();
                if (Ll == null) {
                    Ll = Kl();
                }
                kah.LJIILL("search_position", Ll);
                kah.LJIIZILJ(Jl());
                kah.LJIILIIL();
            }
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.im9);
            c5s1.LJ();
        }
    }

    public final int vl() {
        InterfaceC178696zp LIZIZ;
        if (mo49getActivity() instanceof EcSearchActivity) {
            K75 k75 = this.LJLZ;
            if (k75 != null && (LIZIZ = k75.LIZIZ()) != null) {
                return LIZIZ.LIZIZ();
            }
            return -1;
        }
        return this.LJLLL;
    }

    public final ECSearchEntranceData wl() {
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz6 != null) {
            return c50948Jz6.getEcSearchEntranceData();
        }
        return null;
    }

    @Override // X.K6B
    public final void z2() {
        String str;
        Integer num;
        String str2;
        String str3;
        KBQ Ml = Ml();
        String f1 = f1();
        String str4 = null;
        if (Ml.LJLIL == null || !f1.equals(Ml.LJLJLLL)) {
            return;
        }
        Iterator it = ((ArrayList) Ml.LJLIL).iterator();
        while (it.hasNext()) {
            SearchSugEntity searchSugEntity = (SearchSugEntity) it.next();
            SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo != null && sugExtraInfo.matchQuery()) {
                EcSearchSugMobHelper ecSearchSugMobHelper = this.LJLLI;
                if (ecSearchSugMobHelper == null) {
                    return;
                }
                if (Z9N.LIZIZ.LJIL(mo49getActivity())) {
                    str = KAI.LIZIZ(Hl());
                } else {
                    str = "discovery";
                }
                KCA kca = new KCA();
                Word word = searchSugEntity.mWord;
                if (word != null) {
                    num = Integer.valueOf(word.getWordPosition());
                } else {
                    num = null;
                }
                kca.LJIIZILJ(num);
                kca.LJIILL("words_source", "sug");
                kca.LJIILL("raw_query", ecSearchSugMobHelper.LJLILLLLZI);
                kca.LJIILL("words_content", searchSugEntity.content);
                LogPbBean logPbBean = ecSearchSugMobHelper.LJLIL;
                if (logPbBean != null) {
                    str2 = logPbBean.getImprId();
                } else {
                    str2 = null;
                }
                kca.LJIILL("impr_id", str2);
                RecommendWordMob recommendWordMob = ecSearchSugMobHelper.LJLJJI;
                if (recommendWordMob != null) {
                    str3 = recommendWordMob.getQueryId();
                } else {
                    str3 = null;
                }
                kca.LJIILL("query_id", str3);
                Word word2 = searchSugEntity.mWord;
                if (word2 != null) {
                    str4 = word2.getId();
                }
                kca.LJIILL("group_id", str4);
                kca.LJIILL("search_position", str);
                kca.LJIILIIL();
                return;
            }
        }
    }

    @Override // X.K6B
    public final void g3(SearchSugEntity entity) {
        o.LJIIIZ(entity, "entity");
        C51252K9o c51252K9o = this.LJLJJI;
        if (c51252K9o != null) {
            for (Map.Entry<String, EcSearchSugResponse> entry : c51252K9o.LJLJLLL.entrySet()) {
                Iterator<SearchSugEntity> it = entry.getValue().sugList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        SearchSugEntity next = it.next();
                        if (next.LIZ() && next.content.equals(entity.content)) {
                            c51252K9o.LJLJLLL.remove(entry.getKey());
                            break;
                        }
                    }
                }
            }
            return;
        }
        o.LJIJI("sugPresenter");
        throw null;
    }

    public void initView(View view) {
        this.LJLIL = (RecyclerView) C7MY.LIZLLL(view, "view", R.id.isn, "view.findViewById(R.id.recycler_view)");
        RecyclerView Gl = Gl();
        getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        wrapLinearLayoutManager.LLIIIL = new KA2(this);
        Gl.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView Gl2 = Gl();
        final Drawable LIZIZ = C04270Et.LIZIZ(Gl().getContext(), R.drawable.aoy);
        if (LIZIZ == null) {
            LIZIZ = new ColorDrawable();
        }
        Gl2.LJII(new AbstractC030309z(LIZIZ) { // from class: X.89j
            public final Drawable LJLIL;

            {
                this.LJLIL = LIZIZ;
            }

            @Override // X.AbstractC030309z
            public final void LJFF(Canvas c, RecyclerView parent, C0AC state) {
                o.LJIIIZ(c, "c");
                o.LJIIIZ(parent, "parent");
                o.LJIIIZ(state, "state");
                if (parent.getChildCount() < 2) {
                    return;
                }
                C0A2 layoutManager = parent.getLayoutManager();
                o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if ((linearLayoutManager.LLILLJJLI() - linearLayoutManager.LLILL()) - 1 < 0) {
                    return;
                }
                this.LJLIL.draw(c);
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view2, RecyclerView recyclerView, C0AC c0ac) {
                T28.LJ(rect, "outRect", view2, "view", recyclerView, "parent", c0ac, "state");
                rect.set(0, 0, 0, this.LJLIL.getIntrinsicHeight());
            }
        }, -1);
        Gl().LJIIJJI(new IDrS13S0000000_8(0));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = (EcSearchIntermediateViewModelNew) ViewModelProviders.of(mo49getActivity).get(EcSearchIntermediateViewModelNew.class);
            o.LJIIIZ(ecSearchIntermediateViewModelNew, "<set-?>");
            this.LJLJJL = ecSearchIntermediateViewModelNew;
            SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity).get(SearchStateViewModel.class);
            o.LJIIIZ(searchStateViewModel, "<set-?>");
            this.LJLJJLL = searchStateViewModel;
            this.LJLJL = new SearchKeywordPresenter(mo49getActivity);
            this.LJLJLJ = new SugKeywordPresenter(mo49getActivity);
        }
        SugKeywordPresenter sugKeywordPresenter = this.LJLJLJ;
        if (sugKeywordPresenter != null) {
            SearchKeywordPresenter searchKeywordPresenter = this.LJLJL;
            if (searchKeywordPresenter != null) {
                str2 = searchKeywordPresenter.getEditText();
            } else {
                str2 = "";
            }
            sugKeywordPresenter.LIZJ(str2);
        }
        SugKeywordPresenter sugKeywordPresenter2 = this.LJLJLJ;
        if (sugKeywordPresenter2 != null) {
            sugKeywordPresenter2.LIZIZ(new KBV(this));
        }
        Al().gv0().observe(this, new AObserverS76S0100000_8(this, 11));
        ((NextLiveData) Al().LJLJI.getValue()).observe(this, new AObserverS76S0100000_8(this, 12), true);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            this.LJLLI = (EcSearchSugMobHelper) ViewModelProviders.of(mo49getActivity2).get(EcSearchSugMobHelper.class);
        }
        EcSearchSugMobHelper ecSearchSugMobHelper = this.LJLLI;
        if (ecSearchSugMobHelper != null) {
            ecSearchSugMobHelper.LJLILLLLZI = f1();
            C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
            if (c50948Jz6 != null) {
                str = c50948Jz6.getEnterSearchFrom();
            } else {
                str = null;
            }
            ecSearchSugMobHelper.LJLJI = str;
            ecSearchSugMobHelper.LJLJJL = new AObjectS137S0100000_8(this, 0);
        }
        KAB.LIZIZ.LIZ().LIZ = xl();
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "8271258607693220938");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/ecomsearch/middle/ui/EcAbstractSearchIntermediateFragmentNew", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecomsearch/middle/ui/EcAbstractSearchIntermediateFragmentNew", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            Ql();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecomsearch/middle/ui/EcAbstractSearchIntermediateFragmentNew", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        initView(view);
        Ml().LJLJJI = this;
        Ml().LJLJJLL = this.LJLZ;
        Ml().LJLJI = Kl();
        C51252K9o c51252K9o = new C51252K9o(mo49getActivity(), C55230Lly.LIZJ(this, null));
        this.LJLJJI = c51252K9o;
        c51252K9o.LJLILLLLZI = this;
        Ql();
    }

    @Override // X.KCL
    public final void ox(EcSearchSugResponse ecSearchSugResponse, boolean z) {
        String str;
        if (!z) {
            Long l = ecSearchSugResponse.requestOrder;
            o.LJIIIIZZ(l, "response.requestOrder");
            long longValue = l.longValue();
            Long lastRequestOrder = C51252K9o.LJLLILLLL;
            o.LJIIIIZZ(lastRequestOrder, "lastRequestOrder");
            if (longValue < lastRequestOrder.longValue()) {
                if (FMX.LIZJ("ttk_sug_success_rate")) {
                    KAH kah = new KAH();
                    kah.LJIILL("type", "sug_order_failed");
                    kah.LJIILLIIL(Kl());
                    String Ll = Ll();
                    if (Ll == null) {
                        Ll = Kl();
                    }
                    kah.LJIILL("search_position", Ll);
                    kah.LJIIZILJ(Jl());
                    kah.LJIJ(vl());
                    kah.LJIILIIL();
                    return;
                }
                return;
            }
        }
        C51252K9o.LJLLILLLL = ecSearchSugResponse.requestOrder;
        if (isViewValid() && (Gl().getAdapter() instanceof KBQ)) {
            Ml().getClass();
            Ml().LJLILLLLZI = ecSearchSugResponse.requestId;
            Ml().LJLJLLL = ecSearchSugResponse.LJLJI;
            EcSearchSugMobHelper ecSearchSugMobHelper = this.LJLLI;
            if (ecSearchSugMobHelper != null) {
                ecSearchSugMobHelper.LJLIL = ecSearchSugResponse.logPb;
                ecSearchSugMobHelper.LJLJJI = ecSearchSugResponse.recommendWordMob;
            }
            C51141K5h c51141K5h = C51141K5h.LIZ;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            c51141K5h.getClass();
            if (C51141K5h.LIZ(mo49getActivity)) {
                ISearchMiddleForECService LJJJJLI = SearchMiddleForEcService.LJJJJLI();
                LogPbBean logPbBean = ecSearchSugResponse.logPb;
                if (logPbBean != null) {
                    str = logPbBean.getImprId();
                } else {
                    str = null;
                }
                LJJJJLI.LJJIIZ(this, str);
            } else {
                LogPbBean logPbBean2 = ecSearchSugResponse.logPb;
                if (logPbBean2 != null) {
                    logPbBean2.getImprId();
                }
            }
            C10K.LIZJ(new ACallableS85S0200000_8(ecSearchSugResponse, this, 2)).LJ(new AgS25S0210000_8(this, ecSearchSugResponse, z, 0), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.K6B
    public final void LLIIIJ(int i, SearchSugEntity entity, String requestId) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        InterfaceC50548Jse LIZ;
        InterfaceC51113K4f interfaceC51113K4f;
        String str6;
        InterfaceC50547Jsd LIZLLL;
        InterfaceC50548Jse LIZ2;
        String sugShopId;
        String isRichSugValue;
        String resultTab;
        InterfaceC51113K4f LJI;
        HashMap<String, Long> LIZIZ;
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(requestId, "requestId");
        K75 k75 = this.LJLZ;
        if (k75 != null && (LJI = k75.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null) {
            LIZIZ.put("search_sug", Long.valueOf(System.currentTimeMillis()));
        }
        int i2 = 1;
        this.LJLLLLLL = true;
        SearchResultParam param = new SearchResultParam();
        param.setKeyword(entity.content);
        SugExtraInfo sugExtraInfo = entity.sugExtraInfo;
        String str7 = "";
        if (sugExtraInfo == null || (str = sugExtraInfo.getSugHint()) == null) {
            str = "";
        }
        param.setSugHint(str);
        param.setSearchFrom("search_sug");
        String str8 = "enrich_sug";
        if (C78840Uwu.LJJIFFI(entity)) {
            str2 = "enrich_sug";
        } else {
            str2 = "normal_sug";
        }
        param.setSugType(str2);
        param.setOpenNewSearchContainer(false);
        o.LJIIIIZZ(param, "param");
        Kl();
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(mo49getActivity);
        if (LJIIJJI != null) {
            LJIIJJI.getSearchPosition();
        }
        KB1.LJII(KB1.LIZ(JTO.LIZIZ(mo49getActivity())));
        Hl();
        mo49getActivity();
        SugExtraInfo sugExtraInfo2 = entity.sugExtraInfo;
        if (sugExtraInfo2 == null) {
            str3 = "";
        } else if (C78840Uwu.LJJIFFI(entity)) {
            String sugShopId2 = sugExtraInfo2.getSugShopId();
            if (sugShopId2 != null && C78685UuP.LJJJZ(sugShopId2)) {
                if (sugExtraInfo2.isCreatorLive()) {
                    str3 = "shop_living";
                } else {
                    str3 = "shop_regular";
                }
            } else if (sugExtraInfo2.isCreatorLive()) {
                str3 = "author_living";
            } else {
                str3 = "author_regular";
            }
        } else {
            str3 = "regular";
        }
        param.setQueryState(str3);
        SugExtraInfo sugExtraInfo3 = entity.sugExtraInfo;
        String str9 = null;
        if (sugExtraInfo3 != null && (resultTab = sugExtraInfo3.getResultTab()) != null) {
            if (o.LJ(resultTab, "general")) {
                param.getSearchEnterParam().setTargetTab(KAK.TOP);
                param.setLandTap("general");
            } else if (o.LJ(resultTab, "ecom")) {
                param.getSearchEnterParam().setTargetTab(KAK.SHOP);
                param.setLandTap("shop");
            }
        }
        SugExtraInfo sugExtraInfo4 = entity.sugExtraInfo;
        if (sugExtraInfo4 == null || (str4 = sugExtraInfo4.getUserId()) == null) {
            str4 = "";
        }
        param.setSugUserId(str4);
        SugExtraInfo sugExtraInfo5 = entity.sugExtraInfo;
        if (sugExtraInfo5 != null && (isRichSugValue = sugExtraInfo5.isRichSugValue()) != null) {
            str7 = isRichSugValue;
        }
        param.setIsRichSug(str7);
        SugExtraInfo sugExtraInfo6 = entity.sugExtraInfo;
        if (sugExtraInfo6 != null && (sugShopId = sugExtraInfo6.getSugShopId()) != null) {
            param.setSugShopId(sugShopId);
        }
        new C51239K9b().LJIILIIL();
        K9C LIZ3 = K8T.LIZ(C55230Lly.LIZJ(this, null));
        if (LIZ3 != null) {
            LIZ3.LIZJ(param);
        }
        getContext();
        C51252K9o.LJLLI = 0L;
        C51252K9o.LJLLILLLL = 0L;
        SearchStateViewModel searchStateViewModel = this.LJLJJLL;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(true);
            if (!TextUtils.isEmpty(param.getKeyword())) {
                K75 k752 = this.LJLZ;
                if (k752 != null && (LIZ2 = k752.LIZ()) != null) {
                    LIZ2.LIZJ(0);
                }
                K75 k753 = this.LJLZ;
                if (k753 != null && (LIZLLL = k753.LIZLLL()) != null) {
                    LIZLLL.LIZ(0);
                }
                JSONObject LIZJ = C65232Piu.LIZJ(WM7.SCENE_SERVICE, "intermediate_search");
                Integer value = Al().gv0().getValue();
                if (value == null) {
                    value = -1;
                }
                o.LJIIIIZZ(value, "intermediateViewModel.in…ateInnerState.value ?: -1");
                LIZJ.put("is_native_request", value.intValue());
                LIZJ.put("enter_method", param.getEnterMethod());
                C50948Jz6 searchEnterParam = param.getSearchEnterParam();
                if (searchEnterParam != null) {
                    str5 = searchEnterParam.getEnterSearchFrom();
                } else {
                    str5 = null;
                }
                LIZJ.put("enter_from", str5);
                if (this.LJLZ == null) {
                    i2 = 0;
                }
                LIZJ.put("request_type", i2);
                C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ);
                Integer value2 = Al().gv0().getValue();
                if (value2 == null || value2.intValue() != 0) {
                    K75 k754 = this.LJLZ;
                    if (k754 != null) {
                        interfaceC51113K4f = k754.LJI();
                    } else {
                        interfaceC51113K4f = null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (interfaceC51113K4f == null) {
                        str6 = "getOpenSearchNull";
                    } else {
                        str6 = "getOpenSearch";
                    }
                    jSONObject.put(WM7.SCENE_SERVICE, str6);
                    jSONObject.put("enter_method", param.getEnterMethod());
                    C50948Jz6 searchEnterParam2 = param.getSearchEnterParam();
                    if (searchEnterParam2 != null) {
                        str9 = searchEnterParam2.getEnterSearchFrom();
                    }
                    jSONObject.put("enter_from", str9);
                    C48658J7u.LIZIZ("rd_ec_search_request_trace", jSONObject);
                    if (interfaceC51113K4f != null) {
                        interfaceC51113K4f.LIZ(param);
                    }
                }
                K75 k755 = this.LJLZ;
                if (k755 != null && (LIZ = k755.LIZ()) != null) {
                    LIZ.LIZLLL();
                }
            }
            String LIZIZ2 = C3A5.LIZ.LIZIZ(requestId);
            if (!C78840Uwu.LJJIFFI(entity)) {
                str8 = "normal_sug";
            }
            C51203K7r c51203K7r = new C51203K7r();
            c51203K7r.LJIILL("action_type", "click");
            c51203K7r.LJIILL("order", String.valueOf(Integer.valueOf(i)));
            c51203K7r.LJIILL("sug_keyword", f1());
            c51203K7r.LJIILL("log_pb", LIZIZ2);
            c51203K7r.LJIILL("search_type", Dl());
            c51203K7r.LJIILL("search_keyword", entity.content);
            c51203K7r.LJIILL("sug_type", str8);
            c51203K7r.LJIILIIL();
            return;
        }
        o.LJIJI("searchStateViewModel");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aot, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.j6_);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.rn_fragment)");
        this.LJLILLLLZI = (ViewGroup) findViewById;
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}

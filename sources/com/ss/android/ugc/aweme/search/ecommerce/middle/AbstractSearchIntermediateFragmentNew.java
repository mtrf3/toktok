package com.ss.android.ugc.aweme.search.ecommerce.middle;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C00F;
import X.C03880Dg;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C218158hH;
import X.C29S;
import X.C37190Eig;
import X.C3A5;
import X.C3C5;
import X.C40438Fty;
import X.C47959Irz;
import X.C49636Jdw;
import X.C49921JiX;
import X.C49922JiY;
import X.C49924Jia;
import X.C49950Jj0;
import X.C50293JoX;
import X.C50321Joz;
import X.C50541JsX;
import X.C50641Ju9;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50669Jub;
import X.C50676Jui;
import X.C50678Juk;
import X.C50699Jv5;
import X.C50768JwC;
import X.C50789JwX;
import X.C50837JxJ;
import X.C50886Jy6;
import X.C50948Jz6;
import X.C51111K4d;
import X.C51112K4e;
import X.C51114K4g;
import X.C51116K4i;
import X.C51119K4l;
import X.C51121K4n;
import X.C51323KCh;
import X.C51341KCz;
import X.C55230Lly;
import X.C5H3;
import X.C5S1;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78841Uwv;
import X.C79077V1t;
import X.C80413VhB;
import X.C90903hW;
import X.DYB;
import X.FMX;
import X.InterfaceC178696zp;
import X.InterfaceC45601Hv3;
import X.InterfaceC50547Jsd;
import X.InterfaceC50548Jse;
import X.InterfaceC50670Juc;
import X.InterfaceC51113K4f;
import X.InterfaceC51123K4p;
import X.InterfaceC51505KJh;
import X.JTO;
import X.K4Q;
import X.K4U;
import X.K56;
import X.K5A;
import X.K6B;
import X.K6V;
import X.K75;
import X.K7B;
import X.KAK;
import X.KB1;
import X.V16;
import X.XKQ;
import X.Z9N;
import Y.ACallableS57S0300000_8;
import Y.AObjectS137S0100000_8;
import Y.AObserverS76S0100000_8;
import Y.AgS16S0310000_8;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowInsets;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.viewmodel.SearchSugMobHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public abstract class AbstractSearchIntermediateFragmentNew extends AmeBaseFragment implements K6B, K4U, InterfaceC51505KJh {
    public RecyclerView LJLIL;
    public ViewGroup LJLILLLLZI;
    public C51323KCh LJLJI;
    public K4Q LJLJJI;
    public SearchIntermediateViewModelNew LJLJJL;
    public SearchStateViewModel LJLJJLL;
    public SearchKeywordPresenter LJLJL;
    public SugKeywordPresenter LJLJLJ;
    public int LJLJLLL;
    public String LJLL;
    public SearchSugMobHelper LJLLI;
    public final C5H3 LJLLILLLL;
    public final C5H3 LJLLJ;
    public int LJLLL;
    public Integer LJLLLL;
    public boolean LJLLLLLL;
    public ViewStub LJLZ;
    public C80413VhB LJZ;
    public int LJZI;
    public int LJZL;
    public XKQ LL;
    public boolean LLD;
    public boolean LLF;
    public K75 LLFF;

    public void Ml() {
        InterfaceC51113K4f LJI;
        this.LJLJLLL = 1;
        K75 k75 = this.LLFF;
        if (k75 != null && (LJI = k75.LJI()) != null) {
            LJI.LIZLLL();
        }
        this.LJLL = "";
        ((CopyOnWriteArrayList) this.LJLLJ.getValue()).clear();
        C51323KCh c51323KCh = this.LJLJI;
        if (c51323KCh != null) {
            List<SearchSugEntity> list = c51323KCh.LJLIL;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            if (C00F.LIZ(31744, 0, "nullify_sug_view_cache", true) == 1) {
                C51323KCh c51323KCh2 = this.LJLJI;
                if (c51323KCh2 != null) {
                    c51323KCh2.notifyDataSetChanged();
                } else {
                    o.LJIJI("searchSugAdapter");
                    throw null;
                }
            }
            ((CopyOnWriteArrayList) this.LJLLJ.getValue()).addAll(vl());
            C50293JoX.LIZIZ();
            C40438Fty.LJFF();
            if (K7B.LJLILLLLZI.LJJII() && (getContext() instanceof InterfaceC45601Hv3)) {
                if (K6V.LIZ() == 1 || K6V.LIZ() == 3) {
                    C79077V1t.LJIJ = 0;
                } else {
                    C79077V1t.LJIJ = 300;
                }
                Object context = getContext();
                o.LJII(context, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.AsyncInflaterOwner");
                InterfaceC45601Hv3 interfaceC45601Hv3 = (InterfaceC45601Hv3) context;
                InterfaceC51123K4p inflater = interfaceC45601Hv3.getInflater();
                if (inflater == null) {
                    return;
                }
                if (inflater.LIZIZ(R.layout.ch8) && inflater.LIZIZ(R.layout.ch6) && inflater.LIZIZ(R.layout.ch9) && inflater.LIZIZ(R.layout.ch1)) {
                    return;
                }
                C37190Eig.LIZ.post(new IDRunnableS6S0101000(6, interfaceC45601Hv3, 10));
                return;
            }
            return;
        }
        o.LJIJI("searchSugAdapter");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Nl() {
        /*
            Method dump skipped, instructions count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew.Nl():void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        this.LLD = false;
        super.onPause();
        C40438Fty.LJFF();
    }

    public AbstractSearchIntermediateFragmentNew() {
        new LinkedHashMap();
        this.LJLL = "";
        this.LJLLILLLL = V16.LJJJJLL(new AqS158S0100000_8(this, 170));
        this.LJLLJ = V16.LJJJJLL(C50886Jy6.LJLIL);
    }

    private final String f1() {
        SugKeywordPresenter sugKeywordPresenter = this.LJLJLJ;
        if (sugKeywordPresenter != null) {
            return sugKeywordPresenter.LIZ();
        }
        return "";
    }

    public final ViewGroup Al() {
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("mRNFragment");
        throw null;
    }

    public final int Dl() {
        InterfaceC178696zp LIZIZ;
        K75 k75 = this.LLFF;
        if (k75 != null && (LIZIZ = k75.LIZIZ()) != null) {
            return LIZIZ.LIZIZ();
        }
        return -1;
    }

    public final String Hl() {
        if (Z9N.LIZIZ.LJIL(mo49getActivity())) {
            return C50676Jui.LJ(Dl());
        }
        return "discovery";
    }

    public final void Pl() {
        C218158hH c218158hH = C3A5.LIZ;
        C51323KCh c51323KCh = this.LJLJI;
        if (c51323KCh != null) {
            String LIZIZ = c218158hH.LIZIZ(c51323KCh.LJLILLLLZI);
            C51119K4l c51119K4l = new C51119K4l();
            c51119K4l.LJIIZILJ("action_type", "show");
            c51119K4l.LJIIZILJ("sug_keyword", f1());
            c51119K4l.LJIIZILJ("log_pb", LIZIZ);
            c51119K4l.LJIIZILJ("search_type", C50676Jui.LIZ(Dl()));
            c51119K4l.LJIILIIL();
            return;
        }
        o.LJIJI("searchSugAdapter");
        throw null;
    }

    public final List<SearchHistory> vl() {
        List<SearchHistory> LJFF = ((InterfaceC50670Juc) this.LJLLILLLL.getValue()).LJFF(C50837JxJ.LJIILJJIL());
        o.LJIIIIZZ(LJFF, "mHistoryManager.getSearc…yByType(getHistoryType())");
        return LJFF;
    }

    public final SearchIntermediateViewModelNew wl() {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LJLJJL;
        if (searchIntermediateViewModelNew != null) {
            return searchIntermediateViewModelNew;
        }
        o.LJIJI("mIntermediateViewModel");
        throw null;
    }

    public final RecyclerView xl() {
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("mListView");
        throw null;
    }

    @Override // X.K6B
    public final void z2() {
        String str;
        Integer num;
        String str2;
        String str3;
        C51323KCh c51323KCh = this.LJLJI;
        if (c51323KCh == null) {
            return;
        }
        String f1 = f1();
        String str4 = null;
        if (c51323KCh.LJLIL == null || !f1.equals(c51323KCh.LJLL)) {
            return;
        }
        Iterator it = ((ArrayList) c51323KCh.LJLIL).iterator();
        while (it.hasNext()) {
            SearchSugEntity searchSugEntity = (SearchSugEntity) it.next();
            SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo != null && sugExtraInfo.matchQuery()) {
                SearchSugMobHelper searchSugMobHelper = this.LJLLI;
                if (searchSugMobHelper == null) {
                    return;
                }
                if (Z9N.LIZIZ.LJIL(mo49getActivity())) {
                    str = C50676Jui.LIZLLL(Dl());
                } else {
                    str = "discovery";
                }
                C51121K4n c51121K4n = new C51121K4n();
                Word word = searchSugEntity.mWord;
                if (word != null) {
                    num = Integer.valueOf(word.getWordPosition());
                } else {
                    num = null;
                }
                c51121K4n.LJJIIJZLJL(num);
                c51121K4n.LJIIZILJ("words_source", "sug");
                c51121K4n.LJIIZILJ("raw_query", searchSugMobHelper.LJLILLLLZI);
                c51121K4n.LJIIZILJ("words_content", searchSugEntity.content);
                LogPbBean logPbBean = searchSugMobHelper.LJLIL;
                if (logPbBean != null) {
                    str2 = logPbBean.getImprId();
                } else {
                    str2 = null;
                }
                c51121K4n.LJIIZILJ("impr_id", str2);
                RecommendWordMob recommendWordMob = searchSugMobHelper.LJLJJI;
                if (recommendWordMob != null) {
                    str3 = recommendWordMob.getQueryId();
                } else {
                    str3 = null;
                }
                c51121K4n.LJIIZILJ("query_id", str3);
                Word word2 = searchSugEntity.mWord;
                if (word2 != null) {
                    str4 = word2.getId();
                }
                c51121K4n.LJIIZILJ("group_id", str4);
                c51121K4n.LJIIZILJ("search_position", str);
                c51121K4n.LJIILIIL();
                return;
            }
        }
    }

    public final String Gl() {
        String enterSearchFrom;
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz6 == null || TextUtils.isEmpty(c50948Jz6.getEnterSearchFrom()) || (enterSearchFrom = c50948Jz6.getEnterSearchFrom()) == null) {
            return "";
        }
        return enterSearchFrom;
    }

    public final boolean Ll() {
        return KB1.LJII(KB1.LIZ(JTO.LIZ(mo49getActivity()).LJLIL));
    }

    @Override // X.K6B
    public final int N6() {
        return C50837JxJ.LJIILJJIL();
    }

    public boolean Ol() {
        K75 k75;
        InterfaceC50548Jse LIZ;
        Long l;
        InterfaceC50548Jse LIZ2;
        Integer valueOf;
        C49636Jdw searchSessionModel;
        InterfaceC50548Jse LIZ3;
        if (!isViewValid() || !getUserVisibleHint()) {
            return false;
        }
        K75 k752 = this.LLFF;
        if ((k752 == null || (LIZ3 = k752.LIZ()) == null || LIZ3.LIZ() != this.LJLJLLL) && (k75 = this.LLFF) != null && (LIZ = k75.LIZ()) != null) {
            LIZ.LIZIZ(this.LJLJLLL);
        }
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        Object context = getContext();
        o.LJII(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII((LifecycleOwner) context);
        if (LJII != null && (searchSessionModel = LJII.getSearchSessionModel()) != null) {
            l = searchSessionModel.getSearchSessionId();
        } else {
            l = null;
        }
        K75 k753 = this.LLFF;
        if (k753 == null || (LIZ2 = k753.LIZ()) == null || (valueOf = Integer.valueOf(LIZ2.LIZ())) == null) {
            return false;
        }
        if (valueOf.intValue() == 1) {
            C50641Ju9.LIZIZ(getContext(), 1, null, l);
            Ml();
        } else if (valueOf.intValue() == 2) {
            C50641Ju9.LIZIZ(getContext(), 2, null, l);
            Nl();
        } else if (valueOf.intValue() == 0) {
            this.LJLJLLL = 0;
        }
        return true;
    }

    public final boolean Ql() {
        boolean z;
        InterfaceC51113K4f LJI;
        String Gl = Gl();
        boolean N = new C50699Jv5(this).LJ().LIZIZ().N();
        if (o.LJ(Gl, "homepage_hot") || o.LJ(Gl, "homepage_follow") || o.LJ(Gl, "homepage_friends") || o.LJ(Gl, "homepage_now")) {
            z = true;
        } else {
            z = false;
        }
        boolean isEmpty = new C50699Jv5(this).LJ().LIZIZ().LJLILLLLZI.isEmpty();
        if (!z) {
            return false;
        }
        K75 k75 = this.LLFF;
        if ((k75 != null && (LJI = k75.LJI()) != null && LJI.LJ()) || !N || isEmpty || Ll()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C51323KCh c51323KCh = this.LJLJI;
        if (c51323KCh != null) {
            C51341KCz c51341KCz = c51323KCh.LJLLILLLL;
            c51341KCz.LIZJ.LIZ();
            c51341KCz.LIZLLL.LIZ();
            c51341KCz.LJ.LIZ();
            c51341KCz.LJFF.LIZ();
            c51341KCz.LJI.LIZ();
            c51341KCz.LJII.LIZ();
            return;
        }
        o.LJIJI("searchSugAdapter");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.LLD = true;
        if (this.LJLJLLL != 0 && (xl().getAdapter() instanceof C51323KCh)) {
            AbstractC029409q adapter = xl().getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.pages.sug.core.ui.SearchSugAdapter");
            if (adapter.getItemCount() > 0) {
                Pl();
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        C80413VhB c80413VhB;
        super.onStart();
        if (isRegisterEventBus()) {
            EventBus LIZJ = EventBus.LIZJ();
            if (!LIZJ.LJI(this)) {
                LIZJ.LJIILJJIL(this);
            }
        }
        if (C51111K4d.LIZJ(KB1.LJII(KB1.LIZ(JTO.LIZ(mo49getActivity()).LJLIL))) && Build.VERSION.SDK_INT < 30 && (c80413VhB = this.LJZ) != null) {
            KeyboardUtils.LIZ(this, c80413VhB, new C51116K4i(this));
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
        C50293JoX.LIZIZ();
        new C50699Jv5(this).LIZIZ(new C50678Juk("others"));
        SearchStateViewModel searchStateViewModel = this.LJLJJLL;
        if (searchStateViewModel != null) {
            searchStateViewModel.setSearchPageVisible(false);
            SearchStateViewModel searchStateViewModel2 = this.LJLJJLL;
            if (searchStateViewModel2 != null) {
                searchStateViewModel2.setIsLeavingSearch(false);
                return;
            } else {
                o.LJIJI("mSearchStateViewModel");
                throw null;
            }
        }
        o.LJIJI("mSearchStateViewModel");
        throw null;
    }

    @Override // X.K4U
    public final void r0() {
        if (mo49getActivity() != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            if (mo49getActivity.isFinishing()) {
                return;
            }
            if (FMX.LIZJ("ttk_sug_success_rate")) {
                C51112K4e c51112K4e = new C51112K4e();
                c51112K4e.LJIIZILJ("type", "no_data");
                c51112K4e.LJIJI(Gl());
                c51112K4e.LJJIII(this.LJLLL);
                String Hl = Hl();
                if (Hl == null) {
                    Hl = Gl();
                }
                c51112K4e.LJIIZILJ("search_position", Hl);
                c51112K4e.LJIILIIL();
            }
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.im9);
            c5s1.LJ();
        }
    }

    public static final int Jl(AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew) {
        int i;
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        Insets insets;
        Insets insets2;
        Window window2;
        View decorView2;
        ActivityC45651qj mo49getActivity = abstractSearchIntermediateFragmentNew.mo49getActivity();
        WindowInsets windowInsets = null;
        if (mo49getActivity != null && (window2 = mo49getActivity.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
            windowInsets = decorView2.getRootWindowInsets();
        }
        int i2 = 0;
        if (windowInsets != null && (insets2 = windowInsets.getInsets(WindowInsets.Type.ime())) != null) {
            i = insets2.bottom;
        } else {
            i = 0;
        }
        ActivityC45651qj mo49getActivity2 = abstractSearchIntermediateFragmentNew.mo49getActivity();
        if (mo49getActivity2 != null && (window = mo49getActivity2.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null && (insets = rootWindowInsets.getInsets(WindowInsets.Type.systemBars())) != null) {
            i2 = insets.bottom;
        }
        return C47959Irz.LIZJ(8, i - i2);
    }

    public static final boolean Kl(AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew) {
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        ActivityC45651qj mo49getActivity = abstractSearchIntermediateFragmentNew.mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null) {
            return rootWindowInsets.isVisible(WindowInsets.Type.ime());
        }
        return false;
    }

    public final SearchResultParam Il(SearchSugEntity searchSugEntity) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        String str3;
        String sugShopId;
        String isRichSugValue;
        String resultTab;
        String searchPosition;
        SearchResultParam param = new SearchResultParam();
        param.setKeyword(searchSugEntity.content);
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        String str4 = "";
        if (sugExtraInfo == null || (str = sugExtraInfo.getSugHint()) == null) {
            str = "";
        }
        param.setSugHint(str);
        param.setIsFromGeneralSug(true);
        param.setSearchFrom("search_sug");
        if (C78841Uwv.LJIL(searchSugEntity)) {
            str2 = "enrich_sug";
        } else {
            str2 = "normal_sug";
        }
        param.setSugType(str2);
        SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo2 != null && sugExtraInfo2.isGenerativeSug()) {
            z = true;
        } else {
            z = false;
        }
        param.setSugGenerateType(Boolean.valueOf(z));
        param.setOpenNewSearchContainer(false);
        o.LJIIIIZZ(param, "param");
        String Gl = Gl();
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(mo49getActivity);
        if (LJIIJJI != null && (searchPosition = LJIIJJI.getSearchPosition()) != null && searchPosition.length() > 0) {
            Gl = searchPosition;
        }
        boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(mo49getActivity())));
        if (Dl() == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        param.setQueryState(K56.LIZJ(searchSugEntity, Gl, LJII, z2));
        SugExtraInfo sugExtraInfo3 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo3 != null && (resultTab = sugExtraInfo3.getResultTab()) != null) {
            if (o.LJ(resultTab, "general")) {
                param.getSearchEnterParam().setTargetTab(KAK.TOP);
                param.setLandTap("general");
            } else if (o.LJ(resultTab, "ecom")) {
                param.getSearchEnterParam().setTargetTab(KAK.SHOP);
                param.setLandTap("shop");
            }
        }
        SugExtraInfo sugExtraInfo4 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo4 == null || (str3 = sugExtraInfo4.getUserId()) == null) {
            str3 = "";
        }
        param.setSugUserId(str3);
        SugExtraInfo sugExtraInfo5 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo5 != null && (isRichSugValue = sugExtraInfo5.isRichSugValue()) != null) {
            str4 = isRichSugValue;
        }
        param.setIsRichSug(str4);
        SugExtraInfo sugExtraInfo6 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo6 != null && (sugShopId = sugExtraInfo6.getSugShopId()) != null) {
            param.setSugShopId(sugShopId);
        }
        SugExtraInfo sugExtraInfo7 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo7 != null && sugExtraInfo7.isLiveQuery() && DYB.LIZ()) {
            param.setSugIsLiveSug(true);
        }
        return param;
    }

    @Override // X.K6B
    public final void g3(SearchSugEntity entity) {
        List<SearchSugEntity> list;
        o.LJIIIZ(entity, "entity");
        K4Q k4q = this.LJLJJI;
        if (k4q != null) {
            for (Map.Entry<String, SearchSugResponse> entry : k4q.LJLL.entrySet()) {
                SearchSugResponse value = entry.getValue();
                if (value != null && (list = value.sugList) != null) {
                    Iterator<SearchSugEntity> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            SearchSugEntity next = it.next();
                            if (next.LIZ() && next.content.equals(entity.content)) {
                                k4q.LJLL.remove(entry.getKey());
                                break;
                            }
                        }
                    }
                }
            }
            return;
        }
        o.LJIJI("mSugPresenter");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0164, code lost:
    
        if (r0 != 3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c8, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c6, code lost:
    
        if (X.K51.LIZ() == 4) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew.initView(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = (SearchIntermediateViewModelNew) ViewModelProviders.of(mo49getActivity).get(SearchIntermediateViewModelNew.class);
        o.LJIIIZ(searchIntermediateViewModelNew, "<set-?>");
        this.LJLJJL = searchIntermediateViewModelNew;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        o.LJI(mo49getActivity2);
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity2).get(SearchStateViewModel.class);
        o.LJIIIZ(searchStateViewModel, "<set-?>");
        this.LJLJJLL = searchStateViewModel;
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        o.LJI(mo49getActivity3);
        this.LJLJL = new SearchKeywordPresenter(mo49getActivity3);
        ActivityC45651qj mo49getActivity4 = mo49getActivity();
        o.LJI(mo49getActivity4);
        SugKeywordPresenter sugKeywordPresenter = new SugKeywordPresenter(mo49getActivity4);
        this.LJLJLJ = sugKeywordPresenter;
        SearchKeywordPresenter searchKeywordPresenter = this.LJLJL;
        if (searchKeywordPresenter != null) {
            str = searchKeywordPresenter.getEditText();
        } else {
            str = "";
        }
        sugKeywordPresenter.LIZJ(str);
        SugKeywordPresenter sugKeywordPresenter2 = this.LJLJLJ;
        if (sugKeywordPresenter2 != null) {
            sugKeywordPresenter2.LIZIZ(new C51114K4g(this));
        }
        ((LiveData) wl().LJLIL.getValue()).observe(this, new AObserverS76S0100000_8(this, 26));
        ((NextLiveData) wl().LJLJI.getValue()).observe(this, new AObserverS76S0100000_8(this, 27), true);
        ActivityC45651qj mo49getActivity5 = mo49getActivity();
        if (mo49getActivity5 != null) {
            this.LJLLI = (SearchSugMobHelper) ViewModelProviders.of(mo49getActivity5).get(SearchSugMobHelper.class);
        }
        SearchSugMobHelper searchSugMobHelper = this.LJLLI;
        if (searchSugMobHelper != null) {
            searchSugMobHelper.LJLILLLLZI = f1();
            C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
            if (c50948Jz6 != null) {
                str2 = c50948Jz6.getEnterSearchFrom();
            } else {
                str2 = null;
            }
            searchSugMobHelper.LJLJI = str2;
            searchSugMobHelper.LJLJJL = new AObjectS137S0100000_8(this, 1);
        }
        C50669Jub.LIZIZ.LIZ().LIZ = vl();
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-4139529230166458110");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/search/ecommerce/middle/AbstractSearchIntermediateFragmentNew", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/ecommerce/middle/AbstractSearchIntermediateFragmentNew", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            Ol();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/ecommerce/middle/AbstractSearchIntermediateFragmentNew", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.K6B
    public final void xc(SearchSugEntity entity) {
        o.LJIIIZ(entity, "entity");
        if (!C50541JsX.LIZ().enableSug) {
            return;
        }
        SearchResultParam Il = Il(entity);
        if (TextUtils.isEmpty(Il.getKeyword())) {
            return;
        }
        Il.setPrefetchId(C49924Jia.LIZIZ());
        Il.setPrefetchType("press");
        Z9N z9n = Z9N.LIZIZ;
        z9n.LIZ.LJLLI(getContext(), Il);
    }

    @Override // X.K4U
    public final void Ft(SearchSugResponse searchSugResponse, boolean z) {
        String str;
        String str2;
        String str3;
        if (this.LLF) {
            return;
        }
        if (!z) {
            Long l = searchSugResponse.requestOrder;
            o.LJIIIIZZ(l, "response.requestOrder");
            long longValue = l.longValue();
            Long lastRequestOrder = K4Q.LJLZ;
            o.LJIIIIZZ(lastRequestOrder, "lastRequestOrder");
            if (longValue < lastRequestOrder.longValue()) {
                if (FMX.LIZJ("ttk_sug_success_rate")) {
                    C51112K4e c51112K4e = new C51112K4e();
                    c51112K4e.LJIIZILJ("type", "sug_order_failed");
                    c51112K4e.LJIJI(Gl());
                    String Hl = Hl();
                    if (Hl == null) {
                        Hl = Gl();
                    }
                    c51112K4e.LJIIZILJ("search_position", Hl);
                    c51112K4e.LJJIII(this.LJLLL);
                    c51112K4e.LJIILIIL();
                    return;
                }
                return;
            }
        }
        K4Q.LJLZ = searchSugResponse.requestOrder;
        if (!Ll() && C00F.LIZ(31744, -1, "search_sug_server_cache_experiment", true) != -1 && z && this.LJLJLLL == 2 && xl().getAdapter() == null) {
            RecyclerView xl = xl();
            C51323KCh c51323KCh = this.LJLJI;
            if (c51323KCh != null) {
                xl.setAdapter(c51323KCh);
            } else {
                o.LJIJI("searchSugAdapter");
                throw null;
            }
        }
        if (isViewValid() && (xl().getAdapter() instanceof C51323KCh)) {
            C51323KCh c51323KCh2 = this.LJLJI;
            if (c51323KCh2 != null) {
                c51323KCh2.LJLILLLLZI = searchSugResponse.requestId;
                c51323KCh2.LJLL = searchSugResponse.LJLILLLLZI;
                SearchSugMobHelper searchSugMobHelper = this.LJLLI;
                if (searchSugMobHelper != null) {
                    searchSugMobHelper.LJLIL = searchSugResponse.logPb;
                    searchSugMobHelper.LJLJJI = searchSugResponse.recommendWordMob;
                }
                C50699Jv5 c50699Jv5 = new C50699Jv5(this);
                LogPbBean logPbBean = searchSugResponse.logPb;
                if (logPbBean != null) {
                    str = logPbBean.getImprId();
                } else {
                    str = null;
                }
                String str4 = "";
                if (str == null) {
                    str = "";
                }
                c50699Jv5.LJII(str);
                C218158hH c218158hH = C3A5.LIZ;
                C51323KCh c51323KCh3 = this.LJLJI;
                if (c51323KCh3 != null) {
                    String LIZIZ = c218158hH.LIZIZ(c51323KCh3.LJLILLLLZI);
                    if (TextUtils.isEmpty(LIZIZ) && C00F.LIZ(31744, -1, "search_sug_server_cache_experiment", true) != -1) {
                        LogPbBean logPbBean2 = searchSugResponse.logPb;
                        LIZIZ = logPbBean2 != null ? logPbBean2.toJsonString() : null;
                    }
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    String str5 = searchSugResponse.LJLILLLLZI;
                    if (str5 == null) {
                        str5 = "";
                    }
                    concurrentHashMap.put("raw_query", str5);
                    RecommendWordMob recommendWordMob = searchSugResponse.recommendWordMob;
                    if (recommendWordMob == null || (str2 = recommendWordMob.getInfo()) == null) {
                        str2 = "";
                    }
                    concurrentHashMap.put("info", str2);
                    concurrentHashMap.put("sug_session_id", "");
                    LogPbBean logPbBean3 = searchSugResponse.logPb;
                    if (logPbBean3 == null || (str3 = logPbBean3.getImprId()) == null) {
                        str3 = "";
                    }
                    concurrentHashMap.put("impr_id", str3);
                    if (LIZIZ == null) {
                        LIZIZ = "";
                    }
                    concurrentHashMap.put("log_pb", LIZIZ);
                    String Hl2 = Hl();
                    if (Hl2 != null) {
                        str4 = Hl2;
                    }
                    concurrentHashMap.put("search_position", str4);
                    C10K.LIZJ(new ACallableS57S0300000_8(searchSugResponse, this, concurrentHashMap, 1)).LJ(new AgS16S0310000_8(this, z, searchSugResponse, concurrentHashMap, 0), C10K.LJIIIIZZ, null);
                    return;
                }
                o.LJIJI("searchSugAdapter");
                throw null;
            }
            o.LJIJI("searchSugAdapter");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        initView(view);
        C51323KCh c51323KCh = new C51323KCh(mo49getActivity(), xl());
        this.LJLJI = c51323KCh;
        c51323KCh.LJLJJI = this;
        c51323KCh.LJLJL = this.LLFF;
        c51323KCh.LJLJI = Gl();
        ((LiveData) wl().LJLIL.getValue()).observe(getViewLifecycleOwner(), new AObserverS76S0100000_8(this, 83));
        K4Q k4q = new K4Q(mo49getActivity(), C55230Lly.LIZJ(this, null));
        this.LJLJJI = k4q;
        k4q.LJLJLLL = Ll();
        K4Q k4q2 = this.LJLJJI;
        if (k4q2 != null) {
            k4q2.LJLILLLLZI = this;
            Ol();
        } else {
            o.LJIJI("mSugPresenter");
            throw null;
        }
    }

    @Override // X.K6B
    public final void LLIIIJ(int i, SearchSugEntity entity, String requestId) {
        InterfaceC50548Jse LIZ;
        K75 k75;
        InterfaceC51113K4f LJI;
        InterfaceC50547Jsd LIZLLL;
        InterfaceC50548Jse LIZ2;
        String str;
        InterfaceC51113K4f LJI2;
        HashMap<String, Long> LIZIZ;
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(requestId, "requestId");
        this.LJLLLLLL = true;
        K75 k752 = this.LLFF;
        if (k752 != null && (LJI2 = k752.LJI()) != null && (LIZIZ = LJI2.LIZIZ()) != null) {
            LIZIZ.put("search_sug", Long.valueOf(System.currentTimeMillis()));
        }
        SearchResultParam Il = Il(entity);
        C49921JiX.LJFF(1, Il);
        C49922JiY.LJ(1, Il);
        new K5A().LJIILIIL();
        this.LLF = true;
        C49950Jj0.LIZ.onEventStart(Il);
        Context context = getContext();
        K4Q.LJLLLLLL = 0L;
        K4Q.LJLZ = 0L;
        SearchStateViewModel searchStateViewModel = this.LJLJJLL;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(true);
            if (!TextUtils.isEmpty(Il.getKeyword())) {
                Z9N.LIZIZ.LIZ.LJLLI(context, Il);
                K75 k753 = this.LLFF;
                if (k753 != null && (LIZ2 = k753.LIZ()) != null) {
                    LIZ2.LIZJ(0);
                }
                K75 k754 = this.LLFF;
                if (k754 != null && (LIZLLL = k754.LIZLLL()) != null) {
                    LIZLLL.LIZ(0);
                }
                Integer num = (Integer) ((LiveData) wl().LJLIL.getValue()).getValue();
                if ((num == null || num.intValue() != 0) && (k75 = this.LLFF) != null && (LJI = k75.LJI()) != null) {
                    LJI.LIZ(Il);
                }
                K75 k755 = this.LLFF;
                if (k755 != null && (LIZ = k755.LIZ()) != null) {
                    LIZ.LIZLLL();
                }
            }
            String LIZIZ2 = C3A5.LIZ.LIZIZ(requestId);
            if (C78841Uwv.LJIL(entity)) {
                str = "enrich_sug";
            } else {
                str = "normal_sug";
            }
            C51119K4l c51119K4l = new C51119K4l();
            c51119K4l.LJIIZILJ("action_type", "click");
            c51119K4l.LJIIZILJ("order", String.valueOf(Integer.valueOf(i)));
            c51119K4l.LJIIZILJ("sug_keyword", f1());
            c51119K4l.LJIIZILJ("log_pb", LIZIZ2);
            c51119K4l.LJIIZILJ("search_type", C50676Jui.LIZ(Dl()));
            c51119K4l.LJIIZILJ("search_keyword", entity.content);
            c51119K4l.LJIIZILJ("sug_type", str);
            c51119K4l.LJIILIIL();
            if (C00F.LIZ(31744, 0, "nullify_sug_view_cache", true) == 1) {
                C51323KCh c51323KCh = this.LJLJI;
                if (c51323KCh != null) {
                    List<SearchSugEntity> list = c51323KCh.LJLIL;
                    if (list != null) {
                        ((ArrayList) list).clear();
                    }
                    C51323KCh c51323KCh2 = this.LJLJI;
                    if (c51323KCh2 != null) {
                        c51323KCh2.notifyDataSetChanged();
                        return;
                    } else {
                        o.LJIJI("searchSugAdapter");
                        throw null;
                    }
                }
                o.LJIJI("searchSugAdapter");
                throw null;
            }
            return;
        }
        o.LJIJI("mSearchStateViewModel");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        C50789JwX c50789JwX = C50768JwC.LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0) {
            c50789JwX.LJIIIIZZ = System.currentTimeMillis();
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cg4, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.j6_);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.rn_fragment)");
        this.LJLILLLLZI = (ViewGroup) findViewById;
        C50789JwX c50789JwX2 = C50768JwC.LIZIZ;
        if (c50789JwX2 != null && c50789JwX2.LIZJ > 0 && c50789JwX2.LJII > 0) {
            c50789JwX2.LJIL = System.currentTimeMillis() - c50789JwX2.LJIIIIZZ;
        }
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

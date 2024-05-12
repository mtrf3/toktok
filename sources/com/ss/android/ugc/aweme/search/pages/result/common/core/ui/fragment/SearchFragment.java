package com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment;

import X.AbstractC030109x;
import X.AbstractC65590Pog;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C03880Dg;
import X.C06F;
import X.C0A2;
import X.C10A;
import X.C10K;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C184077Kh;
import X.C1A7;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C223338pd;
import X.C29S;
import X.C2L4;
import X.C33Q;
import X.C38619FDr;
import X.C3A5;
import X.C3C5;
import X.C3C8;
import X.C40264FrA;
import X.C40443Fu3;
import X.C48054ItW;
import X.C49500Jbk;
import X.C49503Jbn;
import X.C49759Jfv;
import X.C49804Jge;
import X.C49814Jgo;
import X.C49817Jgr;
import X.C49906JiI;
import X.C50070Jkw;
import X.C50085JlB;
import X.C50131Jlv;
import X.C50136Jm0;
import X.C50139Jm3;
import X.C50140Jm4;
import X.C50145Jm9;
import X.C50147JmB;
import X.C50158JmM;
import X.C50159JmN;
import X.C50163JmR;
import X.C50164JmS;
import X.C50165JmT;
import X.C50167JmV;
import X.C50170JmY;
import X.C50171JmZ;
import X.C50222JnO;
import X.C50234Jna;
import X.C50238Jne;
import X.C50254Jnu;
import X.C50257Jnx;
import X.C50258Jny;
import X.C50259Jnz;
import X.C50287JoR;
import X.C50293JoX;
import X.C50294JoY;
import X.C50321Joz;
import X.C50322Jp0;
import X.C50356JpY;
import X.C50407JqN;
import X.C50431Jql;
import X.C50433Jqn;
import X.C50594JtO;
import X.C50605JtZ;
import X.C50642JuA;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50675Juh;
import X.C50937Jyv;
import X.C50948Jz6;
import X.C51105K3x;
import X.C51107K3z;
import X.C51611KNj;
import X.C51612KNk;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55247LmF;
import X.C56412MCa;
import X.C5H3;
import X.C5S1;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65232Piu;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68182ly;
import X.C73210SoI;
import X.C76800UCe;
import X.C76965UIn;
import X.C77275UUl;
import X.C78857UxB;
import X.C78926UyI;
import X.C79043V0l;
import X.C80217Ve1;
import X.C81335Vw3;
import X.C8HS;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EnumC49738Jfa;
import X.EnumC50260Jo0;
import X.EnumC50262Jo2;
import X.FMX;
import X.IIM;
import X.IKU;
import X.InterfaceC191547fS;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC223218pR;
import X.InterfaceC49816Jgq;
import X.InterfaceC49928Jie;
import X.InterfaceC50155JmJ;
import X.InterfaceC50172Jma;
import X.InterfaceC81353VwL;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.JSH;
import X.JTG;
import X.JTO;
import X.JVR;
import X.JY2;
import X.K0M;
import X.K1X;
import X.KEZ;
import X.KNV;
import X.KPL;
import X.KUR;
import X.KUY;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.QD3;
import X.RBW;
import X.RunnableC50138Jm2;
import X.TBV;
import X.TBW;
import X.TMC;
import X.V16;
import X.V1B;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS28S0100000_8;
import Y.ACallableS111S0100000_8;
import Y.ACallableS85S0200000_8;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS44S0100000_8;
import Y.IDrS44S0100000_4;
import Y.IDrS47S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.AdapterStateViewModel;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.common.ComponentHelper;
import com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinTaskManager;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchInfoViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.SearchResultStayHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.SearchTimeHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel.QueryCorrectHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel.FeedbackHelper$startObserver$1;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.viewmodel.SearchSatisfactionSurveyVM;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.ResearchFilterAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.viewmodel.ResearchFilterVM;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.core.viewmodel.SearchResultViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.viewmodel.SearchCreationEntranceViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.viewmodel.SearchHashtagHeaderHelper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.proxy.TopProxyFragment;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes9.dex */
public abstract class SearchFragment<D> extends SearchBaseFragment implements InterfaceC191547fS, InterfaceC223218pR<D>, InterfaceC49928Jie, KPL, SearchFragmentAbility, InterfaceC81353VwL, C2L4 {
    public static final /* synthetic */ int LLJJJJ = 0;
    public RecyclerView LLIFFJFJJ;
    public KUR LLII;
    public C81335Vw3 LLIIII;
    public C50158JmM LLIIIILZ;
    public GlobalDoodleConfig LLIIIL;
    public JSH LLIIIZ;
    public boolean LLIIJI;
    public SearchGlobalViewModel LLIIJLIL;
    public SearchStateViewModel LLIIL;
    public SearchStartViewModel LLIILII;
    public C80217Ve1 LLIILZL;
    public ViewGroup LLIIZ;
    public C50222JnO LLIL;
    public ViewGroup LLILII;
    public ViewGroup LLILIL;
    public C8HS<D> LLILL;
    public C73210SoI LLILLIZIL;
    public SearchStateViewModel LLILLL;
    public AdapterStateViewModel LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;
    public MusicPlayHelper LLIZ;
    public SearchEnterViewModel LLIZLLLIL;
    public SurveyViewModel LLJ;
    public final C214298b3 LLJI;
    public final C214298b3 LLJIJIL;
    public C50937Jyv LLJILJIL;
    public C50356JpY LLJILJILJ;
    public SearchSatisfactionSurveyVM LLJILLL;
    public final C62822Ol8 LLJJ;
    public boolean LLJJI;
    public TopProxyFragment LLJJIII;
    public final C5H3 LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C5H3 LLJJIJIL;
    public boolean LLJJJ;
    public final Map<Integer, View> LLJJJIL = new LinkedHashMap();
    public List<? extends D> LLIIIJ = new ArrayList();
    public boolean LLILLJJLI = true;

    public void Km() {
        qa(null);
        xa(null, null);
        kn(null, true);
        if (Om() && nm().mShowFooter) {
            nm().setShowFooter(false);
            nm().notifyDataSetChanged();
        }
        if (Om()) {
            nm().clearData();
        }
        hm().LJIIIIZZ();
        fm().setIsRefreshingData(false);
        jn(false);
        Context context = GlobalContext.getContext();
        o.LJI(context);
        C5S1 c5s1 = new C5S1(context);
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    @Override // X.InterfaceC81353VwL
    public void LJ() {
    }

    public boolean Nm() {
        return !(this instanceof SearchJediMixFeedFragment);
    }

    @Override // X.InterfaceC49928Jie
    public final void Pk() {
    }

    public abstract void Pm();

    public abstract void Rm(boolean z);

    public String Wl() {
        return null;
    }

    public Map<String, String> Yl() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJJJIL).clear();
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC223218pR
    public void jh(List<? extends D> list, boolean z) {
        o.LJIIIZ(list, "list");
    }

    public String km() {
        return null;
    }

    @Override // X.InterfaceC81353VwL
    public void l0() {
    }

    public String lm() {
        return null;
    }

    @QD3
    public final void onWebViewActivityCloseEvent(C40264FrA event) {
        o.LJIIIZ(event, "event");
    }

    public void pn(FollowStatus followStatus) {
        o.LJIIIZ(followStatus, "followStatus");
    }

    public abstract void ym();

    public abstract void zm();

    public SearchFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ResearchFilterVM.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 782);
        C50159JmN c50159JmN = C50159JmN.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c50159JmN, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c50159JmN, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJI = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(SearchCreationEntranceViewModel.class);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(LIZ2, 783);
        C50085JlB c50085JlB = C50085JlB.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(aqS154S0100000_42, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c50085JlB, LIZ2);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(aqS154S0100000_42, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c50085JlB, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJIJIL = c214298b32;
        this.LLJJ = C221108m2.LIZIZ(new AqS158S0100000_8((SearchFragment) this, 224));
        this.LLJJI = true;
        this.LLJJIJI = V16.LJJJJLL(new AqS158S0100000_8((SearchFragment) this, 225));
        this.LLJJIJIL = V16.LJJJJLL(new AqS158S0100000_8((SearchFragment) this, 228));
    }

    public static void Sm() {
        String str;
        C50165JmT c50165JmT = new C50165JmT();
        if (RBW.LJLLI.LJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c50165JmT.LJIIZILJ("is_login", str);
        c50165JmT.LJIILIIL();
    }

    public final void Am() {
        View LLLZIIL;
        if (this.LLJJJ) {
            return;
        }
        Context context = hm().getContext();
        KUY LIZ = KUY.LIZ(context);
        o.LJIIIIZZ(context, "context");
        if (C49500Jbk.LIZ()) {
            LLLZIIL = C38619FDr.LIZIZ(R.layout.bky, context, null, false);
        } else {
            LLLZIIL = C16880lQ.LLLZIIL(R.layout.bky, C16880lQ.LLZIL(context), null);
            o.LJIIIIZZ(LLLZIIL, "{\n            MtEmptyVie…stance(context)\n        }");
        }
        LIZ.LIZIZ(LLLZIIL);
        LIZ.LJFF = C50238Jne.LJ() ? 1 : 0;
        ACListenerS28S0100000_8 aCListenerS28S0100000_8 = new ACListenerS28S0100000_8(this, 29);
        C50258Jny c50258Jny = new C50258Jny(LIZ.LIZ);
        c50258Jny.LIZJ(R.string.tbz);
        c50258Jny.LIZ(R.string.tby);
        EnumC50262Jo2 enumC50262Jo2 = EnumC50262Jo2.BORDER;
        C50259Jnz c50259Jnz = c50258Jny.LIZ;
        c50259Jnz.LJI = enumC50262Jo2;
        c50259Jnz.LJII = c50258Jny.LIZIZ.getString(R.string.tc5);
        C50259Jnz c50259Jnz2 = c50258Jny.LIZ;
        c50259Jnz2.LJIIIIZZ = aCListenerS28S0100000_8;
        c50259Jnz2.LJIILJJIL = true;
        C51612KNk c51612KNk = new C51612KNk(LIZ.LIZ);
        c51612KNk.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c51612KNk.setStatus(c50259Jnz2);
        LIZ.LIZLLL = c51612KNk;
        hm().setBuilder(LIZ);
        this.LLJJJ = true;
    }

    public final void Em() {
        on(((C50257Jnx) this.LLJJIJIL.getValue()).LIZ());
        Ym();
    }

    public void Jm() {
        C223338pd c223338pd;
        if (this.LLFFF) {
            if (this.LLII != null) {
                hm().post(new ARunnableS44S0100000_8(this, 40));
            }
            if (this.LLIIIILZ != null && (c223338pd = qm().LIZIZ) != null) {
                c223338pd.LIZIZ();
                return;
            }
            return;
        }
        if (this.LLIIII == null || o.LJ(this.LJZ, "pull_refresh")) {
            return;
        }
        cm().setRefreshing(true);
    }

    public final boolean Om() {
        if (this.LLILL != null) {
            return true;
        }
        return false;
    }

    public final SearchCoinTaskManager Vl() {
        return (SearchCoinTaskManager) this.LLJJ.getValue();
    }

    public final void Xm() {
        Keva LIZ;
        Keva LIZ2;
        SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory());
        Lifecycle lifecycle = getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        SearchInfoViewModel searchInfoViewModel = (SearchInfoViewModel) sharedViewModelProvider.get(lifecycle, SearchInfoViewModel.class);
        searchInfoViewModel.gv0(true);
        if (o.LJ("homepage_hot", searchInfoViewModel.LJLILLLLZI) || o.LJ("homepage_follow", searchInfoViewModel.LJLILLLLZI)) {
            C50594JtO.LIZ.getClass();
            LIZ = C50234Jna.LIZ("search_common");
            if (LIZ.getInt("feed_search_tips_shown", -1) == 1) {
                LIZ2 = C50234Jna.LIZ("search_common");
                LIZ2.storeBoolean("no_need_show_tip_discover_to_feed", true);
            }
        }
    }

    public final RecyclerView Zl() {
        RecyclerView recyclerView = this.LLIFFJFJJ;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    @Override // X.InterfaceC49928Jie
    public final void bk() {
        C50356JpY c50356JpY = this.LLJILJILJ;
        if (c50356JpY != null) {
            c50356JpY.LIZ(this);
        }
    }

    public final C81335Vw3 cm() {
        C81335Vw3 c81335Vw3 = this.LLIIII;
        if (c81335Vw3 != null) {
            return c81335Vw3;
        }
        o.LJIJI("mRefreshLayout");
        throw null;
    }

    public final C73210SoI dm() {
        C73210SoI c73210SoI = this.LLILLIZIL;
        if (c73210SoI != null) {
            return c73210SoI;
        }
        o.LJIJI("mSearchAdapterWrapper");
        throw null;
    }

    public final void dn() {
        C80217Ve1 c80217Ve1;
        if (this.LLIFFJFJJ != null) {
            Zl().LJLI(0);
        }
        if (!isViewValid() || this.LLII == null || hm().LJLILLLLZI == 1 || hm().LJLILLLLZI == 2 || (c80217Ve1 = this.LLIILZL) == null) {
            return;
        }
        c80217Ve1.setExpanded(true);
    }

    public final C51105K3x em() {
        return (C51105K3x) this.LLJJIJI.getValue();
    }

    public final SearchStateViewModel fm() {
        SearchStateViewModel searchStateViewModel = this.LLILLL;
        if (searchStateViewModel != null) {
            return searchStateViewModel;
        }
        o.LJIJI("mStateViewModel");
        throw null;
    }

    @Override // X.C2L4
    public List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(SearchFragmentScope.class);
    }

    public final KUR hm() {
        KUR kur = this.LLII;
        if (kur != null) {
            return kur;
        }
        o.LJIJI("mStatusView");
        throw null;
    }

    @Override // X.InterfaceC49928Jie
    public final WeakReference<ActivityC45651qj> il() {
        return new WeakReference<>(mo49getActivity());
    }

    public C0A2 mO() {
        mo49getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.LLJJIII(1);
        return wrapLinearLayoutManager;
    }

    public final ResearchFilterVM mm() {
        return (ResearchFilterVM) this.LLJI.getValue();
    }

    public final C8HS<D> nm() {
        C8HS<D> c8hs = this.LLILL;
        if (c8hs != null) {
            return c8hs;
        }
        o.LJIJI("searchAdapter");
        throw null;
    }

    public final SearchCreationEntranceViewModel om() {
        return (SearchCreationEntranceViewModel) this.LLJIJIL.getValue();
    }

    public final C50158JmM qm() {
        C50158JmM c50158JmM = this.LLIIIILZ;
        if (c50158JmM != null) {
            return c50158JmM;
        }
        o.LJIJI("searchLoadingHelper");
        throw null;
    }

    public final boolean vm() {
        String str;
        if (this.LLIIJI) {
            GlobalDoodleConfig globalDoodleConfig = this.LLIIIL;
            if (globalDoodleConfig != null) {
                str = globalDoodleConfig.getTnsBanType();
            } else {
                str = null;
            }
            if (o.LJ(str, EnumC49738Jfa.AID.getType())) {
                return true;
            }
        }
        return false;
    }

    public final boolean xm() {
        if (this.LLJJIII != null) {
            return true;
        }
        return false;
    }

    private final void Qm() {
        Integer num;
        String str;
        SearchResultParam searchResultParam;
        long uptimeMillis = SystemClock.uptimeMillis() - this.LLILZLL;
        SearchResultParam searchResultParam2 = this.LJLLILLLL;
        if (searchResultParam2 != null) {
            num = Integer.valueOf(searchResultParam2.getIndex());
        } else {
            num = null;
        }
        String str2 = "";
        if (num == null || ((searchResultParam = this.LJLLILLLL) != null && this.LLF == searchResultParam.getIndex())) {
            str = "";
        } else {
            str = C50605JtZ.LJFF(num.intValue());
        }
        String searchId = this.LJLJJI.getSearchId();
        if (searchId != null) {
            str2 = searchId;
        }
        C50167JmV c50167JmV = new C50167JmV();
        c50167JmV.LJIIZILJ("duration", String.valueOf(uptimeMillis));
        c50167JmV.LJIIZILJ("search_type", C50605JtZ.LJFF(this.LLF));
        c50167JmV.LJIIZILJ("search_id", str2);
        c50167JmV.LJIIZILJ("impr_id", str2);
        c50167JmV.LJIIZILJ("log_pb", C3A5.LIZ.LIZIZ(str2));
        c50167JmV.LJIIZILJ("next_tab", str);
        c50167JmV.LJIIZILJ("search_keyword", Kl());
        c50167JmV.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    /* renamed from: Il */
    public C51105K3x vl() {
        return em();
    }

    public void Im() {
        iC();
        if (Om()) {
            nm().showLoadMoreError();
        }
    }

    @Override // X.InterfaceC191547fS
    public void LJIIJJI() {
        if (!isViewValid() || cm().LJLJJI) {
            return;
        }
        Pm();
    }

    @Override // X.InterfaceC223218pR
    public void Ne() {
        if (!isViewValid()) {
            return;
        }
        Em();
        Ym();
    }

    public int Xl() {
        if (C49804Jge.LJJIZ()) {
            return R.layout.cg3;
        }
        return R.layout.cfz;
    }

    public final void Ym() {
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS44S0100000_8(this, 41));
        }
    }

    public void iC() {
        SearchTimeHelper LIZ = SearchTimeHelper.Companion.LIZ(this);
        String labelName = Jl();
        C50321Joz searchFragmentData = this.LJLJJI;
        String mEnterMethod = this.LJZ;
        String mKeyword = Kl();
        o.LJIIIZ(labelName, "labelName");
        o.LJIIIZ(searchFragmentData, "searchFragmentData");
        o.LJIIIZ(mEnterMethod, "mEnterMethod");
        o.LJIIIZ(mKeyword, "mKeyword");
        new Handler().post(new RunnableC50138Jm2(LIZ, labelName, searchFragmentData, mEnterMethod, mKeyword));
        fm().setIsRefreshingData(false);
        if (isViewValid()) {
            if (this.LLIIIILZ != null) {
                qm().LIZ();
            }
            if (this.LLIIII != null) {
                cm().setRefreshing(false);
            }
        }
    }

    public void ln() {
        nm().setData(ORZ.LLJILJILJ(this.LLIIIJ));
        this.LLIIIJ = new ArrayList();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (C48054ItW.LIZ()) {
            AdapterStateViewModel adapterStateViewModel = this.LLILZ;
            if (adapterStateViewModel != null) {
                adapterStateViewModel.LJLIL.removeObservers(this);
            } else {
                o.LJIJI("adapterStateViewModel");
                throw null;
            }
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            JY2.LIZJ(view);
        }
        super.onDestroyView();
        EventBus.LIZJ().LJIJ(this);
        C50356JpY c50356JpY = this.LLJILJILJ;
        if (c50356JpY != null) {
            ((ArrayList) c50356JpY.LIZ).clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (C48054ItW.LIZ() || this.LLILZIL) {
            Qm();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        View view;
        View view2;
        if (C48054ItW.LIZ() && (view = getView()) != null && view.isLayoutRequested() && (view2 = getView()) != null) {
            view2.requestLayout();
        }
        super.onResume();
        this.LLILZLL = SystemClock.uptimeMillis();
    }

    public final String pm() {
        String str;
        C50433Jqn searchCommonModel;
        String enterFrom;
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        String str2 = "";
        if (c50948Jz6 == null || TextUtils.isEmpty(c50948Jz6.getEnterSearchFrom()) || (str = c50948Jz6.getEnterSearchFrom()) == null) {
            str = "";
        }
        JSONObject LIZJ = C65232Piu.LIZJ("enter_from", str);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C50652JuK.Companion.getClass();
            C50650JuI LJII = C50651JuJ.LJII(mo49getActivity);
            if (LJII != null && (searchCommonModel = LJII.getSearchCommonModel()) != null && (enterFrom = searchCommonModel.getEnterFrom()) != null) {
                str2 = enterFrom;
            }
        }
        LIZJ.put("enter_from_x", str2);
        JVR.LIZLLL("ref_search_get_search_fragment_enterfrom", C77275UUl.LIZLLL("enter_from"), LIZJ);
        return str;
    }

    @Override // X.InterfaceC49928Jie
    public final InterfaceC49816Jgq sa() {
        return Ll();
    }

    @Override // X.InterfaceC223218pR
    public void showLoadMoreLoading() {
        if (isViewValid() && Om()) {
            nm().showLoadMoreLoading();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public /* bridge */ /* synthetic */ Object vl() {
        return vl();
    }

    @Override // X.InterfaceC223218pR
    public final void Iw() {
        Jm();
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        Jm();
    }

    @Override // X.InterfaceC49928Jie
    public final SearchResultParam LJLJLLL() {
        return this.LJLLJ;
    }

    public static boolean Mm(C50287JoR c50287JoR) {
        if (c50287JoR != null && (!c50287JoR.isDefaultOption() || !c50287JoR.isDefaultResearchOption())) {
            return false;
        }
        return true;
    }

    public static void rn(List data) {
        List<RelatedWord> list;
        o.LJIIIZ(data, "data");
        for (Object obj : data) {
            if (obj instanceof SearchMixFeed) {
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                if (searchMixFeed.LJIIIZ() && searchMixFeed.getFeedType() == 37 && (list = searchMixFeed.relatedWordList) != null && (!list.isEmpty())) {
                    String LJFF = C50293JoX.LJFF();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(C50293JoX.LJI());
                    LIZ.append(LJFF);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    C50293JoX.LIZLLL(LJFF, true);
                    C50294JoY c50294JoY = (C50294JoY) ((LinkedHashMap) C50293JoX.LIZ).get(LIZIZ);
                    if (c50294JoY != null) {
                        List<RelatedWord> list2 = searchMixFeed.relatedWordList;
                        o.LJIIIIZZ(list2, "it.relatedWordList");
                        c50294JoY.LJIIIZ.clear();
                        ArrayList arrayList = new ArrayList();
                        Iterator<RelatedWord> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().text);
                        }
                        c50294JoY.LJIIIZ.addAll(arrayList);
                    }
                    C50294JoY c50294JoY2 = (C50294JoY) ((LinkedHashMap) C50293JoX.LIZ).get(LIZIZ);
                    if (c50294JoY2 != null) {
                        c50294JoY2.LJIJ = System.currentTimeMillis();
                    }
                } else {
                    DynamicPatch LJI = searchMixFeed.LJI();
                    if (LJI != null && LJI.isQrecVirtualEnable()) {
                        String LJFF2 = C50293JoX.LJFF();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(C50293JoX.LJI());
                        LIZ2.append(LJFF2);
                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                        C50293JoX.LIZLLL(LJFF2, true);
                        LinkedHashMap linkedHashMap = (LinkedHashMap) C50293JoX.LIZ;
                        C50294JoY c50294JoY3 = (C50294JoY) linkedHashMap.get(LIZIZ2);
                        if (c50294JoY3 != null) {
                            List<String> relateSearchList = LJI.getRelateSearchList();
                            o.LJIIIIZZ(relateSearchList, "dynamicPatch.relateSearchList");
                            c50294JoY3.LJIIIZ.clear();
                            c50294JoY3.LJIIIZ.addAll(relateSearchList);
                        }
                        C50294JoY c50294JoY4 = (C50294JoY) linkedHashMap.get(LIZIZ2);
                        if (c50294JoY4 != null) {
                            c50294JoY4.LJIJ = System.currentTimeMillis();
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object Al(View view) {
        o.LJIIIZ(view, "view");
        a.LJFF().LJJIIZI(mo49getActivity(), "general_search", ((C50322Jp0) KNV.LIZ()).LJLJI, view, new AqS158S0100000_8((SearchFragment) this, 658));
        return C76800UCe.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentAbility
    public final void Dj0(C50287JoR c50287JoR) {
        NextLiveData<Boolean> jv0;
        this.LJLZ = "tab_search";
        this.LJLJI = c50287JoR;
        Ql("tab_search");
        Zm(0, c50287JoR);
        SearchStartViewModel searchStartViewModel = this.LLIILII;
        if (searchStartViewModel == null || (jv0 = searchStartViewModel.jv0()) == null) {
            return;
        }
        jv0.setValue(Boolean.valueOf(!c50287JoR.isDefaultOption()));
    }

    public final void Dm(boolean z) {
        iC();
        if (Om()) {
            nm().setShowFooter(true);
            if (!z) {
                nm().showLoadMoreEmpty();
            } else {
                nm().resetLoadMoreState();
            }
        }
        hm().LJI();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void Gl(SearchResultParam searchResultParam) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
        super.Gl(searchResultParam);
        this.LLILLJJLI = true;
        if (!isViewValid()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putSerializable("search_key", searchResultParam);
                return;
            }
            return;
        }
        Tm(searchResultParam);
        Context context = getContext();
        o.LJI(context);
        C50642JuA.LIZ(context, searchResultParam);
        qn(false);
    }

    public final void Hm(Exception e) {
        o.LJIIIZ(e, "e");
        C50259Jnz LIZIZ = C50257Jnx.LIZIZ((C50257Jnx) this.LLJJIJIL.getValue(), null, e, 1);
        if (LIZIZ != null) {
            on(LIZIZ);
        } else {
            C1A7.LJIJJ(getContext(), e);
            Em();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public void Pl(boolean z) {
        super.Pl(z);
        C50937Jyv c50937Jyv = this.LLJILJIL;
        if (c50937Jyv != null) {
            c50937Jyv.LJ(z, this, null);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception e) {
        o.LJIIIZ(e, "e");
        Hm(e);
    }

    public final C50140Jm4 Sl(ComponentInfo componentInfo) {
        if (!o.LJ(componentInfo.type, "header") || this.LLIFFJFJJ == null) {
            return null;
        }
        C50140Jm4 c50140Jm4 = new C50140Jm4(Zl(), componentInfo);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try to create ");
        LIZ.append(c50140Jm4);
        X1D.LIZIZ(LIZ);
        return c50140Jm4;
    }

    public void Tl(View view) {
        o.LJIIIZ(view, "view");
        this.LLIIIILZ = new C50158JmM(view);
        View findViewById = view.findViewById(R.id.fuc);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.list_view)");
        this.LLIFFJFJJ = (RecyclerView) findViewById;
        if (JTG.LIZ()) {
            Zl().setMotionEventSplittingEnabled(false);
        }
        View findViewById2 = view.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.status_view)");
        this.LLII = (KUR) findViewById2;
        hm().setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 28)));
        View findViewById3 = view.findViewById(R.id.itq);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.refresh_layout)");
        this.LLIIII = (C81335Vw3) findViewById3;
        cm().setEnabled(false);
        cm().setOnPullAndRefreshListener(this);
        this.LLIILZL = (C80217Ve1) view.findViewById(R.id.je6);
        this.LLIIZ = (ViewGroup) view.findViewById(R.id.dbk);
        this.LLILIL = (ViewGroup) view.findViewById(R.id.jew);
        Context context = getContext();
        o.LJI(context);
        C50222JnO c50222JnO = new C50222JnO(context);
        Zl().LJIIJJI(c50222JnO.LJLL);
        this.LLIL = c50222JnO;
        this.LLILII = (ViewGroup) view.findViewById(R.id.gzd);
        if (C49804Jge.LJJIZ()) {
            ViewGroup viewGroup = this.LLILII;
            if (viewGroup != null) {
                viewGroup.addView(this.LLIL);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLIIZ;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.addView(this.LLIL);
    }

    public void Tm(SearchResultParam param) {
        boolean z;
        String str;
        o.LJIIIZ(param, "param");
        this.LJLLILLLL = param;
        String keyword = param.getKeyword();
        o.LJIIIIZZ(keyword, "param.keyword");
        Ll().LIZ(new C49814Jgo(keyword, 2));
        String sugHint = param.getSugHint();
        if (sugHint == null) {
            sugHint = "";
        }
        this.LJLLL = sugHint;
        String searchFrom = param.getSearchFrom();
        o.LJIIIIZZ(searchFrom, "param.searchFrom");
        this.LJLZ = searchFrom;
        this.LLFF = param.getNeedCorrect();
        String enterMethod = param.getEnterMethod();
        if (enterMethod == null || enterMethod.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "channel_unknown";
        } else {
            str = param.getEnterMethod();
            o.LJIIIIZZ(str, "{\n            param.enterMethod\n        }");
        }
        Ql(str);
        if (o.LJ(this.LJZ, "channel_unknown")) {
            this.LJLJJI.setRecentRequestSearchSourceUnknown(true);
            C17N.LJJJJJL(this).j4(new C50407JqN());
        }
        if (o.LJ(this.LJLZ, "search_sug")) {
            this.LLD = param.getSugType();
        }
        if (C78857UxB.LJJJIL(param.getFromSearchSubtag())) {
            String fromSearchSubtag = param.getFromSearchSubtag();
            o.LJIIIIZZ(fromSearchSubtag, "param.fromSearchSubtag");
            this.LJZL = fromSearchSubtag;
        }
        if (C78857UxB.LJJJIL(param.getPreSearchId())) {
            String preSearchId = param.getPreSearchId();
            o.LJIIIIZZ(preSearchId, "param.preSearchId");
            this.LL = preSearchId;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            ((SearchResultViewModel) ViewModelProviders.of(mo49getActivity).get(SearchResultViewModel.class)).LJLIL.postValue(param);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
    
        if (r8.isDefaultOption() != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vm(X.C50287JoR r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment.Vm(X.JoR):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentAbility
    public final void Zc(int i) {
        C50222JnO c50222JnO = this.LLIL;
        if (c50222JnO != null) {
            c50222JnO.LJLIL.LJLIL(i);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception e) {
        o.LJIIIZ(e, "e");
        if (!isViewValid()) {
            return;
        }
        Hm(e);
        Ym();
    }

    public final void jn(boolean z) {
        TopProxyFragment topProxyFragment = this.LLJJIII;
        if (topProxyFragment != null) {
            topProxyFragment.Gn();
            return;
        }
        if (this.LLIILZL != null) {
            C06F c06f = (C06F) cm().getLayoutParams();
            if (z) {
                if (c06f != null) {
                    c06f.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
                }
                C80217Ve1 c80217Ve1 = this.LLIILZL;
                if (c80217Ve1 != null) {
                    c80217Ve1.setVisibility(0);
                }
                C80217Ve1 c80217Ve12 = this.LLIILZL;
                if (c80217Ve12 != null) {
                    c80217Ve12.setExpanded(true);
                }
                ViewGroup viewGroup = this.LLILII;
                if (viewGroup == null) {
                    return;
                }
                viewGroup.setVisibility(0);
                return;
            }
            if (c06f != null) {
                c06f.LIZIZ(null);
            }
            C80217Ve1 c80217Ve13 = this.LLIILZL;
            if (c80217Ve13 != null) {
                c80217Ve13.setVisibility(8);
            }
            C80217Ve1 c80217Ve14 = this.LLIILZL;
            if (c80217Ve14 != null) {
                c80217Ve14.setExpanded(false);
            }
            ViewGroup viewGroup2 = this.LLILII;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setVisibility(8);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception e) {
        o.LJIIIZ(e, "e");
        if (!isViewValid()) {
            return;
        }
        Im();
    }

    @Override // X.InterfaceC49928Jie
    public void oa(GlobalDoodleConfig globalDoodleConfig) {
        this.LLIIIL = globalDoodleConfig;
    }

    public final void on(C50259Jnz c50259Jnz) {
        iC();
        if (Om() && nm().mShowFooter) {
            nm().setShowFooter(false);
            nm().notifyDataSetChanged();
        }
        if (Om()) {
            nm().clearData();
        }
        if (!vm()) {
            KUR hm = hm();
            if (c50259Jnz.LJIILL == EnumC50260Jo0.EMPTY.getType() || !c50259Jnz.LJIILJJIL) {
                KeyEvent.Callback LIZJ = hm.LIZJ(1);
                if (LIZJ instanceof InterfaceC50172Jma) {
                    ((InterfaceC50172Jma) LIZJ).setStatus(c50259Jnz);
                    if (LIZJ instanceof C51611KNj) {
                        ((C51611KNj) LIZJ).setDocLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    }
                }
                hm.LJII();
            } else {
                KeyEvent.Callback LIZJ2 = hm.LIZJ(2);
                o.LJII(LIZJ2, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.IDmtDefaultView");
                ((InterfaceC50172Jma) LIZJ2).setStatus(c50259Jnz);
                hm.LJIIIIZZ();
            }
        } else {
            hm().LJI();
        }
        Rm(false);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                Serializable serializable = arguments.getSerializable("search_key");
                o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
                Tm((SearchResultParam) serializable);
            } catch (Exception unused) {
            }
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity).get(SearchStateViewModel.class);
        o.LJIIIZ(searchStateViewModel, "<set-?>");
        this.LLILLL = searchStateViewModel;
        fm().searchState.observe(this, new AObserverS76S0100000_8(this, 132));
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            this.LLIILII = (SearchStartViewModel) ViewModelProviders.of(mo49getActivity2).get(SearchStartViewModel.class);
            this.LLIIJLIL = (SearchGlobalViewModel) ViewModelProviders.of(mo49getActivity2).get(SearchGlobalViewModel.class);
            if (C48054ItW.LIZ()) {
                AdapterStateViewModel adapterStateViewModel = (AdapterStateViewModel) ViewModelProviders.of(mo49getActivity2).get(AdapterStateViewModel.class);
                o.LJIIIZ(adapterStateViewModel, "<set-?>");
                this.LLILZ = adapterStateViewModel;
                adapterStateViewModel.LJLIL.observe(this, new AObserverS76S0100000_8(this, 46));
            }
        }
        if (this.LJLJI == null) {
            em().LIZJ();
        }
        this.LJLJLJ.add(new C50163JmR(this));
        MutableLiveData<Boolean> mutableLiveData = fm().isTnsShowingMaskLayer;
        if (mutableLiveData != null) {
            mutableLiveData.observe(this, new AObserverS76S0100000_8(this, 47));
        }
    }

    @QD3
    public final void onFeedbackSubmitSuccess(C50170JmY event) {
        Boolean bool;
        com.bytedance.ies.sdk.widgets.NextLiveData<Boolean> nextLiveData;
        com.bytedance.ies.sdk.widgets.NextLiveData<Boolean> nextLiveData2;
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFeedbackSubmitSuccess, vm: ");
        LIZ.append(this.LLJ);
        LIZ.append(", observer: ");
        SurveyViewModel surveyViewModel = this.LLJ;
        if (surveyViewModel != null && (nextLiveData2 = surveyViewModel.LJLIL) != null) {
            bool = Boolean.valueOf(nextLiveData2.hasObservers());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        X1D.LIZIZ(LIZ);
        SurveyViewModel surveyViewModel2 = this.LLJ;
        if (surveyViewModel2 != null && (nextLiveData = surveyViewModel2.LJLIL) != null) {
            nextLiveData.postValue(Boolean.TRUE);
        }
    }

    @QD3
    public final void onFollowStatusUpdate(FollowStatusEvent event) {
        o.LJIIIZ(event, "event");
        if (isViewValid()) {
            nm();
            pn(event.status);
        }
    }

    @QD3
    public void onSearchAfterLogin(IKU searchAfterLoginEvent) {
        o.LJIIIZ(searchAfterLoginEvent, "searchAfterLoginEvent");
        if (isViewValid()) {
            if (hm().LJLILLLLZI == 2 || hm().LJLILLLLZI == 3 || hm().LJLILLLLZI == 4) {
                hm().LJI();
                this.LLILLJJLI = true;
                qn(false);
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onShowResultsEvent(C50147JmB c50147JmB) {
        Integer num;
        List<? extends D> list;
        if (c50147JmB == null) {
            return;
        }
        String str = c50147JmB.LJLIL;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            num = Integer.valueOf(mo49getActivity.hashCode());
        } else {
            num = null;
        }
        if (!o.LJ(str, String.valueOf(num)) || !o.LJ(c50147JmB.LJLILLLLZI, C50605JtZ.LJFF(this.LLF)) || (list = this.LLIIIJ) == null || list.isEmpty()) {
            return;
        }
        ln();
    }

    @Override // X.InterfaceC49928Jie
    public final void pa(SearchApiResult searchApiResult) {
        String str;
        GlobalDoodleConfig globalDoodleConfig;
        SearchSurveyConfig surveyConfig;
        SurveyViewModel surveyViewModel;
        com.bytedance.ies.sdk.widgets.NextLiveData<SearchSurveyConfig> nextLiveData;
        GlobalDoodleConfig globalDoodleConfig2;
        SearchSurveyConfig surveyConfig2;
        if (!getUserVisibleHint()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setApiResult, surveyId: ");
        if (searchApiResult != null && (globalDoodleConfig2 = searchApiResult.globalDoodleConfig) != null && (surveyConfig2 = globalDoodleConfig2.getSurveyConfig()) != null) {
            str = surveyConfig2.getSurveyId();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (searchApiResult != null && (globalDoodleConfig = searchApiResult.globalDoodleConfig) != null && (surveyConfig = globalDoodleConfig.getSurveyConfig()) != null && (surveyViewModel = this.LLJ) != null && (nextLiveData = surveyViewModel.LJLILLLLZI) != null) {
            nextLiveData.postValue(surveyConfig);
        }
    }

    @Override // X.InterfaceC49928Jie
    public final void qa(SearchApiResult searchApiResult) {
        int i;
        Collection collection;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data:");
        if (searchApiResult != null) {
            i = searchApiResult.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        ComponentHelper LIZ2 = ComponentHelper.Companion.LIZ(this);
        if (searchApiResult == null || (collection = searchApiResult.components) == null) {
            collection = C61878OQg.INSTANCE;
        }
        AbstractC65590Pog copyOf = AbstractC65590Pog.copyOf(collection);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (copyOf != null) {
            Iterator it = copyOf.iterator();
            while (it.hasNext()) {
                ComponentInfo componentInfo = (ComponentInfo) it.next();
                Object obj = ((LinkedHashMap) LIZ2.LIZ).get(componentInfo.type);
                if (obj != null || (obj = Sl(componentInfo)) != null) {
                    linkedHashMap.put(componentInfo.type, obj);
                    linkedHashMap2.put(componentInfo.type, componentInfo);
                }
            }
        }
        for (Map.Entry entry : ((LinkedHashMap) LIZ2.LIZ).entrySet()) {
            if (!linkedHashMap2.containsKey(entry.getKey())) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(entry.getValue());
                LIZ3.append(" is not need now, just detach");
                X1D.LIZIZ(LIZ3);
                ((InterfaceC50155JmJ) entry.getValue()).LJJIIJZLJL();
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("current component map size:");
        LIZ4.append(LIZ2.LIZ.size());
        LIZ4.append(", new size:");
        LIZ4.append(linkedHashMap.size());
        X1D.LIZIZ(LIZ4);
        ((LinkedHashMap) LIZ2.LIZ).clear();
        LIZ2.LIZ.putAll(linkedHashMap);
        ((LinkedHashMap) LIZ2.LIZIZ).clear();
        LIZ2.LIZIZ.putAll(linkedHashMap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "guide_search_cancel") != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void qn(boolean r11) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment.qn(boolean):void");
    }

    @Override // X.InterfaceC49928Jie
    public final void ra(boolean z) {
        SearchStartViewModel searchStartViewModel;
        NextLiveData<Boolean> jv0;
        NextLiveData<Boolean> gv0;
        NextLiveData<Boolean> gv02;
        NextLiveData<Boolean> gv03;
        if (!C50675Juh.LIZ || !wl()) {
            return;
        }
        SearchResultParam searchResultParam = this.LJLLILLLL;
        if ((searchResultParam == null || searchResultParam.getFilterOption() == null) && (searchStartViewModel = this.LLIILII) != null && (jv0 = searchStartViewModel.jv0()) != null) {
            jv0.setValue(Boolean.FALSE);
        }
        if (z) {
            if (C51107K3z.LIZ(em().LIZ())) {
                SearchStartViewModel searchStartViewModel2 = this.LLIILII;
                if (searchStartViewModel2 != null && (gv03 = searchStartViewModel2.gv0()) != null) {
                    gv03.setValue(Boolean.TRUE);
                }
                this.LJLILLLLZI = true;
                return;
            }
            SearchStartViewModel searchStartViewModel3 = this.LLIILII;
            if (searchStartViewModel3 != null && (gv02 = searchStartViewModel3.gv0()) != null) {
                gv02.setValue(Boolean.FALSE);
            }
            this.LJLILLLLZI = false;
            return;
        }
        SearchStartViewModel searchStartViewModel4 = this.LLIILII;
        if (searchStartViewModel4 != null && (gv0 = searchStartViewModel4.gv0()) != null) {
            gv0.setValue(Boolean.FALSE);
        }
        this.LJLILLLLZI = false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-8140908230534804785");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        qn(false);
        if (z) {
            C50652JuK.Companion.getClass();
            C50431Jql LJFF = C50651JuJ.LJFF(this);
            if (LJFF != null) {
                LJFF.setSearchLastShowPageIndex(this.LLF);
            }
            C17N.LJJJJJL(this).j4(new KEZ(this.LLF));
            C49503Jbn.LIZLLL = false;
            SearchResultParam searchResultParam = this.LJLLILLLL;
            if (searchResultParam != null) {
                searchResultParam.setIndex(this.LLF);
            }
        }
        if (!C48054ItW.LIZ()) {
            if (z) {
                this.LLILZLL = SystemClock.uptimeMillis();
            }
            if (this.LLILZIL && !z) {
                Qm();
            }
            this.LLILZIL = z;
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final void sm(boolean z) {
        List<ResearchFilterStruct> list;
        boolean z2;
        ResearchFilterStruct researchFilterStruct;
        int i;
        Integer num;
        SearchContainerHeaderVM searchContainerHeaderVM;
        String str;
        if (o.LJ(this.LJZ, "tab_search") || o.LJ(this.LJZ, "pull_refresh")) {
            Boolean hasShownResearchFilter = this.LJLJJI.getHasShownResearchFilter();
            if ((hasShownResearchFilter != null && hasShownResearchFilter.booleanValue()) || z) {
                z = true;
            } else {
                z = false;
            }
        }
        String str2 = null;
        if (!IIM.LIZ() ? !(!z || (list = mm().LJLJJI) == null || list.isEmpty()) : !(!z || ((ResearchFilterAbility) C55096Ljo.LIZIZ(C55230Lly.LIZJ(this, null), ResearchFilterAbility.class)).oe0())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJJI.setHasShownResearchFilter(Boolean.valueOf(z2));
        C17N.LJJJJJL(this).j4(new C50254Jnu(z2));
        C50287JoR c50287JoR = this.LJLJI;
        if (c50287JoR == null || c50287JoR.isDefaultResearchOption()) {
            if (IIM.LIZ()) {
                ((ResearchFilterAbility) C55096Ljo.LIZIZ(C55230Lly.LIZJ(this, null), ResearchFilterAbility.class)).wd0();
            } else {
                ResearchFilterVM mm = mm();
                mm.LJLIL = false;
                mm.LJLILLLLZI = false;
                mm.LJLJI = 0;
                List<ResearchFilterStruct> list2 = mm.LJLJJI;
                if (list2 != null) {
                    researchFilterStruct = (ResearchFilterStruct) ORZ.LJLLLL(list2);
                } else {
                    researchFilterStruct = null;
                }
                mm.setState(new AqS174S0100000_8(researchFilterStruct, 6));
            }
            C50222JnO c50222JnO = this.LLIL;
            if (c50222JnO != null) {
                c50222JnO.LJLIL.LJLIL(0);
            }
        }
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        SearchContainerHeaderVM searchContainerHeaderVM2 = this.LJLLI;
        if (searchContainerHeaderVM2 != null) {
            searchContainerHeaderVM2.LLD = 0;
            searchContainerHeaderVM2.LJLJI = z2;
        }
        C50222JnO c50222JnO2 = this.LLIL;
        if (c50222JnO2 == null || c50222JnO2.getVisibility() != i) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateRvTopPadding = ");
            SearchContainerHeaderVM searchContainerHeaderVM3 = this.LJLLI;
            if (searchContainerHeaderVM3 != null) {
                num = Integer.valueOf(searchContainerHeaderVM3.LJLIL);
            } else {
                num = null;
            }
            LIZ.append(num);
            X1D.LIZIZ(LIZ);
            if (i == 8) {
                SearchContainerHeaderVM searchContainerHeaderVM4 = this.LJLLI;
                if (searchContainerHeaderVM4 != null) {
                    searchContainerHeaderVM4.LJLLILLLL.setValue(Integer.valueOf(searchContainerHeaderVM4.LJLIL));
                }
            } else if (i == 0 && (searchContainerHeaderVM = this.LJLLI) != null) {
                searchContainerHeaderVM.LJLLILLLL.setValue(Integer.valueOf(searchContainerHeaderVM.LJLILLLLZI));
            }
        }
        C50222JnO c50222JnO3 = this.LLIL;
        if (c50222JnO3 != null) {
            c50222JnO3.setVisibility(i);
        }
        SearchResultParam searchResultParam = this.LJLLJ;
        if (searchResultParam != null) {
            searchResultParam.setResearchFilterBarShow(z2);
        }
        if (z2) {
            C50652JuK.Companion.getClass();
            C50321Joz LJ = C50651JuJ.LJ(this);
            OSZ[] oszArr = new OSZ[3];
            if (LJ != null) {
                str = LJ.getSearchId();
            } else {
                str = null;
            }
            oszArr[0] = new OSZ("search_id", str);
            if (LJ != null) {
                str2 = LJ.getSearchKeyword();
            }
            oszArr[1] = new OSZ("search_keyword", str2);
            oszArr[2] = new OSZ("enter_from", "general_search");
            FMX.LJIIL("filter_exposed_show", C113554cx.LJJLIIIIJ(oszArr));
        }
    }

    public final void sn(float f) {
        boolean z;
        View childAt;
        C81335Vw3 cm = cm();
        if (cm.getChildCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        View view = null;
        if (z && (childAt = cm.getChildAt(0)) != null) {
            childAt.setTranslationY(f);
        }
        int i = (int) f;
        V1B.LJLLLL(i, hm());
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.ck4);
        }
        if ((view instanceof C50070Jkw) && view != null) {
            V1B.LJLLLL(i, view);
        }
        C79043V0l.LJJ((int) (f / 2), qm().LIZIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r0 = r12.globalDoodleConfig;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        r8 = r0.getFeedbackSurvey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r12 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        r0 = r12.globalDoodleConfig;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r9 = r0.getFeelGood();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r9 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r12 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r0 = r12.dynamicMask;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        r10 = r0.getOriginType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        r2.j4(new X.C50323Jp1(r4, r5, r6, r7, r8, r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        r9 = new java.util.HashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0035, code lost:
    
        if (r12 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0028, code lost:
    
        if (r12 != null) goto L17;
     */
    @Override // X.InterfaceC49928Jie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ta(com.ss.android.ugc.aweme.discover.model.SearchApiResult r12) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r2 = X.C17N.LJJJJJL(r11)
            X.Jp1 r3 = new X.Jp1
            java.lang.String r4 = r11.Kl()
            r8 = 0
            if (r12 == 0) goto L17
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r12.logPb
            if (r0 == 0) goto L17
            java.lang.String r5 = r0.getImprId()
            if (r5 != 0) goto L19
        L17:
            java.lang.String r5 = ""
        L19:
            java.lang.String r1 = "normal"
            if (r12 == 0) goto L27
            com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig r0 = r12.globalDoodleConfig
            if (r0 == 0) goto L27
            java.lang.String r6 = r0.getTnsBanType()
            if (r6 != 0) goto L2a
        L27:
            r6 = r1
            if (r12 == 0) goto L34
        L2a:
            com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig r0 = r12.globalDoodleConfig
            if (r0 == 0) goto L34
            java.lang.String r7 = r0.getUseScenario()
            if (r7 != 0) goto L37
        L34:
            r7 = r1
            if (r12 == 0) goto L3f
        L37:
            com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig r0 = r12.globalDoodleConfig
            if (r0 == 0) goto L3f
            java.util.List r8 = r0.getFeedbackSurvey()
        L3f:
            if (r12 == 0) goto L4b
            com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig r0 = r12.globalDoodleConfig
            if (r0 == 0) goto L4b
            java.util.HashMap r9 = r0.getFeelGood()
            if (r9 != 0) goto L50
        L4b:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        L50:
            if (r12 == 0) goto L61
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r12.dynamicMask
            if (r0 == 0) goto L61
            int r10 = r0.getOriginType()
        L5a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.j4(r3)
            return
        L61:
            r10 = 0
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment.ta(com.ss.android.ugc.aweme.discover.model.SearchApiResult):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01f5, code lost:
    
        if (r0 != 65514) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01f7, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x022e, code lost:
    
        r1 = "lynx";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x022b, code lost:
    
        if (r0 != 65514) goto L106;
     */
    @Override // X.InterfaceC49928Jie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ua(com.ss.android.ugc.aweme.discover.model.SearchApiResult r14) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment.ua(com.ss.android.ugc.aweme.discover.model.SearchApiResult):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b5, code lost:
    
        if (r20 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r20 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0200, code lost:
    
        if (r20 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01fa, code lost:
    
        if (r20 == null) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    @Override // X.InterfaceC49928Jie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void va(com.ss.android.ugc.aweme.discover.model.SearchApiResult r20) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment.va(com.ss.android.ugc.aweme.discover.model.SearchApiResult):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x00d2  */
    @Override // X.InterfaceC49928Jie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wa(com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo r22) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment.wa(com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo):void");
    }

    @Override // X.InterfaceC49928Jie
    public final void yf(boolean z) {
        boolean z2 = true;
        if (!z && hm().LJLILLLLZI != 2 && hm().LJLILLLLZI != 3 && hm().LJLILLLLZI != 4 && hm().LJLILLLLZI != 1) {
            z2 = false;
        }
        this.LLFFF = z2;
    }

    public void Cm(View view, Bundle bundle) {
        C06F c06f;
        o.LJIIIZ(view, "view");
        Am();
        Zl().setItemAnimator(null);
        Zl().setLayoutManager(mO());
        ym();
        this.LLILLIZIL = new C73210SoI(nm());
        C8HS<D> nm = nm();
        Context context = Zl().getContext();
        o.LJIIIIZZ(context, "mRecyclerView.context");
        nm.setLoadEmptyTextColor(Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.gv, context)));
        nm().setLoadMoreListener(this);
        Zl().setAdapter(dm());
        Zl().setOverScrollMode(2);
        AbstractC030109x itemAnimator = Zl().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LJFF = 0L;
        }
        Zl().LJIIJJI(new IDrS44S0100000_4(this, 11));
        Zl().setClipToPadding(false);
        C80217Ve1 c80217Ve1 = this.LLIILZL;
        if (c80217Ve1 != null) {
            c80217Ve1.setOutlineProvider(null);
        }
        jn(false);
        if (xm()) {
            ViewGroup.LayoutParams layoutParams = cm().getLayoutParams();
            if (!(layoutParams instanceof C06F) || (c06f = (C06F) layoutParams) == null) {
                return;
            }
            c06f.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC223218pR
    public void J5(List<? extends D> list, boolean z) {
        boolean z2;
        o.LJIIIZ(list, "list");
        if (!isViewValid()) {
            return;
        }
        Dm(z);
        GlobalDoodleConfig globalDoodleConfig = this.LLIIIL;
        if (globalDoodleConfig != null) {
            z2 = o.LJ(globalDoodleConfig.getHideResults(), Boolean.TRUE);
        } else {
            z2 = false;
        }
        if (z2) {
            this.LLIIIJ = list;
            nm().setData(new ArrayList());
        } else {
            rn(list);
            List<D> data = nm().getData();
            if (this.LLJJI || data == null || data.isEmpty()) {
                nm().setData(ORZ.LLJILJILJ(list));
                this.LLJJI = false;
            } else {
                List<D> data2 = nm().getData();
                if (data2 != null) {
                    data2.clear();
                }
                List<D> data3 = nm().getData();
                if (data3 != null) {
                    data3.addAll(list);
                }
            }
        }
        Ym();
        View view = getView();
        o.LJI(view);
        view.requestLayout();
        Rm(true);
    }

    public void Zm(int i, C50287JoR c50287JoR) {
        Vm(c50287JoR);
        C10K.LIZJ(new ACallableS111S0100000_8(this, 26));
    }

    public final void an(long j, Runnable runnable) {
        View view = getView();
        if (view != null) {
            view.postDelayed(runnable, j);
        }
    }

    @Override // X.InterfaceC223218pR
    public void j0(List<? extends D> list, boolean z) {
        List<D> list2;
        if (!isViewValid()) {
            return;
        }
        if (list == null || list.isEmpty()) {
            z = false;
        }
        iC();
        if (!z) {
            nm().showLoadMoreEmpty();
        } else {
            nm().resetLoadMoreState();
        }
        if (Om()) {
            C8HS<D> nm = nm();
            if (list != null) {
                list2 = ORZ.LLJILJILJ(list);
            } else {
                list2 = null;
            }
            nm.setDataAfterLoadMore(list2);
        }
    }

    public void kn(SearchApiResult searchApiResult, boolean z) {
        if (!isViewValid() || !Om()) {
            return;
        }
        wa(null);
        ua(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        List<ResearchFilterStruct> list;
        com.bytedance.ies.sdk.widgets.NextLiveData nextLiveData;
        int i2;
        int i3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Tl(view);
        Cm(view, bundle);
        zm();
        SearchResultParam searchResultParam = this.LJLLILLLL;
        if (searchResultParam != null) {
            Gl(searchResultParam);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LLIZLLLIL = (SearchEnterViewModel) ViewModelProviders.of(mo49getActivity).get(SearchEnterViewModel.class);
            this.LLIZ = (MusicPlayHelper) ViewModelProviders.of(mo49getActivity).get(MusicPlayHelper.class);
            this.LLJ = (SurveyViewModel) ViewModelProviders.of(mo49getActivity).get(SurveyViewModel.class);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                i2 = mo49getActivity2.hashCode();
            } else {
                i2 = 0;
            }
            if (K0M.LIZIZ(i2) == null) {
                ActivityC45651qj mo49getActivity3 = mo49getActivity();
                if (mo49getActivity3 != null) {
                    i3 = mo49getActivity3.hashCode();
                } else {
                    i3 = 0;
                }
                K0M.LIZLLL(i3, new C50145Jm9());
            }
            if (C49804Jge.LJJIZ()) {
                this.LJLLI = (SearchContainerHeaderVM) ViewModelProviders.of(mo49getActivity).get(SearchContainerHeaderVM.class);
            }
        }
        SearchGlobalViewModel searchGlobalViewModel = this.LLIIJLIL;
        if (searchGlobalViewModel != null && (nextLiveData = searchGlobalViewModel.LJLLLLLL) != null) {
            nextLiveData.observe(this, new AObserverS76S0100000_8(this, 131));
        }
        if (!IIM.LIZ()) {
            ResearchFilterVM mm = mm();
            C51107K3z c51107K3z = C51107K3z.LIZ;
            ActivityC45651qj mo49getActivity4 = mo49getActivity();
            if (mo49getActivity4 != null) {
                i = mo49getActivity4.hashCode();
            } else {
                i = 0;
            }
            OptionConfigParams LIZIZ = c51107K3z.LIZIZ(i, C50605JtZ.LJFF(this.LJLLLLLL));
            if (LIZIZ != null) {
                list = LIZIZ.researchOptionList;
            } else {
                list = null;
            }
            mm.LJLJJI = list;
            C8YN.LJII(this, mm(), new TBV() { // from class: X.JnX
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return ((C50229JnV) obj).LJLIL;
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C50229JnV) obj).LJLIL = (ResearchFilterStruct) obj2;
                }
            }, null, new AqS190S0100000_8(this, (SearchFragment<Object>) 77), 6);
        }
        int i4 = this.LLF;
        if (i4 == C50605JtZ.LJIIL()) {
            str = "search_user_list";
        } else if (i4 == C50605JtZ.LJIILIIL()) {
            str = "search_video_list";
        } else if (i4 == C50605JtZ.LJIIIZ()) {
            str = "search_music_list";
        } else if (i4 == C50605JtZ.LIZJ()) {
            str = "search_challenge_list";
        } else if (i4 != C50605JtZ.LJIIJJI()) {
            str = "";
        } else {
            str = "search_mix_feed_list";
        }
        if (!o.LJ(str, "")) {
            C40443Fu3.LIZ(str).LJIIIIZZ(Zl());
        }
        ActivityC45651qj mo49getActivity5 = mo49getActivity();
        o.LJI(mo49getActivity5);
        this.LLIIL = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity5).get(SearchStateViewModel.class);
        if (!Nm()) {
            Zl().setPadding(0, 0, 0, 0);
        }
        Rl(view);
        ActivityC45651qj mo49getActivity6 = mo49getActivity();
        C68182ly.LIZ(mo49getActivity6, new FeedbackHelper$startObserver$1(mo49getActivity6));
        if (!xm()) {
            if (IIM.LIZ()) {
                C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, SearchFragmentAbility.class, null);
            }
            C8VV.LIZ(this, false, new AqS174S0100000_8((SearchFragment) this, 82));
        }
        QueryCorrectHelper LIZ = QueryCorrectHelper.Companion.LIZ(this);
        C73210SoI dm = dm();
        LIZ.LJ = view;
        LIZ.LIZLLL = dm;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("this ");
        LIZ2.append(LIZ.hashCode());
        X1D.LIZIZ(LIZ2);
        boolean z = this instanceof ActivityC45651qj;
        if (z) {
            C55247LmF.LIZIZ(C55230Lly.LIZLLL((ActivityC45651qj) this, null), new C49817Jgr(LIZ), C49817Jgr.class, "source_default_key");
        } else {
            C55247LmF.LIZIZ(C55230Lly.LIZJ(this, null), new C49817Jgr(LIZ), C49817Jgr.class, "source_default_key");
        }
        SearchHashtagHeaderHelper LIZ3 = SearchHashtagHeaderHelper.Companion.LIZ(this);
        C73210SoI dm2 = dm();
        LIZ3.LIZJ = view;
        LIZ3.LIZIZ = dm2;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("this ");
        LIZ4.append(LIZ3.hashCode());
        X1D.LIZIZ(LIZ4);
        if (z) {
            C55247LmF.LIZIZ(C55230Lly.LIZLLL((ActivityC45651qj) this, null), new C49759Jfv(LIZ3), C49759Jfv.class, "source_default_key");
        } else {
            C55247LmF.LIZIZ(C55230Lly.LIZJ(this, null), new C49759Jfv(LIZ3), C49759Jfv.class, "source_default_key");
        }
        Zl().LJIIJJI(new IDrS47S0100000_8(this, 14));
        if (!xm()) {
            if (C50131Jlv.LIZ() || C49906JiI.LJJIZ()) {
                if (C50131Jlv.LIZ()) {
                    C50937Jyv c50937Jyv = new C50937Jyv();
                    c50937Jyv.LIZLLL(this);
                    this.LLJILJIL = c50937Jyv;
                }
                if (C49906JiI.LJJIZ()) {
                    this.LLJILLL = (SearchSatisfactionSurveyVM) new ViewModelProvider(this).get(SearchSatisfactionSurveyVM.class);
                }
                C50356JpY c50356JpY = new C50356JpY();
                C50937Jyv c50937Jyv2 = this.LLJILJIL;
                if (c50937Jyv2 != null) {
                    ((ArrayList) c50356JpY.LIZ).add(c50937Jyv2);
                }
                SearchSatisfactionSurveyVM searchSatisfactionSurveyVM = this.LLJILLL;
                if (searchSatisfactionSurveyVM != null) {
                    ((ArrayList) c50356JpY.LIZ).add(searchSatisfactionSurveyVM);
                }
                this.LLJILJILJ = c50356JpY;
            }
        }
    }

    public static void cn(C0A2 c0a2, int i, int i2) {
        if (c0a2 instanceof GridLayoutManager) {
            ((LinearLayoutManager) c0a2).LJFF(i, i2);
        } else if (c0a2 instanceof LinearLayoutManager) {
            ((LinearLayoutManager) c0a2).LJFF(i, i2);
        } else {
            if (c0a2 == null) {
                return;
            }
            c0a2.LJZL(i);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        if (C49500Jbk.LIZ()) {
            Context context = inflater.getContext();
            o.LJIIIIZZ(context, "inflater.context");
            LLLLIILL = C38619FDr.LIZIZ(Xl(), context, viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(getContext()), Xl(), viewGroup, false);
        }
        C29S c29s = null;
        if (!C50238Jne.LJ()) {
            LLLLIILL.setBackground(null);
        }
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

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public final void hn(String labelName, String str, String keyword, String str2, boolean z) {
        String str3;
        C50948Jz6 c50948Jz6;
        int i;
        String str4;
        String str5;
        o.LJIIIZ(labelName, "labelName");
        o.LJIIIZ(keyword, "keyword");
        String str6 = "";
        if (this.LJLJJI.isRecentRequestSearchSourceUnknown()) {
            C50164JmS c50164JmS = new C50164JmS();
            c50164JmS.LJIIZILJ("search_id", str);
            c50164JmS.LJIIZILJ("search_keyword", keyword);
            C50652JuK.Companion.getClass();
            C50431Jql LJFF = C50651JuJ.LJFF(this);
            if (LJFF == null || (str5 = LJFF.getLaunchSchemaString()) == null) {
                str5 = "";
            }
            c50164JmS.LJIIZILJ("other_info", str5);
            c50164JmS.LJIILIIL();
        }
        if (this.LJLLLLLL != C50605JtZ.LJIIJJI()) {
            C50139Jm3.LIZ(this.LJLLLLLL);
        }
        C50136Jm0 c50136Jm0 = new C50136Jm0();
        if (o.LJ(labelName, "general_search")) {
            labelName = "general";
        }
        c50136Jm0.LIZ = labelName;
        c50136Jm0.LIZIZ = keyword;
        String str7 = this.LJLZ;
        o.LJIIIZ(str7, "<set-?>");
        c50136Jm0.LIZJ = str7;
        c50136Jm0.LJIIJJI = this.LJZ;
        SearchResultParam searchResultParam = this.LJLLJ;
        String str8 = null;
        if (searchResultParam != null) {
            str3 = searchResultParam.getEnterMethod();
        } else {
            str3 = null;
        }
        c50136Jm0.LJIIL = str3;
        c50136Jm0.LJ = str;
        c50136Jm0.LJI = z;
        SearchEnterViewModel searchEnterViewModel = this.LLIZLLLIL;
        if (searchEnterViewModel != null) {
            c50948Jz6 = searchEnterViewModel.LJLIL;
        } else {
            c50948Jz6 = null;
        }
        c50136Jm0.LJFF = c50948Jz6;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        C50431Jql LJFF2 = C50651JuJ.LJFF(mo49getActivity);
        if (LJFF2 != null) {
            i = LJFF2.getLastShowingPageIndex();
        } else {
            i = -1;
        }
        c50136Jm0.LJIIIIZZ = i;
        c50136Jm0.LJII = this.LLF;
        c50136Jm0.LJIIIZ = this.LLD;
        c50136Jm0.LJIILIIL = C49503Jbn.LIZIZ;
        c50136Jm0.LJIILL = this.LJLLJ;
        c50136Jm0.LJIIJ = C50139Jm3.LIZ;
        c50136Jm0.LJIILJJIL = C50139Jm3.LIZIZ(this.LJLLLLLL);
        lm();
        SearchResultStayHelper LIZ = SearchResultStayHelper.Companion.LIZ(this);
        C50948Jz6 c50948Jz62 = c50136Jm0.LJFF;
        if (c50948Jz62 != null) {
            str4 = c50948Jz62.getGroupId();
        } else {
            str4 = null;
        }
        C50948Jz6 c50948Jz63 = c50136Jm0.LJFF;
        if (c50948Jz63 != null) {
            str8 = c50948Jz63.getEnterSearchFrom();
        }
        String LJ = C50293JoX.LJ(str4, str8);
        LIZ.LIZIZ = pm();
        String str9 = this.LJZ;
        o.LJIIIZ(str9, "<set-?>");
        LIZ.LIZJ = str9;
        String str10 = c50136Jm0.LIZ;
        if (str10 == null) {
            str10 = "";
        }
        LIZ.LIZLLL = str10;
        String str11 = c50136Jm0.LJ;
        if (str11 == null) {
            str11 = "";
        }
        LIZ.LJ = str11;
        String str12 = c50136Jm0.LIZIZ;
        if (str12 == null) {
            str12 = "";
        }
        LIZ.LJFF = str12;
        if (LJ != null) {
            str6 = LJ;
        }
        LIZ.LJI = str6;
        if (str2 != null) {
            c50136Jm0.LIZLLL = str2;
        }
        new C50171JmZ().LJIILIIL();
        C10K.LIZJ(new ACallableS85S0200000_8(c50136Jm0, this, 9));
        C50139Jm3.LIZ = false;
        C49503Jbn.LIZIZ = false;
        C50431Jql LJFF3 = C50651JuJ.LJFF(mo49getActivity());
        if (LJFF3 != null) {
            LJFF3.setLastShowingPageIndex(this.LLF);
        }
        C17N.LJJJJJL(this).j4(new K1X(this.LLF));
        TMC.LJIIJ(C50651JuJ.LJIIJ(this), C17N.LJJJJJL(this).Te().LIZJ(), "SearchFragment 1128");
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}

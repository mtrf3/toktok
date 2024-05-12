package com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed;

import X.AbstractC030109x;
import X.AbstractC49793JgT;
import X.AbstractC50059Jkl;
import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C020506f;
import X.C03880Dg;
import X.C08880Wm;
import X.C0A2;
import X.C10K;
import X.C113554cx;
import X.C16880lQ;
import X.C17N;
import X.C184077Kh;
import X.C1AT;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C251709uI;
import X.C2K3;
import X.C2NU;
import X.C2P2;
import X.C2PJ;
import X.C2U8;
import X.C34261DcX;
import X.C35788E2u;
import X.C36524EVc;
import X.C38995FSd;
import X.C3CY;
import X.C44729Hgz;
import X.C45804HyK;
import X.C46446IKs;
import X.C46447IKt;
import X.C49111JPf;
import X.C49218JTi;
import X.C49365JYz;
import X.C49369JZd;
import X.C49389JZx;
import X.C49491Jbb;
import X.C49494Jbe;
import X.C49554Jcc;
import X.C49578Jd0;
import X.C49580Jd2;
import X.C49589JdB;
import X.C49636Jdw;
import X.C49707Jf5;
import X.C49710Jf8;
import X.C49715JfD;
import X.C49717JfF;
import X.C49724JfM;
import X.C49735JfX;
import X.C49736JfY;
import X.C49737JfZ;
import X.C49746Jfi;
import X.C49747Jfj;
import X.C49751Jfn;
import X.C49789JgP;
import X.C49791JgR;
import X.C49798JgY;
import X.C49814Jgo;
import X.C49825Jgz;
import X.C49914JiQ;
import X.C49919JiV;
import X.C49920JiW;
import X.C49921JiX;
import X.C49922JiY;
import X.C49950Jj0;
import X.C49956Jj6;
import X.C49995Jjj;
import X.C50028JkG;
import X.C50044JkW;
import X.C50073Jkz;
import X.C50074Jl0;
import X.C50243Jnj;
import X.C50257Jnx;
import X.C50259Jnz;
import X.C50287JoR;
import X.C50365Jph;
import X.C50420Jqa;
import X.C50433Jqn;
import X.C50452Jr6;
import X.C50524JsG;
import X.C50605JtZ;
import X.C50620Jto;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50653JuL;
import X.C50654JuM;
import X.C50699Jv5;
import X.C50804Jwm;
import X.C50948Jz6;
import X.C50964JzM;
import X.C51143K5j;
import X.C52411Khb;
import X.C55457Lpd;
import X.C57105Mb7;
import X.C57852Ov;
import X.C61996OUu;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6ZT;
import X.C76800UCe;
import X.C77125UOr;
import X.C78926UyI;
import X.C8HS;
import X.C9CX;
import X.EnumC46469ILp;
import X.EnumC50363Jpf;
import X.IN8;
import X.InterfaceC223218pR;
import X.InterfaceC48970JJu;
import X.InterfaceC49926Jic;
import X.InterfaceC49928Jie;
import X.InterfaceC49940Jiq;
import X.InterfaceC50157JmL;
import X.InterfaceC65784Pro;
import X.JNW;
import X.JQA;
import X.JRS;
import X.JSU;
import X.JVB;
import X.JVD;
import X.JVO;
import X.JVS;
import X.JW7;
import X.JWC;
import X.JWY;
import X.JY9;
import X.JYE;
import X.JYM;
import X.JYY;
import X.K0M;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.RunnableC49727JfP;
import X.TMC;
import X.X1D;
import X.XKX;
import X.Z9N;
import Y.ACallableS36S0110000_8;
import Y.AObjectS31S0000000_8;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS44S0100000_8;
import Y.IDrS47S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.discover.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.SearchActivityCardBgController;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel.QueryCorrectHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.SearchLinearLayoutManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.proxy.TopProxyFragment;
import com.ss.android.ugc.aweme.search.performance.asyncprefetch.config.AsyncLoadConfig;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import com.ss.android.ugc.aweme.search.service.ecom.ab.LynxPrefetchConfig;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class TopFeedFragment extends SearchFragment<SearchMixFeed> implements InterfaceC49926Jic, C2K3, InterfaceC48970JJu {
    public boolean LLJJJJJIL;
    public ClickSearchViewModel LLJJJJLIIL;
    public C49825Jgz LLJL;
    public EventCenter LLJLIL;
    public MusicPlayHelper LLJLILLLLZIIL;
    public SurveyViewModel LLJLL;
    public SearchGlobalViewModel LLJLLIL;
    public SearchActivityCardBgController LLJLLL;
    public C49710Jf8 LLJZ;
    public JVS LLJZIJLIL;
    public VisibilityComparisonPlayer LLL;
    public C49578Jd0 LLLF;
    public JY9 LLLFF;
    public JWY LLLFFI;
    public boolean LLLFZ;
    public FrameLayout LLLI;
    public C50243Jnj LLLII;
    public final C214378bB LLLIIL;
    public final Map<Integer, View> LLLIILIL = new LinkedHashMap();
    public final C62822Ol8 LLJJL = C221108m2.LIZIZ(C49747Jfj.LJLIL);
    public final Handler LLJJLIIIJLLLLLLLZ = new Handler(C16880lQ.LLJJJJ());
    public final C62822Ol8 LLLIIII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 318));
    public final String LLLIIIIL = "general_search";
    public final boolean LLLIIIL = true;

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final boolean Nm() {
        return false;
    }

    @Override // X.InterfaceC49926Jic
    public final void Tc() {
    }

    @Override // X.InterfaceC49926Jic
    public final void WN() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final int Xl() {
        return R.layout.cg8;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLLIILIL).clear();
    }

    @Override // X.InterfaceC49926Jic
    public final void clearCache() {
        C49736JfY.LIZIZ(Integer.valueOf(hashCode()));
        C49389JZx.LIZ(Integer.valueOf(hashCode()));
        C49791JgR.LIZ(Integer.valueOf(hashCode()));
    }

    @Override // X.InterfaceC49926Jic
    public final InterfaceC49928Jie jO() {
        return this;
    }

    @Override // X.InterfaceC49926Jic
    public final void k20(DynamicPatch dynamicPatch) {
    }

    @Override // X.InterfaceC48970JJu
    public final boolean kh(JYM jym) {
        return false;
    }

    @Override // X.InterfaceC49926Jic
    public final InterfaceC223218pR<?> kq() {
        return this;
    }

    @Override // X.InterfaceC49926Jic
    public final void qL() {
    }

    @Override // X.InterfaceC49926Jic
    public final void tR() {
    }

    @Override // X.InterfaceC49926Jic
    public final InterfaceC49940Jiq uH() {
        return this;
    }

    @Override // X.InterfaceC49926Jic
    public final void yB(SearchMixFeedList data) {
        o.LJIIIZ(data, "data");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void ym() {
        JVB jvb;
        if (this.LLJJJJJIL) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            ClickSearchViewModel clickSearchViewModel = (ClickSearchViewModel) ViewModelProviders.of(mo49getActivity).get(ClickSearchViewModel.class);
            clickSearchViewModel.getClass();
            clickSearchViewModel.LJLIL = new WeakReference<>(this);
            this.LLJJJJLIIL = clickSearchViewModel;
        }
        RecyclerView Zl = Zl();
        JW7 jw7 = (JW7) this.LLLIIII.getValue();
        VisibilityComparisonPlayer visibilityComparisonPlayer = this.LLL;
        Boolean bool = null;
        if (visibilityComparisonPlayer != null) {
            jvb = visibilityComparisonPlayer.LJZ;
        } else {
            jvb = null;
        }
        JVS jvs = new JVS(this, Zl, jw7, jvb, this);
        this.LLJZIJLIL = jvs;
        jvs.LJLJJL = this;
        jvs.LJLJJLL = this.LLJJJJLIIL;
        this.LLILL = jvs;
        RecyclerView Zl2 = Zl();
        getContext();
        SearchLinearLayoutManager searchLinearLayoutManager = new SearchLinearLayoutManager();
        int LIZ = C08880Wm.LIZ(0, 0, "rv_predictive_anim", true);
        if (LIZ != 0) {
            if (LIZ != 1) {
                if (LIZ == 2) {
                    bool = Boolean.FALSE;
                }
            } else {
                bool = Boolean.TRUE;
            }
        }
        searchLinearLayoutManager.LLIIIJ = bool;
        Zl2.setLayoutManager(searchLinearLayoutManager);
        if (((Number) C34261DcX.LIZ.getValue()).intValue() != 0) {
            Zl2.LJIIJJI(new C251709uI());
        }
        AbstractC030109x itemAnimator = Zl2.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LIZLLL = 0L;
            itemAnimator.LJ = 0L;
        }
        this.LLJJJJJIL = true;
    }

    public TopFeedFragment() {
        AqS60S0110000_3 LJJ;
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 713);
        C65776Prg LIZ = C65352Pkq.LIZ(SearchTabHorizontalVM.class);
        C49746Jfi c49746Jfi = C49746Jfi.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LLLIIL = new C214378bB(LIZ, aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c49746Jfi, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // X.InterfaceC49926Jic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C49250JUo AR() {
        /*
            r10 = this;
            boolean r0 = X.C46446IKs.LJLJLJ
            r0 = r0 ^ 1
            r2 = 0
            if (r0 == 0) goto L14
            com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.VisibilityComparisonPlayer r0 = r10.LLL
            if (r0 == 0) goto L13
            X.JVB r0 = r0.LJZ
            if (r0 == 0) goto L13
            X.JQX r1 = r0.LIZ
        L11:
            if (r1 != 0) goto L27
        L13:
            return r2
        L14:
            com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco r0 = X.C49218JTi.LIZIZ(r10)
            if (r0 == 0) goto L25
            X.JQq r1 = r0.LIZLLL()
        L1e:
            boolean r0 = r1 instanceof X.JQX
            if (r0 == 0) goto L13
            X.JQX r1 = (X.JQX) r1
            goto L11
        L25:
            r1 = r2
            goto L1e
        L27:
            X.JP7 r0 = r1.LLLLIIL()
            X.JPw r8 = r1.LJJLJ()
            X.JUo r3 = new X.JUo
            int r4 = r10.hashCode()
            int r5 = r0.LIZ()
            java.lang.Integer r6 = r0.LLILLL()
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.getCurrentAweme()
            X.Jf8 r0 = r10.LLJZ
            if (r0 == 0) goto L4d
            boolean r9 = X.C78855Ux9.LJII(r0)
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L4d:
            java.lang.String r0 = "searchRecyclerView"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment.AR():X.JUo");
    }

    @Override // X.InterfaceC49926Jic
    public final void Dy() {
        C49710Jf8 c49710Jf8 = this.LLJZ;
        if (c49710Jf8 != null) {
            c49710Jf8.LJLJJLL();
            Ym();
            iC();
            return;
        }
        o.LJIJI("searchRecyclerView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC81353VwL
    public final void LJ() {
        Ql("pull_refresh");
        SearchResultParam searchResultParam = this.LJLLJ;
        if (searchResultParam != null) {
            searchResultParam.setEnterMethod("pull_refresh");
        }
        TopProxyFragment topProxyFragment = this.LLJJIII;
        if (topProxyFragment != null) {
            topProxyFragment.Ql("pull_refresh");
        }
        Zm(1, this.LJLJI);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Pm() {
        TopProxyFragment topProxyFragment = this.LLJJIII;
        if (topProxyFragment != null) {
            topProxyFragment.Pm();
            return;
        }
        if (!((AbstractC51036K1g) vn().LJLIL).isDataEmpty() && ((AbstractC51036K1g) vn().LJLIL).isHasMore()) {
            C49825Jgz c49825Jgz = this.LLJL;
            if (c49825Jgz != null) {
                if (c49825Jgz.LJLJLJ) {
                    return;
                }
                vn().LJIILL(4, Kl(), 0, 0, 0, Integer.valueOf(this.LLFF), this.LJLJI, pm());
                return;
            }
            o.LJIJI("model");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC81353VwL
    public final void l0() {
        Context context = GlobalContext.getContext();
        o.LJI(context);
        new C61996OUu(context).LIZ(1);
    }

    @Override // X.InterfaceC49926Jic
    public final void o10() {
        C49710Jf8 c49710Jf8 = this.LLJZ;
        if (c49710Jf8 != null) {
            try {
                ((ReentrantLock) c49710Jf8.LLLIIII).unlock();
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        o.LJIJI("searchRecyclerView");
        throw null;
    }

    @Override // X.InterfaceC49926Jic
    public final void o90() {
        C49710Jf8 c49710Jf8 = this.LLJZ;
        if (c49710Jf8 != null) {
            c49710Jf8.LLLIIL.LIZIZ().clear();
            c49710Jf8.LLLII = true;
        } else {
            o.LJIJI("searchRecyclerView");
            throw null;
        }
    }

    @Override // X.InterfaceC49926Jic
    public final void sN() {
        C49710Jf8 c49710Jf8 = this.LLJZ;
        if (c49710Jf8 != null) {
            ((ReentrantLock) c49710Jf8.LLLIIII).tryLock();
        } else {
            o.LJIJI("searchRecyclerView");
            throw null;
        }
    }

    @Override // X.InterfaceC49926Jic
    public final void uN() {
        JVS jvs = this.LLJZIJLIL;
        if (jvs != null) {
            C49491Jbb c49491Jbb = jvs.LJLJLLL;
            c49491Jbb.LJ.LIZIZ(2);
            c49491Jbb.LIZLLL.LIZIZ(1);
            c49491Jbb.LJII.LIZIZ(1);
            c49491Jbb.LJ.LIZIZ(2);
            if (!C49789JgP.LIZ()) {
                C49494Jbe c49494Jbe = c49491Jbb.LJFF;
                if (c49494Jbe.LIZIZ >= 4) {
                    return;
                }
                C38995FSd.LIZJ().execute(new ARunnableS12S0101000_8(4, c49494Jbe, 28));
                return;
            }
            return;
        }
        o.LJIJI("topFeedAdapter");
        throw null;
    }

    public final C49919JiV<TopFeedFragment> vn() {
        return (C49919JiV) this.LLJJL.getValue();
    }

    public final C49825Jgz xn() {
        C49825Jgz c49825Jgz;
        TopProxyFragment topProxyFragment = this.LLJJIII;
        if (topProxyFragment != null) {
            c49825Jgz = topProxyFragment.LLJJJJJIL;
            if (c49825Jgz == null) {
                o.LJIJI("model");
                throw null;
            }
        } else {
            c49825Jgz = this.LLJL;
            if (c49825Jgz == null) {
                o.LJIJI("model");
                throw null;
            }
        }
        return c49825Jgz;
    }

    public final void An() {
        if (nm() instanceof JVO) {
            JYY jyy = ((JVO) nm()).LJLLLLLL.LJFF;
            RecyclerView Zl = Zl();
            jyy.getClass();
            AsyncLoadConfig asyncLoadConfig = JWC.LIZ;
            if (asyncLoadConfig.enablePreloadAfterFirst && asyncLoadConfig.enableAsyncBind) {
                Zl.post(new ARunnableS27S0200000_8(jyy, Zl, 48));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC223218pR
    public final void Ne() {
        xn();
        C50259Jnz LIZIZ = C50257Jnx.LIZIZ((C50257Jnx) this.LLJJIJIL.getValue(), (SearchApiResult) xn().getData(), null, 2);
        if (LIZIZ != null) {
            on(LIZIZ);
            return;
        }
        Em();
        if (!xm()) {
            Ym();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final Map<String, String> Yl() {
        return LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final String lm() {
        AbstractC49793JgT abstractC49793JgT = (AbstractC49793JgT) vn().LJLIL;
        if (abstractC49793JgT != null) {
            return abstractC49793JgT.LJLLL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        SearchActivityCardBgController searchActivityCardBgController = this.LLJLLL;
        if (searchActivityCardBgController != null) {
            C49710Jf8 c49710Jf8 = this.LLJZ;
            if (c49710Jf8 != null) {
                searchActivityCardBgController.LJII(c49710Jf8, null);
                C49791JgR.LIZIZ(hashCode());
                fm().searchState.removeObservers(this);
                C49724JfM.LIZ.getClass();
                C49724JfM.LIZIZ.LIZLLL();
                C50804Jwm.LJ();
                vn().LIZIZ();
                vn().LJJII();
                VisibilityComparisonPlayer visibilityComparisonPlayer = this.LLL;
                if (visibilityComparisonPlayer != null) {
                    visibilityComparisonPlayer.LJIJI();
                }
                JVS jvs = this.LLJZIJLIL;
                if (jvs != null) {
                    C49491Jbb c49491Jbb = jvs.LJLJLLL;
                    if (c49491Jbb != null) {
                        ((ConcurrentLinkedQueue) c49491Jbb.LJFF.LIZ).clear();
                        Looper looper = c49491Jbb.LJIIIIZZ.getLooper();
                        if (looper != null) {
                            looper.quit();
                        }
                    }
                    C2U8.LIZ(new JRS(hashCode(), 3));
                    return;
                }
                o.LJIJI("topFeedAdapter");
                throw null;
            }
            o.LJIJI("searchRecyclerView");
            throw null;
        }
        o.LJIJI("activityCardBgController");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.post(RunnableC49727JfP.LJLIL);
        }
        Z9N.LIZIZ.LLJILJIL(hashCode());
        C49995Jjj.LJ = hashCode();
    }

    public final void yn() {
        if (vm() || this.LLJJIJIIJIL) {
            VisibilityComparisonPlayer visibilityComparisonPlayer = this.LLL;
            if (visibilityComparisonPlayer != null) {
                visibilityComparisonPlayer.LJIJI();
                return;
            }
            return;
        }
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 319);
        this.LLJJLIIIJLLLLLLLZ.removeCallbacksAndMessages(null);
        this.LLJJLIIIJLLLLLLLZ.postDelayed(new ARunnableS37S0100000_1(aqS158S0100000_8, (InterfaceC65784Pro<C76800UCe>) 119), 500L);
        if (C46446IKs.LJLJLJ) {
            JVD.LIZ(getView(), new AqS158S0100000_8(this, 320));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void zm() {
        C49825Jgz c49825Jgz;
        if (C50365Jph.LIZ()) {
            C49914JiQ c49914JiQ = new C49914JiQ();
            c49914JiQ.LLIIIL = vn();
            c49825Jgz = c49914JiQ;
        } else {
            c49825Jgz = new C49825Jgz();
        }
        this.LLJL = c49825Jgz;
        c49825Jgz.LJZI = true;
        C49707Jf5 c49707Jf5 = c49825Jgz.LLD;
        if (c49707Jf5 != null) {
            c49707Jf5.LJLJI = true;
        }
        vn().LJLILLLLZI = this;
        C49919JiV<TopFeedFragment> vn = vn();
        C49825Jgz c49825Jgz2 = this.LLJL;
        if (c49825Jgz2 != null) {
            vn.LJJIII(c49825Jgz2);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C3CY(mo49getActivity, this, null), 3);
            SearchGlobalViewModel searchGlobalViewModel = this.LLJLLIL;
            if (searchGlobalViewModel != null) {
                searchGlobalViewModel.LJLJLJ.observe(this, new AObserverS76S0100000_8(this, 119));
                SearchStateViewModel fm = fm();
                MutableLiveData<Integer> mutableLiveData = fm.searchState;
                C50044JkW c50044JkW = new C50044JkW();
                c50044JkW.LJLIL = new C49717JfF(this);
                mutableLiveData.observe(this, c50044JkW);
                fm.isRefreshingData.observe(this, new AObserverS76S0100000_8(fm, 103));
                fm.isShowingFilters.observe(this, new AObserverS76S0100000_8(this, 105));
                fm.shouldBlockMediaPlay.observe(this, new AObserverS76S0100000_8(this, 107));
                MutableLiveData<Boolean> mutableLiveData2 = fm.isStopAutoPlayByTns;
                if (mutableLiveData2 == null) {
                    return;
                }
                mutableLiveData2.observe(this, new AObserverS76S0100000_8(this, 108));
                return;
            }
            o.LJIJI("globalViewModel");
            throw null;
        }
        o.LJIJI("model");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String Jl() {
        return this.LLLIIIIL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean wl() {
        return this.LLLIIIL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r1 == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cn(java.util.List<? extends com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed> r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r8.iterator()
        Lc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r2 = r6.next()
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r2 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.getAweme()
            r5 = 0
            if (r0 == 0) goto L6b
            boolean r1 = r0.isAd()
            r0 = 1
            if (r1 != r0) goto L6b
        L26:
            r4 = 6
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r2.getAweme()
            java.lang.String r0 = "searchMixFeed.aweme"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.add(r1)
            com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService r0 = com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService.LJIIJJI()
            X.NIW r1 = r0.LJII()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.getAweme()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            X.C49763Jfz.LIZ(r1, r0, r5, r5, r4)
        L48:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.precisead.core.model.SearchPreciseAd r0 = r2.preciseAd
            if (r0 == 0) goto Lc
            java.util.List r2 = r0.getAwemeCards()
            if (r2 == 0) goto Lc
            r3.addAll(r2)
            com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService r0 = com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService.LJIIJJI()
            X.NIW r1 = r0.LJII()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            X.C49763Jfz.LIZ(r1, r0, r5, r5, r4)
            goto Lc
        L6b:
            r0 = 0
            goto L26
        L6d:
            com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService r0 = com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJJI()
            if (r0 == 0) goto L7c
            r0.LJI()
            X.NHG r1 = X.NHG.LIZ
            r0 = 0
            r1.LJIILJJIL(r0, r3)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment.Cn(java.util.List):void");
    }

    public final void Dn(GlobalDoodleConfig globalDoodleConfig) {
        if (globalDoodleConfig == null) {
            return;
        }
        JVS jvs = this.LLJZIJLIL;
        if (jvs != null) {
            jvs.LJLJLJ = globalDoodleConfig;
            SearchActivityCardBgController searchActivityCardBgController = this.LLJLLL;
            if (searchActivityCardBgController != null) {
                C49710Jf8 c49710Jf8 = this.LLJZ;
                if (c49710Jf8 != null) {
                    searchActivityCardBgController.LJI(globalDoodleConfig, c49710Jf8);
                    return;
                } else {
                    o.LJIJI("searchRecyclerView");
                    throw null;
                }
            }
            o.LJIJI("activityCardBgController");
            throw null;
        }
        o.LJIJI("topFeedAdapter");
        throw null;
    }

    @Override // X.InterfaceC49926Jic
    public final void Fs0(SearchMixFeedList data) {
        String str;
        o.LJIIIZ(data, "data");
        C49715JfD.LIZJ(this, data);
        C49710Jf8 c49710Jf8 = this.LLJZ;
        String str2 = null;
        if (c49710Jf8 != null) {
            c49710Jf8.LJLJJLL();
            if (getUserVisibleHint()) {
                C49921JiX.LJ(this.LJLLJ).LJIILJJIL();
                C49922JiY.LIZLLL(this.LJLLJ).LJIIIZ();
            }
            List<SearchMixFeed> list = data.mItems;
            boolean z = data.hasMore;
            C49369JZd c49369JZd = C49369JZd.LIZ;
            o.LJIIIIZZ(list, "list");
            c49369JZd.getClass();
            List LIZLLL = C49369JZd.LIZLLL(list);
            if (list.isEmpty()) {
                Ne();
            } else {
                C36524EVc.LIZ(1000L, 2, 8);
                J5(LIZLLL, z);
            }
            if (!xn().isLoading() && getView() != null) {
                View view = getView();
                o.LJI(view);
                view.post(new ARunnableS27S0200000_8(this, data, 40));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRefreshResultComplete, logId: ");
            LogPbBean logPbBean = data.logPb;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(", haveDynamicHeader: ");
            LIZ.append(this.LLIIJI);
            LIZ.append(", tnsBanType: ");
            GlobalDoodleConfig globalDoodleConfig = this.LLIIIL;
            if (globalDoodleConfig != null) {
                str2 = globalDoodleConfig.getTnsBanType();
            }
            LIZ.append(str2);
            X1D.LIZIZ(LIZ);
            if (C49751Jfn.LIZ == 0 || C49751Jfn.LIZ()) {
                yn();
                return;
            }
            return;
        }
        o.LJIJI("searchRecyclerView");
        throw null;
    }

    @Override // X.InterfaceC49926Jic
    public final void Gd0(GlobalDoodleConfig globalDoodleConfig) {
        C49715JfD.LIZ(this, globalDoodleConfig);
        this.LLLFZ = C50028JkG.LIZ(globalDoodleConfig, this.LJLLILLLL, this.LLLFZ, mo49getActivity());
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void Gl(SearchResultParam searchResultParam) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
        super.Gl(searchResultParam);
        if (Om()) {
            JVS jvs = this.LLJZIJLIL;
            if (jvs != null) {
                jvs.LJLJL = searchResultParam;
            } else {
                o.LJIJI("topFeedAdapter");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC49926Jic
    public final void H30(boolean z) {
        nm().setShowFooter(z);
    }

    @Override // X.InterfaceC49926Jic
    public final void J70(SearchMixFeedList data) {
        boolean z;
        boolean z2;
        boolean z3;
        Boolean showResearchFilter;
        o.LJIIIZ(data, "data");
        va(data);
        wa(data.queryCorrectInfo);
        ua(data);
        GlobalDoodleConfig globalDoodleConfig = data.globalDoodleConfig;
        if (globalDoodleConfig != null && (showResearchFilter = globalDoodleConfig.getShowResearchFilter()) != null) {
            z = showResearchFilter.booleanValue();
        } else {
            z = false;
        }
        sm(z);
        GlobalDoodleConfig globalDoodleConfig2 = data.globalDoodleConfig;
        if (globalDoodleConfig2 != null) {
            z2 = globalDoodleConfig2.getCanPullRefresh();
        } else {
            z2 = false;
        }
        un(z2);
        Boolean hasShownResearchFilter = this.LJLJJI.getHasShownResearchFilter();
        if (hasShownResearchFilter != null) {
            z3 = hasShownResearchFilter.booleanValue();
        } else {
            z3 = false;
        }
        jn(z3);
        C49369JZd c49369JZd = C49369JZd.LIZ;
        List<SearchMixFeed> list = data.mItems;
        o.LJIIIIZZ(list, "data.items");
        c49369JZd.getClass();
        List LIZLLL = C49369JZd.LIZLLL(list);
        GlobalDoodleConfig globalDoodleConfig3 = data.globalDoodleConfig;
        if (globalDoodleConfig3 != null && o.LJ(globalDoodleConfig3.getHideResults(), Boolean.TRUE)) {
            nm().setData(new ArrayList());
        } else {
            JVO jvo = (JVO) nm();
            jvo.LJLL.LIZJ(new AObjectS31S0000000_8(7), LIZLLL);
            jvo.mmItems = ORZ.LLJILJILJ(LIZLLL);
            jvo.notifyDataSetChanged();
            C49491Jbb.LJIIIZ.set(0);
        }
        o10();
        Dy();
        if (!xm()) {
            SearchFragment.rn(LIZLLL);
        }
    }

    @Override // X.InterfaceC49926Jic
    public final void JC(boolean z) {
        Rm(z);
        C8HS<SearchMixFeed> nm = nm();
        C49710Jf8 c49710Jf8 = this.LLJZ;
        if (c49710Jf8 != null) {
            C49956Jj6.LIZJ(c49710Jf8, nm);
            an(0L, new ARunnableS44S0100000_8(this, 51));
            LynxPrefetchConfig lynxPrefetchConfig = C49735JfX.LIZ;
            if (lynxPrefetchConfig.prefetchAfterFirst) {
                an(lynxPrefetchConfig.delayTime, new ARunnableS44S0100000_8(this, 52));
            }
            bk();
            return;
        }
        o.LJIJI("searchRecyclerView");
        throw null;
    }

    @Override // X.InterfaceC49926Jic
    public final void L8(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        if (throwable instanceof CancellationException) {
            return;
        }
        nc(new Exception(throwable));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void Pl(boolean z) {
        super.Pl(z);
        SearchActivityCardBgController searchActivityCardBgController = this.LLJLLL;
        if (searchActivityCardBgController != null) {
            searchActivityCardBgController.LJIIIIZZ(z);
        } else {
            o.LJIJI("activityCardBgController");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Rm(boolean z) {
        if (xm()) {
            return;
        }
        if (this.LLJL != null) {
            if (!r0.LJLJLJ) {
                C10K.LIZJ(new ACallableS36S0110000_8(this, z, 0));
                return;
            }
            return;
        }
        o.LJIJI("model");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Tl(View view) {
        o.LJIIIZ(view, "view");
        super.Tl(view);
        View findViewById = view.findViewById(R.id.jfq);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.s…rch_fragment_root_layout)");
        this.LLLI = (FrameLayout) findViewById;
        C50243Jnj c50243Jnj = new C50243Jnj(mo49getActivity());
        this.LLLII = c50243Jnj;
        FrameLayout frameLayout = this.LLLI;
        if (frameLayout != null) {
            frameLayout.setBackground(c50243Jnj);
            un(true);
        } else {
            o.LJIJI("fragmentRootLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC49926Jic
    public final void XJ(SearchMixFeedList data) {
        o.LJIIIZ(data, "data");
        C49715JfD.LIZIZ(this, data);
        List<SearchMixFeed> list = data.mItems;
        boolean z = data.hasMore;
        if (!data.LJLJI) {
            tn(data, false);
        }
        o.LJIIIIZZ(list, "list");
        if (!list.isEmpty()) {
            C36524EVc.LIZ(500L, 2, 8);
        }
        C49369JZd.LIZ.getClass();
        j0(C49369JZd.LIZLLL(list), z);
        Cn(list);
        An();
    }

    @Override // X.InterfaceC49926Jic
    public final void eI(SearchMixFeedList data) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        Boolean showResearchFilter;
        o.LJIIIZ(data, "data");
        tn(data, true);
        Dn(data.globalDoodleConfig);
        GlobalDoodleConfig globalDoodleConfig = data.globalDoodleConfig;
        if (globalDoodleConfig != null && (showResearchFilter = globalDoodleConfig.getShowResearchFilter()) != null) {
            z = showResearchFilter.booleanValue();
        } else {
            z = false;
        }
        sm(z);
        Boolean hasShownResearchFilter = this.LJLJJI.getHasShownResearchFilter();
        if (hasShownResearchFilter != null) {
            z2 = hasShownResearchFilter.booleanValue();
        } else {
            z2 = false;
        }
        jn(z2);
        DynamicPatch dynamicPatch = data.dynamicMask;
        GlobalDoodleConfig globalDoodleConfig2 = data.globalDoodleConfig;
        if (globalDoodleConfig2 != null) {
            str = globalDoodleConfig2.getUseScenario();
        } else {
            str = null;
        }
        xa(dynamicPatch, str);
        GlobalDoodleConfig globalDoodleConfig3 = data.globalDoodleConfig;
        if (globalDoodleConfig3 == null || globalDoodleConfig3.getDisplayFilterBar() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        ra(z3);
        pa(data);
        C49791JgR.LIZLLL(Integer.valueOf(hashCode()), data.mBacktrace);
        if (!xm() && data.extra != null) {
            C49921JiX.LJ(this.LJLLJ).LJ(data.extra.server_stream_time);
        }
        if (C49751Jfn.LIZ == 1 || C49751Jfn.LIZ()) {
            yn();
        }
    }

    @Override // X.InterfaceC49926Jic
    public final void gl(SearchMixFeedList data) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        Boolean showResearchFilter;
        o.LJIIIZ(data, "data");
        va(data);
        Dn(data.globalDoodleConfig);
        GlobalDoodleConfig globalDoodleConfig = data.globalDoodleConfig;
        if (globalDoodleConfig != null && (showResearchFilter = globalDoodleConfig.getShowResearchFilter()) != null) {
            z = showResearchFilter.booleanValue();
        } else {
            z = false;
        }
        sm(z);
        GlobalDoodleConfig globalDoodleConfig2 = data.globalDoodleConfig;
        if (globalDoodleConfig2 != null) {
            z2 = globalDoodleConfig2.getCanPullRefresh();
        } else {
            z2 = false;
        }
        un(z2);
        Boolean hasShownResearchFilter = this.LJLJJI.getHasShownResearchFilter();
        if (hasShownResearchFilter != null) {
            z3 = hasShownResearchFilter.booleanValue();
        } else {
            z3 = false;
        }
        jn(z3);
        ua(data);
        DynamicPatch dynamicPatch = data.dynamicMask;
        GlobalDoodleConfig globalDoodleConfig3 = data.globalDoodleConfig;
        Boolean bool = null;
        if (globalDoodleConfig3 != null) {
            str = globalDoodleConfig3.getUseScenario();
        } else {
            str = null;
        }
        xa(dynamicPatch, str);
        wa(data.queryCorrectInfo);
        GlobalDoodleConfig globalDoodleConfig4 = data.globalDoodleConfig;
        if (globalDoodleConfig4 == null || globalDoodleConfig4.getDisplayFilterBar() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        ra(z4);
        pa(data);
        C49791JgR.LIZLLL(Integer.valueOf(hashCode()), data.mBacktrace);
        if (!xm()) {
            C49921JiX.LJ(this.LJLLJ).LJ(data.extra.server_stream_time);
            C49920JiW LJ = C49921JiX.LJ(this.LJLLJ);
            GlobalDoodleConfig globalDoodleConfig5 = data.globalDoodleConfig;
            if (globalDoodleConfig5 != null) {
                bool = globalDoodleConfig5.getShowResearchFilter();
            }
            LJ.getClass();
            if (o.LJ(bool, Boolean.TRUE)) {
                LJ.LJJIJIIJIL = 1;
            }
        }
        if (C49751Jfn.LIZ == 1 || C49751Jfn.LIZ()) {
            yn();
        }
        Cn(data.mItems);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        C44729Hgz.LJJJJZ(this, EnumC46469ILp.GENERAL_SEARCH);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCloseLynxCardEvent(C9CX event) {
        TopProxyFragment topProxyFragment;
        o.LJIIIZ(event, "event");
        C8HS<SearchMixFeed> nm = nm();
        if ((nm instanceof JVO) && nm != null) {
            int i = event.LJLIL;
            List<SearchMixFeed> list = nm.mmItems;
            if (list == null || i < 0 || i >= list.size()) {
                return;
            }
            Iterator<SearchMixFeed> it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (it.next().LJLILLLLZI == i) {
                    if (i2 == -1) {
                        return;
                    }
                    Object remove = ListProtector.remove(list, i2);
                    nm.notifyItemRemoved(i2);
                    nm.notifyItemRangeChanged(i2, list.size() - i2);
                    if (remove == null) {
                        return;
                    }
                    ((AbstractC51036K1g) vn().LJLIL).deleteItem(remove);
                    if (!xm() || (topProxyFragment = this.LLJJIII) == null) {
                        return;
                    }
                    C49825Jgz c49825Jgz = topProxyFragment.LLJJJJJIL;
                    if (c49825Jgz != null) {
                        c49825Jgz.deleteItem(remove);
                        return;
                    } else {
                        o.LJIJI("model");
                        throw null;
                    }
                }
                i2++;
            }
        }
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onReceiveCancelEvent(C49798JgY c49798JgY) {
        if (c49798JgY == null || !getUserVisibleHint()) {
            return;
        }
        C49950Jj0.LIZLLL(new AqS174S0100000_8(c49798JgY, 112));
    }

    @QD3
    public final void onReceiveFeaturedAnswerAwemeListMerge(C2PJ event) {
        o.LJIIIZ(event, "event");
        if (!getUserVisibleHint()) {
            return;
        }
        C55457Lpd.LJLJJLL = xn();
    }

    @QD3
    public final void onReceiveHotSpotAwemeListMerge(C57852Ov event) {
        o.LJIIIZ(event, "event");
        if (!getUserVisibleHint()) {
            return;
        }
        C55457Lpd.LJLJJLL = xn();
        C55457Lpd.LJLLI = 71;
    }

    @QD3
    public final void onReceiveUserLynxLiveAwemeListMerge(C2P2 event) {
        o.LJIIIZ(event, "event");
        if (!getUserVisibleHint()) {
            return;
        }
        C55457Lpd.LJLJJLL = xn();
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        int LJIJ;
        LinearLayoutManager linearLayoutManager;
        Aweme aweme;
        Aweme aweme2;
        Map<String, String> searchExtraParams;
        String str;
        Aweme aweme3;
        o.LJIIIZ(event, "event");
        if (event.LJLJLJ == -1 || !isViewValid() || !getUserVisibleHint() || event.LJLIL != 66) {
            return;
        }
        int i = 0;
        if (C46447IKt.LJLJLJ) {
            Object obj = event.LJLILLLLZI;
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            Aweme aweme4 = (Aweme) obj;
            if ((event.LJLJJLL > 0 || C50620Jto.LIZ()) && !o.LJ(aweme4.getSearchFeedType(), "SearchHotSpot")) {
                JVS jvs = this.LLJZIJLIL;
                if (jvs != null) {
                    jvs.LL(aweme4, !event.LJLL, event.LJLJJLL, event.LJLJLLL);
                } else {
                    o.LJIJI("topFeedAdapter");
                    throw null;
                }
            }
            JWY jwy = this.LLLFFI;
            if (jwy == null) {
                return;
            }
            jwy.LIZIZ(event);
            return;
        }
        int i2 = event.LJLJLJ;
        if ((i2 == 65280 || ((i2 == 71 && C50524JsG.LIZ()) || C52411Khb.LIZ())) && (event.LJLILLLLZI instanceof Aweme)) {
            if (event.LJLJLJ == 71 && C52411Khb.LIZ()) {
                Object obj2 = event.LJLILLLLZI;
                o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                ((Aweme) obj2).setSearchFeedType("SearchHotSpot");
            }
            Object obj3 = event.LJLILLLLZI;
            o.LJII(obj3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            Aweme aweme5 = (Aweme) obj3;
            if ((C52411Khb.LIZ() || C50524JsG.LIZ()) && o.LJ(aweme5.getSearchFeedType(), "SearchHotSpot")) {
                JVS jvs2 = this.LLJZIJLIL;
                if (jvs2 != null) {
                    LJIJ = jvs2.LJIJ();
                } else {
                    o.LJIJI("topFeedAdapter");
                    throw null;
                }
            } else if (aweme5.isLive() && C50452Jr6.LIZ()) {
                JVS jvs3 = this.LLJZIJLIL;
                if (jvs3 != null) {
                    LJIJ = jvs3.LJJLIIIJL(aweme5.getAid());
                } else {
                    o.LJIJI("topFeedAdapter");
                    throw null;
                }
            } else {
                JVS jvs4 = this.LLJZIJLIL;
                if (jvs4 != null) {
                    LJIJ = jvs4.LJLLLLLL(aweme5);
                } else {
                    o.LJIJI("topFeedAdapter");
                    throw null;
                }
            }
            if (LJIJ == -1) {
                JVS jvs5 = this.LLJZIJLIL;
                if (jvs5 != null) {
                    SearchMixFeed LJLZ = jvs5.LJLZ();
                    if (LJLZ != null && (aweme = LJLZ.getAweme()) != null && TrendingDetailServiceImpl.LIZLLL().LIZ()) {
                        JVS jvs6 = this.LLJZIJLIL;
                        if (jvs6 != null) {
                            if (jvs6.LJZI()) {
                                JVS jvs7 = this.LLJZIJLIL;
                                if (jvs7 != null) {
                                    LJIJ = jvs7.LJLLLLLL(aweme);
                                    JVS jvs8 = this.LLJZIJLIL;
                                    if (jvs8 != null) {
                                        SearchMixFeed LJLZ2 = jvs8.LJLZ();
                                        if (LJLZ2 != null && (aweme2 = LJLZ2.getAweme()) != null && (searchExtraParams = aweme2.getSearchExtraParams()) != null) {
                                            searchExtraParams.remove("is_click_trending_native_card_enter");
                                        }
                                    } else {
                                        o.LJIJI("topFeedAdapter");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("topFeedAdapter");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("topFeedAdapter");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("topFeedAdapter");
                    throw null;
                }
            }
            int size = ((ArrayList) dm().LJZI()).size() + LJIJ;
            if (size != -1) {
                C49710Jf8 c49710Jf8 = this.LLJZ;
                if (c49710Jf8 != null) {
                    C0A2 layoutManager = c49710Jf8.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                        linearLayoutManager.LJFF(size, 0);
                    }
                } else {
                    o.LJIJI("searchRecyclerView");
                    throw null;
                }
            }
            C55457Lpd.LJLLI = -1;
            boolean z = event.LJLL;
            long j = event.LJLJJLL;
            int i3 = event.LJLJLJ;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                i = mo49getActivity.hashCode();
            }
            C2U8.LIZIZ(new IN8(aweme5, z, j, i3, i, event.LJLJLLL));
            if (event.LJLJJLL > 0 && !o.LJ(aweme5.getSearchFeedType(), "SearchHotSpot") && event.LJLJLJ != 65458) {
                JVS jvs9 = this.LLJZIJLIL;
                if (jvs9 != null) {
                    jvs9.LL(aweme5, !event.LJLL, event.LJLJJLL, event.LJLJLLL);
                } else {
                    o.LJIJI("topFeedAdapter");
                    throw null;
                }
            }
        }
        Object obj4 = event.LJLILLLLZI;
        if (obj4 != null) {
            if ((obj4 instanceof Aweme) && (aweme3 = (Aweme) obj4) != null) {
                str = aweme3.getSearchFeedType();
            } else {
                str = null;
            }
            if (o.LJ(str, "SearchHotSpot")) {
                return;
            }
        }
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 322);
        this.LLJJLIIIJLLLLLLLZ.removeCallbacksAndMessages(null);
        this.LLJJLIIIJLLLLLLLZ.postDelayed(new ARunnableS37S0100000_1(aqS158S0100000_8, (InterfaceC65784Pro<C76800UCe>) 119), 500L);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void pn(FollowStatus followStatus) {
        o.LJIIIZ(followStatus, "followStatus");
        if (!isViewValid()) {
            return;
        }
        JVS jvs = this.LLJZIJLIL;
        if (jvs != null) {
            List<T> list = jvs.mmItems;
            if (list == 0 || list.isEmpty() || TextUtils.isEmpty(followStatus.userId)) {
                return;
            }
            for (T t : list) {
                if (t.getAweme() != null) {
                    jvs.LLD(followStatus, t.getAweme().getAuthor());
                } else {
                    List<SearchUser> list2 = t.users;
                    if (list2 != null) {
                        Iterator<SearchUser> it = list2.iterator();
                        while (it.hasNext()) {
                            List<Aweme> list3 = it.next().awemeCards;
                            if (list3 != null) {
                                Iterator<Aweme> it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    jvs.LLD(followStatus, it2.next().getAuthor());
                                }
                            }
                        }
                    } else {
                        List<SearchChallenge> list4 = t.challengeList;
                        if (list4 != null) {
                            Iterator<SearchChallenge> it3 = list4.iterator();
                            while (it3.hasNext()) {
                                List<Aweme> awemes = it3.next().getAwemes();
                                if (awemes != null) {
                                    Iterator<Aweme> it4 = awemes.iterator();
                                    while (it4.hasNext()) {
                                        jvs.LLD(followStatus, it4.next().getAuthor());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        o.LJIJI("topFeedAdapter");
        throw null;
    }

    @Override // X.InterfaceC49926Jic
    public final void s6(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        if (throwable instanceof CancellationException) {
            return;
        }
        if (throwable instanceof Exception) {
            cb0((Exception) throwable);
        } else {
            cb0(new Exception(throwable));
        }
        wa(null);
        ua(null);
        xa(null, null);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void searchHorizontalParam(C49737JfZ event) {
        int i;
        Activity LJIJJ;
        o.LJIIIZ(event, "event");
        if (!getUserVisibleHint()) {
            return;
        }
        String str = event.LJLIL.LJIIJ;
        Context context = getContext();
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            i = LJIJJ.hashCode();
        } else {
            i = 0;
        }
        if (o.LJ(str, String.valueOf(i))) {
            ((SearchTabHorizontalVM) this.LLLIIL.getValue()).vv0(event.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "1527825370337030638");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/search/pages/result/topsearch/topfeed/TopFeedFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/topsearch/topfeed/TopFeedFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        boolean userVisibleHint = getUserVisibleHint();
        super.setUserVisibleHint(z);
        if (this.LLJZ == null) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/topsearch/topfeed/TopFeedFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
            return;
        }
        C49578Jd0 c49578Jd0 = this.LLLF;
        if (c49578Jd0 != null) {
            c49578Jd0.LIZIZ(Boolean.valueOf(z));
        }
        if (userVisibleHint != z) {
            EventCenter eventCenter = this.LLJLIL;
            if (eventCenter != null) {
                eventCenter.jv0(Boolean.valueOf(z), "mix_feed_fragment_status");
            } else {
                o.LJIJI("eventCenter");
                throw null;
            }
        }
        SearchGlobalViewModel searchGlobalViewModel = this.LLJLLIL;
        if (searchGlobalViewModel != null) {
            searchGlobalViewModel.LJLJLLL.setValue(new C49554Jcc(hashCode(), z));
            MusicPlayHelper musicPlayHelper = this.LLJLILLLLZIIL;
            if (musicPlayHelper != null) {
                musicPlayHelper.hv0();
                c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/topsearch/topfeed/TopFeedFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
                return;
            } else {
                o.LJIJI("musicPlayHelper");
                throw null;
            }
        }
        o.LJIJI("globalViewModel");
        throw null;
    }

    @Override // X.InterfaceC49926Jic
    public final void u80(SearchMixFeedList data) {
        boolean z;
        boolean z2;
        boolean z3;
        Boolean showResearchFilter;
        o.LJIIIZ(data, "data");
        C49710Jf8 c49710Jf8 = this.LLJZ;
        if (c49710Jf8 != null) {
            c49710Jf8.LLLI = false;
            List<SearchMixFeed> data2 = nm().getData();
            if (data2 != null) {
                data2.clear();
            }
            va(data);
            wa(data.queryCorrectInfo);
            ua(data);
            GlobalDoodleConfig globalDoodleConfig = data.globalDoodleConfig;
            if (globalDoodleConfig != null && (showResearchFilter = globalDoodleConfig.getShowResearchFilter()) != null) {
                z = showResearchFilter.booleanValue();
            } else {
                z = false;
            }
            sm(z);
            GlobalDoodleConfig globalDoodleConfig2 = data.globalDoodleConfig;
            if (globalDoodleConfig2 != null) {
                z2 = globalDoodleConfig2.getCanPullRefresh();
            } else {
                z2 = false;
            }
            un(z2);
            Boolean hasShownResearchFilter = this.LJLJJI.getHasShownResearchFilter();
            if (hasShownResearchFilter != null) {
                z3 = hasShownResearchFilter.booleanValue();
            } else {
                z3 = false;
            }
            jn(z3);
            C49369JZd c49369JZd = C49369JZd.LIZ;
            List<SearchMixFeed> list = data.mItems;
            o.LJIIIIZZ(list, "data.items");
            c49369JZd.getClass();
            List LIZLLL = C49369JZd.LIZLLL(list);
            GlobalDoodleConfig globalDoodleConfig3 = data.globalDoodleConfig;
            if (globalDoodleConfig3 != null && o.LJ(globalDoodleConfig3.getHideResults(), Boolean.TRUE)) {
                nm().setData(new ArrayList());
            } else {
                nm().mmItems = ORZ.LLJILJILJ(LIZLLL);
            }
            nm().setShowFooter(false);
            if (!xm()) {
                SearchFragment.rn(LIZLLL);
                return;
            }
            return;
        }
        o.LJIJI("searchRecyclerView");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void un(boolean r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L38
            X.JoR r0 = r3.LJLJI
            boolean r0 = com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment.Mm(r0)
            if (r0 == 0) goto L38
            com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.proxy.TopProxyFragment r0 = r3.LLJJIII
            if (r0 == 0) goto L36
            X.JoR r0 = r0.LJLJI
        L11:
            boolean r0 = com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment.Mm(r0)
            if (r0 == 0) goto L38
            r1 = 1
        L18:
            X.Ol8 r0 = X.C49799JgZ.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L2e
            X.Vw3 r0 = r3.cm()
            r0.setEnabled(r2)
        L2d:
            return
        L2e:
            X.Vw3 r0 = r3.cm()
            r0.setEnabled(r1)
            goto L2d
        L36:
            r0 = 0
            goto L11
        L38:
            r1 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment.un(boolean):void");
    }

    @Override // X.InterfaceC48970JJu
    public final void yd(JYM jym) {
        C1AT c1at;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        int i;
        Integer num;
        String str7;
        String str8;
        String str9;
        String str10;
        C50433Jqn searchCommonModel;
        Integer valueOf;
        ISearchContextAbility LJJJJJL;
        AbstractC50059Jkl<C49589JdB> IO;
        C49589JdB LIZJ;
        C50650JuI immutableData;
        C49636Jdw searchSessionModel;
        C50948Jz6 searchEnterParam;
        new C50699Jv5(this).LJI();
        View view = jym.LIZ;
        if (C6ZT.LIZ(view) || jym.LIZIZ == null || mo49getActivity() == null) {
            return;
        }
        C36524EVc.LIZ(2000L, 2, 8);
        Aweme aweme = jym.LIZIZ;
        Product product = jym.LJ;
        C55457Lpd.LJLJJLL = xn();
        JQA jqa = jym.LIZLLL;
        if (view != null) {
            c1at = C020506f.LIZIZ(view, view.getWidth() / 2, view.getHeight() / 2);
        } else {
            c1at = null;
        }
        C50964JzM.LIZLLL();
        SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), "//aweme/detail");
        buildRoute.withParam("id", aweme.getAid());
        buildRoute.withParam("refer", this.LLLIIIIL);
        buildRoute.withParam("video_from", "from_search_mix");
        buildRoute.withParam("profile_enterprise_type", aweme.getEnterpriseType());
        buildRoute.withParam("page_type", 9);
        buildRoute.withParam("search_keyword", Kl());
        buildRoute.withParam("is_update_search_result_id", true);
        if (jqa != null) {
            str = jqa.LJII;
        } else {
            str = null;
        }
        buildRoute.withParam("search_id", str);
        if (jqa != null) {
            str2 = jqa.LJII;
        } else {
            str2 = null;
        }
        buildRoute.withParam("playlist_search_id", str2);
        buildRoute.withParam("is_from_video", 1);
        if (jqa != null) {
            str3 = jqa.LIZJ;
        } else {
            str3 = null;
        }
        buildRoute.withParam("key_search_type", str3);
        buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
        if (jqa != null) {
            str4 = jqa.LJIJI;
        } else {
            str4 = null;
        }
        buildRoute.withParam("tns_ban_type", str4);
        if (jqa != null) {
            str5 = jqa.LJIJJ;
        } else {
            str5 = null;
        }
        buildRoute.withParam("use_scenario", str5);
        SearchResultParam searchResultParam = this.LJLLILLLL;
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
            str6 = searchEnterParam.getPreviousPage();
        } else {
            str6 = null;
        }
        buildRoute.withParam("previous_page", str6);
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        C50652JuK LJIIJ = C50651JuJ.LJIIJ(mo49getActivity);
        if (LJIIJ != null && (immutableData = LJIIJ.getImmutableData()) != null && (searchSessionModel = immutableData.getSearchSessionModel()) != null) {
            l = searchSessionModel.getSearchSessionId();
        } else {
            l = null;
        }
        buildRoute.withParam("search_session_id", l);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (LJJJJJL = C17N.LJJJJJL(mo49getActivity2)) != null && (IO = LJJJJJL.IO()) != null && (LIZJ = IO.LIZJ()) != null) {
            TMC.LJIIJ(C50651JuJ.LJIIJ(mo49getActivity()), LIZJ, "TopFeedFragment 552");
        }
        if (product != null) {
            buildRoute.withParam("feed_anchor_custom_data", new AnchorCustomData(true, false, C49365JYz.LIZLLL(C49365JYz.LIZJ(aweme, product, jqa)), null, null, null, null, 122, null));
        }
        if (c1at != null) {
            buildRoute.withBundleAnimation(c1at.LIZLLL());
            buildRoute.withParam("activity_has_activity_options", true);
        }
        buildRoute.open();
        C77125UOr.LJIJ(aweme);
        if (Zl().getLayoutManager() != null && view != null && (valueOf = Integer.valueOf(C0A2.LJJJLL(view))) != null) {
            i = valueOf.intValue();
        } else {
            i = -1;
        }
        if (jqa != null) {
            num = Integer.valueOf(jqa.LJIIL);
        } else {
            num = null;
        }
        String str11 = this.LLLIIIIL;
        String Kl = Kl();
        if (num != null) {
            i = num.intValue();
        }
        JNW.LJ(view, str11, aweme, Kl, i);
        SurveyViewModel surveyViewModel = this.LLJLL;
        if (surveyViewModel != null) {
            surveyViewModel.LJLJI.postValue(Boolean.TRUE);
            C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
            OSZ[] oszArr = new OSZ[15];
            oszArr[0] = new OSZ("token_type", "video");
            oszArr[1] = new OSZ("is_aladdin", String.valueOf(0));
            oszArr[2] = new OSZ("search_result_id", aweme.getAid());
            oszArr[3] = new OSZ("rank", String.valueOf(aweme.getRank()));
            oszArr[4] = new OSZ("is_search_scene", "1");
            oszArr[5] = new OSZ("search_keyword", Kl());
            oszArr[6] = new OSZ("search_type", "general");
            String str12 = "";
            if (jqa == null || (str7 = jqa.LJII) == null) {
                str7 = "";
            }
            oszArr[7] = new OSZ("search_id", str7);
            oszArr[8] = new OSZ("is_from_video", "1");
            C50650JuI LJII = C50651JuJ.LJII(requireActivity());
            if (LJII == null || (searchCommonModel = LJII.getSearchCommonModel()) == null || (str8 = searchCommonModel.getEnterFrom()) == null) {
                str8 = "";
            }
            oszArr[9] = new OSZ("search_entrance", str8);
            oszArr[10] = new OSZ("list_item_id", aweme.getAid());
            if (jqa == null || (str9 = jqa.LJFF) == null) {
                str9 = "";
            }
            oszArr[11] = new OSZ("enter_from_merge", str9);
            String requestId = aweme.getRequestId();
            if (requestId != null) {
                str12 = requestId;
            }
            oszArr[12] = new OSZ("request_id", str12);
            if (aweme.isLive()) {
                str10 = "live_cover";
            } else {
                str10 = "video_cell";
            }
            oszArr[13] = new OSZ("enter_method", str10);
            oszArr[14] = new OSZ("group_id", aweme.getAid());
            Map LJJL = C113554cx.LJJL(oszArr);
            c50654JuM.getClass();
            C50654JuM.LIZJ(LJJL, false);
            return;
        }
        o.LJIJI("surveyViewModel");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Cm(View view, Bundle bundle) {
        C49710Jf8 c49710Jf8;
        ViewGroup cm;
        ViewGroup cm2;
        o.LJIIIZ(view, "view");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LLJLIL = (EventCenter) ViewModelProviders.of(mo49getActivity).get(EventCenter.class);
            this.LLJLILLLLZIIL = (MusicPlayHelper) ViewModelProviders.of(mo49getActivity).get(MusicPlayHelper.class);
            RecyclerView Zl = Zl();
            C50243Jnj c50243Jnj = this.LLLII;
            if (c50243Jnj != null) {
                this.LLJLLL = new SearchActivityCardBgController(mo49getActivity, Zl, c50243Jnj);
                this.LLJLL = (SurveyViewModel) ViewModelProviders.of(mo49getActivity).get(SurveyViewModel.class);
                this.LLJLLIL = (SearchGlobalViewModel) ViewModelProviders.of(mo49getActivity).get(SearchGlobalViewModel.class);
            } else {
                o.LJIJI("activityCardGradientDrawable");
                throw null;
            }
        }
        RecyclerView Zl2 = Zl();
        if ((Zl2 instanceof C49710Jf8) && (c49710Jf8 = (C49710Jf8) Zl2) != null) {
            c49710Jf8.setHasFixedSize(true);
            c49710Jf8.setContainerProvider((JW7) this.LLLIIII.getValue());
            if (!C49789JgP.LIZ()) {
                c49710Jf8.getRecycledViewPool().setMaxRecycledViews(1, 8);
            }
            this.LLJZ = c49710Jf8;
            if (!C46446IKs.LJLJLJ) {
                C49710Jf8 c49710Jf82 = this.LLJZ;
                if (c49710Jf82 != null) {
                    if (C49111JPf.LIZ()) {
                        cm2 = this.LLLI;
                        if (cm2 == null) {
                            o.LJIJI("fragmentRootLayout");
                            throw null;
                        }
                    } else {
                        cm2 = cm();
                    }
                    JYE jye = new JYE(cm2, c49710Jf82);
                    SearchStateViewModel fm = fm();
                    SearchGlobalViewModel searchGlobalViewModel = this.LLJLLIL;
                    if (searchGlobalViewModel != null) {
                        this.LLL = new VisibilityComparisonPlayer(this, jye, fm, searchGlobalViewModel);
                    } else {
                        o.LJIJI("globalViewModel");
                        throw null;
                    }
                } else {
                    o.LJIJI("searchRecyclerView");
                    throw null;
                }
            } else {
                this.LLLF = new C49578Jd0();
                this.LLLFFI = new JWY(Zl(), null, null, new AqS158S0100000_8(this, 321));
                Taco LIZJ = C49218JTi.LIZJ(this, "single_column");
                C49710Jf8 c49710Jf83 = this.LLJZ;
                if (c49710Jf83 != null) {
                    if (C49111JPf.LIZ()) {
                        cm = this.LLLI;
                        if (cm == null) {
                            o.LJIJI("fragmentRootLayout");
                            throw null;
                        }
                    } else {
                        cm = cm();
                    }
                    JY9 jy9 = new JY9(LIZJ, new JYE(cm, c49710Jf83));
                    this.LLLFF = jy9;
                    Taco.LIZIZ(LIZJ, jy9);
                    JWY jwy = this.LLLFFI;
                    if (jwy != null) {
                        Taco.LIZIZ(LIZJ, jwy);
                        SearchStateViewModel fm2 = fm();
                        SearchFragment searchFragment = this.LLJJIII;
                        if (searchFragment == null) {
                            searchFragment = this;
                        }
                        LIZJ.LIZJ(new C49580Jd2(fm2, searchFragment));
                        C49578Jd0 c49578Jd0 = this.LLLF;
                        if (c49578Jd0 != null) {
                            LIZJ.LIZJ(c49578Jd0);
                            LIZJ.LJIIIIZZ();
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    o.LJIJI("searchRecyclerView");
                    throw null;
                }
            }
            super.Cm(view, bundle);
            C8HS<SearchMixFeed> nm = nm();
            C49710Jf8 c49710Jf84 = this.LLJZ;
            if (c49710Jf84 != null) {
                C49956Jj6.LIZ(c49710Jf84, nm);
                C49710Jf8 c49710Jf85 = this.LLJZ;
                if (c49710Jf85 != null) {
                    C51143K5j.LIZ(c49710Jf85);
                    C49710Jf8 c49710Jf86 = this.LLJZ;
                    if (c49710Jf86 != null) {
                        c49710Jf86.LJIIJJI(new IDrS47S0100000_8(nm(), 11));
                        C57105Mb7.LJI(0L, getContext());
                        Context context = getContext();
                        if (context != null) {
                            C49724JfM c49724JfM = C49724JfM.LIZ;
                            C8HS<SearchMixFeed> nm2 = nm();
                            C49710Jf8 c49710Jf87 = this.LLJZ;
                            if (c49710Jf87 != null) {
                                c49724JfM.getClass();
                                C49724JfM.LIZ(context, nm2, c49710Jf87);
                                return;
                            } else {
                                o.LJIJI("searchRecyclerView");
                                throw null;
                            }
                        }
                        return;
                    }
                    o.LJIJI("searchRecyclerView");
                    throw null;
                }
                o.LJIJI("searchRecyclerView");
                throw null;
            }
            o.LJIJI("searchRecyclerView");
            throw null;
        }
        throw new ClassCastException("RecyclerView must be an instance of SearchRecyclerView");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC223218pR
    public final void J5(List<? extends SearchMixFeed> list, boolean z) {
        o.LJIIIZ(list, "list");
        EnumC50363Jpf.INSTANCE.await();
        super.J5(list, z);
        ClickSearchViewModel clickSearchViewModel = this.LLJJJJLIIL;
        if (clickSearchViewModel != null) {
            clickSearchViewModel.reset();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Zm(int i, C50287JoR c50287JoR) {
        C35788E2u c35788E2u = C35788E2u.LIZ;
        int hashCode = hashCode();
        c35788E2u.getClass();
        ((Map) C35788E2u.LIZIZ.getValue()).put(Integer.valueOf(hashCode), null);
        boolean z = false;
        JSU.LIZ = 0;
        TopProxyFragment topProxyFragment = this.LLJJIII;
        if (topProxyFragment != null) {
            topProxyFragment.Zm(i, c50287JoR);
            return;
        }
        super.Zm(i, c50287JoR);
        mo49getActivity();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (z) {
            EnumC50363Jpf.INSTANCE.async(new ARunnableS12S0101000_8(i, this, 20));
        } else {
            Km();
        }
        un(SearchFragment.Mm(c50287JoR));
        Xm();
    }

    public final void tn(SearchApiResult searchApiResult, boolean z) {
        String editText;
        String str;
        String str2;
        String str3;
        Object obj;
        Object obj2;
        String searchFrom;
        C50948Jz6 searchEnterParam;
        if (!getUserVisibleHint()) {
            return;
        }
        C49814Jgo keyword = Ll().getKeyword();
        if (z || TextUtils.isEmpty(keyword.LJLILLLLZI)) {
            editText = Ll().getEditText();
        } else {
            editText = keyword.LJLILLLLZI;
        }
        GlobalDoodleConfig globalDoodleConfig = searchApiResult.globalDoodleConfig;
        String str4 = null;
        if (globalDoodleConfig != null) {
            str = globalDoodleConfig.getRequestKeyword();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, editText)) {
            JSONObject jSONObject = new JSONObject();
            SearchResultParam searchResultParam = this.LJLLJ;
            String str5 = "null";
            if (searchResultParam == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null || (str2 = searchEnterParam.getEnterSearchFrom()) == null) {
                str2 = "null";
            }
            jSONObject.put("enter_from", str2);
            InterfaceC50157JmL LIZ = K0M.LIZ();
            if (LIZ == null) {
                str3 = "null";
            } else {
                str3 = C50605JtZ.LJFF(LIZ.LIZIZ());
            }
            jSONObject.put("search_type", str3);
            SearchResultParam searchResultParam2 = this.LJLLJ;
            if (searchResultParam2 != null && (searchFrom = searchResultParam2.getSearchFrom()) != null) {
                str5 = searchFrom;
            }
            jSONObject.put("search_from", str5);
            jSONObject.put("correct_type", QueryCorrectHelper.Companion.LIZIZ(searchApiResult));
            String str6 = "1";
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_refresh", obj);
            GlobalDoodleConfig globalDoodleConfig2 = searchApiResult.globalDoodleConfig;
            if (globalDoodleConfig2 != null) {
                str4 = globalDoodleConfig2.getRequestKeyword();
            }
            if (TextUtils.isEmpty(str4)) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_server_keyword_null", obj2);
            if (TextUtils.equals(keyword.LJLIL, editText)) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("check_edit_text", str6);
            AppLogNewUtils.onEventV3("search_keyword_conflict", jSONObject);
        }
    }

    @Override // X.InterfaceC49928Jie
    public final void xa(DynamicPatch dynamicPatch, String str) {
        C50074Jl0.LIZ(new C50073Jkz(mo49getActivity(), dynamicPatch, str, this.LLF, getView(), this, fm(), null));
    }
}

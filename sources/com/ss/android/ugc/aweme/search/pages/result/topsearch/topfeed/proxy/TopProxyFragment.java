package com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.proxy;

import X.AbstractC49793JgT;
import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C06F;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C1DH;
import X.C221108m2;
import X.C29S;
import X.C2K3;
import X.C2NU;
import X.C3C5;
import X.C45621qg;
import X.C46446IKs;
import X.C49250JUo;
import X.C49389JZx;
import X.C49491Jbb;
import X.C49707Jf5;
import X.C49715JfD;
import X.C49724JfM;
import X.C49736JfY;
import X.C49791JgR;
import X.C49812Jgm;
import X.C49813Jgn;
import X.C49825Jgz;
import X.C49914JiQ;
import X.C49919JiV;
import X.C49921JiX;
import X.C49924Jia;
import X.C49937Jin;
import X.C49967JjH;
import X.C50112Jlc;
import X.C50118Jli;
import X.C50119Jlj;
import X.C50120Jlk;
import X.C50121Jll;
import X.C50122Jlm;
import X.C50123Jln;
import X.C50124Jlo;
import X.C50125Jlp;
import X.C50126Jlq;
import X.C50127Jlr;
import X.C50131Jlv;
import X.C50134Jly;
import X.C50158JmM;
import X.C50234Jna;
import X.C50287JoR;
import X.C50356JpY;
import X.C50365Jph;
import X.C50804Jwm;
import X.C50937Jyv;
import X.C50989Jzl;
import X.C51080K2y;
import X.C51105K3x;
import X.C5H3;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C76800UCe;
import X.C7MY;
import X.C80217Ve1;
import X.C81335Vw3;
import X.C8VV;
import X.C90903hW;
import X.EnumC49738Jfa;
import X.EnumC50363Jpf;
import X.InterfaceC223218pR;
import X.InterfaceC49926Jic;
import X.InterfaceC49928Jie;
import X.InterfaceC49940Jiq;
import X.InterfaceC88472Yns;
import X.KUR;
import X.RunnableC39680Fhk;
import X.V16;
import X.X1D;
import X.XKX;
import Y.ACallableS36S0110000_8;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS14S0110000_8;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.keva.Keva;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.ss.android.ugc.aweme.discover.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.repo.SearchOptPreferLayoutViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS13S0010000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS61S1100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public final class TopProxyFragment extends SearchFragment<SearchMixFeed> implements InterfaceC49926Jic, C2K3 {
    public C49825Jgz LLJJJJJIL;
    public SearchGlobalViewModel LLJJJJLIIL;
    public ViewGroup LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public ViewGroup LLJLL;
    public C45621qg LLJLLIL;
    public boolean LLJLLL;
    public final String LLJZ;
    public final boolean LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public final C5H3 LLLFF;
    public final Map<Integer, View> LLLFFI = new LinkedHashMap();
    public final C62822Ol8 LLJJL = C221108m2.LIZIZ(C49937Jin.LJLIL);
    public final C62822Ol8 LLJJLIIIJLLLLLLLZ = C221108m2.LIZIZ(C49812Jgm.LJLIL);
    public final C62822Ol8 LLJL = C221108m2.LIZIZ(C49813Jgn.LJLIL);

    @Override // X.InterfaceC49926Jic
    public final C49250JUo AR() {
        return null;
    }

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

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLLFFI).clear();
    }

    @Override // X.InterfaceC49926Jic
    public final void clearCache() {
        C49736JfY.LIZIZ(Integer.valueOf(hashCode()));
        C49389JZx.LIZ(Integer.valueOf(hashCode()));
        C49791JgR.LIZ(Integer.valueOf(hashCode()));
        Dn(this, C50124Jlo.LJLIL);
    }

    @Override // X.InterfaceC49926Jic
    public final InterfaceC49928Jie jO() {
        return this;
    }

    @Override // X.InterfaceC49926Jic
    public final void k20(DynamicPatch dynamicPatch) {
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

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void ym() {
    }

    public TopProxyFragment() {
        new C49491Jbb(null, null);
        this.LLJZ = "general_search";
        this.LLJZIJLIL = true;
        this.LLLFF = V16.LJJJJLL(new AqS158S0100000_8(this, 325));
    }

    @Override // X.InterfaceC49926Jic
    public final void Dy() {
        Dn(this, C50123Jln.LJLIL);
    }

    public final void Gn() {
        C06F c06f;
        if (this.LLIILZL != null) {
            C45621qg c45621qg = this.LLJLLIL;
            if (c45621qg != null) {
                ViewGroup.LayoutParams layoutParams = c45621qg.getLayoutParams();
                if (layoutParams instanceof C06F) {
                    c06f = (C06F) layoutParams;
                } else {
                    c06f = null;
                }
                if (isVisible()) {
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
                        return;
                    }
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
                if (c80217Ve14 == null) {
                    return;
                }
                c80217Ve14.setExpanded(false);
                return;
            }
            o.LJIJI("coordinatorLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    /* renamed from: Il */
    public final C51105K3x vl() {
        return (C51105K3x) this.LLLFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Jm() {
        if (!o.LJ(this.LJZ, "pull_refresh")) {
            super.Jm();
        }
        if (this.LLFFF) {
            AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 326);
            if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                aqS158S0100000_8.invoke();
                return;
            }
            C45621qg c45621qg = this.LLJLLIL;
            if (c45621qg != null) {
                c45621qg.post(new RunnableC39680Fhk(aqS158S0100000_8));
            } else {
                o.LJIJI("coordinatorLayout");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC49926Jic
    public final void o10() {
        Dn(this, C50126Jlq.LJLIL);
    }

    @Override // X.InterfaceC49926Jic
    public final void o90() {
        Dn(this, C50122Jlm.LJLIL);
    }

    @Override // X.InterfaceC49926Jic
    public final void sN() {
        Dn(this, C50125Jlp.LJLIL);
    }

    public final SearchJediMixFeedFragment tn() {
        return (SearchJediMixFeedFragment) this.LLJL.getValue();
    }

    @Override // X.InterfaceC49926Jic
    public final void uN() {
        Dn(this, C50127Jlr.LJLIL);
    }

    public final SearchFragment un() {
        ViewGroup viewGroup = this.LLJLILLLLZIIL;
        if (viewGroup == null || this.LLJLL == null) {
            return null;
        }
        if (viewGroup.getVisibility() == 0) {
            return xn();
        }
        ViewGroup viewGroup2 = this.LLJLL;
        if (viewGroup2 != null) {
            if (viewGroup2.getVisibility() != 0) {
                return null;
            }
            return tn();
        }
        o.LJIJI("doubleColumnFragmentContainer");
        throw null;
    }

    public final C49919JiV<TopProxyFragment> vn() {
        return (C49919JiV) this.LLJJL.getValue();
    }

    public final TopFeedFragment xn() {
        return (TopFeedFragment) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Im() {
        super.Im();
        Dn(this, C50118Jli.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Km() {
        super.Km();
        Dn(this, C50119Jlj.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC223218pR
    public final void Ne() {
        if (!isViewValid()) {
            return;
        }
        Em();
        Ym();
        Dn(this, C50120Jlk.LJLIL);
        ViewGroup viewGroup = this.LLJLILLLLZIIL;
        if (viewGroup != null) {
            if (viewGroup.getVisibility() != 0) {
                ViewGroup viewGroup2 = this.LLJLL;
                if (viewGroup2 != null) {
                    if (viewGroup2.getVisibility() != 0) {
                        return;
                    }
                } else {
                    o.LJIJI("doubleColumnFragmentContainer");
                    throw null;
                }
            }
            hm().setVisibility(8);
            return;
        }
        o.LJIJI("singleColumnFragmentContainer");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Pm() {
        if (!((AbstractC51036K1g) vn().LJLIL).isDataEmpty() && ((AbstractC51036K1g) vn().LJLIL).isHasMore()) {
            C49825Jgz c49825Jgz = this.LLJJJJJIL;
            if (c49825Jgz != null) {
                if (c49825Jgz.LJLJLJ || this.LLJLLL) {
                    return;
                }
                this.LLJLLL = true;
                vn().LJIILL(4, Kl(), 0, 0, 0, Integer.valueOf(this.LLFF), this.LJLJI, pm());
                return;
            }
            o.LJIJI("model");
            throw null;
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
        C49791JgR.LIZIZ(hashCode());
        fm().searchState.removeObservers(this);
        C49724JfM.LIZ.getClass();
        C49724JfM.LIZIZ.LIZLLL();
        C50804Jwm.LJ();
        vn().LIZIZ();
        vn().LJJII();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        super.showLoadMoreLoading();
        Dn(this, C50121Jll.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final /* bridge */ /* synthetic */ Object vl() {
        return vl();
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
        this.LLJJJJJIL = c49825Jgz;
        c49825Jgz.LJZI = true;
        C49707Jf5 c49707Jf5 = c49825Jgz.LLD;
        if (c49707Jf5 != null) {
            c49707Jf5.LJLJI = true;
        }
        vn().LJLILLLLZI = this;
        C49919JiV<TopProxyFragment> vn = vn();
        C49825Jgz c49825Jgz2 = this.LLJJJJJIL;
        if (c49825Jgz2 != null) {
            vn.LJJIII(c49825Jgz2);
        } else {
            o.LJIJI("model");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String Jl() {
        return this.LLJZ;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC191547fS
    public final void LJIIJJI() {
        Pm();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final String Wl() {
        return this.LLLF;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final String km() {
        return this.LLL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean wl() {
        return this.LLJZIJLIL;
    }

    public static String An(SearchMixFeedList searchMixFeedList) {
        boolean z;
        Keva LIZ;
        if (C49967JjH.LIZ() == 1) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (!z) {
            LIZ = C50234Jna.LIZ("search_common");
            str = LIZ.getString("user_top_feed_style", "");
            o.LJIIIIZZ(str, "SearchKeva.get().getStri…_TOP_FEED_STYLE_PREF, \"\")");
        }
        if (str.length() == 0) {
            str = searchMixFeedList.preferredLayout;
        }
        if (str == null) {
            return "double_column";
        }
        if (!o.LJ(str, "single_column") && !o.LJ(str, "double_column")) {
            return "double_column";
        }
        return str;
    }

    public final void Cn(String str) {
        if (o.LJ(str, "single_column")) {
            if (!o.LJ(un(), xn())) {
                Hn(xn());
            }
        } else if (o.LJ(str, "double_column")) {
            if (!o.LJ(un(), tn())) {
                Hn(tn());
            }
        } else {
            throw new IllegalStateException(a1.LJ("Invalid subStyle(", str, ") detected"));
        }
        SearchGlobalViewModel searchGlobalViewModel = this.LLJJJJLIIL;
        if (searchGlobalViewModel != null) {
            SearchGlobalViewModel.ov0(searchGlobalViewModel, null, str, 1);
        } else {
            o.LJIJI("globalViewModel");
            throw null;
        }
    }

    @Override // X.InterfaceC49926Jic
    public final void Fs0(SearchMixFeedList data) {
        boolean z;
        SearchOptPreferLayoutViewModel searchOptPreferLayoutViewModel;
        o.LJIIIZ(data, "data");
        C49715JfD.LIZJ(this, data);
        qm().LIZ();
        List<SearchMixFeed> list = data.mItems;
        boolean z2 = data.hasMore;
        if (list == null || list.isEmpty()) {
            Ne();
        } else {
            Dm(z2);
        }
        SearchGlobalViewModel searchGlobalViewModel = this.LLJJJJLIIL;
        if (searchGlobalViewModel != null) {
            if (list == null || list.isEmpty() || o.LJ(data.globalDoodleConfig.getTnsBanType(), EnumC49738Jfa.AID.getType())) {
                z = false;
            } else {
                z = true;
            }
            if (((Number) C51080K2y.LIZ.getValue()).intValue() != 0) {
                C1DH.LJJIJIIJI(new ARunnableS14S0110000_8(searchGlobalViewModel, z, 0));
            }
            SearchGlobalViewModel searchGlobalViewModel2 = this.LLJJJJLIIL;
            if (searchGlobalViewModel2 != null) {
                String jv0 = searchGlobalViewModel2.jv0();
                if (!(!o.LJ(jv0, "unknown")) || jv0 == null) {
                    jv0 = An(data);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onRefreshSuccess, VM(");
                SearchGlobalViewModel searchGlobalViewModel3 = this.LLJJJJLIIL;
                if (searchGlobalViewModel3 != null) {
                    LIZ.append(searchGlobalViewModel3.jv0());
                    LIZ.append("), final(");
                    LIZ.append(jv0);
                    LIZ.append(')');
                    X1D.LIZIZ(LIZ);
                    Cn(jv0);
                    Dn(this, new AqS174S0100000_8(data, 123));
                    SearchResultActivity LJ = C50989Jzl.LJ();
                    if (LJ != null && (searchOptPreferLayoutViewModel = (SearchOptPreferLayoutViewModel) ViewModelProviders.of(LJ).get(SearchOptPreferLayoutViewModel.class)) != null) {
                        String str = data.preferredLayout;
                        if (str == null) {
                            str = "";
                        }
                        searchOptPreferLayoutViewModel.LJLIL = str;
                        return;
                    }
                    return;
                }
                o.LJIJI("globalViewModel");
                throw null;
            }
            o.LJIJI("globalViewModel");
            throw null;
        }
        o.LJIJI("globalViewModel");
        throw null;
    }

    @Override // X.InterfaceC49926Jic
    public final void Gd0(GlobalDoodleConfig globalDoodleConfig) {
        Dn(this, new AqS174S0100000_8(globalDoodleConfig, 116));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void Gl(SearchResultParam searchResultParam) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
        super.Gl(searchResultParam);
        Dn(this, new AqS174S0100000_8(searchResultParam, 115));
    }

    @Override // X.InterfaceC49926Jic
    public final void H30(boolean z) {
        Dn(this, new AqS13S0010000_8(z, 0));
    }

    public final void Hn(SearchFragment searchFragment) {
        if (o.LJ(searchFragment, xn())) {
            ViewGroup viewGroup = this.LLJLIL;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = this.LLJLILLLLZIIL;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                    ViewGroup viewGroup3 = this.LLJLL;
                    if (viewGroup3 != null) {
                        viewGroup3.setVisibility(8);
                        xn().setUserVisibleHint(true);
                        tn().setUserVisibleHint(false);
                        xn();
                        yn(false);
                        return;
                    }
                    o.LJIJI("doubleColumnFragmentContainer");
                    throw null;
                }
                o.LJIJI("singleColumnFragmentContainer");
                throw null;
            }
            o.LJIJI("fragmentsParentLayout");
            throw null;
        }
        if (!o.LJ(searchFragment, tn())) {
            return;
        }
        ViewGroup viewGroup4 = this.LLJLIL;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(0);
            ViewGroup viewGroup5 = this.LLJLILLLLZIIL;
            if (viewGroup5 != null) {
                viewGroup5.setVisibility(8);
                ViewGroup viewGroup6 = this.LLJLL;
                if (viewGroup6 != null) {
                    viewGroup6.setVisibility(0);
                    xn().setUserVisibleHint(false);
                    tn().setUserVisibleHint(true);
                    tn();
                    yn(true);
                    return;
                }
                o.LJIJI("doubleColumnFragmentContainer");
                throw null;
            }
            o.LJIJI("singleColumnFragmentContainer");
            throw null;
        }
        o.LJIJI("fragmentsParentLayout");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (X.C50117Jlh.LIZ(r3) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void In(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r10) {
        /*
            r9 = this;
            java.lang.String r2 = An(r10)
            X.JuJ r0 = X.C50652JuK.Companion
            r0.getClass()
            X.JuK r0 = X.C50651JuJ.LJIIJ(r9)
            java.lang.String r6 = ""
            if (r0 == 0) goto L23
            X.JuI r0 = r0.getImmutableData()
            if (r0 == 0) goto L23
            X.Jqn r0 = r0.getSearchCommonModel()
            if (r0 == 0) goto L23
            java.lang.String r3 = r0.getEnterFrom()
            if (r3 != 0) goto L24
        L23:
            r3 = r6
        L24:
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            int r1 = X.C49967JjH.LIZ()
            r0 = 1
            if (r1 == r0) goto L75
            r0 = 2
            if (r1 == r0) goto L6f
            r0 = 3
            if (r1 == r0) goto L72
            r0 = 4
            if (r1 == r0) goto L64
        L3a:
            r9.LLL = r6
            com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel r1 = r9.LLJJJJLIIL
            if (r1 == 0) goto L7c
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r1.LJLJJL
            java.lang.Object r3 = r0.getValue()
            X.JlZ r3 = (X.C50109JlZ) r3
            if (r3 != 0) goto L50
            X.JlZ r3 = new X.JlZ
            r0 = 0
            r3.<init>(r0)
        L50:
            com.bytedance.ies.sdk.widgets.NextLiveData r1 = r1.LJLJJL
            r4 = 0
            r7 = 0
            r8 = 11
            r5 = r4
            X.JlZ r0 = X.C50109JlZ.L(r3, r4, r5, r6, r7, r8)
            r1.setValue(r0)
            r9.LLLF = r2
            r9.Cn(r2)
            return
        L64:
            X.Jlh r0 = X.C50117Jlh.LIZ
            r0.getClass()
            boolean r0 = X.C50117Jlh.LIZ(r3)
            if (r0 == 0) goto L72
        L6f:
            java.lang.String r6 = "single_column"
            goto L3a
        L72:
            java.lang.String r6 = "double_column"
            goto L3a
        L75:
            java.lang.String r0 = r10.preferredLayout
            if (r0 != 0) goto L7a
            goto L3a
        L7a:
            r6 = r0
            goto L3a
        L7c:
            java.lang.String r0 = "globalViewModel"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.proxy.TopProxyFragment.In(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList):void");
    }

    @Override // X.InterfaceC49926Jic
    public final void J70(SearchMixFeedList data) {
        o.LJIIIZ(data, "data");
        va(data);
        Dn(this, new AqS174S0100000_8(data, 121));
        List<SearchMixFeed> list = data.mItems;
        o.LJIIIIZZ(list, "data.items");
        SearchFragment.rn(list);
    }

    @Override // X.InterfaceC49926Jic
    public final void JC(boolean z) {
        Dn(this, new AqS13S0010000_8(z, 1));
        Rm(z);
        bk();
    }

    @Override // X.InterfaceC49926Jic
    public final void L8(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        this.LLJLLL = false;
        Dn(this, new AqS174S0100000_8(throwable, 119));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Rm(boolean z) {
        if (this.LLJJJJJIL != null) {
            if (!r0.LJLJLJ) {
                C10K.LIZJ(new ACallableS36S0110000_8(this, z, 1));
                return;
            }
            return;
        }
        o.LJIJI("model");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Tl(View view) {
        this.LLIIII = (C81335Vw3) C7MY.LIZLLL(view, "view", R.id.itq, "view.findViewById(R.id.refresh_layout)");
        cm().setEnabled(false);
        View findViewById = view.findViewById(R.id.ji8);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.s…_auto_coordinator_layout)");
        this.LLJLLIL = (C45621qg) findViewById;
        C80217Ve1 c80217Ve1 = (C80217Ve1) view.findViewById(R.id.ji7);
        this.LLIILZL = c80217Ve1;
        if (c80217Ve1 != null) {
            c80217Ve1.setOutlineProvider(null);
        }
        Gn();
        View findViewById2 = view.findViewById(R.id.jia);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.s…op_auto_fragments_parent)");
        this.LLJLIL = (ViewGroup) findViewById2;
        View findViewById3 = view.findViewById(R.id.jic);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.search_top_auto_single)");
        this.LLJLILLLLZIIL = (ViewGroup) findViewById3;
        View findViewById4 = view.findViewById(R.id.ji9);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.search_top_auto_double)");
        this.LLJLL = (ViewGroup) findViewById4;
        View findViewById5 = view.findViewById(R.id.je7);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.search_auto_status_view)");
        this.LLII = (KUR) findViewById5;
        this.LLIIIILZ = new C50158JmM(view);
    }

    @Override // X.InterfaceC49926Jic
    public final void XJ(SearchMixFeedList data) {
        o.LJIIIZ(data, "data");
        C49715JfD.LIZIZ(this, data);
        this.LLJLLL = false;
        iC();
        Dn(this, new AqS174S0100000_8(data, LiveTryModeCountDownThresholdSetting.DEFAULT));
    }

    @Override // X.InterfaceC49926Jic
    public final void eI(SearchMixFeedList data) {
        o.LJIIIZ(data, "data");
        Boolean hasShownResearchFilter = this.LJLJJI.getHasShownResearchFilter();
        if (hasShownResearchFilter != null) {
            hasShownResearchFilter.booleanValue();
        }
        Gn();
        C49791JgR.LIZLLL(Integer.valueOf(hashCode()), data.mBacktrace);
        Dn(this, new AqS174S0100000_8(data, 117));
        if (data.extra != null) {
            C49921JiX.LJ(this.LJLLJ).LJ(data.extra.server_stream_time);
        }
        GlobalDoodleConfig globalDoodleConfig = data.globalDoodleConfig;
        boolean z = true;
        if (globalDoodleConfig != null && globalDoodleConfig.getDisplayFilterBar() != 1) {
            z = false;
        }
        ra(z);
    }

    @Override // X.InterfaceC49926Jic
    public final void gl(SearchMixFeedList data) {
        o.LJIIIZ(data, "data");
        va(data);
        In(data);
        Boolean hasShownResearchFilter = this.LJLJJI.getHasShownResearchFilter();
        if (hasShownResearchFilter != null) {
            hasShownResearchFilter.booleanValue();
        }
        Gn();
        C49791JgR.LIZLLL(Integer.valueOf(hashCode()), data.mBacktrace);
        Dn(this, new AqS174S0100000_8(data, 125));
        C49921JiX.LJ(this.LJLLJ).LJ(data.extra.server_stream_time);
        GlobalDoodleConfig globalDoodleConfig = data.globalDoodleConfig;
        boolean z = true;
        if (globalDoodleConfig != null && globalDoodleConfig.getDisplayFilterBar() != 1) {
            z = false;
        }
        ra(z);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC49928Jie
    public final void oa(GlobalDoodleConfig globalDoodleConfig) {
        this.LLIIIL = globalDoodleConfig;
        Dn(this, new AqS174S0100000_8(globalDoodleConfig, 114));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void pn(FollowStatus followStatus) {
        o.LJIIIZ(followStatus, "followStatus");
        if (!isViewValid()) {
            return;
        }
        Dn(this, new AqS174S0100000_8(followStatus, 118));
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
        Dn(this, new AqS174S0100000_8(throwable, 122));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "429148576725534911");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/search/pages/result/topsearch/topfeed/proxy/TopProxyFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/topsearch/topfeed/proxy/TopProxyFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.LLJLILLLLZIIL == null) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/topsearch/topfeed/proxy/TopProxyFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
            return;
        }
        SearchFragment un = un();
        if (un != null) {
            un.setUserVisibleHint(z);
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/topsearch/topfeed/proxy/TopProxyFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC49928Jie
    public final void ta(SearchApiResult searchApiResult) {
        super.ta(searchApiResult);
        Dn(this, new AqS174S0100000_8(searchApiResult, 128));
    }

    @Override // X.InterfaceC49926Jic
    public final void u80(SearchMixFeedList data) {
        o.LJIIIZ(data, "data");
        va(data);
        In(data);
        Dn(this, new AqS174S0100000_8(data, 127));
        List<SearchMixFeed> list = data.mItems;
        o.LJIIIIZZ(list, "data.items");
        SearchFragment.rn(list);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC49928Jie
    public final void va(SearchApiResult searchApiResult) {
        super.va(searchApiResult);
        Dn(this, new AqS174S0100000_8(searchApiResult, 129));
    }

    @Override // X.InterfaceC49926Jic
    public final void yB(SearchMixFeedList data) {
        o.LJIIIZ(data, "data");
        Dn(this, new AqS174S0100000_8(data, 126));
    }

    public final void yn(boolean z) {
        if (!C49967JjH.LIZIZ() || !C46446IKs.LJLJLJ) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (!tn().isAdded()) {
            return;
        }
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        if (z) {
            LIZ.LJJIFFI(tn(), Lifecycle.State.RESUMED);
            LIZ.LJJIFFI(xn(), Lifecycle.State.STARTED);
        } else {
            LIZ.LJJIFFI(tn(), Lifecycle.State.STARTED);
            LIZ.LJJIFFI(xn(), Lifecycle.State.RESUMED);
        }
        LIZ.LJI();
    }

    public static void Dn(TopProxyFragment topProxyFragment, InterfaceC88472Yns interfaceC88472Yns) {
        interfaceC88472Yns.invoke(topProxyFragment.xn());
        interfaceC88472Yns.invoke(topProxyFragment.tn());
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Zm(int i, C50287JoR c50287JoR) {
        super.Zm(i, c50287JoR);
        Dn(this, new AqS174S0100000_8(i, c50287JoR, 113));
        C49389JZx.LIZJ().clear();
        mo49getActivity();
        if (C2NU.LIZ.LIZIZ()) {
            EnumC50363Jpf.INSTANCE.async(new ARunnableS12S0101000_8(i, this, 21));
            Xm();
            return;
        }
        if (((Number) C50134Jly.LIZ.getValue()).intValue() == 1) {
            ((HashMap) C49924Jia.LIZ).clear();
        }
        SearchGlobalViewModel searchGlobalViewModel = this.LLJJJJLIIL;
        if (searchGlobalViewModel != null) {
            if (((Number) C51080K2y.LIZ.getValue()).intValue() != 0) {
                C1DH.LJJIJIIJI(new ARunnableS14S0110000_8((Object) searchGlobalViewModel, false, 0));
            }
            Km();
            Xm();
            return;
        }
        o.LJIJI("globalViewModel");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C49825Jgz c49825Jgz;
        o.LJIIIZ(view, "view");
        Tl(view);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            ViewModelProviders.of(mo49getActivity).get(EventCenter.class);
            ViewModelProviders.of(mo49getActivity).get(MusicPlayHelper.class);
            ViewModelProviders.of(mo49getActivity).get(SurveyViewModel.class);
            this.LLJJJJLIIL = (SearchGlobalViewModel) ViewModelProviders.of(mo49getActivity).get(SearchGlobalViewModel.class);
            this.LLIZLLLIL = (SearchEnterViewModel) ViewModelProviders.of(mo49getActivity).get(SearchEnterViewModel.class);
        }
        Am();
        zm();
        if (C50365Jph.LIZ()) {
            C49914JiQ c49914JiQ = new C49914JiQ();
            c49914JiQ.LLIIIL = vn();
            c49825Jgz = c49914JiQ;
        } else {
            c49825Jgz = new C49825Jgz();
        }
        this.LLJJJJJIL = c49825Jgz;
        vn().LJLILLLLZI = this;
        C49919JiV<TopProxyFragment> vn = vn();
        C49825Jgz c49825Jgz2 = this.LLJJJJJIL;
        if (c49825Jgz2 != null) {
            vn.LJJIII(c49825Jgz2);
            EventBus.LIZJ().LJIILJJIL(this);
            Bundle arguments = getArguments();
            TopFeedFragment xn = xn();
            xn.setArguments(arguments);
            xn.LLJJIII = this;
            SearchJediMixFeedFragment tn = tn();
            tn.setArguments(arguments);
            tn.LLJJIII = this;
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            LIZ.LJIIJ(xn(), "single_column", R.id.jic);
            LIZ.LJIIJ(tn(), "double_column", R.id.ji9);
            LIZ.LJI();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C50112Jlc(this, null), 3);
            C8VV.LIZ(this, false, new AqS174S0100000_8(this, 124));
            this.mStatusViewValid = true;
            SearchAdMainService.LJIIJJI().LJIIIZ(getContext());
            if (C50131Jlv.LIZ()) {
                C50937Jyv c50937Jyv = new C50937Jyv();
                this.LLJILJIL = c50937Jyv;
                c50937Jyv.LIZLLL(this);
                C50356JpY c50356JpY = new C50356JpY();
                C50937Jyv c50937Jyv2 = this.LLJILJIL;
                if (c50937Jyv2 != null) {
                    ((ArrayList) c50356JpY.LIZ).add(c50937Jyv2);
                }
                this.LLJILJILJ = c50356JpY;
                return;
            }
            return;
        }
        o.LJIJI("model");
        throw null;
    }

    @Override // X.InterfaceC49928Jie
    public final void xa(DynamicPatch dynamicPatch, String str) {
        Dn(this, new AqS61S1100000_8(dynamicPatch, str, 6));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cg_, viewGroup, false);
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

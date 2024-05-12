package com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui;

import X.AbstractC49793JgT;
import X.AbstractC51036K1g;
import X.AnonymousClass636;
import X.C020506f;
import X.C03880Dg;
import X.C0A2;
import X.C113554cx;
import X.C16330kX;
import X.C17N;
import X.C191487fM;
import X.C221108m2;
import X.C35788E2u;
import X.C40443Fu3;
import X.C46447IKt;
import X.C48054ItW;
import X.C49197JSn;
import X.C49218JTi;
import X.C49229JTt;
import X.C49232JTw;
import X.C49365JYz;
import X.C49578Jd0;
import X.C49580Jd2;
import X.C49636Jdw;
import X.C49644Je4;
import X.C49655JeF;
import X.C49708Jf6;
import X.C49719JfH;
import X.C49721JfJ;
import X.C49729JfR;
import X.C49730JfS;
import X.C49823Jgx;
import X.C49917JiT;
import X.C50044JkW;
import X.C50073Jkz;
import X.C50074Jl0;
import X.C50160JmO;
import X.C50321Joz;
import X.C50433Jqn;
import X.C50469JrN;
import X.C50605JtZ;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50653JuL;
import X.C50654JuM;
import X.C50699Jv5;
import X.C50948Jz6;
import X.C51697KQr;
import X.C51733KSb;
import X.C54585LbZ;
import X.C55457Lpd;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C73210SoI;
import X.C77125UOr;
import X.C80217Ve1;
import X.C8HS;
import X.InterfaceC48970JJu;
import X.InterfaceC50157JmL;
import X.InterfaceC56526MGk;
import X.J21;
import X.JNW;
import X.JOO;
import X.JQA;
import X.JQT;
import X.JUH;
import X.JVD;
import X.JVQ;
import X.JWD;
import X.JWE;
import X.JY2;
import X.JYM;
import X.JZQ;
import X.K0M;
import X.KRB;
import X.KSZ;
import X.LY0;
import X.OSZ;
import X.TMC;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS7S0210000_8;
import Y.IDCListenerS255S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchIntentStruct;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class SearchFeedFragment extends SearchOriginalFragment<Aweme> implements InterfaceC48970JJu, InterfaceC56526MGk, LY0 {
    public C49708Jf6 LLJJL;
    public C49823Jgx LLJJLIIIJLLLLLLLZ;
    public JQT LLJL;
    public C49730JfS LLJLIL;
    public C49578Jd0 LLJLILLLLZIIL;
    public C49729JfR LLJLL;
    public C49229JTt LLJLLIL;
    public JUH LLJLLL;
    public VerticalScrollDoubleColumnProvider LLJZ;
    public final C62822Ol8 LLJZIJLIL;
    public final Map<Integer, View> LLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String Jl() {
        return "video";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final boolean Nm() {
        return false;
    }

    @Override // X.LY0
    public final void Y9() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLL).clear();
    }

    @Override // X.InterfaceC48970JJu
    public final boolean kh(JYM jym) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean wl() {
        return true;
    }

    public SearchFeedFragment() {
        if (this.LLJJL == null) {
            this.LLJJL = new C49708Jf6(this, this);
        }
        C49708Jf6 c49708Jf6 = this.LLJJL;
        o.LJI(c49708Jf6);
        this.LLJJL = c49708Jf6;
        this.LLJZIJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 327));
        this.LJLLLLLL = C50605JtZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void Nl() {
        if (this.LLILLL != null) {
            fm().queryWordChangeInProcess.add(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void ym() {
        JVQ jvq;
        this.LLILL = this.LLJJL.LJIIIZ();
        C73210SoI c73210SoI = this.LLJJL.LJLJL;
        o.LJIIIIZZ(c73210SoI, "mFragmentPanel.cellFeedAdapterWrapper");
        this.LLILLIZIL = c73210SoI;
        C8HS<Aweme> nm = nm();
        if ((nm instanceof JVQ) && (jvq = (JVQ) nm) != null) {
            jvq.LJLJL = (C49719JfH) this.LLJZIJLIL.getValue();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void zm() {
        this.LLJJJJJIL = new C49721JfJ();
        tn().LJJI(this);
        C49917JiT<?> tn = tn();
        tn.LJLJJL = this;
        T t = tn.LJLIL;
        if (t != 0) {
            ((AbstractC49793JgT) t).LJLJL = sa();
        }
        tn().LJLJJI = this.LLJJL;
        this.LLJJLIIIJLLLLLLLZ = new C49823Jgx();
        ((C49721JfJ) tn()).LJJ(this.LLJJLIIIJLLLLLLLZ);
        C49823Jgx c49823Jgx = this.LLJJLIIIJLLLLLLLZ;
        if (c49823Jgx != null) {
            c49823Jgx.LJLZ = "video_search";
        }
        if (mo49getActivity() != null) {
            MutableLiveData<Integer> mutableLiveData = fm().searchState;
            if (mutableLiveData != null) {
                C50044JkW c50044JkW = new C50044JkW();
                c50044JkW.LJLIL = new C49644Je4(this);
                mutableLiveData.observe(this, c50044JkW);
            }
            MutableLiveData<Boolean> mutableLiveData2 = fm().isRefreshingData;
            if (mutableLiveData2 != null) {
                mutableLiveData2.observe(this, new AObserverS76S0100000_8(this, 70));
            }
            MutableLiveData<Boolean> mutableLiveData3 = fm().isShowingFilters;
            if (mutableLiveData3 != null) {
                mutableLiveData3.observe(this, new AObserverS76S0100000_8(this, 71));
            }
            MutableLiveData<Boolean> mutableLiveData4 = fm().backToMiddle;
            if (mutableLiveData4 != null) {
                mutableLiveData4.observe(this, new AObserverS76S0100000_8(this, 72));
            }
            MutableLiveData<Boolean> mutableLiveData5 = fm().shouldBlockMediaPlay;
            if (mutableLiveData5 != null) {
                mutableLiveData5.observe(this, new AObserverS76S0100000_8(this, 73));
            }
        }
    }

    @Override // X.InterfaceC56526MGk
    public final void LIZJ() {
        if (vm() && (!this.LLIIIJ.isEmpty())) {
            return;
        }
        LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final Map<String, String> Yl() {
        return LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave();
    }

    @Override // X.InterfaceC56526MGk
    public final boolean hasMore() {
        T t = tn().LJLIL;
        o.LJII(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
        return ((AbstractC51036K1g) t).isHasMore();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void ln() {
        super.ln();
        vn();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        tn().LIZIZ();
        this.LLJJL.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        JQT jqt = this.LLJL;
        if (jqt != null) {
            jqt.LLD = true;
            jqt.LJJJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        JQT jqt;
        super.onResume();
        JQT jqt2 = this.LLJL;
        if (jqt2 != null) {
            jqt2.LLD = false;
        }
        if (getUserVisibleHint()) {
            Boolean value = fm().isShowingFilters.getValue();
            Boolean bool = Boolean.TRUE;
            if (!o.LJ(value, bool) && !o.LJ(fm().isRefreshingData.getValue(), bool) && !o.LJ(fm().shouldBlockMediaPlay.getValue(), bool) && (jqt = this.LLJL) != null) {
                jqt.LJJJJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<KRB> registerComponents() {
        SparseArray<KRB> registerComponents = super.registerComponents();
        o.LJIIIIZZ(registerComponents, "super.registerComponents()");
        registerComponents.append(C51697KQr.LIZIZ, this.LLJJL);
        return registerComponents;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment
    public final void un() {
        tn().LJIILL(1, Kl(), 0, Integer.valueOf(this.LLFF), this.LJLJI);
    }

    public final void vn() {
        JQT jqt;
        if ((vm() || this.LLJJIJIIJIL) && (jqt = this.LLJL) != null) {
            jqt.LJJJI(false);
            jqt.LJJJJI();
        }
    }

    @Override // X.InterfaceC56526MGk
    public final void A8(boolean z) {
        this.LLJJL.LJLJJLL.showLoadMoreEmpty();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Tm(SearchResultParam param) {
        o.LJIIIZ(param, "param");
        super.Tm(param);
        C49823Jgx c49823Jgx = this.LLJJLIIIJLLLLLLLZ;
        if (c49823Jgx != null) {
            c49823Jgx.LJLZ = "video_search";
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void pn(FollowStatus followStatus) {
        o.LJIIIZ(followStatus, "followStatus");
        if (!isViewValid()) {
            return;
        }
        ((JZQ) nm()).LJZL(followStatus);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        Taco LIZ;
        C49197JSn c49197JSn;
        JQT jqt;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-6106538097293635660");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/search/pages/result/videosearch/core/ui/SearchFeedFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/videosearch/core/ui/SearchFeedFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        this.LLJJL.setUserVisibleHint(z);
        JQT jqt2 = this.LLJL;
        if (jqt2 != null) {
            jqt2.LJJJI(z);
        }
        C49578Jd0 c49578Jd0 = this.LLJLILLLLZIIL;
        if (c49578Jd0 != null) {
            c49578Jd0.LIZIZ(Boolean.valueOf(z));
        }
        if (!z) {
            if (!C48054ItW.LIZ() && (jqt = this.LLJL) != null) {
                jqt.LJJJJI();
            }
            this.LLJJL.getClass();
        } else {
            JQT jqt3 = this.LLJL;
            if (jqt3 != null) {
                jqt3.LJJJJ();
            }
            C49708Jf6 c49708Jf6 = this.LLJJL;
            if (c49708Jf6.isViewValid()) {
                int childCount = c49708Jf6.LJLJJL.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.ViewHolder LJJJJJL = c49708Jf6.LJLJJL.LJJJJJL(c49708Jf6.LJLJJL.getChildAt(i));
                    if (LJJJJJL.getItemViewType() == 0) {
                        JOO joo = (JOO) LJJJJJL;
                        if (!joo.c0()) {
                            joo.bindView();
                            joo.f0();
                        }
                    }
                }
            }
            vn();
            if (this.LLIFFJFJJ != null && ((LIZ = C49218JTi.LIZ(Zl(), false)) == null || (c49197JSn = LIZ.LJLILLLLZI) == null || c49197JSn.LIZ == null)) {
                RecyclerView Zl = Zl();
                if (C16330kX.LIZJ(Zl) && !Zl.isLayoutRequested()) {
                    JUH juh = this.LLJLLL;
                    if (juh != null) {
                        juh.LJFF();
                    }
                } else {
                    Zl.addOnLayoutChangeListener(new IDCListenerS255S0100000_8(this, 3));
                }
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/videosearch/core/ui/SearchFeedFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.InterfaceC48970JJu
    public final void yd(JYM jym) {
        JQA jqa;
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        C020506f c020506f;
        Bundle bundle;
        int i;
        String str5;
        C50433Jqn searchCommonModel;
        String enterFrom;
        C50469JrN searchVideoModel;
        Integer valueOf;
        String str6;
        C50469JrN searchVideoModel2;
        C50650JuI immutableData;
        C49636Jdw searchSessionModel;
        Long searchSessionId;
        C50948Jz6 searchEnterParam;
        C50160JmO LIZJ;
        C50160JmO LIZJ2;
        new C50699Jv5(this).LJI();
        Aweme aweme = jym.LIZIZ;
        View view = jym.LIZ;
        String str7 = jym.LIZJ;
        Product product = jym.LJ;
        String str8 = null;
        if (view != null) {
            jqa = JY2.LIZ(view);
        } else {
            jqa = null;
        }
        if (aweme != null && mo49getActivity() != null) {
            T t = tn().LJLIL;
            o.LJII(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
            C55457Lpd.LJLJJLL = (AbstractC51036K1g) t;
            C50652JuK.Companion.getClass();
            C50321Joz LIZIZ = C50651JuJ.LIZIZ();
            if (LIZIZ != null) {
                str = LIZIZ.getSearchId();
            } else {
                str = null;
            }
            JWD.LIZ.getClass();
            String LIZ = JWE.LIZ(4);
            Bundle bundle2 = new Bundle();
            bundle2.putString("id", aweme.getAid());
            bundle2.putString("refer", str7);
            bundle2.putString("video_from", "from_search");
            bundle2.putInt("profile_enterprise_type", aweme.getEnterpriseType());
            bundle2.putInt("page_type", 9);
            bundle2.putString("search_keyword", Kl());
            bundle2.putString("search_id", str);
            bundle2.putString("playlist_search_id", str);
            bundle2.putInt("is_from_video", 1);
            bundle2.putString("key_search_type", LIZ);
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
            InterfaceC50157JmL LIZ2 = K0M.LIZ();
            if (LIZ2 != null && (LIZJ2 = LIZ2.LIZJ()) != null) {
                str2 = LIZJ2.LIZJ;
            } else {
                str2 = null;
            }
            bundle2.putString("tns_ban_type", str2);
            InterfaceC50157JmL LIZ3 = K0M.LIZ();
            if (LIZ3 != null && (LIZJ = LIZ3.LIZJ()) != null) {
                str3 = LIZJ.LIZLLL;
            } else {
                str3 = null;
            }
            bundle2.putString("use_scenario", str3);
            SearchResultParam searchResultParam = this.LJLLILLLL;
            if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
                str4 = searchEnterParam.getPreviousPage();
            } else {
                str4 = null;
            }
            bundle2.putString("previous_page", str4);
            bundle2.putBoolean("is_update_search_result_id", true);
            C50652JuK LJIIJ = C50651JuJ.LJIIJ(mo49getActivity());
            if (LJIIJ != null && (immutableData = LJIIJ.getImmutableData()) != null && (searchSessionModel = immutableData.getSearchSessionModel()) != null && (searchSessionId = searchSessionModel.getSearchSessionId()) != null) {
                j = searchSessionId.longValue();
            } else {
                j = 0;
            }
            bundle2.putLong("search_session_id", j);
            TMC.LJIIJ(C50651JuJ.LJIIJ(this), C17N.LJJJJJL(this).IO().LIZJ(), "SearchFeedFragment");
            String str9 = "";
            if (product != null) {
                Map LIZJ3 = C49365JYz.LIZJ(aweme, product, jqa);
                C50650JuI LJII = C50651JuJ.LJII(this);
                if (LJII == null || (searchVideoModel2 = LJII.getSearchVideoModel()) == null || (str6 = searchVideoModel2.getGroupId()) == null) {
                    str6 = "";
                }
                LIZJ3.put("last_from_group_id", str6);
                bundle2.putSerializable("feed_anchor_custom_data", new AnchorCustomData(true, true, C49365JYz.LIZLLL(LIZJ3), null, null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT, null));
            }
            if (view != null) {
                c020506f = C020506f.LIZ(view, view.getWidth(), view.getHeight());
            } else {
                c020506f = null;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), "//aweme/detail");
            buildRoute.withParam(bundle2);
            if (c020506f != null) {
                bundle = c020506f.LIZLLL();
            } else {
                bundle = null;
            }
            buildRoute.withBundleAnimation(bundle);
            buildRoute.withParam("activity_has_activity_options", true);
            buildRoute.open();
            C77125UOr.LJIJ(aweme);
            if (Zl().getLayoutManager() != null && view != null && (valueOf = Integer.valueOf(C0A2.LJJJLL(view))) != null) {
                i = valueOf.intValue();
            } else {
                i = -1;
            }
            C50321Joz LIZIZ2 = C50651JuJ.LIZIZ();
            if (LIZIZ2 != null) {
                str8 = LIZIZ2.getSearchKeyword();
            }
            JNW.LJ(view, "search_result", aweme, str8, i);
            OSZ[] oszArr = new OSZ[14];
            oszArr[0] = new OSZ("token_type", "video");
            oszArr[1] = new OSZ("is_aladdin", String.valueOf(0));
            oszArr[2] = new OSZ("search_result_id", aweme.getAid());
            oszArr[3] = new OSZ("is_search_scene", "1");
            oszArr[4] = new OSZ("rank", String.valueOf(aweme.getRank()));
            oszArr[5] = new OSZ("search_keyword", Kl());
            oszArr[6] = new OSZ("search_type", "video");
            if (str == null) {
                str = "";
            }
            oszArr[7] = new OSZ("search_id", str);
            oszArr[8] = new OSZ("search_enter_position", "video");
            oszArr[9] = new OSZ("enter_position", "video");
            C50650JuI LJII2 = C50651JuJ.LJII(this);
            if (LJII2 == null || (searchVideoModel = LJII2.getSearchVideoModel()) == null || (str5 = searchVideoModel.getGroupId()) == null) {
                str5 = "";
            }
            oszArr[10] = new OSZ("last_from_group_id", str5);
            oszArr[11] = new OSZ("is_from_video", "1");
            C50650JuI LJII3 = C50651JuJ.LJII(requireActivity());
            if (LJII3 != null && (searchCommonModel = LJII3.getSearchCommonModel()) != null && (enterFrom = searchCommonModel.getEnterFrom()) != null) {
                str9 = enterFrom;
            }
            oszArr[12] = new OSZ("search_entrance", str9);
            oszArr[13] = new OSZ("group_id", aweme.getAid());
            Map LJJL = C113554cx.LJJL(oszArr);
            C50653JuL.LJLILLLLZI.getClass();
            C50654JuM.LIZJ(LJJL, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void Cm(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        Am();
        this.LLJJL.onViewCreated(view, bundle);
        ym();
        C8HS<Aweme> nm = nm();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        nm.setLoadEmptyTextColor(Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.gv, context)));
        C49708Jf6 c49708Jf6 = this.LLJJL;
        c49708Jf6.LJLLL = 9;
        JVQ jvq = c49708Jf6.LJLJJLL;
        if (jvq != null) {
            jvq.setLoadMoreListener(this);
        }
        C49708Jf6 c49708Jf62 = this.LLJJL;
        c49708Jf62.getClass();
        RecyclerView recyclerView = c49708Jf62.LJLJJL;
        if (recyclerView != null && (recyclerView instanceof C191487fM)) {
            ((C191487fM) recyclerView).setLabel("");
        }
        C40443Fu3.LIZ("").LJIIIIZZ(c49708Jf62.LJLJJL);
        JVQ jvq2 = c49708Jf62.LJLJJLL;
        if (jvq2 != null) {
            jvq2.mmLabel = "";
        }
        this.LLJJL.LJLLLL = (C49719JfH) this.LLJZIJLIL.getValue();
        Zl().setClipToPadding(false);
        C80217Ve1 c80217Ve1 = this.LLIILZL;
        if (c80217Ve1 == null) {
            return;
        }
        c80217Ve1.setBackground(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC223218pR
    public final void J5(List<? extends Aweme> list, boolean z) {
        SearchIntentStruct searchIntentStruct;
        o.LJIIIZ(list, "list");
        fm().queryWordChangeInProcess.remove(1);
        if (!isViewValid()) {
            return;
        }
        GlobalDoodleConfig globalDoodleConfig = this.LLIIIL;
        if (globalDoodleConfig != null && o.LJ(globalDoodleConfig.getHideResults(), Boolean.TRUE)) {
            this.LLIIIJ = list;
        }
        Zl().post(new ARunnableS7S0210000_8(list, this, z, 4));
        fm().setIsRefreshingData(false);
        hm().LJI();
        if (C46447IKt.LJLJLJ) {
            JVD.LIZ(Zl(), new AqS158S0100000_8(this, 328));
        } else {
            JQT jqt = this.LLJL;
            if (jqt != null) {
                jqt.LJJIJL(null, false);
            }
        }
        C35788E2u c35788E2u = C35788E2u.LIZ;
        int hashCode = hashCode();
        c35788E2u.getClass();
        ((Map) C35788E2u.LIZIZ.getValue()).put(Integer.valueOf(hashCode), null);
        GlobalDoodleConfig globalDoodleConfig2 = this.LLIIIL;
        if (globalDoodleConfig2 != null && (searchIntentStruct = globalDoodleConfig2.getSearchIntentStruct()) != null && o.LJ(searchIntentStruct.getHasPoiIntent(), Boolean.TRUE) && !C17N.LJJJJJL(this).le0().LIZJ().LJLIL) {
            C17N.LJJJJJL(this).j4(new C49655JeF());
            C51733KSb.LIZ("search", "poi_biz", KSZ.LIZJ, KSZ.LIZ, new C54585LbZ(), 32);
        }
        Rm(true);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC223218pR
    public final void j0(List<? extends Aweme> list, boolean z) {
        this.LLJJL.j0(list, z);
        qm().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC223218pR
    public final void jh(List<? extends Aweme> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LLJJL.j0(list, z);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        JVQ jvq;
        JQT jqt;
        GridLayoutManager gridLayoutManager;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C0A2 layoutManager = Zl().getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            i = gridLayoutManager.LLIIIL;
        } else {
            i = -1;
        }
        if (((Number) J21.LIZ.getValue()).intValue() != 0 && i <= 2) {
            if (C46447IKt.LJLJLJ) {
                this.LLJLILLLLZIIL = new C49578Jd0();
                this.LLJLIL = new C49730JfS();
                C49729JfR c49729JfR = new C49729JfR();
                c49729JfR.LJLILLLLZI = new AqS158S0100000_8(this, 691);
                this.LLJLL = c49729JfR;
                this.LLJLLIL = new C49229JTt(Zl());
                this.LLJLLL = new JUH(Zl());
                this.LLJZ = new VerticalScrollDoubleColumnProvider(this, Zl());
                C49232JTw c49232JTw = new C49232JTw(this, "video_search");
                C49232JTw.LIZIZ(c49232JTw, this.LLJLLL);
                VerticalScrollDoubleColumnProvider verticalScrollDoubleColumnProvider = this.LLJZ;
                if (verticalScrollDoubleColumnProvider != null) {
                    ((SparseArray) c49232JTw.LIZJ.getValue()).put(1, verticalScrollDoubleColumnProvider);
                }
                C49229JTt c49229JTt = this.LLJLLIL;
                if (c49229JTt != null) {
                    ((SparseArray) c49232JTw.LIZJ.getValue()).put(19, c49229JTt);
                }
                SearchStateViewModel fm = fm();
                SearchFragment searchFragment = this.LLJJIII;
                if (searchFragment == null) {
                    searchFragment = this;
                }
                c49232JTw.LIZJ(new C49580Jd2(fm, searchFragment));
                c49232JTw.LIZJ(this.LLJLLIL);
                c49232JTw.LIZJ(this.LLJLILLLLZIIL);
                c49232JTw.LIZJ(this.LLJLL);
                c49232JTw.LIZJ(this.LLJLIL);
                c49232JTw.LIZ().LJIIIIZZ();
                return;
            }
            JQT jqt2 = new JQT(Zl(), cm(), new AqS158S0100000_8(this, 692));
            this.LLJL = jqt2;
            jqt2.LJLJJL = new AqS158S0100000_8(this, 693);
            C8HS<Aweme> nm = nm();
            if ((nm instanceof JVQ) && (jvq = (JVQ) nm) != null && (jqt = this.LLJL) != null) {
                jvq.LJLJJLL = jqt;
            }
            this.LLJJL.LJLLLLLL = this.LLJL;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment, X.InterfaceC49928Jie
    public final void xa(DynamicPatch dynamicPatch, String str) {
        C50074Jl0.LIZ(new C50073Jkz(mo49getActivity(), dynamicPatch, str, this.LLF, getView(), this, fm(), this.LLJLIL));
    }
}

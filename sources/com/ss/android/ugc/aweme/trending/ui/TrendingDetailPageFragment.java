package com.ss.android.ugc.aweme.trending.ui;

import X.AbstractC72278SYg;
import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C50420Jqa;
import X.C55108Lk0;
import X.C56412MCa;
import X.C57939MoZ;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C76800UCe;
import X.C78685UuP;
import X.C78926UyI;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC224628ri;
import X.InterfaceC57784Mm4;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.KQM;
import X.M89;
import X.MB3;
import X.MBM;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SYL;
import X.TBR;
import X.TBW;
import Y.ACListenerS29S0100000_9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.trending.ui.platform.TrendingDetailComponent;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS21S0310000_9;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class TrendingDetailPageFragment extends DetailPageFragment implements MBM, KPL, InterfaceC224628ri {
    public final C214378bB LJLL;
    public boolean LJLLI;
    public long LJLLILLLL;
    public Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C5H3 LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 664));

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLLJ.clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return Vl(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.MBM, X.C8V9
    public String serviceKey() {
        return null;
    }

    public TrendingDetailPageFragment() {
        AqS60S0110000_3 LJJ;
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 341);
        C65776Prg LIZ = C65352Pkq.LIZ(TrendingDetailOperatorWrapper.class);
        KQM kqm = KQM.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLL = new C214378bB(LIZ, aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, kqm, LJJ, C78926UyI.LJIILLIIL(this, true));
        this.LJLLILLLL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public DetailPageComponent Gl() {
        return new TrendingDetailComponent();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public DetailFragmentPanel Hl() {
        return new TrendingDetailFragmentPanel(this, this.LJLJJI);
    }

    @Override // X.MBM
    public void LJJJJL() {
        C50420Jqa c50420Jqa = new C50420Jqa(64);
        DetailFragmentPanel detailFragmentPanel = this.LJLJI;
        if (detailFragmentPanel != null) {
            detailFragmentPanel.onInternalEvent(c50420Jqa);
        }
    }

    @Override // X.MBM
    public void LJL() {
        C50420Jqa c50420Jqa = new C50420Jqa(65);
        DetailFragmentPanel detailFragmentPanel = this.LJLJI;
        if (detailFragmentPanel != null) {
            detailFragmentPanel.onInternalEvent(c50420Jqa);
        }
    }

    public final String Xl() {
        return (String) this.LJLJLLL.getValue();
    }

    public final TrendingDetailOperatorWrapper Yl() {
        return (TrendingDetailOperatorWrapper) this.LJLL.getValue();
    }

    public final boolean Zl() {
        return C78685UuP.LJJJZ(this.LJLJJI.isFromTrendingCard());
    }

    @Override // X.MBM
    public void LJ() {
        C55108Lk0 c55108Lk0;
        View view = getView();
        if (view != null && (c55108Lk0 = (C55108Lk0) view.findViewById(R.id.g99)) != null) {
            c55108Lk0.LJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public void Pl() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "DETAIL_TRENDING");
        }
    }

    public final String Wl() {
        if (Zl()) {
            return "general_search";
        }
        if (o.LJ(this.LJLJJI.getEnterMethodValue(), "trends_push")) {
            return "trends_push";
        }
        if (o.LJ(this.LJLJJI.getEnterMethodValue(), "trending_publisher_notification")) {
            return "creator_spotlight_inspired_button";
        }
        return "homepage_hot_trending_bar";
    }

    @Override // X.MBM
    public Aweme getAweme() {
        return Ol().getAweme();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        String str;
        String str2;
        super.onDestroy();
        if (this.LJLLI) {
            str = "click_arrow";
        } else {
            str = "slide_rightward";
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJLLILLLL;
        String Xl = Xl();
        M89 m89 = this.LJLJJI;
        Aweme aweme = getAweme();
        if (aweme != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", MB3.LIZ);
            c188727au.LJIIIZ("enter_method", str);
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            c188727au.LJIIIZ("group_id", aid);
            if (m89 != null) {
                str2 = m89.getFromGroupId();
            } else {
                str2 = null;
            }
            if (aweme.getTrendingBarFYP() != null) {
                TrendingEventModel trendingEventModel = new TrendingEventModel();
                trendingEventModel.setTrendingName(aweme.getTrendingBarFYP().getEventKeyword());
                trendingEventModel.setEventId(String.valueOf(aweme.getTrendingBarFYP().getEventKeywordId()));
                trendingEventModel.setExtra(aweme.getTrendingBarFYP().getEventTrackingParam());
                MB3.LJ(c188727au, Xl, trendingEventModel, str2);
            }
            c188727au.LJ(currentTimeMillis, "inflow_stay_duration");
            FMX.LJIIL("trending_inflow_page_quit", c188727au.LIZ);
        }
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLLILLLL = System.currentTimeMillis();
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, R> R fm(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C212418Vh.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q> void hm(VM1 vm1, InterfaceC88472Yns<? super S1, C76800UCe> interfaceC88472Yns) {
        C212418Vh.LJIIL(vm1, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        PlayerComponentTemp playerComponentTemp;
        o.LJIIIZ(view, "view");
        TrendingDetailOperatorWrapper Yl = Yl();
        String Xl = Xl();
        if (Xl == null) {
            Xl = Wl();
        }
        Yl.getClass();
        o.LJIIIZ(Xl, "<set-?>");
        Yl.LJLL = Xl;
        Yl().LJLLJ = this.LJLJJI.getTrendingEventId();
        String str = "";
        if (o.LJ(Yl().LJLLJ, CardStruct.IStatusCode.DEFAULT)) {
            Yl().LJLLJ = "";
        } else {
            String str2 = Yl().LJLLJ;
            if (str2 == null || str2.length() == 0) {
                Yl().LJLLJ = "-1";
            }
        }
        Yl().LJLLLL = Yl().LJLLJ;
        TrendingDetailOperatorWrapper Yl2 = Yl();
        String outAwemeId = this.LJLJJI.getOutAwemeId();
        if (outAwemeId == null) {
            outAwemeId = "";
        }
        Yl2.getClass();
        Yl2.LJLLI = outAwemeId;
        String trendingEventId = this.LJLJJI.getTrendingEventId();
        if (trendingEventId != null && trendingEventId.length() != 0) {
            TrendingDetailOperatorWrapper Yl3 = Yl();
            TrendingEventModel trendingEventModel = new TrendingEventModel();
            trendingEventModel.setEventId(this.LJLJJI.getTrendingEventId());
            trendingEventModel.setTrendingName(this.LJLJJI.getTrendingName());
            Yl3.LJLLILLLL = trendingEventModel;
        }
        SYL syl = new SYL(view.getContext(), null);
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZ = 5;
        syl.setListConfig(c57939MoZ);
        TrendingDetailOperatorWrapper Yl4 = Yl();
        C72808Sho<InterfaceC57784Mm4> state = syl.getState();
        o.LJIIIIZZ(state, "fakeList.state");
        Yl4.setListState(state);
        final TrendingDetailOperatorWrapper Yl5 = Yl();
        syl.LJLJLLL((AbstractC72278SYg) new TBR(Yl5) { // from class: X.KQL
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        MB3.LIZ(getArguments());
        String outAwemeId2 = this.LJLJJI.getOutAwemeId();
        String Xl2 = Xl();
        String searchKeyword = this.LJLJJI.getSearchKeyword();
        String searchId = this.LJLJJI.getSearchId();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", MB3.LIZ);
        if (Xl2 == null) {
            Xl2 = "";
        }
        c188727au.LJIIIZ("trending_entrance", Xl2);
        if (outAwemeId2 == null) {
            outAwemeId2 = "";
        }
        c188727au.LJIIIZ("from_group_id", outAwemeId2);
        if (searchKeyword == null) {
            searchKeyword = "";
        }
        c188727au.LJIIIZ("search_keyword", searchKeyword);
        if (searchId != null) {
            str = searchId;
        }
        c188727au.LJIIIZ("search_id", str);
        FMX.LJIIL("trending_inflow_page_show", c188727au.LIZ);
        DetailFragmentPanel detailFragmentPanel = this.LJLJI;
        if (detailFragmentPanel != null && (playerComponentTemp = detailFragmentPanel.playerComponent) != null) {
            playerComponentTemp.Cm0();
        }
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS140S0200000_9(this, view, 31));
        View Jl = Jl();
        if (Jl != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 71), Jl);
        }
    }

    @Override // X.InterfaceC224628ri
    public void G2(boolean z, Aweme aweme, Aweme aweme2) {
        fm(Yl(), new AqS21S0310000_9(this, z, aweme, aweme2, 0));
    }

    public View Tl(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, R.layout.cts, viewGroup, false);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, R> R em(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C212418Vh.LJIIJ(vm1, vm2, interfaceC88471Ynr);
    }

    public static View Vl(TrendingDetailPageFragment trendingDetailPageFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View Tl = trendingDetailPageFragment.Tl(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(Tl instanceof View)) {
            Tl = null;
        }
        if (Tl != null) {
            try {
                ViewTreeLifecycleOwner.set(Tl, trendingDetailPageFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(Tl, trendingDetailPageFragment);
                C10A.LIZIZ(Tl, trendingDetailPageFragment);
                ActivityC45651qj mo49getActivity = trendingDetailPageFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return Tl;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, VM3 extends AssemViewModel<S3>, S3 extends C33Q, R> R dm(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C212418Vh.LJIIIZ(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    @Override // X.C8YM
    public <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <S extends C33Q, T> InterfaceC222288nw Sl(AssemViewModel<S> assemViewModel, TBW<S, ? extends AbstractC72932td<? extends T>> tbw, C56412MCa<C213178Yf<AbstractC72932td<T>>> c56412MCa, InterfaceC88471Ynr<? super C3C8, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super C3C8, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C212418Vh.LIZ(this, assemViewModel, tbw, c56412MCa, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    public <S extends C33Q, A, B> InterfaceC222288nw cm(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LJI(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}

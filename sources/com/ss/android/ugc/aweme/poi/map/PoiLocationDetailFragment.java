package com.ss.android.ugc.aweme.poi.map;

import X.AbstractC62641OiD;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C190817eH;
import X.C190927eS;
import X.C190937eT;
import X.C190947eU;
import X.C191067eg;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C29S;
import X.C2NU;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C41155GDf;
import X.C41156GDg;
import X.C45804HyK;
import X.C56178M3a;
import X.C56412MCa;
import X.C5H3;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EnumC191017eb;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC61213O0r;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.M3Z;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.map.PoiLocationDetailFragment;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class PoiLocationDetailFragment extends BaseFragment implements KPL {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public View LJLJJLL;
    public FrameLayout LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public C73305Spp LJLLJ;
    public PoiAnchorData LJLLL;
    public final C214298b3 LJLLLL;
    public boolean LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public PoiLocationDetailFragment() {
        C214298b3 c214298b3;
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.requiredArg(this, C191067eg.LJLIL, "poi_id", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArg(this, C190927eS.LJLIL, "enter_from", String.class);
        this.LJLJI = routeArgExtension.optionalArg(this, C190937eT.LJLIL, "enter_method", String.class);
        this.LJLJJI = routeArgExtension.optionalArg(this, new AqS169S0100000_3(this, 391), "mob_param", LocationDetailMobParam.class);
        this.LJLJJL = routeArgExtension.optionalArg(this, new AqS169S0100000_3(this, 392), "poi_collect_mob_data", C190817eH.class);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiMapViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 766);
        C190947eU c190947eU = C190947eU.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c190947eU, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c190947eU, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLLLL = c214298b3;
        this.LJLLLLLL = true;
    }

    public final String G20() {
        return (String) this.LJLIL.getValue();
    }

    public final PoiMapViewModel vl() {
        return (PoiMapViewModel) this.LJLLLL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
        o.LJIIIIZZ(LJIIIZ, "get().getService(IScreenshotService::class.java)");
        LJIIIZ.LJI(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ScreenShotService.LJIIIZ().LIZ("poi_map", new AbstractC62641OiD() { // from class: X.7eP
            @Override // X.AbstractC62641OiD
            public final java.util.Map<String, String> mobExtalParams() {
                return C225248si.LIZ("poi_map", PoiLocationDetailFragment.this.G20(), PoiLocationDetailFragment.this.LJLLL);
            }
        });
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C41155GDf.LJLIL);
        activityConfiguration(C41156GDg.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8YN.LJII(this, vl(), new TBT() { // from class: X.7eV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C190977eX) obj).LJLILLLLZI;
            }
        }, null, new AqS185S0100000_3(this, 64), 6);
        C8YN.LJII(this, vl(), new TBT() { // from class: X.7eR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C190977eX) obj).LJLJI;
            }
        }, null, new AqS185S0100000_3(this, 65), 6);
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            PoiMapViewModel vl = vl();
            String poiId = G20();
            vl.getClass();
            o.LJIIIZ(poiId, "poiId");
            vl.withState(new AqS57S1100000_3(vl, poiId, 38));
            return;
        }
        C73305Spp c73305Spp = this.LJLLJ;
        if (c73305Spp != null) {
            c73305Spp.post(new ARunnableS39S0100000_3(this, 194));
            vl().gv0(EnumC191017eb.STATUS_POI_DETAIL_FAIL);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        ActivityC45651qj LJJIFFI;
        Intent intent;
        o.LJIIIZ(inflater, "inflater");
        if (viewGroup != null && (context = viewGroup.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (intent = LJJIFFI.getIntent()) != null) {
            long longExtra = intent.getLongExtra("page_start_ts", -1L);
            if (longExtra > 0) {
                vl().LJLILLLLZI = Long.valueOf(longExtra);
                M3Z m3z = new M3Z("poi_map");
                m3z.LIZLLL = "open_page";
                m3z.LIZ(System.currentTimeMillis() - longExtra);
                C56178M3a.LIZ(m3z);
            }
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c0x, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "this");
        this.LJLJJLL = LLLLIILL;
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 862));
        View view = this.LJLJJLL;
        C29S c29s = null;
        if (view != null) {
            View findViewById = view.findViewById(R.id.des);
            o.LJIIIIZZ(findViewById, "content.findViewById(R.id.fl_map_view_container)");
            this.LJLJL = (FrameLayout) findViewById;
            View view2 = this.LJLJJLL;
            if (view2 != null) {
                View findViewById2 = view2.findViewById(R.id.n_e);
                o.LJIIIIZZ(findViewById2, "content.findViewById(R.id.view_bg_bottom)");
                this.LJLJLJ = findViewById2;
                View view3 = this.LJLJJLL;
                if (view3 != null) {
                    View findViewById3 = view3.findViewById(R.id.eys);
                    o.LJIIIIZZ(findViewById3, "content.findViewById(R.id.iv_back)");
                    this.LJLJLLL = findViewById3;
                    View view4 = this.LJLJJLL;
                    if (view4 != null) {
                        View findViewById4 = view4.findViewById(R.id.f1s);
                        o.LJIIIIZZ(findViewById4, "content.findViewById(R.id.iv_detail)");
                        this.LJLL = findViewById4;
                        View view5 = this.LJLJJLL;
                        if (view5 != null) {
                            View findViewById5 = view5.findViewById(R.id.bdv);
                            o.LJIIIIZZ(findViewById5, "content.findViewById(R.id.cl_top)");
                            this.LJLLI = findViewById5;
                            View view6 = this.LJLJJLL;
                            if (view6 != null) {
                                View findViewById6 = view6.findViewById(R.id.bcg);
                                o.LJIIIIZZ(findViewById6, "content.findViewById(R.id.cl_bottom)");
                                this.LJLLILLLL = findViewById6;
                                View view7 = this.LJLJJLL;
                                if (view7 != null) {
                                    View findViewById7 = view7.findViewById(R.id.kf_);
                                    o.LJIIIIZZ(findViewById7, "content.findViewById(R.id.status_view)");
                                    this.LJLLJ = (C73305Spp) findViewById7;
                                    View view8 = this.LJLJLLL;
                                    if (view8 != null) {
                                        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 285), view8);
                                        View view9 = this.LJLL;
                                        if (view9 != null) {
                                            C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 38, 42, 42), view9);
                                            View view10 = this.LJLJLJ;
                                            if (view10 != null) {
                                                view10.setVisibility(0);
                                                View view11 = this.LJLLI;
                                                if (view11 != null) {
                                                    ViewGroup.LayoutParams layoutParams = view11.getLayoutParams();
                                                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                                    View view12 = this.LJLJJLL;
                                                    if (view12 != null) {
                                                        Context context2 = view12.getContext();
                                                        o.LJIIIIZZ(context2, "content.context");
                                                        marginLayoutParams.topMargin = C63081OpJ.LJJJJLI(context2);
                                                        vl().gv0(EnumC191017eb.STATUS_PAGE_INIT);
                                                        try {
                                                            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                                                            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                                                            C10A.LIZIZ(LLLLIILL, this);
                                                            ActivityC45651qj mo49getActivity = mo49getActivity();
                                                            if (mo49getActivity instanceof C29S) {
                                                                c29s = (C29S) mo49getActivity;
                                                            }
                                                            C90903hW.LIZ(c29s);
                                                            C3C5.m7constructorimpl(C76800UCe.LIZ);
                                                        } catch (Throwable th) {
                                                            C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                                        }
                                                        return LLLLIILL;
                                                    }
                                                    o.LJIJI("content");
                                                    throw null;
                                                }
                                                o.LJIJI("clTop");
                                                throw null;
                                            }
                                            o.LJIJI("viewBottomBg");
                                            throw null;
                                        }
                                        o.LJIJI("viewDetail");
                                        throw null;
                                    }
                                    o.LJIJI("viewBack");
                                    throw null;
                                }
                                o.LJIJI("content");
                                throw null;
                            }
                            o.LJIJI("content");
                            throw null;
                        }
                        o.LJIJI("content");
                        throw null;
                    }
                    o.LJIJI("content");
                    throw null;
                }
                o.LJIJI("content");
                throw null;
            }
            o.LJIJI("content");
            throw null;
        }
        o.LJIJI("content");
        throw null;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
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

package com.ss.android.ugc.aweme.poi.search;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213588Zu;
import X.C213598Zv;
import X.C213608Zw;
import X.C213618Zx;
import X.C213628Zy;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C45804HyK;
import X.C56178M3a;
import X.C56412MCa;
import X.C5H3;
import X.C61712OJw;
import X.C61713OJx;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.EnumC85244Xcu;
import X.GG2;
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
import X.TBW;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class PoiSearchFragment extends BasePage implements KPL {
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C214378bB LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public PoiSearchFragment() {
        AqS60S0110000_3 LJJ;
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLILLLLZI = routeArgExtension.optionalArg(this, C213618Zx.LJLIL, "poi_mob_param", PoiMobParam.class);
        this.LJLJI = routeArgExtension.optionalArg(this, C213598Zv.LJLIL, "aid", String.class);
        this.LJLJJI = routeArgExtension.optionalArg(this, C213588Zu.LJLIL, "page_scene", EnumC85244Xcu.class);
        C65776Prg LIZ = C65352Pkq.LIZ(PoiSearchVM.class);
        C213628Zy c213628Zy = C213628Zy.LJLIL;
        C213608Zw c213608Zw = C213608Zw.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLJJL = new C214378bB(LIZ, c213628Zy, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c213608Zw, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        C61713OJx LIZJ = C61712OJw.LIZJ(mo49getActivity);
        LIZJ.LJII(R.attr.cl);
        LIZJ.LJ(R.attr.cl);
        LIZJ.LIZ(true);
        LIZJ.LIZJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, X.JBS
    public final void onBeforeActivityCreated(Activity activity) {
        String str;
        PoiMobParam poiMobParam = (PoiMobParam) this.LJLILLLLZI.getValue();
        if (poiMobParam != null) {
            str = poiMobParam.getEnterFrom();
        } else {
            str = null;
        }
        if (!o.LJ(str, "video_post_page") && (this.LJLJJI.getValue() == EnumC85244Xcu.ADD_LOCATION || this.LJLJJI.getValue() == EnumC85244Xcu.LOCATION_STICKER)) {
            if (activity != null) {
                activity.setTheme(R.style.uw);
            } else {
                return;
            }
        } else if (activity == null) {
            return;
        }
        C61713OJx LIZJ = C61712OJw.LIZJ((ActivityC45651qj) activity);
        LIZJ.LJII(R.attr.cl);
        LIZJ.LJ(R.attr.cl);
        LIZJ.LIZ(true);
        LIZJ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        activityConfiguration(GG2.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 399));
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
                ((PoiSearchVM) this.LJLJJL.getValue()).LJLJJL = Long.valueOf(longExtra);
                M3Z m3z = new M3Z("poi_search");
                m3z.LIZLLL = "open_page";
                m3z.LIZ(System.currentTimeMillis() - longExtra);
                C56178M3a.LIZ(m3z);
            }
        }
        PoiSearchVM poiSearchVM = (PoiSearchVM) this.LJLJJL.getValue();
        EnumC85244Xcu enumC85244Xcu = (EnumC85244Xcu) this.LJLJJI.getValue();
        if (enumC85244Xcu == null) {
            enumC85244Xcu = EnumC85244Xcu.ADD_LOCATION;
        }
        o.LJIIIZ(enumC85244Xcu, "<set-?>");
        poiSearchVM.LJLIL = enumC85244Xcu;
        ((PoiSearchVM) this.LJLJJL.getValue()).LJLILLLLZI = (String) this.LJLJI.getValue();
        ((PoiSearchVM) this.LJLJJL.getValue()).LJLLILLLL = (PoiMobParam) this.LJLILLLLZI.getValue();
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c02, viewGroup, false);
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

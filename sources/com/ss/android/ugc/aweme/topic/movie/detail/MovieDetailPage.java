package com.ss.android.ugc.aweme.topic.movie.detail;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C184077Kh;
import X.C199407s8;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C29S;
import X.C2K0;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C51029K0z;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C7RJ;
import X.C7RK;
import X.C7RL;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.EV9;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC55235Lm3;
import X.InterfaceC61213O0r;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.TBT;
import X.TBW;
import X.XKX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieVideoListVM;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class MovieDetailPage extends DetailBaseFragment implements ShootAbility, KPL, RefreshAbility {
    public final C214298b3 LJLJJI;
    public final C214378bB LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C5H3 LJLILLLLZI = RouteArgExtension.INSTANCE.requiredArg(this, C7RL.LJLIL, "movie_id", String.class);
    public final String LJLJI = String.valueOf(System.currentTimeMillis());

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void ZJ() {
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String lr() {
        return "movie_detail_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MovieDetailPage() {
        AqS60S0110000_3 LJJ;
        C65776Prg LIZ = C65352Pkq.LIZ(MovieDetailVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1075);
        C7RJ c7rj = C7RJ.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, false);
        AqS60S0110000_3 LJJIIJZLJL = C78926UyI.LJJIIJZLJL(this, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LJLJJI = new C214298b3(LIZ, aqS153S0100000_3, c214528bQ, LJJII, LJJIIJZLJL, c184077Kh, c7rj, (InterfaceC65784Pro) null, 384);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(this, 1073);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MovieVideoListVM.class);
        C7RK c7rk = C7RK.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLJJL = new C214378bB(LIZ2, aqS153S0100000_32, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, c7rk, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        ((MovieVideoListVM) this.LJLJJL.getValue()).LJLJJI = true;
        xl().LJLJI = true;
        MovieDetailVM xl = xl();
        xl.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(xl), null, null, new C199407s8(xl, null), 3);
        ((AssemSingleListViewModel) this.LJLJJL.getValue()).manualListRefresh();
    }

    public final MovieDetailVM xl() {
        return (MovieDetailVM) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), ShootAbility.class, null);
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), RefreshAbility.class, null);
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), FavoriteAbility.class, null);
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), DetailPageNameAbility.class, null);
        FMX.LJIIL("close_detail_page", C51029K0z.LJJIIZI(new OSZ("enter_from", "movie_detail_page")));
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void te0() {
        C212418Vh.LJIIJJI(xl(), new AqS169S0100000_3(this, 492));
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void mj() {
        te0();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        C2K0 LIZ = C55096Ljo.LIZ(LIZJ, ShootAbility.class, null);
        if (LIZ == null) {
            C55096Ljo.LJIIJJI(LIZJ, this, ShootAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(this);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(this);
                ev9.LIZ.add(LIZ);
                Object newProxyInstance = Proxy.newProxyInstance(ShootAbility.class.getClassLoader(), new Class[]{ShootAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, ShootAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(this, null);
        C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ2, RefreshAbility.class, null);
        if (LIZ2 == null) {
            C55096Ljo.LJIIJJI(LIZJ2, this, RefreshAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ2);
                if (invocationHandler2 instanceof EV9) {
                    ((EV9) invocationHandler2).LIZ.add(this);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused2) {
                EV9 ev92 = new EV9();
                ev92.LIZ.add(this);
                ev92.LIZ.add(LIZ2);
                Object newProxyInstance2 = Proxy.newProxyInstance(RefreshAbility.class.getClassLoader(), new Class[]{RefreshAbility.class}, ev92);
                if (newProxyInstance2 != null) {
                    C55096Ljo.LJIIJJI(LIZJ2, (C2K0) newProxyInstance2, RefreshAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ3 = C55230Lly.LIZJ(this, null);
        MovieDetailVM xl = xl();
        C2K0 LIZ3 = C55096Ljo.LIZ(LIZJ3, FavoriteAbility.class, null);
        if (LIZ3 == null) {
            C55096Ljo.LJIIJJI(LIZJ3, xl, FavoriteAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler3 = Proxy.getInvocationHandler(LIZ3);
                if (invocationHandler3 instanceof EV9) {
                    ((EV9) invocationHandler3).LIZ.add(xl);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused3) {
                EV9 ev93 = new EV9();
                ev93.LIZ.add(xl);
                ev93.LIZ.add(LIZ3);
                Object newProxyInstance3 = Proxy.newProxyInstance(FavoriteAbility.class.getClassLoader(), new Class[]{FavoriteAbility.class}, ev93);
                if (newProxyInstance3 != null) {
                    C55096Ljo.LJIIJJI(LIZJ3, (C2K0) newProxyInstance3, FavoriteAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ4 = C55230Lly.LIZJ(this, null);
        C2K0 LIZ4 = C55096Ljo.LIZ(LIZJ4, DetailPageNameAbility.class, null);
        if (LIZ4 == null) {
            C55096Ljo.LJIIJJI(LIZJ4, this, DetailPageNameAbility.class, null);
            return;
        }
        try {
            InvocationHandler invocationHandler4 = Proxy.getInvocationHandler(LIZ4);
            if (invocationHandler4 instanceof EV9) {
                ((EV9) invocationHandler4).LIZ.add(this);
                return;
            }
            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
        } catch (IllegalArgumentException unused4) {
            EV9 ev94 = new EV9();
            ev94.LIZ.add(this);
            ev94.LIZ.add(LIZ4);
            Object newProxyInstance4 = Proxy.newProxyInstance(DetailPageNameAbility.class.getClassLoader(), new Class[]{DetailPageNameAbility.class}, ev94);
            if (newProxyInstance4 != null) {
                C55096Ljo.LJIIJJI(LIZJ4, (C2K0) newProxyInstance4, DetailPageNameAbility.class, null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility");
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        MovieDetailVM xl = xl();
        String str = (String) this.LJLILLLLZI.getValue();
        xl.getClass();
        o.LJIIIZ(str, "<set-?>");
        xl.LJLIL = str;
        MovieVideoListVM movieVideoListVM = (MovieVideoListVM) this.LJLJJL.getValue();
        String str2 = (String) this.LJLILLLLZI.getValue();
        o.LJIIIZ(str2, "<set-?>");
        movieVideoListVM.LJLIL = str2;
        MovieVideoListVM movieVideoListVM2 = (MovieVideoListVM) this.LJLJJL.getValue();
        String str3 = this.LJLJI;
        o.LJIIIZ(str3, "<set-?>");
        movieVideoListVM2.LJLILLLLZI = str3;
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 937));
        AssemViewModel.asyncSubscribe$default(xl(), new TBT() { // from class: X.7RI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C7RN) obj).LJLIL;
            }
        }, null, new AqS169S0100000_3(this, 490), new AqS153S0100000_3(this, 1074), new AqS169S0100000_3(this, 491), 2, null);
        MovieDetailVM xl2 = xl();
        xl2.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(xl2), null, null, new C199407s8(xl2, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(R.id.bul);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setBackgroundColor(-1);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            C10A.LIZIZ(frameLayout, this);
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
        return frameLayout;
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

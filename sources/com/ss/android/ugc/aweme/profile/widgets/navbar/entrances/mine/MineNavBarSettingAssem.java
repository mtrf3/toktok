package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine;

import X.AVS;
import X.C113554cx;
import X.C2068389v;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C234529Ii;
import X.C244779j7;
import X.C244789j8;
import X.C244809jA;
import X.C244839jD;
import X.C244849jE;
import X.C244859jF;
import X.C244989jS;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C60829Nu5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73040SlY;
import X.C76800UCe;
import X.C78926UyI;
import X.C86V;
import X.C8VC;
import X.C8YN;
import X.C8YZ;
import X.C9HI;
import X.C9KV;
import X.C9XN;
import X.EnumC235829Ni;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC244909jK;
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
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BABusinessSuitePageServiceImp;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem;
import com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MineNavBarSettingAssem extends ProfileNavIconActionAssem<EnumC235829Ni> implements KPL {
    public final C214298b3 LJLIL;
    public AVS LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    public MineNavBarSettingAssem() {
        C9XN c9xn = C9XN.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreatorToolsNavBarSettingViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9xn, new AqS154S0100000_4(LIZ, 743), C244789j8.INSTANCE, null);
        this.LJLJI = C221108m2.LIZIZ(C244779j7.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(C244859jF.LJLIL);
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (isFromMain()) {
            requestDisplayAction();
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9Vc
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PL) obj).LIZ;
                }
            }, new AqS170S0100000_4(this, 726));
        }
        if (C244839jD.LIZ()) {
            C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9j5
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C244749j4) obj).LJLIL;
                }
            }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 177), 4);
        }
        ((ICreatorCenterPreloadService) this.LJLJI.getValue()).LIZ();
        int LIZ = C244849jE.LIZ();
        if (C244809jA.LIZ()) {
            if (LIZ == 2 || LIZ == 5) {
                C60829Nu5.LIZIZ(new C244989jS(true));
            }
        }
    }

    public final IWalletService v3() {
        return (IWalletService) this.LJLJJI.getValue();
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ((ICreatorCenterPreloadService) this.LJLJI.getValue()).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final C9HI getActionType() {
        return EnumC235829Ni.Setting;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final void initNavAction(C234529Ii c234529Ii) {
        C234529Ii navAction = c234529Ii;
        o.LJIIIZ(navAction, "navAction");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_3_lines_horizontal_2;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        navAction.LIZ(c2068389v);
        navAction.LIZIZ(new AqS154S0100000_4(this, 1062));
        if (SettingServiceImpl.LIZ().shouldShowBusinessAccount()) {
            BABusinessSuitePageServiceImp.LIZJ().LIZIZ();
        }
        EnumC235829Ni enumC235829Ni = EnumC235829Ni.Setting;
        String LJFF = C86V.LJFF(R.string.ams);
        o.LJIIIIZZ(LJFF, "getString(R.string.acces…yLabels_profile_btn_menu)");
        updateContentDescription(enumC235829Ni, LJFF);
    }

    public final void x3(String str) {
        FMX.LJIIL("enter_setting_page", C113554cx.LJJLIIIIJ(new OSZ("previous_page", "personal_homepage"), new OSZ("enter_from", "personal_homepage"), new OSZ("enter_method", str)));
        C73040SlY.LJII(getContext(), "set", "personal_homepage");
        InterfaceC244909jK interfaceC244909jK = (InterfaceC244909jK) C8VC.LJII(this, C65352Pkq.LIZ(InterfaceC244909jK.class));
        if (interfaceC244909jK != null) {
            interfaceC244909jK.LLLIILIL();
        }
        SmartRouter.buildRoute(getContext(), "//setting").open();
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

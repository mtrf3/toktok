package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.user;

import X.C175256uH;
import X.C2068389v;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C234999Kd;
import X.C235079Kl;
import X.C245349k2;
import X.C245379k5;
import X.C245479kF;
import X.C26074ALe;
import X.C26175APb;
import X.C33Q;
import X.C3C8;
import X.C47704Ins;
import X.C55749LuL;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C86034Xpe;
import X.C8BR;
import X.C8BS;
import X.C8VC;
import X.C8YN;
import X.C8YZ;
import X.C9HI;
import X.C9PN;
import X.EnumC235829Ni;
import X.HG3;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC85901XnV;
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
import X.QD3;
import X.RBX;
import X.TBT;
import X.TBW;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS39S0200000_4;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveAssemViewModel;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavCustomActionAssem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class UserNavBarBellAssem extends ProfileNavCustomActionAssem<EnumC235829Ni> implements InterfaceC85901XnV, KPL {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C8BR<C8BS<PushSettings>, InterfaceC85901XnV> LJLJI;
    public C245479kF LJLJJI;
    public boolean LJLJJL;

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

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavCustomActionAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        if (((RBX) HG3.LJIILL()).isLogin()) {
            requestDisplayAction();
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9k4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 730));
        C8YN.LJIIJ(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9kA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C245469kE) obj).LJLJI;
            }
        }, new TBT() { // from class: X.9k8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C245469kE) obj).LJLIL);
            }
        }, null, new IDqS429S0100000_4(this, 11), 12);
    }

    @Override // X.InterfaceC85901XnV
    public final void onFailed(Exception exc) {
    }

    public UserNavBarBellAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(NotificationLiveAssemViewModel.class);
        this.LJLIL = new C214298b3(new AqS154S0100000_4(LIZ, 744), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C245379k5.INSTANCE, LIZ);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C26175APb.class, null), checkSupervisorPrepared());
        this.LJLJI = C86034Xpe.LIZIZ.providePushSettingFetchPresenter();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavCustomActionAssem
    public final View initCustomAction() {
        Context context = getContext();
        if (context != null) {
            LiveOuterService.LJJJLL().LJJIZ().LJJJZ().getClass();
            C245479kF c245479kF = new C245479kF(context);
            this.LJLJJI = c245479kF;
            c245479kF.setBellIcon(v3(2));
            C245479kF c245479kF2 = this.LJLJJI;
            if (c245479kF2 != null) {
                c245479kF2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS39S0200000_4(this, context, 30)));
            }
        }
        return this.LJLJJI;
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJI.LIZIZ();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final C9HI getActionType() {
        return EnumC235829Ni.Bell;
    }

    @Override // X.InterfaceC85901XnV
    public final void A1(PushSettings pushSettings) {
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
        boolean z = true;
        if (pushSettings.livePush != 1) {
            z = false;
        }
        C26074ALe.LIZJ(z);
    }

    @QD3
    public final void onEvent(C245349k2 event) {
        String str;
        User user;
        CommerceUserInfo commerceUserInfo;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLIL;
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null && (aweme = c9pn.LJI) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getCreativeIdStr();
        } else {
            str = null;
        }
        if (!o.LJ(str2, str)) {
            return;
        }
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
            if (user != null && (commerceUserInfo = user.getCommerceUserInfo()) != null) {
                commerceUserInfo.setNotificationConfig(event.LJLILLLLZI ? 1 : 0);
            }
        } else {
            user = null;
        }
        C235079Kl.LIZIZ((InterfaceC235069Kk) C8VC.LIZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), user, null, false, 6);
    }

    @QD3
    public final void onUserLoginSuccessfully(C175256uH c175256uH) {
        if (HG3.LJIILL().isLogin()) {
            requestDisplayAction();
        }
    }

    public final C2068389v v3(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_bell;
                    c2068389v.LJ = Integer.valueOf(R.attr.go);
                    return c2068389v;
                }
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_bell_slash;
                c2068389v2.LJ = Integer.valueOf(R.attr.go);
                return c2068389v2;
            }
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_bell;
            c2068389v3.LJ = Integer.valueOf(R.attr.go);
            return c2068389v3;
        }
        C2068389v c2068389v4 = new C2068389v();
        c2068389v4.LIZ = R.raw.icon_bell_activation;
        c2068389v4.LJ = Integer.valueOf(R.attr.go);
        return c2068389v4;
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

package com.ss.android.ugc.aweme.paidcontent.seriescreation.activity;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C234529Ii;
import X.C248499p7;
import X.C248509p8;
import X.C248519p9;
import X.C248559pD;
import X.C248589pG;
import X.C248629pK;
import X.C252709vu;
import X.C26227ARb;
import X.C33Q;
import X.C3C8;
import X.C48841JEv;
import X.C56412MCa;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65803Ps7;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78613UtF;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.C9BT;
import X.C9KF;
import X.CK3;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC248539pB;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.JBR;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import X.UC0;
import X.XKX;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.Price;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS9S2000000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesDraftActivity extends ActivityC86117Xqz implements KPL {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C214298b3 LJLJJI;
    public final C73318Sq2 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
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

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public SeriesDraftActivity() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArg(this, C248509p8.LJLIL, "collection_id", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArg(this, C248519p9.LJLIL, "enter_from", String.class);
        this.LJLJI = routeArgExtension.optionalArgNotNull(this, C9BT.LJLIL, "should_show_back_button", Boolean.class);
        C65776Prg LIZ = C65352Pkq.LIZ(SeriesDraftViewModel.class);
        this.LJLJJI = new C214298b3(LIZ, new AqS154S0100000_4(LIZ, 598), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C248499p7.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLJJL = new C73318Sq2();
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 594));
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 599));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 597));
        C221108m2.LIZIZ(new AqS154S0100000_4(this, 596));
    }

    public final SeriesDraftViewModel LLFII() {
        return (SeriesDraftViewModel) this.LJLJJI.getValue();
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String str;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        if (LLFII().gv0()) {
            C248629pK state = LLFII().getState();
            String str4 = state.LJLIL;
            C248559pD c248559pD = state.LJLJL;
            String str5 = null;
            if (c248559pD != null) {
                str = c248559pD.LIZ;
            } else {
                str = null;
            }
            boolean z3 = true;
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            Price price = state.LJLJJI;
            if (price != null) {
                str5 = price.getPriceInUsd();
            }
            if (state.LJLILLLLZI != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (state.LJLJI == null) {
                z3 = false;
            }
            String str6 = state.LL;
            C188727au LIZ = CK3.LIZ("collection_id", str4);
            String str7 = "1";
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJI("is_cover", str2);
            LIZ.LJI("pricing_selection", str5);
            if (z2) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJI("is_name", str3);
            if (!z3) {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJI("is_description", str7);
            LIZ.LJI("enter_from", str6);
            FMX.LJIIL("show_new_series_save_popup", LIZ.LIZ);
            C26227ARb c26227ARb = new C26227ARb(this);
            c26227ARb.LJ(R.string.qmc);
            UC0.LIZJ(c26227ARb, new AqS170S0100000_4(this, 1543));
            c26227ARb.LJI().LIZLLL();
            return;
        }
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        this.LJLJJL.dispose();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public final void LLFZ(String str) {
        String str2;
        boolean z;
        boolean z2;
        String str3;
        String str4;
        C248629pK state = LLFII().getState();
        String str5 = state.LJLIL;
        C248559pD c248559pD = state.LJLJL;
        String str6 = null;
        if (c248559pD != null) {
            str2 = c248559pD.LIZ;
        } else {
            str2 = null;
        }
        boolean z3 = false;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        Price price = state.LJLJJI;
        if (price != null) {
            str6 = price.getPriceInUsd();
        }
        if (state.LJLILLLLZI != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (state.LJLJI != null) {
            z3 = true;
        }
        String str7 = state.LL;
        C188727au LJIIIIZZ = JBR.LJIIIIZZ("button_name", str, "collection_id", str5);
        String str8 = "1";
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIIIZZ.LJI("is_cover", str3);
        LJIIIIZZ.LJI("pricing_selection", str6);
        if (z2) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIIIZZ.LJI("is_name", str4);
        if (!z3) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIIIZZ.LJI("is_description", str8);
        LJIIIIZZ.LJI("enter_from", str7);
        FMX.LJIIL("click_new_series_save_popup", LJIIIIZZ.LIZ);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.aj8);
        C252709vu c252709vu = (C252709vu) this.LJLJJLL.getValue();
        if (c252709vu != null) {
            C9KF c9kf = new C9KF();
            String string = getString(R.string.qmr);
            o.LJIIIIZZ(string, "getString(R.string.serie…ewSeries_headerSec_title)");
            c9kf.LIZJ = string;
            c252709vu.LJIILLIIL(c9kf);
            if (((Boolean) this.LJLJI.getValue()).booleanValue()) {
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
                LIZJ.LIZLLL = true;
                LIZJ.LIZIZ(new AqS154S0100000_4(this, 1241));
                c252709vu.LIZJ(LIZJ);
            }
        }
        SeriesDraftViewModel LLFII = LLFII();
        String str = (String) this.LJLILLLLZI.getValue();
        LLFII.getClass();
        LLFII.setState(new AqS29S1000000_4(str, 5));
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C248589pG(this, null), 3);
        C8YN.LJII(this, LLFII(), new TBT() { // from class: X.9p5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C248629pK) obj).LJLLLLLL;
            }
        }, null, new AqS186S0100000_4(this, 158), 6);
        LLFII().asyncSubscribe(new TBT() { // from class: X.9p6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C248629pK) obj).LJZ;
            }
        }, C213688a4.LIZLLL(), new AqS170S0100000_4(this, 505), new AqS154S0100000_4(this, 595), new AqS170S0100000_4(this, 506));
        FMX.LJIIL("show_new_series_shell_page", CK3.LIZ("enter_from", (String) this.LJLILLLLZI.getValue()).LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SeriesDraftViewModel LLFII = LLFII();
        LLFII.getClass();
        if (intent == null) {
            return;
        }
        if (i == 10002) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "uri");
            String valueOf = String.valueOf(intent.getData());
            if (LLJJIJIIJIL == null) {
                return;
            }
            LLFII.setState(new AqS9S2000000_4(LLJJIJIIJIL, valueOf, 1));
            return;
        }
        ((InterfaceC248539pB) LLFII.LJLILLLLZI.getValue()).onActivityResult(i, i2, intent);
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

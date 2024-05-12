package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.AMD;
import X.AML;
import X.AbstractActivityC27434Api;
import X.AbstractC26082ALm;
import X.AbstractC26897Ah3;
import X.C157166Eu;
import X.C221108m2;
import X.C26045AKb;
import X.C26755Ael;
import X.C26876Agi;
import X.C26898Ah4;
import X.C26901Ah7;
import X.C3C5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65803Ps7;
import X.C70858RrS;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78915Uy7;
import X.C84654XKg;
import X.EnumC63755P0l;
import X.InterfaceC151715xP;
import X.InterfaceC18010nF;
import X.InterfaceC26883Agp;
import X.InterfaceC37828Esy;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.TBW;
import X.TMG;
import X.W1T;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressListActivity extends AbstractActivityC27434Api implements InterfaceC151715xP, AMD<ViewModelProvider.Factory>, InterfaceC37828Esy, InterfaceC18010nF {
    public final lifecycleAwareLazy LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public long LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 130));

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
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

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.AbstractActivityC27434Api, X.InterfaceC37828Esy
    public final String getPageName() {
        return "shipping_info";
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public AddressListActivity() {
        C65776Prg LIZ = C65352Pkq.LIZ(AddressListViewModel.class);
        this.LJLJJL = new lifecycleAwareLazy(this, new AqS64S0400000_4(this, LIZ, C26876Agi.INSTANCE, LIZ, 2));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 127));
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 129));
        this.LJLJLJ = -1L;
    }

    public final AbstractC26897Ah3 LLII() {
        return (AbstractC26897Ah3) this.LJLJL.getValue();
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return EnumC63755P0l.ADDRESS_LIST_PAGE.getPageCode();
    }

    @Override // X.AMD
    public final ViewModelProvider.Factory getViewModelFactory() {
        return (ViewModelProvider.Factory) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        LLII().onBackPressed(new AqS154S0100000_4(this, 128));
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        String str;
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        LLII().onDestroy();
        ((InterfaceC26883Agp) this.LJLJJLL.getValue()).onDestroy();
        Address address = ((AddressListViewModel) this.LJLJJL.getValue()).LL;
        if (address == null || (str = address.id) == null) {
            str = "";
        }
        AddressPageStarter.AddressEvent addressEvent = new AddressPageStarter.AddressEvent(str, 3, null, 4, null);
        C84654XKg c84654XKg = AddressPageStarter.LIZIZ;
        if (c84654XKg != null) {
            C3C5.m7constructorimpl(addressEvent);
            c84654XKg.resumeWith(addressEvent);
            AddressPageStarter.LIZIZ = null;
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        LiveOuterService.LJJJLL().LJJIJIL().E8(SystemClock.elapsedRealtime() - this.LJLJLJ);
        LLII().onPause();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity", "onResume", true);
        super.onResume();
        this.LJLJLJ = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity", "onStart", true);
        super.onStart();
        LLII().onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity", "onStart", false);
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

    public static final /* synthetic */ void LLFZ(AddressListActivity addressListActivity) {
        super.onBackPressed();
    }

    @Override // X.AbstractActivityC27434Api, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
        HashMap<String, Object> hashMap = ((AddressListViewModel) this.LJLJJL.getValue()).LJLJL;
        C78915Uy7.LJJIL(c70858RrS, new AqS170S0100000_4((HashMap) hashMap, (HashMap<String, Object>) 209));
        C78915Uy7.LJJJ(c70858RrS, new AqS170S0100000_4((HashMap) hashMap, (HashMap<String, Object>) 210));
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity", "onCreate", true);
        activityConfiguration(C26898Ah4.LJLIL);
        super.onCreate(bundle);
        ((InterfaceC26883Agp) this.LJLJJLL.getValue()).LIZIZ(null, this, (JediViewModel) this.LJLJJL.getValue(), null);
        LLII().onCreate(bundle);
        InterfaceC26883Agp interfaceC26883Agp = (InterfaceC26883Agp) this.LJLJJLL.getValue();
        JediViewModel jediViewModel = (JediViewModel) this.LJLJJL.getValue();
        View container = _$_findCachedViewById(R.id.bs8);
        o.LJIIIIZZ(container, "container");
        interfaceC26883Agp.LIZ(jediViewModel, container);
        C26901Ah7.LIZIZ(this, "ec_address_select", "ec_address_change");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        LLII().onRestoreInstanceState(this, savedInstanceState);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        LLII().onSaveInstanceState(this, outState);
    }

    @Override // X.AbstractActivityC27434Api, X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_address_select")) {
            finish();
        } else {
            if (!o.LJ(eventName, "ec_address_change") || C26755Ael.LIZ(str).type != 2) {
                return;
            }
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIZ(getString(R.string.r92));
            c26045AKb.LJIIJ();
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}

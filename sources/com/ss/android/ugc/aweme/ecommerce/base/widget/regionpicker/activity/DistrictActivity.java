package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.activity;

import X.AML;
import X.AbstractActivityC27434Api;
import X.AbstractC26082ALm;
import X.C157166Eu;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C27088Ak8;
import X.C27196Als;
import X.C27739Aud;
import X.C47261Igj;
import X.C61712OJw;
import X.C61713OJx;
import X.C65330PkU;
import X.C65340Pke;
import X.C65352Pkq;
import X.C65803Ps7;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.ORZ;
import X.TBW;
import X.TMG;
import X.W1T;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DistrictActivity extends AbstractActivityC27434Api implements InterfaceC151715xP {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.activity.DistrictActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
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

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List list;
        boolean z;
        String str;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.activity.DistrictActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.xe);
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LJII(R.attr.cl);
        LIZJ.LIZJ();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "current_selected_region_list");
        if (LLJJIJIIJIL != null) {
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), LLJJIJIIJIL, C65330PkU.LIZJ(C65352Pkq.LJII(List.class, C65340Pke.LIZ(C65352Pkq.LJI(Region.class)))));
                if (!(fromJson instanceof List)) {
                    fromJson = null;
                }
                list = (List) fromJson;
            } catch (s unused) {
                list = null;
            }
        } else {
            list = null;
        }
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "geo_name_id");
        int intExtra = getIntent().getIntExtra("level_count", Integer.MAX_VALUE);
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "page_info");
        boolean booleanExtra = getIntent().getBooleanExtra("if_auto_locate", false);
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "previous_page");
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(getIntent(), "entrance_info");
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(getIntent(), "location");
        boolean booleanExtra2 = getIntent().getBooleanExtra("without_next_level", false);
        boolean LIZ = C27196Als.LIZ();
        if (C27196Als.LIZ()) {
            List LJJIJIIJI = C47261Igj.LJJIJIIJI("MY", "TH");
            if (LLJJIJIIJIL6 != null) {
                str = LLJJIJIIJIL6.toUpperCase();
                o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase()");
            } else {
                str = null;
            }
            if (!ORZ.LJLJJI(str, LJJIJIIJI)) {
                z = true;
                DistrictFragment LIZ2 = C27088Ak8.LIZ(LLJJIJIIJIL2, list, intExtra, LLJJIJIIJIL3, null, Boolean.valueOf(LIZ), Boolean.valueOf(z), null, booleanExtra, LLJJIJIIJIL4, LLJJIJIIJIL5, LLJJIJIIJIL6, null, booleanExtra2, true, 4112);
                LIZ2.LJLLLLLL = new AqS170S0100000_4(this, 324);
                LIZ2.LJLZ = new AqS154S0100000_4(this, 305);
                LIZ2.LJZ = new AqS154S0100000_4(this, 306);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                C1B3 LIZ3 = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                LIZ3.LJIIIIZZ(R.id.iu2, 1, LIZ2, null);
                LIZ3.LJI();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.activity.DistrictActivity", "onCreate", false);
            }
        }
        z = false;
        DistrictFragment LIZ22 = C27088Ak8.LIZ(LLJJIJIIJIL2, list, intExtra, LLJJIJIIJIL3, null, Boolean.valueOf(LIZ), Boolean.valueOf(z), null, booleanExtra, LLJJIJIIJIL4, LLJJIJIIJIL5, LLJJIJIIJIL6, null, booleanExtra2, true, 4112);
        LIZ22.LJLLLLLL = new AqS170S0100000_4(this, 324);
        LIZ22.LJLZ = new AqS154S0100000_4(this, 305);
        LIZ22.LJZ = new AqS154S0100000_4(this, 306);
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        C1B3 LIZ32 = C1B6.LIZ(supportFragmentManager2, supportFragmentManager2);
        LIZ32.LJIIIIZZ(R.id.iu2, 1, LIZ22, null);
        LIZ32.LJI();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.activity.DistrictActivity", "onCreate", false);
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

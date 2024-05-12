package com.ss.android.ugc.aweme.paidseries.broadcaster.before.activity;

import X.AbstractC029409q;
import X.ActivityC86117Xqz;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25659A5f;
import X.C25660A5g;
import X.C25661A5h;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65803Ps7;
import X.C73305Spp;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.C9KF;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
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
import X.TBT;
import X.TBW;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddSeriesToLiveViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS16S0000100_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidSeriesAddActivity extends ActivityC86117Xqz implements KPL {
    public RecyclerView LJLIL;
    public C73305Spp LJLILLLLZI;
    public long LJLJI;
    public final C214298b3 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidseries.broadcaster.before.activity.PaidSeriesAddActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public PaidSeriesAddActivity() {
        C65776Prg LIZ = C65352Pkq.LIZ(PaidSeriesAddSeriesToLiveViewModel.class);
        this.LJLJJI = new C214298b3(LIZ, new AqS154S0100000_4(LIZ, 643), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C25659A5f.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLJJL = C221108m2.LIZIZ(C25660A5g.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 641));
    }

    public final PaidSeriesAddSeriesToLiveViewModel LLFII() {
        return (PaidSeriesAddSeriesToLiveViewModel) this.LJLJJI.getValue();
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidseries.broadcaster.before.activity.PaidSeriesAddActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ai9);
        this.LJLIL = (RecyclerView) findViewById(R.id.jow);
        this.LJLILLLLZI = (C73305Spp) findViewById(R.id.joy);
        this.LJLJI = getIntent().getLongExtra("room_id", 0L);
        PaidSeriesAddSeriesToLiveViewModel LLFII = LLFII();
        long j = this.LJLJI;
        LLFII.getClass();
        LLFII.setState(new AqS16S0000100_4(j, 13));
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView2 = this.LJLIL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((AbstractC029409q) this.LJLJJLL.getValue());
        }
        C252709vu c252709vu = (C252709vu) findViewById(R.id.jox);
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            String string = getString(R.string.qi5);
            o.LJIIIIZZ(string, "getString(\n             …                        )");
            c9kf.LIZJ = string;
            c235119Kp.LIZJ = c9kf;
            c252709vu.setNavActions(c235119Kp);
            C234529Ii c234529Ii = new C234529Ii();
            c234529Ii.LIZJ();
            c234529Ii.LIZJ = R.raw.icon_chevron_left_ltr;
            c234529Ii.LIZLLL = true;
            c234529Ii.LIZIZ(new AqS154S0100000_4(this, 1049));
            c252709vu.LIZJ(c234529Ii);
        }
        LLFII().gv0();
        AssemViewModel.asyncSubscribe$default(LLFII(), new TBT() { // from class: X.A5b
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25656A5c) obj).LJLILLLLZI;
            }
        }, null, new AqS170S0100000_4(this, 520), new AqS154S0100000_4(this, 642), new AqS170S0100000_4(this, 521), 2, null);
        C8YN.LJII(this, LLFII(), new TBT() { // from class: X.A5e
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25656A5c) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 167), 4);
        AssemViewModel.asyncSubscribe$default(LLFII(), new TBT() { // from class: X.A5d
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25656A5c) obj).LJLJI;
            }
        }, null, C25661A5h.LJLIL, null, new AqS170S0100000_4(this, 522), 10, null);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidseries.broadcaster.before.activity.PaidSeriesAddActivity", "onCreate", false);
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

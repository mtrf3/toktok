package com.ss.android.ugc.aweme.pns.agegate.ui.view;

import X.AbstractC40941G4z;
import X.C16880lQ;
import X.C1B3;
import X.C221108m2;
import X.C29S;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C76800UCe;
import X.C86057Xq1;
import X.C86092Xqa;
import X.C86097Xqf;
import X.C86098Xqg;
import X.C86099Xqh;
import X.EnumC86095Xqd;
import X.InterfaceC86091XqZ;
import X.InterfaceC86100Xqi;
import Y.AObserverS58S0101000_2;
import Y.AObserverS59S0101000_3;
import Y.AObserverS60S0101000_5;
import Y.AObserverS64S0101000_14;
import Y.AObserverS77S0200000_14;
import Y.AObserverS78S0200000_15;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class PNSAgeGateActivity extends C29S {
    public static PNSAgeGateActivity LJLJLLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 512));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 509));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 515));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 513));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 514));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 510));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 511));
    public boolean LJLJLJ;

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final PNSAgeGateBaseFragment LLFII() {
        return (PNSAgeGateBaseFragment) this.LJLILLLLZI.getValue();
    }

    public final EnumC86095Xqd LLFZ() {
        return (EnumC86095Xqd) this.LJLJJI.getValue();
    }

    public final PNSBaseAgeGateViewModel LLII() {
        return (PNSBaseAgeGateViewModel) this.LJLJI.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C86057Xq1 LJ;
        PNSAgeGateBaseFragment LLFII;
        MutableLiveData<C76800UCe> wl;
        InterfaceC86091XqZ interfaceC86091XqZ = (InterfaceC86091XqZ) this.LJLJJL.getValue();
        if (interfaceC86091XqZ == null || (LJ = interfaceC86091XqZ.LJ()) == null || !o.LJ(LJ.getCanQuit(), Boolean.TRUE) || (LLFII = LLFII()) == null || (wl = LLFII.wl()) == null) {
            return;
        }
        wl.postValue(C76800UCe.LIZ);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        EnumC86095Xqd scenario = LLFZ();
        o.LJIIIZ(scenario, "scenario");
        C86098Xqg.LIZ.remove(scenario);
        EnumC86095Xqd scenario2 = LLFZ();
        o.LJIIIZ(scenario2, "scenario");
        C86097Xqf.LIZ.remove(scenario2);
        EnumC86095Xqd scenario3 = LLFZ();
        o.LJIIIZ(scenario3, "scenario");
        C86099Xqh.LIZ.remove(scenario3);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateActivity", "onStart", true);
        super.onStart();
        if (!this.LJLJLJ) {
            LLII().LJZ.observe(this, new AObserverS58S0101000_2(2, this, 16));
            LLII().LJLLI.observe(this, new AObserverS60S0101000_5(5, this, 0));
            LLII().LJLLILLLL.observe(this, new AObserverS58S0101000_2(3, this, 15));
            PNSAgeGateBaseFragment LLFII = LLFII();
            if (LLFII != null) {
                LLII().LJLLJ.observe(this, new AObserverS58S0101000_2(3, LLFII, 7));
                LLII().LJLLL.observe(this, new AObserverS64S0101000_14(1, LLFII, 3));
                LLII().LJLLLL.observe(this, new AObserverS59S0101000_3(3, LLFII, 0));
                LLII().LJLLLLLL.observe(this, new AObserverS58S0101000_2(1, LLFII, 8));
                LLII().LJLZ.observe(this, new AObserverS77S0200000_14(LLFII, this, 2));
                LLFII.Al().observe(this, new AObserverS58S0101000_2(1, this, 9));
                LLFII.xl().observe(this, new AObserverS78S0200000_15(this, LLFII, 0));
                LLFII.wl().observe(this, new AObserverS58S0101000_2(2, this, 6));
            }
            this.LJLJLJ = true;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateActivity", "onStart", false);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle data;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateActivity", "onCreate", true);
        LJLJLLL = this;
        super.onCreate(bundle);
        setContentView(R.layout.gp);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        PNSAgeGateBaseFragment LLFII = LLFII();
        if (LLFII != null) {
            c1b3.LJIIIIZZ(R.id.dm7, 1, LLFII, null);
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI == null) {
                LLJJIJI = new Bundle();
            }
            LLFII.setArguments(LLJJIJI);
            InterfaceC86100Xqi interfaceC86100Xqi = (InterfaceC86100Xqi) ((LinkedHashMap) C86099Xqh.LIZ).get(LLFZ());
            if (interfaceC86100Xqi != null && (data = interfaceC86100Xqi.data()) != null) {
                Bundle arguments = LLFII.getArguments();
                if (arguments != null) {
                    arguments.putAll(data);
                }
                Bundle arguments2 = LLFII.getArguments();
                if (arguments2 != null) {
                    arguments2.putSerializable("age_gate_params", (C86092Xqa) this.LJLIL.getValue());
                }
            }
            c1b3.LJIILJJIL();
            LLII().kv0((AbstractC40941G4z) this.LJLJJLL.getValue(), (InterfaceC86091XqZ) this.LJLJJL.getValue(), SystemClock.elapsedRealtime(), (C86092Xqa) this.LJLIL.getValue());
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateActivity", "onCreate", false);
    }
}

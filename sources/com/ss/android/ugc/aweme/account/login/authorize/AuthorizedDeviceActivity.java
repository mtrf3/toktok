package com.ss.android.ugc.aweme.account.login.authorize;

import X.ActivityC86117Xqz;
import X.C10K;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C26045AKb;
import X.C41117GBt;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C73305Spp;
import X.C73306Spq;
import X.C78840Uwu;
import X.C85144XbI;
import X.FMX;
import Y.ACListenerS27S0100000_7;
import Y.AgS124S0100000_7;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AuthorizedDeviceActivity extends ActivityC86117Xqz {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 41));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 42));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLFZ() {
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.keh);
        C73306Spq c73306Spq = new C73306Spq();
        String string = getString(R.string.rmx);
        o.LJIIIIZZ(string, "getString(R.string.step_…ion_no_authorized_logins)");
        c73306Spq.LJI = string;
        c73305Spp.setStatus(c73306Spq);
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(0);
        C16880lQ.LJIIJJI(new ACListenerS27S0100000_7(this, 8), (C73305Spp) _$_findCachedViewById(R.id.keh));
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

    public final void refresh() {
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(0);
        C16880lQ.LJIIJJI(null, (C73305Spp) _$_findCachedViewById(R.id.keh));
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).LJFF();
        TwoStepAuthApi.LIZ.getClass();
        TwoStepAuthApi.LIZIZ().getAuthDeviceList().LJ(new AgS124S0100000_7(this, 6), C10K.LJIIIIZZ, null);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onCreate", true);
        activityConfiguration(C41117GBt.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.m3);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.rmq);
        o.LJIIIIZZ(string, "getString(R.string.step_…ication_authorized_login)");
        C78840Uwu.LJJIL(c235119Kp, string, this);
        c252709vu.setNavActions(c235119Kp);
        refresh();
        String enterFrom = (String) this.LJLIL.getValue();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C188727au LJFF = C85144XbI.LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("authorized_logins_notify", LJFF.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onCreate", false);
    }

    public final void LLFII(Integer num, String str) {
        C26045AKb c26045AKb = new C26045AKb(this);
        if (num == null) {
            c26045AKb.LJIIIZ(getString(R.string.g5w));
        } else if (num.intValue() < 0 || TextUtils.isEmpty(str)) {
            c26045AKb.LJIIIZ(getString(R.string.img));
        } else {
            o.LJI(str);
            c26045AKb.LJIIIZ(str);
        }
        c26045AKb.LJIIJ();
    }
}

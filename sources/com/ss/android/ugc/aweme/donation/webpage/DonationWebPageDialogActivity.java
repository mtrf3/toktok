package com.ss.android.ugc.aweme.donation.webpage;

import X.ActivityC86117Xqz;
import X.C234779Jh;
import X.C59314NPq;
import X.C65803Ps7;
import X.FFL;
import X.GCO;
import X.NPN;
import X.NZA;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DonationWebPageDialogActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJJL = 0;
    public C59314NPq LJLIL;
    public NZA LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public long LJLJI = -1;

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        NZA nza = this.LJLILLLLZI;
        if (nza != null) {
            if (nza.LJIIJJI().goBack()) {
                return;
            }
            super.onBackPressed();
            return;
        }
        o.LJIJI("donationWebPageContainer");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        if (C234779Jh.LIZ()) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJI;
            FFL.LJIIIZ().getClass();
            if (elapsedRealtime > FFL.LJIIJ(31744, 0, "donation_flow_timer_threshold", true) * 1000) {
                setResult(-1);
            }
        }
        super.finish();
        overridePendingTransition(0, R.anim.ag);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onCreate", true);
        activityConfiguration(GCO.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.ang);
        overridePendingTransition(R.anim.ae, 0);
        this.LJLIL = NPN.LIZIZ(getIntent());
        C59314NPq c59314NPq = this.LJLIL;
        if (c59314NPq != null) {
            NZA nza = new NZA(this, c59314NPq);
            this.LJLILLLLZI = nza;
            nza.LJ();
            NZA nza2 = this.LJLILLLLZI;
            if (nza2 != null) {
                nza2.LJLLI = new AqS157S0100000_7(this, 581);
                this.LJLJI = SystemClock.elapsedRealtime();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onCreate", false);
                return;
            }
            o.LJIJI("donationWebPageContainer");
            throw null;
        }
        o.LJIJI("crossPlatformParams");
        throw null;
    }
}

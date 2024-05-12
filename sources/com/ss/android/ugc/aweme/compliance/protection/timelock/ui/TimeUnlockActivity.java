package com.ss.android.ugc.aweme.compliance.protection.timelock.ui;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C1FO;
import X.C65803Ps7;
import X.C78488UrE;
import X.GHI;
import Y.AObjectS12S0001000_7;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.TimeUnlockFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class TimeUnlockActivity extends GHI {
    public static final /* synthetic */ int LJLILLLLZI = 0;

    @Override // X.GHI
    public final int LLFII() {
        return R.layout.afy;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.GHI
    public final void init() {
        View findViewById = findViewById(R.id.dm7);
        findViewById.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, findViewById.getContext()));
        TimeUnlockFragment timeUnlockFragment = new TimeUnlockFragment();
        this.LJLIL = timeUnlockFragment;
        timeUnlockFragment.setArguments(C16880lQ.LLJJIJI(getIntent()));
        C78488UrE LJII = C1FO.LJII();
        if (LJII != null) {
            LJII.LIZIZ(this.LJLIL);
        }
        TimeUnlockFragment timeUnlockFragment2 = this.LJLIL;
        if (getSupportFragmentManager().LJJJJLI() == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            LIZ.LJIIIIZZ(R.id.dm7, 1, timeUnlockFragment2, null);
            LIZ.LJI();
            return;
        }
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        C1B3 LIZ2 = C1B6.LIZ(supportFragmentManager2, supportFragmentManager2);
        LIZ2.LJIIJJI(R.anim.fv, R.anim.g0, R.anim.ft, R.anim.g2);
        LIZ2.LJIIJ(timeUnlockFragment2, null, R.id.dm7);
        LIZ2.LJ(null);
        LIZ2.LJI();
    }

    @Override // X.GHI, X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (C1FO.LJII() != null) {
            super.onBackPressed();
        }
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

    @Override // X.GHI, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onCreate", true);
        activityConfiguration(new AObjectS12S0001000_7(1, 1));
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onCreate", false);
    }
}

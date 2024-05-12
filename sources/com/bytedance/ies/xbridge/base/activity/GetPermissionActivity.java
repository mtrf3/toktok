package com.bytedance.ies.xbridge.base.activity;

import X.C1AR;
import X.C29S;
import X.C61099NyR;
import X.C65803Ps7;
import X.OHQ;
import Y.IDeS403S0100000_7;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class GetPermissionActivity extends C29S {
    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        String[] stringArrayExtra = getIntent().getStringArrayExtra(OHQ.LIZIZ);
        if (stringArrayExtra != null) {
            C1AR.LJFF(this, stringArrayExtra, 36);
        }
        String[] stringArrayExtra2 = getIntent().getStringArrayExtra(OHQ.LIZIZ);
        if (stringArrayExtra2 != null) {
            C61099NyR.LIZIZ.LIZIZ(this, TokenCert.Companion.with("bpea-x_bridge_base_get_permission_activity_calendar_permission")).LIZ((String[]) Arrays.copyOf(stringArrayExtra2, stringArrayExtra2.length)).LIZJ(new IDeS403S0100000_7(this, 0));
        }
    }
}

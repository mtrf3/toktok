package com.ss.android;

import X.C16880lQ;
import X.C65803Ps7;
import X.C66960QPs;
import X.DialogInterfaceOnClickListenerC40674Fxm;
import X.X1D;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;

/* loaded from: classes7.dex */
public class ShowDialogActivity extends Activity {
    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onResume", true);
        super.onResume();
        Intent intent = getIntent();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "event");
        LLJJIJIIJIL.getClass();
        if (LLJJIJIIJIL.equals("event_dialog")) {
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "title");
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "message");
            AlertDialog.Builder title = new AlertDialog.Builder(this).setTitle(LLJJIJIIJIL2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LLJJIJIIJIL3);
            LIZ.append("\nPlease confirm that account adk is initialized correctly.");
            title.setMessage(X1D.LIZIZ(LIZ)).setPositiveButton("ok", new DialogInterfaceOnClickListenerC40674Fxm(this)).setCancelable(false).show();
        }
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onResume", false);
    }

    @Override // android.app.Activity
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

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.f_);
        C66960QPs.LIZ().getClass();
        finish();
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onCreate", false);
    }
}

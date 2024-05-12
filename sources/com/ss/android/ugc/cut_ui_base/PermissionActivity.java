package com.ss.android.ugc.cut_ui_base;

import X.C29S;
import X.C65803Ps7;
import X.OHQ;
import Y.ARunnableS11S0101000_7;
import Y.IDRunnableS6S0101000;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class PermissionActivity extends C29S {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final int LJLIL = 1000;

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
    }

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

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_base.PermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, strArr, grantResults);
        if (this.LJLIL == i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 : grantResults) {
                if (i2 != 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (arrayList.isEmpty()) {
                runOnUiThread(new IDRunnableS6S0101000(8, this, 25));
            } else {
                runOnUiThread(new ARunnableS11S0101000_7(7, this, 10));
            }
        }
    }
}

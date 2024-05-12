package com.ss.android.account.share.data.write.activity;

import X.C16880lQ;
import X.C65803Ps7;
import X.C66862QLy;
import X.C66863QLz;
import X.F9J;
import X.QM5;
import X.QM7;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ShareDataActivity extends Activity {
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
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public ShareDataActivity() {
        new LinkedHashMap();
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
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = new Intent();
        try {
            if (!QM5.LIZ(getCallingPackage())) {
                intent.putExtra("EXTRA_IS_SUCCESS", 0);
                setResult(-1, intent);
            } else {
                intent.putExtra("EXTRA_IS_SUCCESS", 1);
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "EXTRA_KEY");
                if (LLJJIJIIJIL == null) {
                    LLJJIJIIJIL = "";
                }
                C66862QLy LIZ = C66863QLz.LIZ(this);
                SharedPreferences LIZIZ = F9J.LIZIZ(LIZ.LIZ, 0, LIZ.LIZIZ);
                o.LJIIIIZZ(LIZIZ, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                intent.putExtra("EXTRA_VALUE", LIZIZ.getString(LLJJIJIIJIL, ""));
                setResult(-1, intent);
            }
            finish();
            ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onCreate", false);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            QM7 qm7 = new QM7();
            qm7.LIZJ("share_sdk_activity_read_local_data_failed");
            qm7.LIZIZ(e.getMessage(), "err_msg");
            qm7.LIZIZ(Log.getStackTraceString(e), "err_msg_stack");
            qm7.LIZLLL();
            intent.putExtra("EXTRA_IS_SUCCESS", 0);
            intent.removeExtra("EXTRA_VALUE");
            setResult(-1, intent);
            finish();
            ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onCreate", false);
        }
    }
}

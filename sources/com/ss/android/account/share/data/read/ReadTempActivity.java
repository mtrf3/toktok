package com.ss.android.account.share.data.read;

import X.C16880lQ;
import X.C65803Ps7;
import X.C78598Ut0;
import X.QM6;
import X.QM7;
import X.QM8;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ReadTempActivity extends Activity {
    public final int LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;

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
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public ReadTempActivity() {
        new LinkedHashMap();
        this.LJLIL = 17;
        this.LJLILLLLZI = "";
        this.LJLJI = "";
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
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

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onCreate", true);
        super.onCreate(bundle);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "READ_PKG");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        this.LJLILLLLZI = LLJJIJIIJIL;
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "EXTRA_KEY");
        if (LLJJIJIIJIL2 != null) {
            str = LLJJIJIIJIL2;
        }
        this.LJLJI = str;
        if (TextUtils.isEmpty(this.LJLILLLLZI)) {
            finish();
        }
        try {
            if (!QM6.LIZIZ(this.LJLILLLLZI)) {
                QM6.LJ(new QM8(this.LJLILLLLZI, "not support", false, 8));
                finish();
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.LJLILLLLZI, "com.ss.android.account.share.data.write.activity.ShareDataActivity"));
            intent.putExtra("EXTRA_KEY", this.LJLJI);
            int i = this.LJLIL;
            C78598Ut0.LJIJJ(intent, this);
            startActivityForResult(intent, i);
        } catch (Exception e) {
            QM6.LJ(new QM8(3, this.LJLILLLLZI, String.valueOf(e.getMessage()), false));
            QM7 qm7 = new QM7();
            qm7.LIZJ("share_sdk_read_start_share_activity_failed");
            qm7.LIZIZ(e.getMessage(), "err_msg");
            qm7.LIZIZ(Log.getStackTraceString(e), "err_msg_stack");
            qm7.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onCreate", false);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == this.LJLIL && intent != null) {
            if (i2 == -1) {
                if (1 == intent.getIntExtra("EXTRA_IS_SUCCESS", -1)) {
                    z = true;
                } else {
                    z = false;
                }
                String str = "";
                if (z) {
                    String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "EXTRA_VALUE");
                    if (LLJJIJIIJIL != null) {
                        str = LLJJIJIIJIL;
                    }
                    QM8 qm8 = new QM8(this.LJLILLLLZI, (String) null, true, 12);
                    String str2 = this.LJLJI;
                    o.LJIIIZ(str2, "<set-?>");
                    qm8.LJ = str2;
                    qm8.LIZLLL = 3;
                    qm8.LJFF = str;
                    QM6.LJ(qm8);
                } else {
                    String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "ERROR_MSG");
                    if (LLJJIJIIJIL2 != null) {
                        str = LLJJIJIIJIL2;
                    }
                    QM6.LJ(new QM8(3, this.LJLILLLLZI, str, false));
                }
            } else {
                QM6.LJ(new QM8(3, this.LJLILLLLZI, "resultCode not ok", false));
            }
        }
        finish();
    }
}

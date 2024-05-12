package com.ss.android.ugc.aweme.app;

import X.ActivityC86117Xqz;
import X.C65803Ps7;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

/* loaded from: classes10.dex */
public class PushLoginActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final Handler LJLIL = new Handler(Looper.myLooper());

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        this.LJLIL.removeCallbacksAndMessages(null);
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r10 = r18
            r2 = r19
            X.C65803Ps7.LIZ(r10, r2)
            java.lang.String r5 = "com.ss.android.ugc.aweme.app.PushLoginActivity"
            java.lang.String r4 = "onCreate"
            r7 = 1
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r5, r4, r7)
            Y.AObjectS13S0001000_9 r1 = new Y.AObjectS13S0001000_9
            r3 = 0
            r0 = 0
            r1.<init>(r3, r0)
            r10.activityConfiguration(r1)
            super.onCreate(r2)
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "next_step"
            android.os.Parcelable r15 = r1.getParcelableExtra(r0)
            android.content.Intent r15 = (android.content.Intent) r15
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "next_steps"
            java.util.ArrayList r16 = r1.getParcelableArrayListExtra(r0)
            android.content.Intent r1 = r10.getIntent()
            r12 = 0
            if (r1 == 0) goto Lc5
            java.lang.String r0 = "multi_account"
            android.os.Bundle r11 = X.C16880lQ.LJJLIIIIJ(r1, r0)
            if (r11 == 0) goto Lc6
            java.lang.String r0 = "push_intent"
            android.os.Parcelable r13 = r11.getParcelable(r0)
            android.content.Intent r13 = (android.content.Intent) r13
        L49:
            if (r1 == 0) goto L51
            java.lang.String r0 = "multi_account_push_uid"
            java.lang.String r12 = X.C16880lQ.LLJJIJIIJIL(r1, r0)
        L51:
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "EXTRA_AV_RECORD_CONFIG"
            java.io.Serializable r2 = r1.getSerializableExtra(r0)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig r2 = (com.ss.android.ugc.aweme.services.external.ui.RecordConfig) r2
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "IS_LANDING_SUB_ONLY_LIVE"
            boolean r1 = r1.getBooleanExtra(r0, r3)
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            java.lang.String r0 = "com.ss.android.ugc.aweme.main.MainActivity"
            r14.setClassName(r10, r0)
            X.LwK r9 = new X.LwK
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L91
            java.lang.String r0 = "force_use_default_login_method"
            r8.putBoolean(r0, r7)
            java.lang.String r0 = "need_auto_fill_latest_login_info"
            r8.putBoolean(r0, r3)
        L91:
            java.lang.String r6 = "push"
            if (r1 == 0) goto Lc3
            java.lang.String r0 = "sub_auto_email"
        L97:
            X.Ptb r2 = X.HG3.LJIIIIZZ()
            X.Uqc r1 = new X.Uqc
            r1.<init>()
            r1.LIZ = r10
            r1.LIZIZ = r0
            r1.LIZJ = r6
            r1.LJI = r7
            r1.LIZLLL = r8
            X.JJ6 r0 = new X.JJ6
            r0.<init>()
            r1.LJFF = r0
            X.JJ1 r0 = new X.JJ1
            r0.<init>(r9)
            r1.LJ = r0
            X.Uqd r0 = r1.LIZ()
            r2.showLoginAndRegisterView(r0)
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r5, r4, r3)
            return
        Lc3:
            r0 = r6
            goto L97
        Lc5:
            r11 = r12
        Lc6:
            r13 = r12
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.PushLoginActivity.onCreate(android.os.Bundle):void");
    }
}

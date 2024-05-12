package com.ss.android.ugc.aweme.deeplink;

import X.C16880lQ;
import X.C65803Ps7;
import X.C78450Uqc;
import X.C78451Uqd;
import X.G25;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.AccountService;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class RequireLoginActivity extends Activity {
    public static final /* synthetic */ int LJLJJL = 0;
    public String LJLIL;
    public Intent LJLILLLLZI;
    public boolean LJLJI;
    public final G25 LJLJJI;

    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public RequireLoginActivity() {
        new LinkedHashMap();
        this.LJLJJI = new G25(this);
    }

    @Override // android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
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

    public final void LIZ(Intent intent) {
        Intent intent2;
        String str = null;
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
        }
        this.LJLIL = str;
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("is_new_procedure", false);
        }
        this.LJLJI = z;
        if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("deep_link_intent")) != null) {
            this.LJLILLLLZI = intent2;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        LIZ(getIntent());
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_fullscreen_dialog", true);
        bundle2.putBoolean("is_skippable_dialog", false);
        bundle2.putBoolean("need_callback", true);
        C78450Uqc c78450Uqc = new C78450Uqc();
        c78450Uqc.LIZIZ = "deeplink";
        c78450Uqc.LIZ = this;
        c78450Uqc.LJ = this.LJLJJI;
        c78450Uqc.LIZLLL = bundle2;
        AccountService.LJIJ().LJI().showLoginAndRegisterView(new C78451Uqd(c78450Uqc));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onCreate", false);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LIZ(intent);
    }
}

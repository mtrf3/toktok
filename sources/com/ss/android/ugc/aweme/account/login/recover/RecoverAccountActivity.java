package com.ss.android.ugc.aweme.account.login.recover;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C252749vy;
import X.C252759vz;
import X.C278817o;
import X.C65803Ps7;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class RecoverAccountActivity extends ActivityC86117Xqz {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onCreate", true);
        activityConfiguration(C252749vy.LJLIL);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        String str = C252759vz.LIZ().recoverAccountUrl;
        if (str == null || str.length() == 0) {
            str = "sslocal://webview?url=https%3A%2F%2Fwww.tiktok.com%2Fucenter_web%2Faccount_recover%3Fappend_common_params%3D1%26hide_nav_bar%3D1%26container_color_auto_dark%3D1";
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        StringBuilder LIZJ = C278817o.LIZJ(str);
        LIZJ.append(URLDecoder.decode("&enter_from=".concat(LLJJIJIIJIL), "UTF-8"));
        SmartRoute buildRoute = SmartRouter.buildRoute(this, LIZJ.toString());
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        buildRoute.withParam(LLJJIJI);
        buildRoute.withAnimation(R.anim.fv, R.anim.a2);
        buildRoute.open();
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onCreate", false);
    }
}

package com.ss.android.ugc.trill.main.shortcut;

import X.ActivityC86117Xqz;
import X.C65803Ps7;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS60S0100000_7;

/* loaded from: classes4.dex */
public class ShortcutShootingActivity extends ActivityC86117Xqz {
    public void com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // X.KMV, X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onStart", true);
        super.onStart();
        AVExternalServiceImpl.LIZ().asyncServiceWithActivity(this, "shortcut", new IDLCallbackS60S0100000_7(this, 2));
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onStart", false);
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ShortcutShootingActivity shortcutShootingActivity) {
        shortcutShootingActivity.com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                shortcutShootingActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ShortcutShootingActivity shortcutShootingActivity) {
        com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(shortcutShootingActivity);
        try {
            shortcutShootingActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }
}

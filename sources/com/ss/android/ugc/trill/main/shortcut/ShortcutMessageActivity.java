package com.ss.android.ugc.trill.main.shortcut;

import X.ActivityC86117Xqz;
import X.C65803Ps7;
import X.HG3;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* loaded from: classes2.dex */
public class ShortcutMessageActivity extends ActivityC86117Xqz {
    public boolean isFirstOpenFlag = true;

    public void com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // X.KMV, X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
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
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void jumpProxy() {
        if (!this.isFirstOpenFlag) {
            return;
        }
        this.isFirstOpenFlag = false;
        if (HG3.LJIILL().isLogin()) {
            IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LJIILLIIL(this, null, false, null);
        }
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ShortcutMessageActivity shortcutMessageActivity) {
        shortcutMessageActivity.com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                shortcutMessageActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ShortcutMessageActivity shortcutMessageActivity) {
        com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(shortcutMessageActivity);
        try {
            shortcutMessageActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", true);
        super.onCreate(bundle);
        jumpProxy();
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", false);
    }
}

package com.kakao.sdk.auth;

import X.C65803Ps7;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

/* loaded from: classes8.dex */
public final class AuthCodeHandlerActivity extends CustomTabLauncherActivity {
    public void com_kakao_sdk_auth_AuthCodeHandlerActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // com.kakao.sdk.auth.CustomTabLauncherActivity, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
    }

    @Override // com.kakao.sdk.auth.CustomTabLauncherActivity, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // com.kakao.sdk.auth.CustomTabLauncherActivity, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        com_kakao_sdk_auth_AuthCodeHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    public static void com_kakao_sdk_auth_AuthCodeHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(AuthCodeHandlerActivity authCodeHandlerActivity) {
        authCodeHandlerActivity.com_kakao_sdk_auth_AuthCodeHandlerActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                authCodeHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_kakao_sdk_auth_AuthCodeHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(AuthCodeHandlerActivity authCodeHandlerActivity) {
        com_kakao_sdk_auth_AuthCodeHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(authCodeHandlerActivity);
        try {
            authCodeHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }
}

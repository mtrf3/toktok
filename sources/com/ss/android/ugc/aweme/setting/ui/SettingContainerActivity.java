package com.ss.android.ugc.aweme.setting.ui;

import X.ActivityC86117Xqz;
import X.C00F;
import X.C25814ABe;
import X.C25854ACs;
import X.C54154LNe;
import X.C55230Lly;
import X.C55247LmF;
import X.C57082Lw;
import X.C65803Ps7;
import Y.AObserverS72S0100000_4;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.fragment.FragmentNavigationContainer;
import com.bytedance.router.fragment.FragmentRoute;
import com.bytedance.router.fragment.NavigationUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SettingContainerActivity extends ActivityC86117Xqz implements FragmentNavigationContainer {
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

    @Override // com.bytedance.router.fragment.FragmentNavigationContainer
    public final boolean addFragmentToBackStack() {
        return true;
    }

    @Override // com.bytedance.router.fragment.FragmentNavigationContainer
    public final int getFragmentContainer() {
        return R.id.j7b;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        C54154LNe.LJ("setting_2_profile", C54154LNe.LIZIZ(this));
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "onCreate", true);
        activityConfiguration(C25854ACs.LJLIL);
        super.onCreate(bundle);
        setTheme(R.style.kp);
        setContentView(R.layout.ck4);
        FragmentRoute fragmentNavigation = SmartRouter.fragmentNavigation(this);
        o.LJIIIIZZ(fragmentNavigation, "fragmentNavigation(this)");
        FragmentRoute.push$default(fragmentNavigation, "//setting_fragment", null, null, 6, null);
        fragmentNavigation.withNavArg((Parcelable) RouteArgExtension.INSTANCE.navArg(this).getValue());
        fragmentNavigation.withParam(getIntent());
        FragmentRoute.commit$default(fragmentNavigation, null, 1, null);
        if (C00F.LIZ(31744, 0, "show_email_consent_page_scene", true) == 4 || C00F.LIZ(31744, 0, "show_email_consent_page_scene", true) == 2) {
            C57082Lw.LIZ.LIZIZ("email_consent_status").observe(this, new AObserverS72S0100000_4(this, 4));
        }
        C55247LmF.LIZIZ(C55230Lly.LIZLLL(this, null), new C25814ABe(true), C25814ABe.class, "source_default_key");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment findTopFragment = NavigationUtils.INSTANCE.findTopFragment(this);
        if (findTopFragment != null) {
            findTopFragment.onActivityResult(i, i2, intent);
        }
    }
}

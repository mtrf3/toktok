package com.ss.android.ugc.aweme.setting.ui;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C235119Kp;
import X.C252709vu;
import X.C40322Fs6;
import X.C61712OJw;
import X.C61713OJx;
import X.C65803Ps7;
import X.C78840Uwu;
import X.C79045V0n;
import X.GEP;
import X.Z8A;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PushSettingNotificationChoiceActivity extends ActivityC86117Xqz {
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onResume", true);
        super.onResume();
        if (!C40322Fs6.LIZJ(this)) {
            finish();
            overridePendingTransition(0, 0);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onResume", false);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onCreate", true);
        activityConfiguration(GEP.LJLIL);
        super.onCreate(bundle);
        setTheme(R.style.kp);
        setContentView(R.layout.ck9);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        Fragment LJJJIL = supportFragmentManager.LJJJIL("FRAGMENT_PUSH_MANAGER_LIST");
        if (LJJJIL == null) {
            LJJJIL = Z8A.LIZIZ.providePushSettingNotificationChoiceFragment();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("enter_from", C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from"));
        LJJJIL.setArguments(bundle2);
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ(LJJJIL, "FRAGMENT_PUSH_MANAGER_LIST", R.id.dm7);
        c1b3.LJI();
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.n6b);
        o.LJIIIIZZ(string, "getString(R.string.pm_mt_livepush_settings)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS151S0100000_1(this, 714));
        c252709vu.setNavActions(c235119Kp);
        Integer LJI = C79045V0n.LJI(R.attr.c9, this);
        if (LJI != null) {
            int intValue = LJI.intValue();
            ((C252709vu) _$_findCachedViewById(R.id.la4)).setNavBackground(intValue);
            ((C252709vu) _$_findCachedViewById(R.id.la4)).LJIILJJIL(false);
            C61713OJx LIZJ = C61712OJw.LIZJ(this);
            LIZJ.LJIIIIZZ(intValue);
            LIZJ.LJFF(intValue);
            LIZJ.LIZ(true);
            LIZJ.LIZJ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onCreate", false);
    }
}

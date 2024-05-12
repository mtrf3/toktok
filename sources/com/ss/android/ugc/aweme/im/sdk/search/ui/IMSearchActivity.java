package com.ss.android.ugc.aweme.im.sdk.search.ui;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C41220GFs;
import X.C65803Ps7;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class IMSearchActivity extends ActivityC86117Xqz {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.search.ui.IMSearchActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.search.ui.IMSearchActivity", "onResume", true);
        super.onResume();
        overridePendingTransition(0, R.anim.g2);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.search.ui.IMSearchActivity", "onResume", false);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.search.ui.IMSearchActivity", "onCreate", true);
        activityConfiguration(C41220GFs.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.b0g);
        if (getSupportFragmentManager().LJJJIL("im_search_fragment") != null) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.search.ui.IMSearchActivity", "onCreate", false);
            return;
        }
        Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(getIntent(), "search_bar_entrance");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        IMSearchFragment iMSearchFragment = new IMSearchFragment();
        iMSearchFragment.setArguments(LJJLIIIIJ);
        LIZ.LJIIIIZZ(R.id.dm7, 1, iMSearchFragment, "im_search_fragment");
        LIZ.LJIILJJIL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.search.ui.IMSearchActivity", "onCreate", false);
    }
}

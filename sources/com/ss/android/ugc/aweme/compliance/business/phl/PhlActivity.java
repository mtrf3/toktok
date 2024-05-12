package com.ss.android.ugc.aweme.compliance.business.phl;

import X.ActivityC86117Xqz;
import X.C182717Fb;
import X.C1B3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65803Ps7;
import X.GFO;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.compliance.api.phl.vm.PhlViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;

/* loaded from: classes4.dex */
public final class PhlActivity extends ActivityC86117Xqz {
    public Fragment LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 167));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.phl.PhlActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        PhlFragment phlFragment;
        Fragment fragment = this.LJLIL;
        if ((fragment instanceof PhlFragment) && (phlFragment = (PhlFragment) fragment) != null) {
            phlFragment.xl("close");
        }
        super.onBackPressed();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.phl.PhlActivity", "onCreate", true);
        activityConfiguration(GFO.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.afu);
        Fragment LJJJIL = getSupportFragmentManager().LJJJIL("phl_fragment");
        this.LJLIL = LJJJIL;
        if (LJJJIL == null) {
            PhlFragment LIZ = C182717Fb.LIZ("privacy_highlight_popup");
            this.LJLIL = LIZ;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIJ(LIZ, "phl_fragment", R.id.dm7);
            c1b3.LJIIL(LIZ);
            c1b3.LJI();
        }
        ((PhlViewModel) this.LJLILLLLZI.getValue()).gv0();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.phl.PhlActivity", "onCreate", false);
    }
}

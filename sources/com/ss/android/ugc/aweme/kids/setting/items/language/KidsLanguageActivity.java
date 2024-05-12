package com.ss.android.ugc.aweme.kids.setting.items.language;

import X.ActivityC86117Xqz;
import X.C1B3;
import X.C65803Ps7;
import X.C79045V0n;
import X.GD8;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.kids.setting.items.language.viewmodel.AppLanguageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KidsLanguageActivity extends ActivityC86117Xqz {
    public KidAppLanguageListFragment LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onWindowFocusChanged", true);
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

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onCreate", true);
        activityConfiguration(GD8.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.bf9);
        Integer LJI = C79045V0n.LJI(R.attr.cl, this);
        if (LJI != null) {
            int intValue = LJI.intValue();
            View _$_findCachedViewById = _$_findCachedViewById(R.id.j84);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setBackgroundColor(intValue);
            }
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        KidAppLanguageListFragment kidAppLanguageListFragment = (KidAppLanguageListFragment) supportFragmentManager.LJJJIL("language_app_fragment");
        this.LJLIL = kidAppLanguageListFragment;
        if (kidAppLanguageListFragment == null) {
            this.LJLIL = new KidAppLanguageListFragment();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            KidAppLanguageListFragment kidAppLanguageListFragment2 = this.LJLIL;
            o.LJI(kidAppLanguageListFragment2);
            c1b3.LJIIJ(kidAppLanguageListFragment2, "language_app_fragment", R.id.dm7);
            c1b3.LJ(null);
            c1b3.LJI();
        }
        ViewModelProviders.of(this).get(AppLanguageViewModel.class);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onCreate", false);
    }
}

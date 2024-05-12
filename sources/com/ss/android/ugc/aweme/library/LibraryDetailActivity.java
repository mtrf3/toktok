package com.ss.android.ugc.aweme.library;

import X.ActivityC86117Xqz;
import X.C1B3;
import X.C221108m2;
import X.C41195GEt;
import X.C5H3;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C78939UyV;
import X.C78996UzQ;
import X.InterfaceC27853AwT;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.model.library.LibraryDetailParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LibraryDetailActivity extends ActivityC86117Xqz implements InterfaceC27853AwT {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 135));

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

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "library_detail_page";
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.library.LibraryDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C78939UyV.LJJJJ(this);
        C78996UzQ.LJJJ(this);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.library.LibraryDetailActivity", "onCreate", true);
        activityConfiguration(C41195GEt.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.bol);
        findViewById(R.id.bs8).setFitsSystemWindows(false);
        if (TextUtils.isEmpty(((LibraryDetailParam) this.LJLILLLLZI.getValue()).getId())) {
            finish();
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            LibraryDetailParam param = (LibraryDetailParam) this.LJLILLLLZI.getValue();
            o.LJIIIZ(param, "param");
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            Fragment LJJJIL = supportFragmentManager.LJJJIL("library_detail_fragment_tag");
            if (LJJJIL == null) {
                LJJJIL = new LibraryDetailFragment();
                RouteArgExtension.INSTANCE.withNavArg(LJJJIL, param);
            }
            LJJJIL.setUserVisibleHint(true);
            c1b3.LJIIJ(LJJJIL, "library_detail_fragment_tag", R.id.bs8);
            c1b3.LJIILJJIL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.library.LibraryDetailActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}

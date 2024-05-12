package com.ss.android.ugc.trill.setting;

import X.ActivityC86117Xqz;
import X.C1B3;
import X.C1B6;
import X.C41112GBo;
import X.C65803Ps7;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class VideoLanguageActivity extends ActivityC86117Xqz {
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
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.VideoLanguageActivity", "onWindowFocusChanged", true);
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
        VideoLanguageFragment videoLanguageFragment;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.VideoLanguageActivity", "onCreate", true);
        activityConfiguration(C41112GBo.LJLIL);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setTheme(R.style.kp);
        setContentView(R.layout.f7);
        Fragment LJJJIL = getSupportFragmentManager().LJJJIL("video_language_fragment");
        if (!(LJJJIL instanceof VideoLanguageFragment) || (videoLanguageFragment = (VideoLanguageFragment) LJJJIL) == null) {
            videoLanguageFragment = new VideoLanguageFragment();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            LIZ.LJIIIIZZ(R.id.dm7, 1, videoLanguageFragment, "video_language_fragment");
            LIZ.LJI();
        }
        videoLanguageFragment.LJLILLLLZI = this;
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.VideoLanguageActivity", "onCreate", false);
    }
}

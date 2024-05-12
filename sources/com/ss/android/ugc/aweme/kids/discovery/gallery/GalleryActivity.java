package com.ss.android.ugc.aweme.kids.discovery.gallery;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C235119Kp;
import X.C252709vu;
import X.C65803Ps7;
import X.C78840Uwu;
import X.C85039XZb;
import X.G4U;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class GalleryActivity extends ActivityC86117Xqz {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onWindowFocusChanged", true);
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
        String string;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onCreate", true);
        activityConfiguration(G4U.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.bfa);
        Fragment LJJJIL = getSupportFragmentManager().LJJJIL("gallery_grid_fragment");
        if (!(LJJJIL instanceof GalleryGridFragment)) {
            LJJJIL = null;
        }
        String str = "";
        if (LJJJIL == null) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI == null) {
                LLJJIJI = new Bundle();
            }
            GalleryGridFragment galleryGridFragment = new GalleryGridFragment();
            String string2 = LLJJIJI.getString("challenge_id");
            if (string2 == null) {
                string2 = "";
            }
            if (string2.length() != 0) {
                galleryGridFragment.LJLJI = new C85039XZb(string2);
                galleryGridFragment.setArguments(LLJJIJI);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJIIJ(galleryGridFragment, "gallery_grid_fragment", R.id.dm7);
                c1b3.LJIIL(galleryGridFragment);
                c1b3.LJIILJJIL();
            }
        }
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.fdg);
        C235119Kp c235119Kp = new C235119Kp();
        Bundle LLJJIJI2 = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI2 != null && (string = LLJJIJI2.getString("title")) != null) {
            str = string;
        }
        C78840Uwu.LJJIL(c235119Kp, str, this);
        c252709vu.setNavActions(c235119Kp);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onCreate", false);
    }
}

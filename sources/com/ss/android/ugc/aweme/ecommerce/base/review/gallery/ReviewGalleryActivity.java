package com.ss.android.ugc.aweme.ecommerce.base.review.gallery;

import X.AbstractActivityC27434Api;
import X.C16880lQ;
import X.C19N;
import X.C1B3;
import X.C1B6;
import X.C201037ul;
import X.C61712OJw;
import X.C61713OJx;
import X.C65803Ps7;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ReviewGalleryActivity extends AbstractActivityC27434Api {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // X.AbstractActivityC27434Api, X.InterfaceC37828Esy
    public final String getPageName() {
        return "review_photo";
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C201037ul.LIZ(2, this, false);
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

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.a6j);
        C201037ul.LIZ(2, this, true);
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LIZIZ.LJIIJ(true);
        LIZJ.LIZIZ.LJIIL();
        LIZJ.LIZJ();
        if (C19N.LJ("ec_review_gallery_viewer", true)) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            GalleryViewerFragment galleryViewerFragment = new GalleryViewerFragment();
            galleryViewerFragment.setArguments(C16880lQ.LLJJIJI(getIntent()));
            LIZ.LJIIJ(galleryViewerFragment, null, R.id.j71);
            LIZ.LJI();
        } else {
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            C1B3 LIZ2 = C1B6.LIZ(supportFragmentManager2, supportFragmentManager2);
            ReviewGalleryFragment reviewGalleryFragment = new ReviewGalleryFragment();
            reviewGalleryFragment.setArguments(C16880lQ.LLJJIJI(getIntent()));
            LIZ2.LJIIJ(reviewGalleryFragment, null, R.id.j71);
            LIZ2.LJI();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryActivity", "onCreate", false);
    }
}

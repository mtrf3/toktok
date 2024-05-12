package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AbstractActivityC162676Zz;
import X.C152175y9;
import X.C1549666i;
import X.C161956Xf;
import X.C16360ka;
import X.C221108m2;
import X.C41531GRr;
import X.C44272HZc;
import X.C58U;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C6XR;
import X.C74275TDb;
import X.FragmentC39261gQ;
import X.HEP;
import X.InterfaceC80245VeT;
import Y.ALAdapterS1S0100000_2;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.Fragment;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.ChangeClipBounds;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewActivity;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImagePublishPreviewActivity extends AbstractActivityC162676Zz {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public C6XR LJLJLLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 282));

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJI() {
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final ImageView LLILIL() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-coverImageView>(...)");
        return (ImageView) value;
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        LLILIL().setAlpha(0.0f);
        LLILIL().setVisibility(0);
        super.finishAfterTransition();
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        C6XR c6xr = this.LJLJLLL;
        if (c6xr != null) {
            c6xr.LLJILJILJ();
        } else {
            o.LJIJI("imagesPublishPreviewRootScene");
            throw null;
        }
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

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
        int i;
        C6XR c6xr = this.LJLJLLL;
        if (c6xr != null) {
            if (z) {
                i = C1549666i.LIZIZ();
            } else {
                i = 0;
            }
            C41531GRr c41531GRr = c6xr.LJLILLLLZI;
            if (c41531GRr != null) {
                c41531GRr.setBottomMargin(i);
                C152175y9 c152175y9 = c6xr.LJLJL;
                if (c152175y9 != null) {
                    c6xr.LLJJ(i, c152175y9);
                    TuxIconView tuxIconView = c6xr.LJLLILLLL;
                    if (tuxIconView != null) {
                        c6xr.LLJJ(i / 2, tuxIconView);
                        View view = c6xr.LJLLI;
                        if (view != null) {
                            c6xr.LLJJ(i, view);
                            return;
                        } else {
                            o.LJIJI("previewShadowBottom");
                            throw null;
                        }
                    }
                    o.LJIJI("pauseButton");
                    throw null;
                }
                o.LJIJI("viewPager");
                throw null;
            }
            o.LJIJI("previewFakeFeedView");
            throw null;
        }
        o.LJIJI("imagesPublishPreviewRootScene");
        throw null;
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
        C6XR c6xr = this.LJLJLLL;
        if (c6xr != null) {
            Activity requireActivity = c6xr.requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            int LIZIZ = (int) C74275TDb.LIZIZ(requireActivity, 13.0f);
            Activity requireActivity2 = c6xr.requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            int LIZIZ2 = (int) C74275TDb.LIZIZ(requireActivity2, 3.0f);
            C41531GRr c41531GRr = c6xr.LJLILLLLZI;
            if (c41531GRr != null) {
                c6xr.LLJJI(LIZIZ, c41531GRr, true);
                ImageView imageView = c6xr.LJLJI;
                if (imageView != null) {
                    c6xr.LLJJI(LIZIZ2, imageView, true);
                    ImageView imageView2 = c6xr.LJLJJI;
                    if (imageView2 != null) {
                        c6xr.LLJJI(LIZIZ2, imageView2, true);
                        View view = c6xr.LJLL;
                        if (view != null) {
                            c6xr.LLJJI(0, view, false);
                            return;
                        } else {
                            o.LJIJI("previewShadowTop");
                            throw null;
                        }
                    }
                    o.LJIJI("clearScreenButton");
                    throw null;
                }
                o.LJIJI("backButton");
                throw null;
            }
            o.LJIJI("previewFakeFeedView");
            throw null;
        }
        o.LJIJI("imagesPublishPreviewRootScene");
        throw null;
    }

    @Override // X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewActivity", "onCreate", true);
        getWindow().requestFeature(12);
        getWindow().setSharedElementsUseOverlay(true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.ef);
        Bitmap bitmap = VideoCoverBitmapHolder.LJLIL;
        if (bitmap != null) {
            LLILIL().setImageBitmap(bitmap);
            LLILIL().setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        Window window = getWindow();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new ChangeTransform());
        transitionSet.addTransition(new ChangeClipBounds());
        transitionSet.addTransition(new Fade(1));
        transitionSet.setDuration(342L);
        transitionSet.setInterpolator((TimeInterpolator) new C58U(4.0f));
        window.setSharedElementEnterTransition(transitionSet);
        Window window2 = getWindow();
        TransitionSet transitionSet2 = new TransitionSet();
        transitionSet2.addTransition(new ChangeBounds());
        transitionSet2.addTransition(new ChangeTransform());
        transitionSet2.addTransition(new ChangeClipBounds());
        transitionSet2.addTransition(new Fade(2));
        transitionSet2.setDuration(342L);
        transitionSet2.setInterpolator((TimeInterpolator) new C58U(4.0f));
        window2.setSharedElementReturnTransition(transitionSet2);
        Fade fade = new Fade(1);
        fade.setDuration(342L);
        fade.setInterpolator(new LinearInterpolator());
        getWindow().setEnterTransition(fade);
        Fade fade2 = new Fade(2);
        fade2.setDuration(342L);
        fade2.setInterpolator(new LinearInterpolator());
        getWindow().setExitTransition(fade2);
        Transition enterTransition = getWindow().getEnterTransition();
        Transition exitTransition = getWindow().getExitTransition();
        if (enterTransition != null) {
            enterTransition.excludeTarget("android:status:background", true);
            enterTransition.excludeTarget("android:navigation:background", true);
        }
        if (exitTransition != null) {
            exitTransition.excludeTarget("android:status:background", true);
            exitTransition.excludeTarget("android:navigation:background", true);
        }
        C16360ka.LJIJJLI(findViewById(R.id.eij), "transition_view_v1");
        getWindow().getSharedElementEnterTransition().addListener(new C161956Xf() { // from class: X.6ba
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ImagePublishPreviewActivity.this.LLILIL(), "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(100L);
                ofFloat.addListener(new ALAdapterS1S0100000_2(ImagePublishPreviewActivity.this, 8));
                ofFloat.start();
            }
        });
        getWindow().getSharedElementReturnTransition().addListener(new C161956Xf() { // from class: X.6bb
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ImagePublishPreviewActivity.this.LLILIL(), "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        });
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("ALS.ActivityLifecycleFragment");
        if (!(findFragmentByTag instanceof FragmentC39261gQ) || findFragmentByTag == null) {
            getFragmentManager().beginTransaction().add(new FragmentC39261gQ(), "ALS.ActivityLifecycleFragment").commit();
            getFragmentManager().executePendingTransactions();
        }
        this.LJLJLLL = new C6XR();
        HEP LIZ = C44272HZc.LIZ(this, C6XR.class);
        LIZ.LJFF = R.id.nbw;
        LIZ.LJII = new InterfaceC80245VeT() { // from class: X.6bc
            @Override // X.InterfaceC80245VeT
            public final WM7 LIZ(ClassLoader classLoader, String str) {
                if (!o.LJ(C6XR.class.getName(), str)) {
                    return null;
                }
                C6XR c6xr = ImagePublishPreviewActivity.this.LJLJLLL;
                if (c6xr != null) {
                    return c6xr;
                }
                o.LJIJI("imagesPublishPreviewRootScene");
                throw null;
            }
        };
        LIZ.LJI = false;
        LIZ.LJIIIZ = false;
        LIZ.LIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewActivity", "onCreate", false);
    }
}

package com.ss.android.ugc.aweme.ftc.pages;

import X.C135315St;
import X.C157236Fb;
import X.C161956Xf;
import X.C162016Xl;
import X.C162656Zx;
import X.C16360ka;
import X.C16880lQ;
import X.C42326GjK;
import X.C60903NvH;
import X.C65803Ps7;
import X.GBO;
import X.H7R;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS22S0100000_2;
import Y.AUListenerS91S0100000_2;
import Y.IDAListenerS71S0100000_2;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCVideoPublishPreviewActivity extends GBO {
    public static final /* synthetic */ int LJLJJLL = 0;
    public VideoPublishEditModel LJLJI;
    public C135315St LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    public final void LLIIIILZ() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6Xm
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                o.LJIIIZ(animation, "animation");
                SurfaceView surfaceView = (SurfaceView) FTCVideoPublishPreviewActivity.this._$_findCachedViewById(R.id.i1m);
                Object animatedValue = animation.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                surfaceView.setAlpha(((Float) animatedValue).floatValue());
            }
        });
        ofFloat.addListener(new IDAListenerS71S0100000_2(this, 4));
        ofFloat.setDuration(100L);
        ofFloat.start();
        _$_findCachedViewById(R.id.ewm).bringToFront();
        _$_findCachedViewById(R.id.ewm).setAlpha(1.0f);
        ((ImageView) _$_findCachedViewById(R.id.ewm)).setVisibility(0);
        finishAfterTransition();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        C16880lQ.LJLLJ(FTCVideoPublishPreviewActivity.class);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        LLIIIILZ();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        LifecycleRegistry lifecycleRegistry;
        C65803Ps7.LIZIZ(this);
        Lifecycle lifecycle = getLifecycle();
        if ((lifecycle instanceof LifecycleRegistry) && (lifecycleRegistry = (LifecycleRegistry) lifecycle) != null) {
            lifecycleRegistry.markState(Lifecycle.State.DESTROYED);
        }
        C135315St c135315St = this.LJLJJI;
        if (c135315St != null) {
            c135315St.LIZIZ();
            super.onDestroy();
            C42326GjK.LIZ.getClass();
            C42326GjK.LIZ(this);
            return;
        }
        o.LJIJI("mPresenter");
        throw null;
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

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        LifecycleRegistry lifecycleRegistry;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.ec);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        Intent intent = getIntent();
        c42326GjK.getClass();
        C42326GjK.LIZJ(this, intent, bundle);
        C60903NvH.LJIIJJI().LJIJ();
        Bitmap bitmap = VideoCoverBitmapHolder.LJLIL;
        if (bitmap != null) {
            ((ImageView) _$_findCachedViewById(R.id.ewm)).setImageBitmap(bitmap);
        }
        C16360ka.LJIJJLI(_$_findCachedViewById(R.id.ewm), "transition_view_v1");
        C16360ka.LJIJJLI(_$_findCachedViewById(R.id.jku), "transition_view_v2");
        ((SurfaceView) _$_findCachedViewById(R.id.i1m)).setVisibility(4);
        _$_findCachedViewById(R.id.i1m).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(this, 100)));
        VideoPublishEditModel LJIIJ = H7R.LJIIJ(getIntent());
        this.LJLJI = LJIIJ;
        C135315St c135315St = new C135315St(LJIIJ.getVideoEditorType());
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        if (videoPublishEditModel != null) {
            c135315St.LJIJ = videoPublishEditModel.nleData;
            this.LJLJJI = c135315St;
            Lifecycle lifecycle = getLifecycle();
            if ((lifecycle instanceof LifecycleRegistry) && (lifecycleRegistry = (LifecycleRegistry) lifecycle) != null) {
                lifecycleRegistry.markState(Lifecycle.State.STARTED);
            }
            C162656Zx previewSurface = (C162656Zx) _$_findCachedViewById(R.id.i1m);
            o.LJIIIIZZ(previewSurface, "previewSurface");
            C135315St c135315St2 = this.LJLJJI;
            if (c135315St2 != null) {
                VideoPublishEditModel videoPublishEditModel2 = this.LJLJI;
                if (videoPublishEditModel2 != null) {
                    C162016Xl.LIZ(this, this, previewSurface, c135315St2, videoPublishEditModel2, "kids_preview");
                    C157236Fb c157236Fb = C157236Fb.LIZ;
                    View _$_findCachedViewById = _$_findCachedViewById(R.id.i1m);
                    VideoPublishEditModel videoPublishEditModel3 = this.LJLJI;
                    if (videoPublishEditModel3 != null) {
                        int intValue = ((Number) C162016Xl.LIZIZ(videoPublishEditModel3).getFirst()).intValue();
                        VideoPublishEditModel videoPublishEditModel4 = this.LJLJI;
                        if (videoPublishEditModel4 != null) {
                            c157236Fb.LJII(intValue, ((Number) C162016Xl.LIZIZ(videoPublishEditModel4).getSecond()).intValue(), _$_findCachedViewById);
                            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.ewm);
                            VideoPublishEditModel videoPublishEditModel5 = this.LJLJI;
                            if (videoPublishEditModel5 != null) {
                                int intValue2 = ((Number) C162016Xl.LIZIZ(videoPublishEditModel5).getFirst()).intValue();
                                VideoPublishEditModel videoPublishEditModel6 = this.LJLJI;
                                if (videoPublishEditModel6 != null) {
                                    c157236Fb.LJII(intValue2, ((Number) C162016Xl.LIZIZ(videoPublishEditModel6).getSecond()).intValue(), _$_findCachedViewById2);
                                    AutoTransition autoTransition = new AutoTransition();
                                    getWindow().setSharedElementEnterTransition(autoTransition);
                                    getWindow().setSharedElementExitTransition(autoTransition);
                                    autoTransition.addListener((Transition.TransitionListener) new C161956Xf() { // from class: X.6Xo
                                        public final ValueAnimator LIZ = ValueAnimator.ofFloat(0.0f, 1.0f);

                                        @Override // X.C161956Xf, android.transition.Transition.TransitionListener
                                        public final void onTransitionEnd(Transition transition) {
                                            o.LJIIIZ(transition, "transition");
                                            FTCVideoPublishPreviewActivity.this._$_findCachedViewById(R.id.i1m).bringToFront();
                                            ((SurfaceView) FTCVideoPublishPreviewActivity.this._$_findCachedViewById(R.id.i1m)).setVisibility(0);
                                            this.LIZ.end();
                                        }

                                        @Override // android.transition.Transition.TransitionListener
                                        public final void onTransitionStart(Transition transition) {
                                            o.LJIIIZ(transition, "transition");
                                            this.LIZ.addUpdateListener(new AUListenerS91S0100000_2(FTCVideoPublishPreviewActivity.this, 32));
                                            this.LIZ.addListener(new IDAListenerS71S0100000_2(FTCVideoPublishPreviewActivity.this, 12));
                                            this.LIZ.setDuration(300L);
                                            this.LIZ.start();
                                        }
                                    });
                                    getWindow().setReturnTransition(new AutoTransition());
                                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onCreate", false);
                                    return;
                                }
                                o.LJIJI("mModel");
                                throw null;
                            }
                            o.LJIJI("mModel");
                            throw null;
                        }
                        o.LJIJI("mModel");
                        throw null;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mPresenter");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        getIntent();
        c42326GjK.getClass();
        C42326GjK.LJI(this, outState);
    }
}

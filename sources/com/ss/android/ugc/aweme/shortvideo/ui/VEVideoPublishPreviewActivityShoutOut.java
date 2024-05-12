package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C135315St;
import X.C16880lQ;
import X.C170576mj;
import X.C32151Nz;
import X.C42326GjK;
import X.C44172HVg;
import X.C65803Ps7;
import X.C78926UyI;
import X.GBO;
import X.H7R;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS22S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VEVideoPublishPreviewActivityShoutOut extends GBO {
    public C135315St LJLJI;
    public LifecycleRegistry LJLJJI;
    public View LJLJJL;
    public boolean LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        C16880lQ.LJLLJ(VEVideoPublishPreviewActivityShoutOut.class);
    }

    @Override // androidx.activity.ComponentActivity, X.C1AU, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        if (this.LJLJJI == null) {
            this.LJLJJI = new LifecycleRegistry(this);
        }
        LifecycleRegistry lifecycleRegistry = this.LJLJJI;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        o.LJIJI("lifecycleRegistry");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        ((LifecycleRegistry) getLifecycle()).markState(Lifecycle.State.DESTROYED);
        C135315St c135315St = this.LJLJI;
        if (c135315St != null) {
            c135315St.LIZIZ();
        }
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C135315St c135315St;
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onResume", true);
        super.onResume();
        if (!this.LJLJJLL && (c135315St = this.LJLJI) != null) {
            c135315St.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onResume", false);
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
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.fk);
        View findViewById = findViewById(R.id.hrq);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.play_icon)");
        setPlayView(findViewById);
        View view = this.LJLJJL;
        if (view != null) {
            view.setTranslationY((-C170576mj.LIZIZ(this)) * 0.16f);
            C42326GjK c42326GjK = C42326GjK.LIZ;
            Intent intent = getIntent();
            c42326GjK.getClass();
            C42326GjK.LIZJ(this, intent, bundle);
            View view2 = this.LJLJJL;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 34), view2);
                C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
                View findViewById2 = findViewById(R.id.i3r);
                o.LJIIIIZZ(findViewById2, "findViewById(R.id.preview_surface)");
                SurfaceView surfaceView = (SurfaceView) findViewById2;
                VideoPublishEditModel LJIIJ = H7R.LJIIJ(getIntent());
                C135315St c135315St = new C135315St(LJIIJ.getVideoEditorType());
                c135315St.LJIJ = LJIIJ.nleData;
                this.LJLJI = c135315St;
                LifecycleRegistry lifecycleRegistry = (LifecycleRegistry) getLifecycle();
                if (LJIIJ.mVideoCanvasWidth <= 0 || LJIIJ.mVideoCanvasHeight <= 0) {
                    int videoWidth = LJIIJ.videoWidth();
                    if (LJIIJ.videoHeight() == 0 || videoWidth == 0) {
                        if (LJIIJ.getOriginal() == 0) {
                            iVideoConfigService = C44172HVg.LJIILIIL;
                        } else {
                            iVideoConfigService = C44172HVg.LJIIL;
                        }
                        iVideoConfigService.getVideoWidth();
                        if (LJIIJ.getOriginal() == 0) {
                            iVideoConfigService2 = C44172HVg.LJIILIIL;
                        } else {
                            iVideoConfigService2 = C44172HVg.LJIIL;
                        }
                        iVideoConfigService2.getVideoHeight();
                    }
                }
                VEPreviewParams LJJJJZ = C78926UyI.LJJJJZ(LJIIJ, 2, 30, 4);
                MutableLiveData mutableLiveData = new MutableLiveData();
                mutableLiveData.setValue(LJJJJZ);
                MutableLiveData<InfoStickerModel> mutableLiveData2 = new MutableLiveData<>();
                mutableLiveData2.setValue(LJIIJ.infoStickerModel);
                c135315St.LIZLLL = mutableLiveData;
                c135315St.LJFF = mutableLiveData2;
                c135315St.LJIIL.observe(this, new Observer() { // from class: X.2PG
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        C36922EeM.LJ("receive prepare done event in publish preview page");
                    }
                });
                lifecycleRegistry.markState(Lifecycle.State.STARTED);
                c135315St.LIZ(this, this, surfaceView, LJIIJ);
                AudioEffectParam audioEffectParam = LJIIJ.veAudioEffectParam;
                if (audioEffectParam != null) {
                    audioEffectParam.setShowErrorToast(false);
                    AudioEffectParam audioEffectParam2 = LJIIJ.veAudioEffectParam;
                    o.LJI(audioEffectParam2);
                    audioEffectParam2.setPreprocessResult(null);
                }
                surfaceView.setVisibility(0);
                surfaceView.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(this, 35)));
                new SafeHandler(this).post(new ARunnableS38S0100000_2(LJIIJ, 80));
                C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 36), findViewById(R.id.aeg));
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onCreate", false);
                return;
            }
            o.LJIJI("playView");
            throw null;
        }
        o.LJIJI("playView");
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

    public final void setPlayView(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLJJL = view;
    }
}

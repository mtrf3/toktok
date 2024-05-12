package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C16880lQ;
import X.C2308694g;
import X.C42025GeT;
import X.C42326GjK;
import X.C42691GpD;
import X.C42721Gph;
import X.C5HC;
import X.C60903NvH;
import X.C65803Ps7;
import X.GB7;
import X.InterfaceC144185lG;
import X.InterfaceC163766bk;
import X.InterfaceC42677Goz;
import X.InterfaceC45540Hu4;
import X.OSZ;
import X.U1F;
import X.WMA;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.zhiliaoapp.musically.R;
import defpackage.e1;

/* loaded from: classes8.dex */
public class VideoRecordNewActivity extends GB7 implements InterfaceC163766bk, InterfaceC45540Hu4, InterfaceC42677Goz {
    public boolean LJLILLLLZI;
    public C42691GpD LJLJI;
    public TikTokCameraBaseGroupScene LJLJJI;
    public NavigationScene LJLJJL;

    @Override // X.InterfaceC163766bk
    public final void LJIJI() {
    }

    @Override // X.InterfaceC163766bk
    public final void LJLJL() {
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        this.LJLILLLLZI = false;
        super.finish();
        TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene = this.LJLJJI;
        if (tikTokCameraBaseGroupScene != null) {
            U1F.LIZJ(this, tikTokCameraBaseGroupScene.LLJJIII());
        } else {
            U1F.LIZJ(this, C2308694g.LIZ(C16880lQ.LLJJIJI(getIntent())));
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC163766bk
    public final boolean LJL() {
        return !C42721Gph.LIZ();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJJI.LLJJJ();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        C42691GpD c42691GpD = this.LJLJI;
        if (c42691GpD != null) {
            c42691GpD.LJII();
        }
        this.LJLILLLLZI = false;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.LJLJJI.LLJJJJ();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        C42691GpD c42691GpD = this.LJLJI;
        if (c42691GpD != null) {
            c42691GpD.LIZJ();
        }
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", true);
        super.onResume();
        C42691GpD c42691GpD = this.LJLJI;
        if (c42691GpD != null) {
            c42691GpD.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onStart", true);
        super.onStart();
        C42691GpD c42691GpD = this.LJLJI;
        if (c42691GpD != null) {
            c42691GpD.LJFF();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        C42691GpD c42691GpD = this.LJLJI;
        if (c42691GpD != null) {
            c42691GpD.LJI();
        }
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

    @Override // X.InterfaceC42677Goz
    public final boolean isRecording() {
        return this.LJLILLLLZI;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.LJLJJI.LLJJ(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LJLJJI.LLJJJIL(configuration);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Class cls;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", true);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        Intent intent = getIntent();
        c42326GjK.getClass();
        C42326GjK.LIZJ(this, intent, bundle);
        if (getIntent().hasExtra("exterior_record_model")) {
            cls = ExteriorVideoRecordScene.class;
        } else {
            cls = VideoRecordNewScene.class;
        }
        super.onCreate(bundle);
        this.LJLILLLLZI = true;
        setContentView(R.layout.f3);
        OSZ<NavigationScene, WMA<?>> LIZIZ = C42025GeT.LIZIZ(this, cls, C16880lQ.LLJJIJI(getIntent()), R.id.ja3);
        this.LJLJI = new C42691GpD(LIZIZ.getSecond());
        this.LJLJJL = LIZIZ.getFirst();
        this.LJLJI.LIZIZ(this, bundle);
        this.LJLJJI = (TikTokCameraBaseGroupScene) this.LJLJJL.LLJJIII();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", false);
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.LJLJJI.LLJJLIIIJLLLLLLLZ(intent);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        if (e1.LIZ(31744, "disable_remove_fragment_inrecord_page", true, true)) {
            bundle.remove("android:support:fragments");
        }
        C42691GpD c42691GpD = this.LJLJI;
        if (c42691GpD != null) {
            c42691GpD.LJ(bundle);
        }
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC c5hc) {
        this.LJLJJI.registerActivityOnKeyDownListener(c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC c5hc) {
        this.LJLJJI.registerActivityOnKeyDownListenerHead(c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
        this.LJLJJI.registerActivityResultListener(interfaceC144185lG);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC c5hc) {
        this.LJLJJI.unRegisterActivityOnKeyDownListener(c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
        this.LJLJJI.unRegisterActivityResultListener(interfaceC144185lG);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!SceneExtensionsKt.LIZ(this.LJLJJI) && this.LJLJJI.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.LJLJJI.LLJJL(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.LJLJJI.onActivityResult(i, i2, intent);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C60903NvH.LJIIJJI().LJJIII().getAlbumService().tryPreloadMediaAfterAlbumPermissionGranted(this);
    }
}

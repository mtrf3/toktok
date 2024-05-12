package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C137015Zh;
import X.C16880lQ;
import X.C41030G8k;
import X.C42022GeQ;
import X.C42326GjK;
import X.C42330GjO;
import X.C42691GpD;
import X.C43542H7a;
import X.C60903NvH;
import X.C65531Pnj;
import X.C65803Ps7;
import X.C6BK;
import X.C77412UZs;
import X.C78895Uxn;
import X.C78934UyQ;
import X.C78983UzD;
import X.C86298Xtu;
import X.F53;
import X.G8G;
import X.GB7;
import X.H78;
import X.H7R;
import X.HJO;
import X.InterfaceC170656mr;
import X.InterfaceC80245VeT;
import X.U1F;
import X.WMA;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class VideoPublishActivity extends GB7 {
    public static final /* synthetic */ int LJLL = 0;
    public View LJLILLLLZI;
    public NavigationScene LJLJI;
    public C42691GpD LJLJJL;
    public VideoPublishContainerScene LJLJJLL;
    public VideoPublishEditModel LJLJL;
    public boolean LJLJLJ;
    public final C78895Uxn LJLJJI = new C78895Uxn();
    public C137015Zh LJLJLLL = null;

    public final void LLFII() {
        if (this.LJLJL == null) {
            return;
        }
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) this.LJLJLLL.findSceneByTag("VideoPublishScene");
        if (videoPublishContainerScene == null) {
            videoPublishContainerScene = new VideoPublishContainerScene();
            videoPublishContainerScene.mArguments = C16880lQ.LLJJIJI(getIntent());
            C137015Zh c137015Zh = this.LJLJLLL;
            c137015Zh.add(c137015Zh.LJLIL, videoPublishContainerScene, "VideoPublishScene");
        }
        this.LJLJJLL = videoPublishContainerScene;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        U1F.LIZJ(this, 1);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LJII();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LIZJ();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", true);
        super.onResume();
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onStart", true);
        super.onStart();
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LJFF();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LJI();
        }
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

    public final void LLFZ(Bundle bundle) {
        this.LJLJLLL = new C137015Zh();
        HJO hjo = new HJO((Bundle) null, C137015Zh.class);
        hjo.LIZJ = false;
        hjo.LIZLLL = false;
        hjo.LJ = 0;
        NavigationScene navigationScene = (NavigationScene) C65531Pnj.LIZ(hjo.LIZ(), NavigationScene.class);
        this.LJLJI = navigationScene;
        navigationScene.LJLILLLLZI = new InterfaceC80245VeT() { // from class: X.GeC
            @Override // X.InterfaceC80245VeT
            public final WM7 LIZ(ClassLoader classLoader, String str) {
                return VideoPublishActivity.this.LJLJLLL;
            }
        };
        C42691GpD c42691GpD = new C42691GpD(new WMA(R.id.jb_, new C42022GeQ(this), this.LJLJI, this.LJLJJI, new C42330GjO(), true));
        this.LJLJJL = c42691GpD;
        c42691GpD.LIZIZ(this, bundle);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", true);
        H78.LJI("VideoPublishActivity onCreate");
        if (!C41030G8k.LIZ()) {
            G8G.LIZ.step("av_video_publish", "onCreate");
        }
        U1F.LJFF(this, 1);
        try {
            super.onCreate(bundle);
        } catch (Exception e) {
            if (F53.LIZIZ(bundle, e) && F53.LIZJ(this)) {
                H78.LIZIZ("VideoPublishActivity", "view state restore crash fixed");
            } else {
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", false);
                throw e;
            }
        }
        setContentView(R.layout.fm);
        this.LJLILLLLZI = findViewById(R.id.j7n);
        Intent intent = getIntent();
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZJ(this, intent, bundle);
        try {
            this.LJLJLJ = intent.getBooleanExtra("extra_enter_from_shoutout_sync", false);
            this.LJLJL = H7R.LJIIJ(intent);
        } catch (RuntimeException e2) {
            if (C16880lQ.LLJJIJI(getIntent()) != null) {
                i = C78934UyQ.LJJII(C16880lQ.LLJJIJI(getIntent()));
            } else {
                i = 0;
            }
            H78.LIZJ("StickerInfo, " + e2.getMessage() + ", bundleSize: " + i);
            InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("exception", e2.getMessage());
            c6bk.LIZ.put("bundleSize", Integer.valueOf(i));
            LJJIIZI.LJIIL(0, "bundle_stickerinfo", c6bk.LJ());
        }
        if (this.LJLJL == null) {
            if (this.LJLJLJ) {
                new C43542H7a("shoutOuts");
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extra_shoutout_video_path");
                String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "extra_shoutout_pid");
                String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "extra_shoutout_music_id");
                CreativeInfo LJIJI = C77412UZs.LJIJI(intent);
                VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
                this.LJLJL = videoPublishEditModel;
                C43542H7a.LJFF(videoPublishEditModel, LJIJI, LLJJIJIIJIL, LLJJIJIIJIL2, LLJJIJIIJIL3);
                LLFZ(bundle);
                LLFII();
            } else {
                H78.LIZJ("VideoPublishActivity onCreate error, model == null");
                HashMap hashMap = new HashMap();
                hashMap.put("intent", intent.toString());
                C78983UzD.LJIILLIIL("VideoPublishActivity onCreate error, model == null", hashMap);
                LLFZ(bundle);
            }
        } else {
            LLFZ(bundle);
            LLFII();
            VideoPublishContainerScene videoPublishContainerScene = this.LJLJJLL;
            if (videoPublishContainerScene != null) {
                videoPublishContainerScene.LLLIILIL();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        VideoPublishContainerScene videoPublishContainerScene = this.LJLJJLL;
        if (videoPublishContainerScene != null) {
            videoPublishContainerScene.onViewStateRestored(bundle);
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        getIntent();
        c42326GjK.getClass();
        C42326GjK.LJI(this, bundle);
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LJ(bundle);
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        VideoPublishContainerScene videoPublishContainerScene;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && !C41030G8k.LIZ() && (videoPublishContainerScene = this.LJLJJLL) != null) {
            videoPublishContainerScene.E();
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        VideoPublishContainerScene videoPublishContainerScene = this.LJLJJLL;
        if (videoPublishContainerScene != null && videoPublishContainerScene.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        VideoPublishContainerScene videoPublishContainerScene = this.LJLJJLL;
        if (videoPublishContainerScene != null && videoPublishContainerScene.LLLF()) {
            this.LJLJJLL.getClass();
        }
        super.onActivityResult(i, i2, intent);
        VideoPublishContainerScene videoPublishContainerScene2 = this.LJLJJLL;
        if (videoPublishContainerScene2 != null && videoPublishContainerScene2.LLLF()) {
            this.LJLJJLL.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C86298Xtu.LIZIZ(this, i, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}

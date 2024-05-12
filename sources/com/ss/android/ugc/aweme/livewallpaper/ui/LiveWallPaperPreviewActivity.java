package com.ss.android.ugc.aweme.livewallpaper.ui;

import X.AYA;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C188727au;
import X.C31268COy;
import X.C38891fp;
import X.C5S1;
import X.C62011OVj;
import X.C62016OVo;
import X.C65803Ps7;
import X.FMX;
import X.InterfaceC88472Yns;
import X.OWF;
import X.OWI;
import X.OWN;
import Y.ACListenerS24S0101000_5;
import Y.AObjectS50S0101000_5;
import Y.IDCListenerS10S0101000;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes11.dex */
public class LiveWallPaperPreviewActivity extends ActivityC86117Xqz implements SurfaceHolder.Callback {
    public static final /* synthetic */ int LJLJLJ = 0;
    public SurfaceView LJLIL;
    public TuxIconView LJLILLLLZI;
    public LiveWallPaperBean LJLJI;
    public OWI LJLJJI;
    public float LJLJJL;
    public boolean LJLJJLL;
    public String LJLJL;

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C31268COy c31268COy = C31268COy.LJI;
        if (((HashMap) c31268COy.LJ).size() == 0) {
            return;
        }
        ((HashMap) c31268COy.LJ).remove("paper_set");
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

    public void exit(View view) {
        finish();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        float f;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", true);
        activityConfiguration(new InterfaceC88472Yns() { // from class: X.AHx
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                ((BaseViewModel) obj).config(new AObjectS50S0101000_5(3, ggt, 2));
                return null;
            }
        });
        super.onCreate(bundle);
        this.LJLJI = (LiveWallPaperBean) getIntent().getParcelableExtra("live_wall_paper");
        this.LJLJJLL = getIntent().getBooleanExtra("hide_more_button", false);
        this.LJLJL = C16880lQ.LLJJIJIIJIL(getIntent(), "from");
        if (this.LJLJI == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
            return;
        }
        setContentView(R.layout.dtz);
        this.LJLIL = (SurfaceView) findViewById(R.id.js5);
        this.LJLILLLLZI = (TuxIconView) findViewById(R.id.f70);
        findViewById(R.id.i12);
        View findViewById = findViewById(R.id.aej);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0101000_5(2, this, 10), findViewById);
        }
        View findViewById2 = findViewById(R.id.mjq);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0101000_5(2, this, 2), findViewById2);
        }
        View findViewById3 = findViewById(R.id.f70);
        if (findViewById3 != null) {
            C16880lQ.LJIIJ(new IDCListenerS10S0101000(5, this, 7), findViewById3);
        }
        View findViewById4 = findViewById(R.id.i12);
        if (findViewById4 != null) {
            C16880lQ.LJIIJ(new IDCListenerS10S0101000(3, this, 8), findViewById4);
        }
        AYA.LIZIZ(findViewById(R.id.kej));
        this.LJLIL.getHolder().addCallback(this);
        OWI owi = new OWI(this, null);
        this.LJLJJI = owi;
        owi.LJ = this.LJLJI;
        if (this.LJLJJLL) {
            this.LJLILLLLZI.setVisibility(8);
        }
        this.LJLJJL = (C62016OVo.LIZ().getInt("keva_key_wallpaper_sound_slider_progress", 0) * 1.0f) / 100.0f;
        LiveWallPaperBean liveWallPaperBean = this.LJLJI;
        if (liveWallPaperBean != null) {
            if (liveWallPaperBean.isShouldMute()) {
                f = 0.0f;
            } else {
                f = this.LJLJJL;
            }
            liveWallPaperBean.setVolume(f);
        }
        String str = this.LJLJL;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("enter_wallpaper_preview", c188727au.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
    }

    public void showSettingDialog(View view) {
        boolean z;
        LiveWallPaperBean liveWallPaperBean = this.LJLJI;
        if (liveWallPaperBean != null && liveWallPaperBean.isShouldMute()) {
            z = true;
        } else {
            z = false;
        }
        new OWN().LIZ(this, z, "Preview", new OWF(this));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        OWI owi;
        LiveWallPaperBean liveWallPaperBean = this.LJLJI;
        if (liveWallPaperBean == null || (owi = this.LJLJJI) == null) {
            return;
        }
        String videoPath = liveWallPaperBean.getVideoPath();
        this.LJLJI.getWidth();
        this.LJLJI.getHeight();
        owi.LIZJ(surfaceHolder, videoPath);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        OWI owi = this.LJLJJI;
        if (owi != null) {
            TTVideoEngine tTVideoEngine = owi.LIZJ;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJJLIIIJILLIZJL();
                owi.LIZJ = null;
            }
            owi.LIZLLL = null;
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1) {
            Context applicationContext = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            C5S1 c5s1 = new C5S1(applicationContext);
            c5s1.LIZJ(R.string.tu8);
            c5s1.LJ();
            C62011OVj.LJIIJ(this.LJLJI.getId(), this.LJLJL, "", true);
            C62011OVj.LJIIIIZZ(0, "");
            finish();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        OWI owi = this.LJLJJI;
        if (owi != null) {
            owi.LIZLLL = surfaceHolder;
        }
    }
}

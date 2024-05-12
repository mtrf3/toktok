package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C04330Ez;
import X.C221108m2;
import X.C29S;
import X.C60903NvH;
import X.C61099NyR;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C78605Ut7;
import X.GM3;
import X.GSL;
import X.H7R;
import X.T4V;
import Y.AObjectS86S0100000_7;
import Y.IDeS403S0100000_7;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.TTEPVideoSaveViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TTEPVideoSaveActivity extends C29S {
    public VideoPublishEditModel LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public TTEPVideoSaveActivity() {
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(new GM3(this));
        this.LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 296));
    }

    public final VideoPublishEditModel LIZLLL() {
        VideoPublishEditModel videoPublishEditModel = this.LJLIL;
        if (videoPublishEditModel != null) {
            return videoPublishEditModel;
        }
        o.LJIJI("model");
        throw null;
    }

    public final TTEPVideoSaveViewModel LLFII() {
        return (TTEPVideoSaveViewModel) this.LJLJI.getValue();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fq);
        ((T4V) findViewById(R.id.iaf)).setVisibility(0);
        getWindow().setNavigationBarColor(C04330Ez.LIZIZ(this, R.color.ey));
        Intent intent = getIntent();
        o.LJIIIIZZ(intent, "intent");
        this.LJLIL = H7R.LJIIJ(intent);
        GSL LJIJI = C60903NvH.LJIIJJI().getPublishService().LJIJI();
        CreativeInfo creativeInfo = LIZLLL().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        AVUploadSaveModel LJIILIIL = LJIJI.LJIILIIL(creativeInfo, H7R.LJJJJLL(LIZLLL()));
        if (LJIILIIL != null) {
            LJIILIIL.setWaterMark(false);
        }
        LIZLLL().setSaveModel(LJIILIIL);
        LLFII().LJLJI.LIZLLL(this, new AObjectS86S0100000_7(this, 73));
        if (Build.VERSION.SDK_INT >= 29) {
            LLFII().gv0(true);
        } else {
            C61099NyR LIZIZ = C61099NyR.LIZIZ.LIZIZ(this, TokenCert.Companion.with((String) C78605Ut7.LJIIJ("bpea-tools_request_storage_permission_ttep_video_save_target33", "bpea-tools_request_storage_permission_ttep_video_save")));
            LIZIZ.LIZ("android.permission.WRITE_EXTERNAL_STORAGE");
            LIZIZ.LIZ.LIZJ(new IDeS403S0100000_7(this, 3));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity", "onCreate", false);
    }
}

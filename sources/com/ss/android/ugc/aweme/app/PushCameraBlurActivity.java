package com.ss.android.ugc.aweme.app;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C279017q;
import X.C44066HRe;
import X.C62905OmT;
import X.C65803Ps7;
import X.HTI;
import Y.AObjectS15S0001000_14;
import Y.IDCListenerS160S0100000_7;
import Y.IDCListenerS283S0100000_7;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class PushCameraBlurActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJJL = 0;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLFII() {
        if (this.LJLILLLLZI) {
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.showStickerPanel(true);
            builder.shootWay("camera_blur");
            AVExternalServiceImpl.LIZ().asyncService(this, "camera_blur", new IDLCallbackS16S0200000_7(builder.build(), this, 2));
            return;
        }
        if (!this.LJLJI || u.LJIIZILJ(this.LJLJJI)) {
            return;
        }
        C44066HRe c44066HRe = new C44066HRe();
        c44066HRe.LJIIL = new HTI(this);
        c44066HRe.LIZJ(this, this.LJLJJI, "push");
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
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", true);
        activityConfiguration(new AObjectS15S0001000_14(0, 1));
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.LJLIL = intent.getBooleanExtra("show_dialog", false);
        this.LJLILLLLZI = intent.getBooleanExtra("show_effect", false);
        this.LJLJI = intent.getBooleanExtra("show_duet", false);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "aid");
        this.LJLJJI = LLJJIJIIJIL;
        if (LLJJIJIIJIL == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", false);
            return;
        }
        if (this.LJLIL) {
            setContentView(R.layout.f9);
            C62905OmT c62905OmT = new C62905OmT(this);
            c62905OmT.LJ(R.string.jbw);
            c62905OmT.LIZ(R.string.jbu);
            c62905OmT.LJIIIIZZ(R.string.gt7, new IDCListenerS160S0100000_7(this, 3), false);
            c62905OmT.LJIIJJI(R.string.blv, new IDCListenerS160S0100000_7(this, 2), false);
            c62905OmT.LJ = new IDCListenerS283S0100000_7(this, 0);
            c62905OmT.LJII = true;
            C279017q.LIZLLL(c62905OmT);
        } else {
            LLFII();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", false);
    }
}

package com.ss.android.ugc.aweme.download.component_api.activity;

import X.C16880lQ;
import X.C61013Nx3;
import X.C61014Nx4;
import X.C61099NyR;
import X.C65803Ps7;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

/* loaded from: classes11.dex */
public class DownloadDelegateActivity extends Activity {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public Intent LJLIL;

    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity
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

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String[] strArr;
        C61099NyR LIZIZ;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onCreate", true);
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
        Intent intent = getIntent();
        this.LJLIL = intent;
        if (intent != null) {
            if (intent.getIntExtra("type", 0) != 1) {
                if (!isFinishing()) {
                    finish();
                }
            } else {
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(this.LJLIL, "permission_id_key");
                String[] stringArrayExtra = this.LJLIL.getStringArrayExtra("permission_content_key");
                if (stringArrayExtra == null || stringArrayExtra.length <= 0) {
                    if (!isFinishing()) {
                        finish();
                    }
                } else {
                    C61014Nx4 c61014Nx4 = new C61014Nx4(this, LLJJIJIIJIL);
                    int i = Build.VERSION.SDK_INT;
                    String str = "android.permission.READ_MEDIA_VIDEO";
                    if (i >= 33) {
                        strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "bpea-download_api_read_media_video"};
                        LIZIZ = C61099NyR.LIZIZ.LIZIZ(this, TokenCert.with("bpea-download_api_read_media_video"));
                    } else {
                        strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "bpea-download_api_write_external_storage"};
                        LIZIZ = C61099NyR.LIZIZ.LIZIZ(this, TokenCert.with("bpea-download_api_write_external_storage"));
                    }
                    String[] strArr2 = new String[1];
                    if (i < 33) {
                        str = "android.permission.WRITE_EXTERNAL_STORAGE";
                    }
                    strArr2[0] = str;
                    LIZIZ.LIZ(strArr2).LIZJ(new C61013Nx3(c61014Nx4, strArr));
                }
            }
            this.LJLIL = null;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onCreate", false);
    }
}

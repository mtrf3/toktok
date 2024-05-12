package com.bytedance.ies.safemode.SmartProtected.fastboot;

import X.C65803Ps7;
import X.C78598Ut0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.ies.safemode.SmartProtected.utils.logger.LLog;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DownloadApkActivity extends Activity {
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
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        LLog.LIZ("FastBootLauncher_DownloadApkActivity", "DownloadApkActivity call onCreate", new Object[0]);
        setContentView(R.layout.e2);
        WebView wv = (WebView) findViewById(R.id.nk6);
        o.LJFF(wv, "wv");
        WebSettings wSet = wv.getSettings();
        o.LJFF(wSet, "wSet");
        wSet.setJavaScriptEnabled(true);
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(""));
        C78598Ut0.LJIJJ(intent, this);
        startActivity(intent);
    }
}

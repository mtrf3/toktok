package com.bytedance.ies.ugc.aweme.commercialize.splash.show;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C27740Aue;
import X.C59759Ncp;
import X.C59761Ncr;
import X.C59835Ne3;
import X.C65803Ps7;
import X.C78983UzD;
import X.FR4;
import X.InterfaceC54245LQr;
import X.NW6;
import X.Q7K;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class NormalSplashAdActivity extends ActivityC86117Xqz implements InterfaceC54245LQr {
    public static final C59761Ncr LJLILLLLZI = new C59761Ncr();
    public static int LJLJI;
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        FR4.LJFF = false;
        if (FR4.LJI) {
            FR4.LJI = false;
            synchronized (FR4.LJII) {
                FR4.LJII.notifyAll();
            }
        }
        super.finish();
        int i = LJLJI;
        if (i == 4) {
            overridePendingTransition(0, R.anim.ga);
        } else if (i != 1) {
            int LIZIZ = Q7K.LIZIZ("splash_disappear_time", 0);
            if (LIZIZ == 1) {
                overridePendingTransition(0, R.anim.g9);
            } else if (LIZIZ == 2) {
                overridePendingTransition(0, R.anim.g_);
            } else {
                overridePendingTransition(0, 0);
            }
        } else {
            overridePendingTransition(0, 0);
        }
        FR4.LJ = false;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        Handler handler = this.LJLIL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        FR4.LJ = false;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
        NW6.LIZ().LJIILJJIL();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
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
        C59761Ncr c59761Ncr = LJLILLLLZI;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        NW6.LIZ().LJIIL();
        try {
            setContentView(R.layout.et);
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
            View view = c59761Ncr.LIZ;
            C59759Ncp c59759Ncp = c59761Ncr.LIZIZ;
            if (c59759Ncp != null) {
                c59759Ncp.LIZ = this;
            }
            c59761Ncr.LIZ = null;
            c59761Ncr.LIZIZ = null;
            if (view != null) {
                C27740Aue.LJIIIIZZ(this);
                view.setBackgroundResource(R.drawable.c6l);
                ((ViewGroup) findViewById(R.id.k_x)).addView(view);
            } else {
                if (getIntent() != null) {
                    C16880lQ.LLJJIJIIJIL(getIntent(), "from");
                }
                finish();
                overridePendingTransition(0, 0);
            }
            FR4.LJFF = true;
        } catch (RuntimeException e) {
            C78983UzD.LJIIZILJ(e);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("exception", e.toString());
                C59835Ne3.LIZJ().monitorCommonLog("splash_set_content_view", jSONObject);
            } catch (Throwable unused) {
            }
            c59761Ncr.LIZ = null;
            c59761Ncr.LIZIZ = null;
            finish();
        }
    }
}

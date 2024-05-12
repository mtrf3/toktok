package com.ss.android.ugc.aweme.ecommerce.singpass;

import X.AbstractActivityC27434Api;
import X.C16880lQ;
import X.C61712OJw;
import X.C61713OJx;
import X.C64710PaU;
import X.C65803Ps7;
import X.C66635QDf;
import X.C78613UtF;
import X.QA7;
import X.QA8;
import X.QAA;
import X.QAB;
import X.QAE;
import X.QAF;
import X.XKX;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class TransparentSingPassHandleActivity extends AbstractActivityC27434Api {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final QA7 LJLJJI = new QA7(this, new QAB(new C64710PaU()), new QAF(this));

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
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

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onCreate", true);
        activityConfiguration(C66635QDf.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.aok);
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LIZIZ.LJIIJ(false);
        LIZJ.LIZIZ.LJIIL();
        LIZJ.LIZJ();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "request_id");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "redirect_uri");
        if (LLJJIJIIJIL == null || LLJJIJIIJIL2 == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onCreate", false);
            return;
        }
        QA7 qa7 = this.LJLJJI;
        qa7.getClass();
        if (LLJJIJIIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || LLJJIJIIJIL2.length() == 0) {
            qa7.LIZJ.LIZ(null, new QAE("illegal params", 101, (String) null, 12));
        } else {
            QA8.LJ = LLJJIJIIJIL2;
            QA8.LIZLLL = LLJJIJIIJIL;
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(qa7.LIZ), C78613UtF.LIZJ, null, new QAA(qa7, LLJJIJIIJIL, LLJJIJIIJIL2, null, null), 2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onCreate", false);
    }
}

package com.ss.android.ugc.aweme.hybridkit.spark;

import X.AbstractC60811Ntn;
import X.ActivityC86117Xqz;
import X.C109464Ri;
import X.C117144ik;
import X.C16880lQ;
import X.C40342FsQ;
import X.C40343FsR;
import X.C61712OJw;
import X.C61713OJx;
import X.C65803Ps7;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class TranslucentActivity extends ActivityC86117Xqz {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C117144ik c117144ik = C117144ik.LIZIZ;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "SparkContextContainerId");
        c117144ik.getClass();
        Map<String, SparkContext> map = C117144ik.LIZ;
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        map.remove(LLJJIJIIJIL);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity", "onCreate", true);
        super.onCreate(bundle);
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LIZIZ.LJIIL();
        LIZJ.LIZJ();
        C109464Ri.LIZ.getClass();
        C117144ik c117144ik = C117144ik.LIZIZ;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "SparkContextContainerId");
        c117144ik.getClass();
        SparkContext LIZ = C117144ik.LIZ(LLJJIJIIJIL);
        if (LIZ != null) {
            LIZ.LJJI(new AbstractC60811Ntn() { // from class: X.4ij
                @Override // X.AbstractC60800Ntc
                public final void LJJJLIIL(SparkContext sparkContext) {
                    TranslucentActivity.this.finish();
                }
            });
            C40343FsR.LJIILJJIL.getClass();
            C40342FsQ.LJII(this, LIZ);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity", "onCreate", false);
    }
}

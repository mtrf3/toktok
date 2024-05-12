package com.ss.android.ugc.aweme.bullet;

import X.AKZ;
import X.C65803Ps7;
import X.C90193gN;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class SingleTaskBulletContainerActivity extends BulletContainerActivity {
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity
    public final int LLIIJI() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJLIL;
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

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, android.app.Activity
    public final void finish() {
        super.finish();
        if (C90193gN.LIZ()) {
            overridePendingTransition(R.anim.fv, R.anim.g0);
        } else {
            overridePendingTransition(R.anim.ft, R.anim.g2);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onCreate", true);
        boolean booleanExtra = getIntent().getBooleanExtra("is_clear_top", false);
        if ((C90193gN.LIZ() && booleanExtra) || (!C90193gN.LIZ() && !booleanExtra)) {
            overridePendingTransition(R.anim.fv, R.anim.g0);
        } else {
            overridePendingTransition(R.anim.ft, R.anim.g2);
        }
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && this.LLIIIZ) {
            AKZ.LIZIZ(this);
            this.LLIIIZ = false;
        }
    }
}

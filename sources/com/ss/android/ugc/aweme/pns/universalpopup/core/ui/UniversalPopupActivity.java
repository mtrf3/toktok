package com.ss.android.ugc.aweme.pns.universalpopup.core.ui;

import X.C221108m2;
import X.C29S;
import X.C62822Ol8;
import X.C65803Ps7;
import X.OSZ;
import Y.AObserverS64S0101000_14;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.util.Stack;
import kotlin.jvm.internal.AqS164S0100000_14;

/* loaded from: classes15.dex */
public final class UniversalPopupActivity extends C29S {
    public static final /* synthetic */ int LJLJI = 0;
    public final Stack<OSZ<UniversalPopup, UniversalPopupUI>> LJLIL = new Stack<>();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 129));

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final UniversalPopupViewModel LLFII() {
        return (UniversalPopupViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.dr0);
        LLFII().LJLJJLL.observe(this, new AObserverS64S0101000_14(1, this, 11));
        LLFII().LJLJLJ.observe(this, new AObserverS64S0101000_14(1, this, 12));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity", "onCreate", false);
    }
}

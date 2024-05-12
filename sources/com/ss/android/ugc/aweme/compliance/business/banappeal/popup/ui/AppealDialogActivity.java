package com.ss.android.ugc.aweme.compliance.business.banappeal.popup.ui;

import X.ARI;
import X.ActivityC86117Xqz;
import X.C26231ARf;
import X.C52283KfX;
import X.C63031OoV;
import X.C63032OoW;
import X.C65803Ps7;
import X.HG3;
import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.viewmodel.AppealDialogViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS141S0200000_10;

/* loaded from: classes11.dex */
public final class AppealDialogActivity extends ActivityC86117Xqz {
    public boolean LJLIL;
    public AppealDialogViewModel LJLILLLLZI;
    public C26231ARf LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.banappeal.popup.ui.AppealDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.banappeal.popup.ui.AppealDialogActivity", "onResume", true);
        super.onResume();
        if (this.LJLIL && HG3.LJIILL().isLogin()) {
            HG3.LJIIIIZZ().logout("user_banned", "user_banned");
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.banappeal.popup.ui.AppealDialogActivity", "onResume", false);
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

    /* JADX WARN: Removed duplicated region for block: B:94:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a8  */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.banappeal.popup.ui.AppealDialogActivity.onCreate(android.os.Bundle):void");
    }

    public final void LLFII(ARI ari, C63031OoV c63031OoV) {
        int i = C63032OoW.LIZ[c63031OoV.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ari.LJFF(c63031OoV.LJLIL, new AqS141S0200000_10(this, c63031OoV, 11));
                return;
            }
            ari.LJIIIZ(c63031OoV.LJLIL, new AqS141S0200000_10(this, c63031OoV, 10));
            return;
        }
        ari.LJII(c63031OoV.LJLIL, new AqS141S0200000_10(this, c63031OoV, 9));
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!C52283KfX.LIZ() && i == 17) {
            HG3.LJIIIIZZ().logout("user_banned", "user_banned");
            finish();
        } else {
            if (!C52283KfX.LIZ()) {
                return;
            }
            finish();
        }
    }
}

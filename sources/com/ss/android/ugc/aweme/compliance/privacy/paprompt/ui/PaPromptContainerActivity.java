package com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C251969ui;
import X.C65803Ps7;
import X.GH3;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import yq4.a;

/* loaded from: classes8.dex */
public final class PaPromptContainerActivity extends ActivityC86117Xqz {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui.PaPromptContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        PaPromptProcessFragment paPromptProcessFragment;
        Fragment LJJJI = getSupportFragmentManager().LJJJI(R.id.j71);
        if ((LJJJI instanceof PaPromptProcessFragment) && (paPromptProcessFragment = (PaPromptProcessFragment) LJJJI) != null) {
            paPromptProcessFragment.onBackPressed();
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        PopupManager.LIZJ(C251969ui.class);
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
        int i;
        int i2;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui.PaPromptContainerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ah0);
        Fragment LJJJIL = getSupportFragmentManager().LJJJIL("pa_prompt_process");
        if (LJJJIL == null) {
            ComplianceSetting LJIIL = a.LJIIZILJ().LJIIL();
            if (LJIIL != null) {
                i = LJIIL.getPrivateAccountPrompt();
            } else {
                i = 1;
            }
            ComplianceSetting LJIIL2 = a.LJIIZILJ().LJIIL();
            if (LJIIL2 != null) {
                i2 = LJIIL2.getPrivateAccountPromptType();
            } else {
                i2 = 0;
            }
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_position");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            LJJJIL = GH3.LIZ(i, i2, LLJJIJIIJIL);
        }
        PaPromptProcessFragment paPromptProcessFragment = (PaPromptProcessFragment) LJJJIL;
        if (paPromptProcessFragment.isAdded()) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIL(paPromptProcessFragment);
            c1b3.LJI();
        } else {
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager2, supportFragmentManager2);
            LIZ.LJIIIIZZ(R.id.j71, 1, paPromptProcessFragment, "pa_prompt_process");
            LIZ.LJI();
        }
        paPromptProcessFragment.LJLIL = new AqS157S0100000_7(this, 498);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui.PaPromptContainerActivity", "onCreate", false);
    }
}

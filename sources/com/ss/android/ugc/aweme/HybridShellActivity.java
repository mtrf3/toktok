package com.ss.android.ugc.aweme;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C44498HdG;
import X.C62387Oe7;
import X.C65803Ps7;
import X.OQA;
import X.OXJ;
import X.OXK;
import X.OXM;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class HybridShellActivity extends ActivityC86117Xqz {
    public static OXK LJLJJLL;
    public static AqS160S0100000_10 LJLJL;
    public C62387Oe7 LJLIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final OXJ LJLJJI = new OXJ(this);

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.HybridShellActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        OXM.LIZ = null;
        OXM.LIZIZ = null;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        super.onDestroy();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.HybridShellActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.f2);
        C62387Oe7 c62387Oe7 = OXM.LIZ;
        this.LJLIL = c62387Oe7;
        if (c62387Oe7 == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.HybridShellActivity", "onCreate", false);
            return;
        }
        int intExtra = getIntent().getIntExtra("referral_panel_style", R.style.a6u);
        int intExtra2 = getIntent().getIntExtra("need_pane_frame_info", 0);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "biz_tag");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "biz_scene_tag");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "page_type");
        if (LLJJIJIIJIL3 == null) {
            LLJJIJIIJIL3 = "webview";
        }
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "params");
        if (LLJJIJIIJIL4 != null) {
            str = LLJJIJIIJIL4;
        }
        C62387Oe7 c62387Oe72 = this.LJLIL;
        o.LJI(c62387Oe72);
        if (c62387Oe72.LJIIJ instanceof HybridImageSharePackage) {
            C62387Oe7 c62387Oe73 = this.LJLIL;
            o.LJI(c62387Oe73);
            BaseSharePackage baseSharePackage = c62387Oe73.LJIIJ;
            o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage");
            ((HybridImageSharePackage) baseSharePackage).callback = new AqS160S0100000_10(this, 58);
        }
        LJLJJLL = new OXK(this, intExtra2, LLJJIJIIJIL, LLJJIJIIJIL2, LLJJIJIIJIL3, str);
        LJLJL = new AqS160S0100000_10(this, 59);
        C62387Oe7 c62387Oe74 = this.LJLIL;
        if (c62387Oe74 != null) {
            ShareDependService.LIZ.getClass();
            OQA.LIZLLL(C44498HdG.LIZ(), this, c62387Oe74, Integer.valueOf(intExtra), null, false, 24);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.HybridShellActivity", "onCreate", false);
    }
}

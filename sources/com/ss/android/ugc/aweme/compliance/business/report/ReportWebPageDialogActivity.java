package com.ss.android.ugc.aweme.compliance.business.report;

import X.AbstractC57425MgH;
import X.ActivityC86117Xqz;
import X.C16360ka;
import X.C16880lQ;
import X.C188727au;
import X.C19N;
import X.C25574A1y;
import X.C26338AVi;
import X.C40342FsQ;
import X.C40343FsR;
import X.C53816LAe;
import X.C59308NPk;
import X.C59600NaG;
import X.C60600NqO;
import X.C60996Nwm;
import X.C63081OpJ;
import X.C65803Ps7;
import X.FMX;
import X.GCB;
import X.InterfaceC27436Apk;
import X.InterfaceC62984Onk;
import X.LFH;
import X.NPN;
import X.NXI;
import X.NZC;
import X.OGB;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import Y.ACListenerS30S0100000_10;
import Y.IDAListenerS235S0100000_10;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.gyf.barlibrary.ImmersionBar;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ReportWebPageDialogActivity extends ActivityC86117Xqz implements OGB, InterfaceC62984Onk {
    public static final /* synthetic */ int LJLL = 0;
    public InterfaceC27436Apk LJLIL;
    public C59600NaG LJLILLLLZI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJI;
    public int LJLJJI;
    public Animation LJLJJL;
    public int LJLJJLL;
    public long LJLJL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public String LJLJLJ = "";

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    @Override // X.InterfaceC62984Onk
    public final boolean getCanCollectConsent() {
        return false;
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

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        if (this.LJLJJLL <= 2) {
            Animation animation = this.LJLJJL;
            if (animation != null) {
                animation.cancel();
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.ah);
            this.LJLJJL = loadAnimation;
            if (loadAnimation != null) {
                o.LJI(loadAnimation);
                loadAnimation.setAnimationListener(new IDAListenerS235S0100000_10(this, 0));
                _$_findCachedViewById(R.id.c04).startAnimation(this.LJLJJL);
                this.LJLJJLL = 3;
                return;
            }
            this.LJLJJLL = 4;
            if (isFinishing()) {
                return;
            }
            super.finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (C19N.LJ("report_spark_view", false)) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIIIIZZ()) {
                return;
            }
            finish();
            return;
        }
        C59600NaG c59600NaG = this.LJLILLLLZI;
        if (c59600NaG != null && c59600NaG.LJIJ().goBack()) {
            return;
        }
        finish();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        long currentTimeMillis = System.currentTimeMillis();
        C188727au c188727au = new C188727au();
        c188727au.LJ(this.LJLJL, "enter_time");
        c188727au.LJ(currentTimeMillis, "exit_time");
        c188727au.LJ(currentTimeMillis - this.LJLJL, "duration");
        c188727au.LJIIIZ("enter_from", C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from"));
        c188727au.LJIIIZ("object_id", C16880lQ.LLJJIJIIJIL(getIntent(), "object_id"));
        FMX.LJIIL("tns_report_webview", c188727au.LIZ);
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

    public final void LLFZ(int i) {
        int i2 = this.LJLJJI;
        if (i2 != 0) {
            if (i > i2) {
                _$_findCachedViewById(R.id.c04).getLayoutParams().height = this.LJLJJI;
            } else {
                _$_findCachedViewById(R.id.c04).getLayoutParams().height = -1;
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (o.LJ(this.LJLJLJ, "video_comment")) {
            LFH.LIZIZ.LIZLLL().LJIILIIL();
            if (C53816LAe.LJIIIIZZ()) {
                finish();
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onCreate", true);
        activityConfiguration(GCB.LJLIL);
        super.onCreate(bundle);
        this.LJLJL = System.currentTimeMillis();
        setContentView(R.layout.afw);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        this.LJLJLJ = LLJJIJIIJIL;
        overridePendingTransition(0, 0);
        this.LJLJJI = getIntent().getIntExtra("half_screen_height", (int) (C60996Nwm.LJ(this) * 0.9d));
        LLFZ(C60996Nwm.LJ(this));
        View cross_react_wrapper = _$_findCachedViewById(R.id.c04);
        o.LJIIIIZZ(cross_react_wrapper, "cross_react_wrapper");
        C26338AVi.LJI(cross_react_wrapper, null, Integer.valueOf(C63081OpJ.LJJJJLI(this)), null, null, false, 29);
        _$_findCachedViewById(R.id.c04).setTranslationY(C60996Nwm.LJ(this));
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 91), _$_findCachedViewById(R.id.cc0));
        Object view = null;
        if (C19N.LJ("report_spark_view", false)) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI != null) {
                ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.c04);
                String string = LLJJIJI.getString("url");
                if (string == null) {
                    z = false;
                }
                C25574A1y.LIZLLL("report_url_null_check_iv", null, z);
                if (string == null) {
                    finish();
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onCreate", false);
                }
                C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
                SparkContext sparkContext = new SparkContext();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("aweme://webview?url=");
                LIZ.append(URLEncoder.encode(string));
                sparkContext.LJJIJLIJ(X1D.LIZIZ(LIZ));
                sparkContext.LJIJJLI(LLJJIJI);
                c40342FsQ.getClass();
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ2 = C40343FsR.LIZ(C40342FsQ.LIZ(this, sparkContext));
                LIZ2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(LIZ2);
                LIZ2.LIZIZ();
                this.LJLJI = LIZ2;
            }
        } else {
            C16880lQ.LLLZIIL(R.layout.afx, getLayoutInflater(), (ViewGroup) _$_findCachedViewById(R.id.c04));
            C59600NaG c59600NaG = new C59600NaG(this, NPN.LIZIZ(getIntent()));
            View findViewById = c59600NaG.LJLIL.findViewById(R.id.c02);
            if (findViewById != null) {
                view = findViewById;
            }
            o.LJIIIIZZ(view, "view");
            c59600NaG.LJLJJI = (NZC) view;
            c59600NaG.LJIJ().onCreate(c59600NaG.LJLIL);
            c59600NaG.LJIJ().setCrossPlatformActivityContainer(c59600NaG);
            C59308NPk c59308NPk = c59600NaG.LJLILLLLZI.LIZ;
            if (!c59308NPk.LJIIJ) {
                ((NXI) c59600NaG.LJIJ().LJI(NXI.class)).LIZIZ(AbstractC57425MgH.LIZ(ImmersionBar.getStatusBarHeight(c59600NaG.LJLIL), c59308NPk.LIZJ));
            }
            this.LJLILLLLZI = c59600NaG;
        }
        C16360ka.LJIJJ(_$_findCachedViewById(R.id.j7n), new C60600NqO(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && this.LJLJJLL <= 0) {
            Animation animation = this.LJLJJL;
            if (animation != null) {
                animation.cancel();
            }
            _$_findCachedViewById(R.id.c04).setTranslationY(0.0f);
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.af);
            this.LJLJJL = loadAnimation;
            if (loadAnimation != null) {
                o.LJI(loadAnimation);
                loadAnimation.setAnimationListener(new IDAListenerS235S0100000_10(this, 1));
                _$_findCachedViewById(R.id.c04).startAnimation(this.LJLJJL);
                this.LJLJJLL = 1;
                return;
            }
            this.LJLJJLL = 2;
        }
    }

    @Override // X.OGB
    public final void setActivityResultListener(InterfaceC27436Apk listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC27436Apk interfaceC27436Apk = this.LJLIL;
        if (interfaceC27436Apk != null) {
            interfaceC27436Apk.onActivityResult(i, i2, intent);
        }
    }
}

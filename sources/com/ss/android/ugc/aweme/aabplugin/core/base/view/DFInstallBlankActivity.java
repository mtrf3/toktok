package com.ss.android.ugc.aweme.aabplugin.core.base.view;

import X.AbstractC37134Ehm;
import X.AbstractC40550Fvm;
import X.ActivityC86117Xqz;
import X.C0DC;
import X.C16880lQ;
import X.C26227ARb;
import X.C37100EhE;
import X.C37101EhF;
import X.C65803Ps7;
import X.DialogInterfaceOnDismissListenerC29873Bnx;
import X.F5U;
import X.F5V;
import X.F5W;
import X.F6E;
import X.FJW;
import X.InterfaceC38394F5a;
import X.ProgressDialogC43242Gy6;
import X.UC0;
import Y.IDCListenerS282S0100000_6;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFInstallBlankActivity extends ActivityC86117Xqz {
    public boolean LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        if (this.LJLIL) {
            FJW.LIZJ().LIZIZ();
        }
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onResume", false);
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

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        finish();
        return super.dispatchTouchEvent(ev);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC40550Fvm abstractC40550Fvm;
        String string;
        F6E f6e;
        C65803Ps7.LIZ(this, bundle);
        int i = 1;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", true);
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("is_guide_clean_dialog", false)) {
            AbstractC37134Ehm abstractC37134Ehm = F5V.LIZLLL().LJLJJLL;
            if (abstractC37134Ehm != null) {
                C26227ARb c26227ARb = new C26227ARb(this);
                c26227ARb.LJ(R.string.juk);
                c26227ARb.LIZ(R.string.juj);
                UC0.LIZJ(c26227ARb, new AqS137S0200000_6(this, abstractC37134Ehm, 35));
                c26227ARb.LIZJ(new AqS172S0100000_6(this, 114));
                c26227ARb.LJI().LIZLLL();
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", false);
            return;
        }
        F5U LJ = F5V.LIZLLL().LJ(C16880lQ.LLJJIJIIJIL(getIntent(), "module_name"));
        boolean booleanExtra = getIntent().getBooleanExtra("is_hold_progress_dialog", false);
        this.LJLIL = booleanExtra;
        if (booleanExtra) {
            FJW LIZJ = FJW.LIZJ();
            AbstractC37134Ehm abstractC37134Ehm2 = LJ.LJII;
            IDCListenerS282S0100000_6 iDCListenerS282S0100000_6 = new IDCListenerS282S0100000_6(LJ, 1);
            LIZJ.getClass();
            if (abstractC37134Ehm2 == null || (f6e = abstractC37134Ehm2.LJII) == null || (string = f6e.LIZ) == null) {
                string = getString(R.string.gqj);
            }
            WeakReference weakReference = new WeakReference(this);
            LIZJ.LIZ = new ProgressDialogC43242Gy6(this);
            LIZJ.LIZ.setCancelable(true);
            LIZJ.LIZ.setCanceledOnTouchOutside(false);
            LIZJ.LIZ.setIndeterminate(false);
            LIZJ.LIZ.setMax(100);
            LIZJ.LIZ.setMessage(string);
            LIZJ.LIZ.setOnCancelListener(iDCListenerS282S0100000_6);
            LIZJ.LIZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC29873Bnx(i, weakReference));
            if (!isFinishing()) {
                FJW.LIZ(LIZJ.LIZ);
            }
        }
        if (getIntent().getBooleanExtra("is_hold_permission_dialog", false)) {
            try {
                activityConfiguration(new AqS137S0200000_6(LJ, this, 30));
                AbstractC37134Ehm abstractC37134Ehm3 = LJ.LJII;
                if (abstractC37134Ehm3 != null) {
                    InterfaceC38394F5a interfaceC38394F5a = F5W.LIZIZ;
                    String packageName = abstractC37134Ehm3.LIZIZ;
                    o.LJIIIZ(packageName, "packageName");
                    ConcurrentHashMap<String, AbstractC40550Fvm> concurrentHashMap = C37101EhF.LIZIZ;
                    synchronized (concurrentHashMap) {
                        abstractC40550Fvm = concurrentHashMap.get(packageName);
                    }
                    o.LJI(abstractC40550Fvm);
                    if (!interfaceC38394F5a.LIZLLL(abstractC40550Fvm, this, LJ.LIZJ)) {
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", false);
    }

    public static void LLFII(AbstractC37134Ehm abstractC37134Ehm, boolean z) {
        C37100EhE c37100EhE = new C37100EhE(abstractC37134Ehm.LJIIJ, abstractC37134Ehm.LJIIJJI, abstractC37134Ehm.LIZIZ);
        if (z) {
            c37100EhE.LJIIIZ = C0DC.LIZIZ("reject_clean_dialog", Boolean.TRUE);
        }
        F5V.LIZLLL().LJ(abstractC37134Ehm.LIZ).LJFF.LIZ(c37100EhE);
    }
}

package com.bytedance.ies.safemode;

import X.ARI;
import X.C03880Dg;
import X.C16880lQ;
import X.C26227ARb;
import X.C29S;
import X.C65300Pk0;
import X.C65803Ps7;
import X.C66457Q6j;
import X.C66458Q6k;
import X.C66465Q6r;
import X.DialogInterfaceOnClickListenerC40472FuW;
import X.DialogInterfaceOnClickListenerC40473FuX;
import X.InterfaceC38831FLv;
import X.PTS;
import Y.AObjectS11S0001000_6;
import Y.AObjectS29S0000000_6;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class SafeModeActivity extends C29S {
    public static InterfaceC38831FLv LJLJJI;
    public static SafeModeActivity LJLJJL;
    public static final C66457Q6j LJLJJLL = new C66457Q6j();
    public static String LJLIL = "";
    public static String LJLILLLLZI = "";
    public static int LJLJI = -1;

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
        super.onCreate(bundle);
        supportRequestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.f4);
        LJLJJL = this;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "crashType");
        o.LJFF(LLJJIJIIJIL, "intent.getStringExtra(CRASH_TYPE)");
        LJLIL = LLJJIJIIJIL;
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "crashStack");
        o.LJFF(LLJJIJIIJIL2, "intent.getStringExtra(CRASH_STACK)");
        LJLILLLLZI = LLJJIJIIJIL2;
        LJLJI = getIntent().getIntExtra("reachType", -1);
        C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
        o.LJFF(c66465Q6r, "SafeModeConfig.getInstance()");
        if (c66465Q6r.LIZIZ != null) {
            PTS.LIZJ(LJLIL, LJLILLLLZI, "LaunchProtectShowDialog");
        }
        SafeModeReporter.CrashInfo LIZIZ = SafeModeReporter.CrashInfo.LIZIZ(LJLIL, LJLILLLLZI);
        int i = LJLJI;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", LIZIZ.LIZLLL());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        SafeModeReporter.LIZJ("safemode_dialog_show_v2", jSONObject);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (C66458Q6k.class) {
            C66458Q6k.LIZ.LJI(currentTimeMillis, "boot_protected_time_stamp");
        }
        if (LJLJJI != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, R.style.ul);
            C26227ARb c26227ARb = new C26227ARb(contextThemeWrapper);
            c26227ARb.LJ(R.string.bkq);
            c26227ARb.LIZ(R.string.bkp);
            ARI ari = new ARI(contextThemeWrapper);
            ari.LJI(R.string.bko, new AObjectS11S0001000_6(1, 3));
            ari.LJIIIIZZ(R.string.bkm, new AObjectS29S0000000_6(2));
            c26227ARb.LJIIL = ari;
            c26227ARb.LJII = false;
            c26227ARb.LJI().LIZLLL();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.bkp).setPositiveButton(R.string.bko, DialogInterfaceOnClickListenerC40473FuX.LJLIL).setNegativeButton(R.string.bkm, DialogInterfaceOnClickListenerC40472FuW.LJLIL);
        AlertDialog create = builder.create();
        if (new C03880Dg(2).LIZJ(300000, "android/app/AlertDialog", "show", create, new Object[0], "void", new C65300Pk0(false, "()V", "4073184159768871028")).LIZ) {
            return;
        }
        create.show();
    }
}

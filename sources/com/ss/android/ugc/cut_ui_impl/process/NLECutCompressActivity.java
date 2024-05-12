package com.ss.android.ugc.cut_ui_impl.process;

import X.ActivityC41728GZg;
import X.AnonymousClass021;
import X.C145765no;
import X.C16880lQ;
import X.C171576oL;
import X.C171656oT;
import X.C171686oW;
import X.C171796oh;
import X.C171856on;
import X.C171886oq;
import X.C172586py;
import X.C172976qb;
import X.C2NY;
import X.C5KU;
import X.C65803Ps7;
import X.C68332mD;
import X.C79146V4k;
import X.EXS;
import X.InterfaceC70422pa;
import X.MBA;
import X.ProgressDialogC173666ri;
import X.XKX;
import Y.ACListenerS24S0101000_5;
import Y.ARunnableS38S0100000_2;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class NLECutCompressActivity extends ActivityC41728GZg implements InterfaceC70422pa {
    public static final /* synthetic */ int LJLLLL = 0;
    public ProgressDialogC173666ri LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public Intent LJLJLJ;
    public NLETemplateSource LJLL;
    public String LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public final MBA LJLIL = EXS.LIZ.plus(C79146V4k.LJIILIIL());
    public final double LJLILLLLZI = 0.2d;
    public final long LJLJI = 500;
    public boolean LJLJLLL = true;
    public final ARunnableS38S0100000_2 LJLLL = new ARunnableS38S0100000_2(this, 88);

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        C172976qb.LIZ.LIZ();
        NLE.loadNLELibrary$default(NLE.INSTANCE, false, 1, null);
        C172586py.LIZLLL();
    }

    public final void cancel() {
        C171656oT.LIZ.getValue().getClass();
        VEEditor vEEditor = C145765no.LIZ;
        if (vEEditor != null) {
            vEEditor.LJIILIIL();
        }
        C171576oL c171576oL = (C171576oL) C171656oT.LIZIZ.getValue();
        c171576oL.LIZ = true;
        C5KU c5ku = c171576oL.LIZIZ;
        if (c5ku != null) {
            c5ku.LIZ();
        }
        ProgressDialogC173666ri progressDialogC173666ri = this.LJLJJI;
        if (progressDialogC173666ri != null) {
            progressDialogC173666ri.dismiss();
            Intent intent = new Intent();
            intent.putExtra("cut_compress_error", this.LJLJL);
            intent.putExtra("cut_compress_code", -10002);
            setResult(0, intent);
            finish();
            return;
        }
        o.LJIJI("progressDialog");
        throw null;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        cancel();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        ARunnableS38S0100000_2 run = this.LJLLL;
        o.LJIIIZ(run, "run");
        ((Handler) C2NY.LIZ.getValue()).removeCallbacks(run);
        C79146V4k.LJIJ(this.LJLIL, null);
        ProgressDialogC173666ri progressDialogC173666ri = this.LJLJJI;
        if (progressDialogC173666ri != null) {
            progressDialogC173666ri.dismiss();
            NLETemplateSource nLETemplateSource = this.LJLL;
            if (nLETemplateSource != null) {
                nLETemplateSource.LIZLLL();
            }
            super.onDestroy();
            return;
        }
        o.LJIJI("progressDialog");
        throw null;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        this.LJLJLLL = false;
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onResume", true);
        super.onResume();
        this.LJLJLLL = true;
        Intent intent = this.LJLJLJ;
        if (intent != null) {
            setResult(-1, intent);
            finish();
        }
        this.LJLJLJ = null;
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onResume", false);
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

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLIL;
    }

    public final void LLFII(int i) {
        if (this.LJLJJL >= i || i > 100) {
            return;
        }
        XKX.LIZLLL(this, EXS.LIZ, null, new C171796oh(this, i, null), 2);
        this.LJLJJL = i;
        ARunnableS38S0100000_2 run = this.LJLLL;
        o.LJIIIZ(run, "run");
        C68332mD c68332mD = C2NY.LIZ;
        ((Handler) c68332mD.getValue()).removeCallbacks(run);
        ARunnableS38S0100000_2 run2 = this.LJLLL;
        o.LJIIIZ(run2, "run");
        ((Handler) c68332mD.getValue()).postDelayed(run2, 1000L);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        AnonymousClass021 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.LJFF();
        }
        ProgressDialogC173666ri LIZIZ = ProgressDialogC173666ri.LIZIZ(this, getString(R.string.e84));
        this.LJLJJI = LIZIZ;
        ACListenerS24S0101000_5 aCListenerS24S0101000_5 = new ACListenerS24S0101000_5(3, this, 5);
        ImageView imageView = (ImageView) LIZIZ.findViewById(R.id.eay);
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, aCListenerS24S0101000_5);
        }
        ProgressDialogC173666ri progressDialogC173666ri = this.LJLJJI;
        if (progressDialogC173666ri != null) {
            ImageView imageView2 = (ImageView) progressDialogC173666ri.findViewById(R.id.eay);
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ProgressDialogC173666ri progressDialogC173666ri2 = this.LJLJJI;
            if (progressDialogC173666ri2 != null) {
                progressDialogC173666ri2.setProgress(0);
                Intent intent = getIntent();
                o.LJIIIIZZ(intent, "intent");
                C171856on LIZIZ2 = C171886oq.LIZIZ(intent);
                CutSource cutSource = (CutSource) getIntent().getParcelableExtra("arg_cut_source");
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "zip_md5");
                TemplateSourceConfig templateSourceConfig = (TemplateSourceConfig) getIntent().getParcelableExtra("template_config");
                if (LIZIZ2 == null) {
                    finish();
                } else {
                    XKX.LIZLLL(this, null, null, new C171686oW(cutSource, this, templateSourceConfig, LLJJIJIIJIL, LIZIZ2, null), 3);
                }
                ARunnableS38S0100000_2 run = this.LJLLL;
                o.LJIIIZ(run, "run");
                C68332mD c68332mD = C2NY.LIZ;
                ((Handler) c68332mD.getValue()).removeCallbacks(run);
                ARunnableS38S0100000_2 run2 = this.LJLLL;
                o.LJIIIZ(run2, "run");
                ((Handler) c68332mD.getValue()).postDelayed(run2, 1000L);
                ActivityAgent.onTrace("com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity", "onCreate", false);
                return;
            }
            o.LJIJI("progressDialog");
            throw null;
        }
        o.LJIJI("progressDialog");
        throw null;
    }
}

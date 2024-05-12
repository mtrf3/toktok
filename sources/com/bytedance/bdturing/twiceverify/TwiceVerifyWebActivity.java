package com.bytedance.bdturing.twiceverify;

import X.C16880lQ;
import X.C29S;
import X.C37037EgD;
import X.C65803Ps7;
import X.C66890QNa;
import X.C66892QNc;
import X.C66893QNd;
import X.KL2;
import X.O5V;
import X.OCP;
import X.QNH;
import X.QNK;
import X.QNQ;
import X.QNR;
import X.QNV;
import X.QNW;
import X.X1D;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class TwiceVerifyWebActivity extends C29S {
    public O5V LJLIL;
    public View LJLILLLLZI;
    public QNH LJLJI;
    public final QNW LJLJJI = new QNW();

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
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        setFinishOnTouchOutside(false);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) decorView.getLayoutParams();
        layoutParams.gravity = 80;
        layoutParams.width = KL2.LJIIJJI(this);
        QNQ.LIZ().getClass();
        layoutParams.height = (int) KL2.LIZJ(this, 304.0f);
        QNH qnh = this.LJLJI;
        if (qnh instanceof C66892QNc) {
            layoutParams.height = (int) KL2.LIZJ(this, 290.0f);
        } else if (qnh instanceof C66890QNa) {
            layoutParams.height = (int) KL2.LIZJ(this, 304.0f);
        } else if (qnh instanceof C66893QNd) {
            layoutParams.height = (int) KL2.LIZJ(this, 272.0f);
        }
        getWindowManager().updateViewLayout(decorView, layoutParams);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
        QNV qnv = QNQ.LIZ().LIZIZ;
        if (qnv != null) {
            ((QNR) qnv).LIZ.onFail(2);
        }
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        this.LJLIL = null;
        QNQ LIZ = QNQ.LIZ();
        LIZ.LIZIZ = null;
        LIZ.LIZJ = null;
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

    public final void LLFII(int i) {
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.abr));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ERROR:");
        LIZ.append(i);
        C16880lQ.LLZILL(Toast.makeText(this, X1D.LIZIZ(LIZ), 1));
        O5V o5v = this.LJLIL;
        if (o5v != null) {
            o5v.setVisibility(4);
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.ud);
        QNQ.LIZ().LIZ.LJII();
        this.LJLJI = QNQ.LIZ().LIZJ;
        if (this.LJLIL == null) {
            O5V o5v = (O5V) findViewById(R.id.ahv);
            this.LJLIL = o5v;
            o5v.LIZ(this.LJLJJI);
        }
        O5V o5v2 = this.LJLIL;
        if (o5v2 != null) {
            o5v2.setParentActivity(this);
        }
        this.LJLIL.getSettings().setJavaScriptEnabled(true);
        new OCP(new QNK(this), this.LJLIL);
        HashMap hashMap = new HashMap();
        O5V o5v3 = this.LJLIL;
        String LJFF = this.LJLJI.LJFF();
        String LIZLLL = C37037EgD.LIZ.LIZLLL(o5v3, LJFF);
        if (!TextUtils.isEmpty(LIZLLL)) {
            LJFF = LIZLLL;
        }
        o5v3.loadUrl(LJFF, hashMap);
        this.LJLILLLLZI = findViewById(R.id.lbo);
        QNQ.LIZ().getClass();
    }
}

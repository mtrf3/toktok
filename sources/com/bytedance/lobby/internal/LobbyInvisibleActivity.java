package com.bytedance.lobby.internal;

import X.C16880lQ;
import X.C29S;
import X.C65803Ps7;
import X.C66504Q8e;
import X.Q8M;
import X.QB2;
import X.QB3;
import X.QBA;
import X.QBB;
import X.X1D;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import defpackage.i0;

/* loaded from: classes12.dex */
public class LobbyInvisibleActivity extends C29S {
    public static final /* synthetic */ int LJLJJL = 0;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public QB3 LJLJI;
    public int LJLJJI;

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        QB3 qb3 = this.LJLJI;
        if (qb3 != null) {
            qb3.onDestroy();
        }
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
        if (this.LJLIL && !this.LJLILLLLZI) {
            finish();
        } else {
            this.LJLIL = true;
        }
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
        setContentView(R.layout.ek);
        Intent intent = getIntent();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "provider_id");
        this.LJLJJI = intent.getIntExtra("action_type", 0);
        QB3 LIZ = QBA.LIZIZ().LIZ(LLJJIJIIJIL);
        this.LJLJI = LIZ;
        if (LIZ == null) {
            QBB LIZ2 = QBB.LIZ();
            int i = this.LJLJJI;
            Q8M q8m = new Q8M(LLJJIJIIJIL, i);
            q8m.LIZ = false;
            q8m.LIZIZ = new C66504Q8e(1, i0.LJFF("No provider found for ", LLJJIJIIJIL), "before_goto_URL");
            LIZ2.LIZIZ(i, q8m.LIZ(), LLJJIJIIJIL);
            finish();
            return;
        }
        LobbyViewModel.gv0(this).LJLIL.observe(this, new QB2(this, LLJJIJIIJIL));
        this.LJLILLLLZI = true;
        int i2 = this.LJLJJI;
        if (i2 != 1) {
            if (i2 != 2) {
                QBB LIZ3 = QBB.LIZ();
                int i3 = this.LJLJJI;
                Q8M q8m2 = new Q8M(LLJJIJIIJIL, i3);
                q8m2.LIZ = false;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Unknown action type: ");
                LIZ4.append(this.LJLJJI);
                q8m2.LIZIZ = new C66504Q8e(1, X1D.LIZIZ(LIZ4));
                LIZ3.LIZIZ(i3, q8m2.LIZ(), LLJJIJIIJIL);
                finish();
                return;
            }
            this.LJLJI.us(C16880lQ.LLJJIJI(intent), this);
            return;
        }
        this.LJLJI.za(C16880lQ.LLJJIJI(intent), this);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        QB3 qb3 = this.LJLJI;
        if (qb3 != null) {
            qb3.q50(this, i, i2, intent);
        }
    }
}

package X;

import Y.IDCListenerS252S0100000_2;
import android.R;
import android.os.Bundle;
import android.view.View;
import defpackage.e1;

/* renamed from: X.6Zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC162676Zz extends GBO {
    public View LJLJJLL;
    public int LJLJL;
    public boolean LJLJI = true;
    public boolean LJLJJI = true;
    public boolean LJLJJL = true;
    public IDCListenerS252S0100000_2 LJLJLJ = new IDCListenerS252S0100000_2(this, 4);

    public int LLIIIILZ() {
        return -16777216;
    }

    public abstract void LLIIIZ(boolean z);

    public abstract void LLIIJI();

    public abstract void LLIIJLIL(boolean z);

    public void LLIL(int i, int i2) {
    }

    public final void LLIILII() {
        LLIIJI();
        if (LLIIIJ() instanceof C157236Fb) {
            switch (C157236Fb.LIZ.LJIIIZ()) {
                case 1:
                case 4:
                    LLIIJLIL(true);
                    LLIIIZ(true);
                    return;
                case 2:
                case 5:
                    LLIIJLIL(false);
                    LLIIIZ(true);
                    return;
                case 3:
                case 6:
                    LLIIJLIL(true);
                    LLIIIZ(false);
                    return;
                default:
                    LLIIJLIL(false);
                    LLIIIZ(false);
                    return;
            }
        }
        if (!(LLIIIJ() instanceof C157226Fa)) {
            return;
        }
        LLIIJLIL(((C157226Fa) LLIIIJ()).LJIIL());
        LLIIIZ(((C157226Fa) LLIIIJ()).LJIILIIL());
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        View view = this.LJLJJLL;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LJLJLJ);
            this.LJLJLJ = null;
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.LJLJJI) {
            this.LJLJJI = false;
            if (LLIIIJ() instanceof C157226Fa) {
                this.LJLJL = C157226Fa.LIZ.LIZLLL();
            } else {
                int LIZJ = C81184Vtc.LIZJ(this);
                this.LJLJL = LIZJ;
                if (LIZJ != LLIIIJ().LIZLLL()) {
                    LLIIIJ().LIZJ(this.LJLJL);
                }
            }
            LLIILII();
            boolean z = this.LJLJJL;
            View view = this.LJLJJLL;
            if (view != null) {
                if (z) {
                    view.addOnLayoutChangeListener(this.LJLJLJ);
                } else {
                    view.removeOnLayoutChangeListener(this.LJLJLJ);
                }
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.LJLJI) {
            this.LJLJI = false;
            getWindow().clearFlags(1024);
            OQN.LJIILIIL(this);
            getWindow().setNavigationBarColor(-16777216);
            getWindow().getDecorView().setBackgroundColor(LLIIIILZ());
            LLIL(C63081OpJ.LJJJJLI(this), LLIIIJ().LJI());
            this.LJLJJLL = findViewById(R.id.content);
        }
    }

    public C6FB LLIIIJ() {
        return C157236Fb.LIZ;
    }

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJJL = true;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (e1.LIZ(31744, "studio_enable_on_restore_mod", true, true)) {
            C188727au c188727au = new C188727au();
            c188727au.LJI("activity_tag", C16880lQ.LJLLJ(getClass()));
            FMX.LJIIL("studio_activity_on_restore", c188727au.LIZ);
        }
    }
}

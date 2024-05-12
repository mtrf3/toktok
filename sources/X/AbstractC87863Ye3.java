package X;

import Y.ARunnableS52S0100000_16;
import android.os.Handler;

/* renamed from: X.Ye3, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC87863Ye3 {
    public final InterfaceC87871YeB LIZ;
    public final AbstractC48851JFf LIZIZ;
    public final InterfaceC67096QUy LIZJ;
    public final String LIZLLL;
    public C87869Ye9 LJ;
    public final ARunnableS52S0100000_16 LJFF = new ARunnableS52S0100000_16(this, 3);

    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract int LIZJ();

    public abstract boolean LIZLLL(C67101QVd c67101QVd);

    public final void LJ() {
        long j;
        if (this.LIZ.isForeground()) {
            j = this.LJ.LIZ;
        } else {
            j = this.LJ.LIZIZ;
        }
        long j2 = j * 1000;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL);
        LIZ.append("next time to request: ");
        LIZ.append(j2 / 1000);
        LIZ.append("s");
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        if (j2 < 0) {
            return;
        }
        ((Handler) this.LIZIZ.LIZLLL(new Object[0])).postDelayed(this.LJFF, j2);
    }

    public final void LJFF(boolean z) {
        if (!z) {
            LIZIZ();
        }
        LJ();
    }

    public final void LJI(C67101QVd c67101QVd) {
        if (LIZLLL(c67101QVd)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZLLL);
            LIZ.append("receive data, do reset rotate");
            C66629QCz.LIZ(X1D.LIZIZ(LIZ));
            ((Handler) this.LIZIZ.LIZLLL(new Object[0])).removeCallbacks(this.LJFF);
            LJ();
        }
    }

    public AbstractC87863Ye3(String str, InterfaceC87871YeB interfaceC87871YeB, InterfaceC67096QUy interfaceC67096QUy, AbstractC48851JFf abstractC48851JFf, C87869Ye9 c87869Ye9) {
        this.LIZLLL = str;
        this.LIZ = interfaceC87871YeB;
        this.LIZJ = interfaceC67096QUy;
        this.LIZIZ = abstractC48851JFf;
        this.LJ = c87869Ye9;
    }
}

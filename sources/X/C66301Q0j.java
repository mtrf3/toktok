package X;

import android.os.SystemClock;

/* renamed from: X.Q0j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66301Q0j {
    public final C66302Q0k LIZ = new C66302Q0k();
    public final C66302Q0k LIZIZ = new C66302Q0k();
    public final C66302Q0k LIZJ = new C66302Q0k();
    public boolean LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        this.LIZ.LIZIZ = System.currentTimeMillis();
        this.LIZIZ.LIZIZ = System.nanoTime();
        this.LIZJ.LIZIZ = SystemClock.currentThreadTimeMillis();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TimeAnchor(absoluteTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", threadTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", nanoTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }
}

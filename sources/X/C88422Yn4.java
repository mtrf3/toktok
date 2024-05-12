package X;

import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.Yn4, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C88422Yn4 {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C88418Yn0 LJ;

    public final synchronized boolean LIZIZ() {
        return this.LIZLLL;
    }

    public final synchronized boolean LIZJ() {
        if (!this.LIZ) {
            this.LIZ = true;
        }
        return !this.LIZJ;
    }

    public final synchronized void LIZ(GL10 gl10) {
        boolean z;
        if (!this.LIZIZ) {
            if (!this.LIZ) {
                this.LIZ = true;
            }
            if (!gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ")) {
                z = true;
            } else {
                z = false;
            }
            this.LIZJ = z;
            notifyAll();
            this.LIZLLL = !this.LIZJ;
            this.LIZIZ = true;
        }
    }

    public final synchronized void LIZLLL(C88418Yn0 c88418Yn0) {
        c88418Yn0.LJLILLLLZI = true;
        if (this.LJ == c88418Yn0) {
            this.LJ = null;
        }
        notifyAll();
    }
}

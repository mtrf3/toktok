package X;

import java.util.BitSet;

/* loaded from: classes10.dex */
public final class LXS {
    public static LXS LJIIIIZZ;
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final BitSet LJFF = new BitSet();
    public boolean LJI;
    public boolean LJII;

    public final boolean LIZIZ(int i) {
        return this.LJFF.get(i);
    }

    public final void LIZJ(boolean z) {
        if (this.LIZIZ == z) {
            return;
        }
        this.LIZIZ = z;
        C2U8.LIZ(new IKF());
    }

    public final void LIZLLL(boolean z) {
        if (this.LIZJ == z) {
            return;
        }
        this.LIZJ = z;
        C2U8.LIZ(new IKG());
    }

    public final void LJ(boolean z) {
        this.LJ = z;
        C2U8.LIZ(new IKI());
    }

    public final void LJFF(boolean z) {
        if (this.LIZLLL == z) {
            return;
        }
        this.LIZLLL = z;
        C2U8.LIZ(new IKJ());
    }

    public final void LJI(boolean z) {
        if (z == this.LJII) {
            return;
        }
        this.LJII = z;
        C2U8.LIZ(new IKK());
    }

    public final void LJII(int i, boolean z) {
        if (z) {
            this.LJFF.set(i);
        } else {
            this.LJFF.clear(i);
        }
        C2U8.LIZ(new LXT(i));
    }
}

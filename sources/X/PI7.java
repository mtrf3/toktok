package X;

/* loaded from: classes12.dex */
public final class PI7 extends PI2 {
    @Override // X.PI2
    public final boolean LJIIZILJ() {
        return false;
    }

    @Override // X.PI2
    public final long LJIILL() {
        if (this.LIZLLL) {
            return 600000L;
        }
        return 30000L;
    }

    @Override // X.PMI
    public final PI8 LJIIIIZZ() {
        return PI8.PROCESS_DETECT;
    }

    public PI7(PI1 pi1) {
        super(pi1);
    }

    @Override // X.PI2
    public final boolean LJIILLIIL(boolean z) {
        if (z) {
            C64207PHv.LIZ.getClass();
            PI1 pi1 = (PI1) this.LIZ;
            synchronized (pi1) {
                pi1.LIZ(pi1.LJIIIIZZ);
            }
        }
        return z;
    }
}

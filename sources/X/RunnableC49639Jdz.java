package X;

/* renamed from: X.Jdz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC49639Jdz implements Runnable {
    public final C49640Je0 LJLIL;

    public final void LIZ() {
        C49640Je0 c49640Je0 = this.LJLIL;
        long j = c49640Je0.LJIIZILJ;
        if (j != -1) {
            long j2 = c49640Je0.LJIJ;
            if (j2 != -1) {
                long j3 = j2 - j;
                if (j3 >= 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("from search to first autoplay time is ");
                    LIZ.append(j3);
                    LIZ.append(' ');
                    X1D.LIZIZ(LIZ);
                    c49640Je0.LJIIZILJ("duration", String.valueOf(j3));
                    c49640Je0.LJIILIIL();
                    c49640Je0.LJIIZILJ = -1L;
                    c49640Je0.LJIJ = -1L;
                }
            }
        }
        C49638Jdy.LIZ = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC49639Jdz(C49640Je0 c49640Je0) {
        this.LJLIL = c49640Je0;
    }
}

package X;

import java.io.File;

/* loaded from: classes12.dex */
public final class PUO extends PVP {
    public final /* synthetic */ C39745Fin LIZ;
    public final /* synthetic */ File LIZIZ;

    @Override // X.PVP
    public final long LIZ() {
        return this.LIZIZ.length();
    }

    @Override // X.PVP
    public final C39745Fin LIZIZ() {
        return this.LIZ;
    }

    @Override // X.PVP
    public final void LJ(PVU pvu) {
        try {
            PUE LJI = PU7.LJI(this.LIZIZ);
            try {
                C64533PUj c64533PUj = new C64533PUj();
                long j = 2048;
                for (long read = LJI.read(c64533PUj, j); read != -1; read = LJI.read(c64533PUj, j)) {
                    pvu.LLIIIL(c64533PUj, read);
                }
                pvu.flush();
                AnonymousClass636.LJFF(LJI, null);
            } finally {
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public PUO(C39745Fin c39745Fin, File file) {
        this.LIZ = c39745Fin;
        this.LIZIZ = file;
    }
}

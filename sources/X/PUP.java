package X;

import java.io.File;

/* loaded from: classes12.dex */
public final class PUP extends PVP {
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
        PUE pue = null;
        try {
            pue = PU7.LJI(this.LIZIZ);
            pvu.j(pue);
        } finally {
            PVA.LJ(pue);
        }
    }

    public PUP(C39745Fin c39745Fin, File file) {
        this.LIZ = c39745Fin;
        this.LIZIZ = file;
    }
}

package X;

import java.io.File;

/* renamed from: X.0EE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0EE {
    public final String LIZ;
    public final long[] LIZIZ;
    public boolean LIZJ;
    public C0ED LIZLLL;
    public final /* synthetic */ C0EG LJ;

    public final String LIZJ() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.LIZIZ) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    public final File LIZ(int i) {
        File file = this.LJ.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        return new File(file, C40084FoG.LIZ(LIZ, this.LIZ, ".", i, LIZ));
    }

    public final File LIZIZ(int i) {
        File file = this.LJ.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        C0EH.LIZLLL(LIZ, this.LIZ, ".", i, ".tmp");
        return new File(file, X1D.LIZIZ(LIZ));
    }

    public C0EE(C0EG c0eg, String str) {
        this.LJ = c0eg;
        this.LIZ = str;
        this.LIZIZ = new long[c0eg.LJLJL];
    }
}

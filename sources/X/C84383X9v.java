package X;

import java.io.File;

/* renamed from: X.X9v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84383X9v {
    public final String LIZ;
    public final long[] LIZIZ;
    public boolean LIZJ;
    public C84384X9w LIZLLL;
    public final /* synthetic */ C84382X9u LJ;

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

    public C84383X9v(C84382X9u c84382X9u, String str) {
        this.LJ = c84382X9u;
        this.LIZ = str;
        this.LIZIZ = new long[c84382X9u.LJLJJLL];
    }
}

package X;

import java.io.File;

/* renamed from: X.X9r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84379X9r {
    public final String LIZ;
    public final long[] LIZIZ;
    public final File[] LIZJ;
    public final File[] LIZLLL;
    public boolean LJ;
    public C84380X9s LJFF;
    public final /* synthetic */ C84378X9q LJI;

    public final String LIZ() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.LIZIZ) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    public C84379X9r(C84378X9q c84378X9q, String str) {
        this.LJI = c84378X9q;
        this.LIZ = str;
        int i = c84378X9q.LJLJL;
        this.LIZIZ = new long[i];
        this.LIZJ = new File[i];
        this.LIZLLL = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < c84378X9q.LJLJL; i2++) {
            sb.append(i2);
            this.LIZJ[i2] = new File(c84378X9q.LJLIL, sb.toString());
            sb.append(".tmp");
            this.LIZLLL[i2] = new File(c84378X9q.LJLIL, sb.toString());
            sb.setLength(length);
        }
    }
}

package X;

import java.nio.ByteBuffer;

/* renamed from: X.08E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08E {
    public static final ThreadLocal<C29351Df> LIZLLL = new ThreadLocal<>();
    public final int LIZ;
    public final C08N LIZIZ;
    public volatile int LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.1Df, java.lang.Object] */
    public final C29351Df LIZJ() {
        ThreadLocal threadLocal = LIZLLL;
        C29351Df c29351Df = (C29351Df) threadLocal.get();
        C29351Df c29351Df2 = c29351Df;
        if (c29351Df == null) {
            ?? r4 = new C0DY() { // from class: X.1Df
            };
            threadLocal.set(r4);
            c29351Df2 = r4;
        }
        C29361Dg c29361Dg = this.LIZIZ.LIZ;
        int i = this.LIZ;
        int LIZ = c29361Dg.LIZ(6);
        if (LIZ != 0) {
            int i2 = LIZ + c29361Dg.LIZ;
            int i3 = (i * 4) + c29361Dg.LIZIZ.getInt(i2) + i2 + 4;
            c29351Df2.LIZIZ(c29361Dg.LIZIZ.getInt(i3) + i3, c29361Dg.LIZIZ);
        }
        return c29351Df2;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C29351Df LIZJ = LIZJ();
        int LIZ = LIZJ.LIZ(4);
        if (LIZ != 0) {
            i = LIZJ.LIZIZ.getInt(LIZ + LIZJ.LIZ);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        int LIZIZ = LIZIZ();
        for (int i2 = 0; i2 < LIZIZ; i2++) {
            sb.append(Integer.toHexString(LIZ(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public final int LIZIZ() {
        C29351Df LIZJ = LIZJ();
        int LIZ = LIZJ.LIZ(16);
        if (LIZ != 0) {
            int i = LIZ + LIZJ.LIZ;
            return LIZJ.LIZIZ.getInt(LIZJ.LIZIZ.getInt(i) + i);
        }
        return 0;
    }

    public final int LIZ(int i) {
        C29351Df LIZJ = LIZJ();
        int LIZ = LIZJ.LIZ(16);
        if (LIZ != 0) {
            ByteBuffer byteBuffer = LIZJ.LIZIZ;
            int i2 = LIZ + LIZJ.LIZ;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    public C08E(C08N c08n, int i) {
        this.LIZIZ = c08n;
        this.LIZ = i;
    }
}

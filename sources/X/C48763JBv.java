package X;

/* renamed from: X.JBv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48763JBv {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ = 2;
    public long LIZLLL;

    public final void LIZ() {
        if (this.LIZJ == 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
            if (currentTimeMillis < 3600000) {
                this.LIZ += currentTimeMillis;
            }
            this.LIZIZ = 0L;
            this.LIZJ = 1;
        }
    }
}

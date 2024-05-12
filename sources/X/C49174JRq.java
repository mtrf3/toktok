package X;

/* renamed from: X.JRq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49174JRq {
    public final C49181JRx LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public String LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{type='");
        LIZ.append(this.LIZIZ);
        LIZ.append("', position=");
        LIZ.append(this.LIZJ);
        LIZ.append(", key='");
        return JBR.LJFF(LIZ, this.LIZLLL, "'}", LIZ);
    }

    public C49174JRq(C49181JRx c49181JRx, String str) {
        this.LIZ = c49181JRx;
        this.LIZIZ = str;
        this.LIZJ = c49181JRx.getLayoutPosition();
        if (c49181JRx.L() != null) {
            this.LIZLLL = c49181JRx.L().LJLIL;
        }
    }
}

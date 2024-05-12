package X;

/* renamed from: X.JDs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48812JDs {
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(JEM.LJLIL);
    public final JE0 LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;
    public Integer LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append("{Limits: port(");
        LIZ.append(this.LIZIZ);
        LIZ.append(", ");
        LIZ.append(this.LIZJ);
        LIZ.append("), land(");
        LIZ.append(this.LIZLLL);
        LIZ.append(", ");
        LIZ.append(this.LJ);
        LIZ.append(")}");
        return X1D.LIZIZ(LIZ);
    }

    public C48812JDs(JE0 je0, Integer num, Integer num2, int i) {
        je0 = (i & 1) != 0 ? JE0.DEFAULT : je0;
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 8) != 0 ? null : num2;
        this.LIZ = je0;
        this.LIZIZ = null;
        this.LIZJ = num;
        this.LIZLLL = num2;
        this.LJ = null;
    }
}

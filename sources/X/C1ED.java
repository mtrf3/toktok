package X;

/* renamed from: X.1ED, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1ED extends C0FO {
    public C07350Qp[] LIZ;
    public String LIZIZ;
    public int LIZJ;
    public final int LIZLLL;

    public C1ED() {
    }

    public C07350Qp[] getPathData() {
        return this.LIZ;
    }

    public String getPathName() {
        return this.LIZIZ;
    }

    public C1ED(C1ED c1ed) {
        this.LIZIZ = c1ed.LIZIZ;
        this.LIZLLL = c1ed.LIZLLL;
        this.LIZ = C07360Qq.LJ(c1ed.LIZ);
    }

    public void setPathData(C07350Qp[] c07350QpArr) {
        if (!C07360Qq.LIZ(this.LIZ, c07350QpArr)) {
            this.LIZ = C07360Qq.LJ(c07350QpArr);
            return;
        }
        C07350Qp[] c07350QpArr2 = this.LIZ;
        for (int i = 0; i < c07350QpArr.length; i++) {
            c07350QpArr2[i].LIZ = c07350QpArr[i].LIZ;
            int i2 = 0;
            while (true) {
                float[] fArr = c07350QpArr[i].LIZIZ;
                if (i2 < fArr.length) {
                    c07350QpArr2[i].LIZIZ[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }
}

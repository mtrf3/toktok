package X;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: X.Zg5, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90537Zg5 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public float[] LJIIIIZZ;

    public final void LIZ() {
        int LJIIL;
        int LJIIL2;
        if (!this.LJFF) {
            int LJIIIIZZ = C07290Qj.LJIIIIZZ(4.5f, -1, this.LIZLLL);
            int LJIIIIZZ2 = C07290Qj.LJIIIIZZ(3.0f, -1, this.LIZLLL);
            if (LJIIIIZZ != -1 && LJIIIIZZ2 != -1) {
                this.LJII = C07290Qj.LJIIL(-1, LJIIIIZZ);
                this.LJI = C07290Qj.LJIIL(-1, LJIIIIZZ2);
                this.LJFF = true;
                return;
            }
            int LJIIIIZZ3 = C07290Qj.LJIIIIZZ(4.5f, -16777216, this.LIZLLL);
            int LJIIIIZZ4 = C07290Qj.LJIIIIZZ(3.0f, -16777216, this.LIZLLL);
            if (LJIIIIZZ3 != -1 && LJIIIIZZ4 != -1) {
                this.LJII = C07290Qj.LJIIL(-16777216, LJIIIIZZ3);
                this.LJI = C07290Qj.LJIIL(-16777216, LJIIIIZZ4);
                this.LJFF = true;
                return;
            }
            if (LJIIIIZZ != -1) {
                LJIIL = C07290Qj.LJIIL(-1, LJIIIIZZ);
            } else {
                LJIIL = C07290Qj.LJIIL(-16777216, LJIIIIZZ3);
            }
            this.LJII = LJIIL;
            if (LJIIIIZZ2 != -1) {
                LJIIL2 = C07290Qj.LJIIL(-1, LJIIIIZZ2);
            } else {
                LJIIL2 = C07290Qj.LJIIL(-16777216, LJIIIIZZ4);
            }
            this.LJI = LJIIL2;
            this.LJFF = true;
        }
    }

    public final float[] LIZIZ() {
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new float[3];
        }
        C07290Qj.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LJIIIIZZ);
        return this.LJIIIIZZ;
    }

    public final int hashCode() {
        return (this.LIZLLL * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C16880lQ.LJLLJ(C90537Zg5.class));
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.LIZLLL));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(LIZIZ()));
        sb.append("] [Population: ");
        sb.append(this.LJ);
        sb.append("] [Title Text: #");
        LIZ();
        sb.append(Integer.toHexString(this.LJI));
        sb.append("] [Body Text: #");
        LIZ();
        sb.append(Integer.toHexString(this.LJII));
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C90537Zg5.class != obj.getClass()) {
            return false;
        }
        C90537Zg5 c90537Zg5 = (C90537Zg5) obj;
        if (this.LJ == c90537Zg5.LJ && this.LIZLLL == c90537Zg5.LIZLLL) {
            return true;
        }
        return false;
    }

    public C90537Zg5(int i, int i2) {
        this.LIZ = Color.red(i);
        this.LIZIZ = Color.green(i);
        this.LIZJ = Color.blue(i);
        this.LIZLLL = i;
        this.LJ = i2;
    }
}

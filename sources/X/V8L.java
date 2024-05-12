package X;

import java.util.Arrays;

/* loaded from: classes14.dex */
public final class V8L {
    public V8K LIZ = V8K.BITMAP_ONLY;
    public boolean LIZIZ;
    public float[] LIZJ;
    public int LIZLLL;
    public float LJ;
    public int LJFF;
    public float LJI;
    public boolean LJII;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        V8K v8k = this.LIZ;
        int i4 = 0;
        if (v8k != null) {
            i = v8k.hashCode();
        } else {
            i = 0;
        }
        int i5 = ((i * 31) + (this.LIZIZ ? 1 : 0)) * 31;
        float[] fArr = this.LIZJ;
        if (fArr != null) {
            i2 = Arrays.hashCode(fArr);
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.LIZLLL) * 31;
        float f = this.LJ;
        if (f != 0.0f) {
            i3 = Float.floatToIntBits(f);
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.LJFF) * 31;
        float f2 = this.LJI;
        if (f2 != 0.0f) {
            i4 = Float.floatToIntBits(f2);
        }
        return ((i7 + i4) * 31) + (this.LJII ? 1 : 0);
    }

    public static V8L LIZ(float[] fArr) {
        boolean z;
        V8L v8l = new V8L();
        if (fArr.length == 8) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJFF("radii should have exactly 8 values", z);
        if (v8l.LIZJ == null) {
            v8l.LIZJ = new float[8];
        }
        System.arraycopy(fArr, 0, v8l.LIZJ, 0, 8);
        return v8l;
    }

    public static V8L LIZIZ(float f) {
        V8L v8l = new V8L();
        v8l.LJFF(f);
        return v8l;
    }

    public final void LIZLLL(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJFF("the border width cannot be < 0", z);
        this.LJ = f;
    }

    public final void LJFF(float f) {
        if (this.LIZJ == null) {
            this.LIZJ = new float[8];
        }
        Arrays.fill(this.LIZJ, f);
    }

    public final void LJI(int i) {
        this.LIZLLL = i;
        this.LIZ = V8K.OVERLAY_COLOR;
    }

    public final void LJII(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJFF("the padding cannot be < 0", z);
        this.LJI = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V8L.class != obj.getClass()) {
            return false;
        }
        V8L v8l = (V8L) obj;
        if (this.LIZIZ != v8l.LIZIZ || this.LIZLLL != v8l.LIZLLL || Float.compare(v8l.LJ, this.LJ) != 0 || this.LJFF != v8l.LJFF || Float.compare(v8l.LJI, this.LJI) != 0 || this.LIZ != v8l.LIZ || this.LJII != v8l.LJII) {
            return false;
        }
        return Arrays.equals(this.LIZJ, v8l.LIZJ);
    }

    public final void LIZJ(float f, int i) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJFF("the border width cannot be < 0", z);
        this.LJ = f;
        this.LJFF = i;
    }

    public final void LJ(float f, float f2, float f3, float f4) {
        if (this.LIZJ == null) {
            this.LIZJ = new float[8];
        }
        float[] fArr = this.LIZJ;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
    }
}

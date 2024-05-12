package X;

import java.util.Arrays;

/* renamed from: X.0BO, reason: invalid class name */
/* loaded from: classes.dex */
public class C0BO {
    public final long[] LIZ;
    public final boolean[] LIZIZ;
    public final int[] LIZJ;
    public boolean LIZLLL;

    public final int[] LIZ() {
        boolean z;
        synchronized (this) {
            if (!this.LIZLLL) {
                return null;
            }
            int length = this.LIZ.length;
            for (int i = 0; i < length; i++) {
                int i2 = 1;
                if (this.LIZ[i] > 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean[] zArr = this.LIZIZ;
                if (z != zArr[i]) {
                    int[] iArr = this.LIZJ;
                    if (!z) {
                        i2 = 2;
                    }
                    iArr[i] = i2;
                } else {
                    this.LIZJ[i] = 0;
                }
                zArr[i] = z;
            }
            this.LIZLLL = false;
            return (int[]) this.LIZJ.clone();
        }
    }

    public final void LIZLLL() {
        synchronized (this) {
            Arrays.fill(this.LIZIZ, false);
            this.LIZLLL = true;
        }
    }

    public C0BO(int i) {
        long[] jArr = new long[i];
        this.LIZ = jArr;
        boolean[] zArr = new boolean[i];
        this.LIZIZ = zArr;
        this.LIZJ = new int[i];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    public final boolean LIZIZ(int... iArr) {
        boolean z;
        synchronized (this) {
            z = false;
            for (int i : iArr) {
                long[] jArr = this.LIZ;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.LIZLLL = true;
                }
            }
        }
        return z;
    }

    public final boolean LIZJ(int... iArr) {
        boolean z;
        synchronized (this) {
            z = false;
            for (int i : iArr) {
                long[] jArr = this.LIZ;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    z = true;
                    this.LIZLLL = true;
                }
            }
        }
        return z;
    }
}

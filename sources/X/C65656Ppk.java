package X;

import defpackage.g0;
import java.util.Arrays;

/* renamed from: X.Ppk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65656Ppk<K> {
    public transient Object[] LIZ;
    public transient int[] LIZIZ;
    public transient int LIZJ;
    public transient int[] LIZLLL;
    public transient long[] LJ;
    public transient float LJFF;
    public transient int LJI;

    public C65656Ppk() {
        LIZJ(3);
    }

    public C65656Ppk(C65656Ppk<? extends K> c65656Ppk) {
        LIZJ(c65656Ppk.LIZJ);
        if (c65656Ppk.LIZJ == 0) {
            return;
        }
        int i = 0;
        do {
            C76917UGr.LJFF(i, c65656Ppk.LIZJ);
            Object obj = c65656Ppk.LIZ[i];
            C76917UGr.LJFF(i, c65656Ppk.LIZJ);
            LIZLLL(c65656Ppk.LIZIZ[i], obj);
            i++;
            if (i >= c65656Ppk.LIZJ) {
                return;
            }
        } while (i != -1);
    }

    public final void LIZ(int i) {
        if (i > this.LJ.length) {
            LJ(i);
        }
        if (i >= this.LJI) {
            LJFF(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    public final int LIZIZ(Object obj) {
        int LJIJJLI = C1FP.LJIJJLI(obj);
        int i = this.LIZLLL[(r1.length - 1) & LJIJJLI];
        while (i != -1) {
            long j = this.LJ[i];
            if (((int) (j >>> 32)) == LJIJJLI && C78886Uxe.LJIIIIZZ(obj, this.LIZ[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public final void LIZJ(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LIZJ("Initial capacity must be non-negative", z);
        int LJ = C1FP.LJ(1.0f, i);
        int[] iArr = new int[LJ];
        Arrays.fill(iArr, -1);
        this.LIZLLL = iArr;
        this.LJFF = 1.0f;
        this.LIZ = new Object[i];
        this.LIZIZ = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.LJ = jArr;
        this.LJI = Math.max(1, (int) (LJ * 1.0f));
    }

    public final void LJ(int i) {
        this.LIZ = Arrays.copyOf(this.LIZ, i);
        this.LIZIZ = Arrays.copyOf(this.LIZIZ, i);
        long[] jArr = this.LJ;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.LJ = copyOf;
    }

    public final void LJFF(int i) {
        if (this.LIZLLL.length >= 1073741824) {
            this.LJI = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.LJFF)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.LJ;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.LIZJ; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (i5 << 32) | (i7 & 4294967295L);
        }
        this.LJI = i2;
        this.LIZLLL = iArr;
    }

    public C65656Ppk(int i) {
        LIZJ(i);
    }

    public final void LIZLLL(int i, Object obj) {
        g0.LJIIIZ(i, "count");
        long[] jArr = this.LJ;
        Object[] objArr = this.LIZ;
        int[] iArr = this.LIZIZ;
        int LJIJJLI = C1FP.LJIJJLI(obj);
        int[] iArr2 = this.LIZLLL;
        int length = (iArr2.length - 1) & LJIJJLI;
        int i2 = this.LIZJ;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (((int) (j >>> 32)) == LJIJJLI && C78886Uxe.LJIIIIZZ(obj, objArr[i3])) {
                    iArr[i3] = i;
                    return;
                }
                int i4 = (int) j;
                if (i4 == -1) {
                    jArr[i3] = ((-4294967296L) & j) | (i2 & 4294967295L);
                    break;
                }
                i3 = i4;
            }
        }
        int i5 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            int i6 = i2 + 1;
            int length2 = this.LJ.length;
            if (i6 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max >= 0) {
                    i5 = max;
                }
                if (i5 != length2) {
                    LJ(i5);
                }
            }
            this.LJ[i2] = (LJIJJLI << 32) | 4294967295L;
            this.LIZ[i2] = obj;
            this.LIZIZ[i2] = i;
            this.LIZJ = i6;
            if (i2 >= this.LJI) {
                LJFF(this.LIZLLL.length * 2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }
}

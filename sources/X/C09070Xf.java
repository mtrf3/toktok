package X;

import android.R;
import kotlin.jvm.internal.o;

/* renamed from: X.0Xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09070Xf {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int[] LIZLLL;
    public final int[] LJ;
    public final int[] LJFF;
    public static final C09060Xe LJIIZILJ = new C09060Xe();
    public static final int[] LJI = new int[256];
    public static final int[] LJII = new int[256];
    public static final int[] LJIIIIZZ = new int[256];
    public static final int[] LJIIIZ = new int[256];
    public static final int[] LJIIJ = new int[256];
    public static final int[] LJIIJJI = new int[256];
    public static final int[] LJIIL = new int[256];
    public static final int[] LJIILIIL = new int[256];
    public static final int[] LJIILJJIL = new int[256];
    public static final int[] LJIILL = new int[256];
    public static final int[] LJIILLIIL = {0, 1, 2, 4, 8, 16, 32, 64, 128, 27, 54};

    static {
        int[] iArr = new int[256];
        int i = 0;
        loop0: while (true) {
            int i2 = i << 1;
            while (true) {
                iArr[i] = i2;
                i++;
                if (i >= 256) {
                    break loop0;
                } else if (i >= 128) {
                    i2 = (i << 1) ^ 283;
                }
            }
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        do {
            int i6 = ((((i4 << 1) ^ i4) ^ (i4 << 2)) ^ (i4 << 3)) ^ (i4 << 4);
            int i7 = ((i6 & 255) ^ (i6 >>> 8)) ^ 99;
            LJI[i5] = i7;
            LJII[i7] = i5;
            int i8 = iArr[i5];
            int i9 = iArr[i8];
            int i10 = iArr[i9];
            int i11 = (iArr[i7] * 257) ^ (i7 * R.attr.transcriptMode);
            LJIIIIZZ[i5] = (i11 << 24) | (i11 >>> 8);
            LJIIIZ[i5] = (i11 << 16) | (i11 >>> 16);
            LJIIJ[i5] = (i11 << 8) | (i11 >>> 24);
            LJIIJJI[i5] = i11 << 0;
            int i12 = (((i9 * 65537) ^ (R.attr.cacheColorHint * i10)) ^ (i8 * 257)) ^ (R.attr.transcriptMode * i5);
            LJIIL[i7] = (i12 << 24) | (i12 >>> 8);
            LJIILIIL[i7] = (i12 << 16) | (i12 >>> 16);
            LJIILJJIL[i7] = (i12 << 8) | (i12 >>> 24);
            LJIILL[i7] = i12 << 0;
            if (i5 == 0) {
                i4 = 1;
                i5 = 1;
            } else {
                i5 = iArr[iArr[iArr[i10 ^ i8]]] ^ i8;
                i4 ^= iArr[iArr[i4]];
            }
            i3++;
        } while (i3 < 256);
    }

    public C09070Xf(byte[] key) {
        int i;
        int i2;
        o.LJIIJ(key, "key");
        LJIIZILJ.getClass();
        int[] LIZIZ = C09060Xe.LIZIZ(key);
        this.LJFF = LIZIZ;
        int length = LIZIZ.length;
        this.LIZ = length;
        int i3 = length + 6;
        this.LIZIZ = i3;
        int i4 = (i3 + 1) * 4;
        this.LIZJ = i4;
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.LIZ;
            if (i5 < i6) {
                i2 = this.LJFF[i5];
            } else {
                int i7 = iArr[i5 - 1];
                int i8 = i5 % i6;
                if (i8 == 0) {
                    int i9 = (i7 >>> 24) | (i7 << 8);
                    int[] iArr2 = LJI;
                    i7 = (iArr2[i9 & 255] | (((iArr2[(i9 >>> 24) & 255] << 24) | (iArr2[(i9 >>> 16) & 255] << 16)) | (iArr2[(i9 >>> 8) & 255] << 8))) ^ (LJIILLIIL[i5 / i6] << 24);
                } else if (i6 > 6 && i8 == 4) {
                    int[] iArr3 = LJI;
                    i7 = iArr3[i7 & 255] | (iArr3[(i7 >>> 24) & 255] << 24) | (iArr3[(i7 >>> 16) & 255] << 16) | (iArr3[(i7 >>> 8) & 255] << 8);
                }
                i2 = iArr[i5 - i6] ^ i7;
            }
            iArr[i5] = i2;
        }
        this.LIZLLL = iArr;
        int i10 = this.LIZJ;
        int[] iArr4 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.LIZJ - i11;
            if (i11 % 4 != 0) {
                i = this.LIZLLL[i12];
            } else {
                i = this.LIZLLL[i12 - 4];
            }
            if (i11 >= 4 && i12 > 4) {
                int[] iArr5 = LJIIL;
                int[] iArr6 = LJI;
                i = LJIILL[iArr6[i & 255]] ^ ((iArr5[iArr6[(i >>> 24) & 255]] ^ LJIILIIL[iArr6[(i >>> 16) & 255]]) ^ LJIILJJIL[iArr6[(i >>> 8) & 255]]);
            }
            iArr4[i11] = i;
        }
        this.LJ = iArr4;
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09060Xe {
    public static int[] LIZIZ(byte[] bArr) {
        int length = bArr.length / 4;
        int[] iArr = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            int i4 = bArr[i] & 255;
            int i5 = i3 + 1;
            int i6 = bArr[i3] & 255;
            int i7 = i5 + 1;
            int i8 = bArr[i5] & 255;
            i = i7 + 1;
            iArr[i2] = (i4 << 24) | (i6 << 16) | (i8 << 8) | ((bArr[i7] & 255) << 0);
        }
        return iArr;
    }

    public static byte[] LIZ(byte[] bArr, byte[] key, byte[] iv, EnumC09150Xn padding) {
        int i;
        byte[] bArr2;
        o.LJIIJ(key, "key");
        o.LJIIJ(iv, "iv");
        o.LJIIJ(padding, "padding");
        C09070Xf c09070Xf = new C09070Xf(key);
        int[] LIZIZ = LIZIZ(bArr);
        int length = LIZIZ.length;
        byte[] bArr3 = new byte[16];
        if (iv.length < 16) {
            i = iv.length;
        } else {
            i = 16;
        }
        char c = 0;
        C78949Uyf.LJIIIZ(iv, 0, 0, bArr3, i);
        int[] LIZIZ2 = LIZIZ(bArr3);
        int i2 = LIZIZ2[0];
        char c2 = 1;
        int i3 = LIZIZ2[1];
        char c3 = 2;
        int i4 = LIZIZ2[2];
        char c4 = 3;
        int i5 = LIZIZ2[3];
        C40511Fv9 LJIL = C78842Uww.LJIL(C78842Uww.LJJ(0, length), 4);
        int i6 = LJIL.LJLIL;
        int i7 = LJIL.LJLILLLLZI;
        int i8 = LJIL.LJLJI;
        if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
            while (true) {
                int i9 = LIZIZ[i6];
                int i10 = i6 + 1;
                int i11 = LIZIZ[i10];
                int i12 = i6 + 2;
                int i13 = LIZIZ[i12];
                int i14 = i6 + 3;
                int i15 = LIZIZ[i14];
                LIZIZ[i10] = i15;
                LIZIZ[i14] = i11;
                int[] iArr = c09070Xf.LJ;
                int[] iArr2 = C09070Xf.LJIIL;
                int[] iArr3 = C09070Xf.LJIILIIL;
                int[] iArr4 = C09070Xf.LJIILJJIL;
                int[] iArr5 = C09070Xf.LJIILL;
                int[] iArr6 = C09070Xf.LJII;
                int i16 = LIZIZ[i6] ^ iArr[c];
                int i17 = LIZIZ[i10] ^ iArr[c2];
                int i18 = LIZIZ[i12] ^ iArr[c3];
                int i19 = iArr[c4] ^ i11;
                int i20 = c09070Xf.LIZIZ;
                int i21 = 1;
                int i22 = 4;
                while (i21 < i20) {
                    int i23 = i22 + 1;
                    int i24 = iArr[i22] ^ (((iArr2[(i16 >>> 24) & 255] ^ iArr3[(i17 >>> 16) & 255]) ^ iArr4[(i18 >>> 8) & 255]) ^ iArr5[(i19 >>> 0) & 255]);
                    int i25 = i23 + 1;
                    int i26 = (((iArr3[(i18 >>> 16) & 255] ^ iArr2[(i17 >>> 24) & 255]) ^ iArr4[(i19 >>> 8) & 255]) ^ iArr5[(i16 >>> 0) & 255]) ^ iArr[i23];
                    int i27 = i25 + 1;
                    int i28 = (((iArr3[(i19 >>> 16) & 255] ^ iArr2[(i18 >>> 24) & 255]) ^ iArr4[(i16 >>> 8) & 255]) ^ iArr5[(i17 >>> 0) & 255]) ^ iArr[i25];
                    i22 = i27 + 1;
                    i19 = (((iArr3[(i16 >>> 16) & 255] ^ iArr2[(i19 >>> 24) & 255]) ^ iArr4[(i17 >>> 8) & 255]) ^ iArr5[(i18 >>> 0) & 255]) ^ iArr[i27];
                    i21++;
                    i17 = i26;
                    i16 = i24;
                    i18 = i28;
                }
                int i29 = i22 + 1;
                int i30 = ((((iArr6[(i16 >>> 24) & 255] << 24) | (iArr6[(i17 >>> 16) & 255] << 16)) | (iArr6[(i18 >>> 8) & 255] << 8)) | iArr6[(i19 >>> 0) & 255]) ^ iArr[i22];
                int i31 = i29 + 1;
                int i32 = iArr[i29] ^ ((((iArr6[(i17 >>> 24) & 255] << 24) | (iArr6[(i18 >>> 16) & 255] << 16)) | (iArr6[(i19 >>> 8) & 255] << 8)) | iArr6[(i16 >>> 0) & 255]);
                int i33 = ((((iArr6[(i18 >>> 24) & 255] << 24) | (iArr6[(i19 >>> 16) & 255] << 16)) | (iArr6[(i16 >>> 8) & 255] << 8)) | iArr6[(i17 >>> 0) & 255]) ^ iArr[i31];
                int i34 = ((((iArr6[(i19 >>> 24) & 255] << 24) | (iArr6[(i16 >>> 16) & 255] << 16)) | (iArr6[(i17 >>> 8) & 255] << 8)) | iArr6[(i18 >>> 0) & 255]) ^ iArr[i31 + 1];
                LIZIZ[i6] = i30;
                LIZIZ[i10] = i32;
                LIZIZ[i12] = i33;
                LIZIZ[i14] = i34;
                int i35 = LIZIZ[i10];
                LIZIZ[i10] = i34;
                LIZIZ[i14] = i35;
                LIZIZ[i6] = LIZIZ[i6] ^ i2;
                LIZIZ[i10] = LIZIZ[i10] ^ i3;
                LIZIZ[i12] = LIZIZ[i12] ^ i4;
                LIZIZ[i14] = i5 ^ LIZIZ[i14];
                if (i6 == i7) {
                    break;
                }
                i6 += i8;
                i2 = i9;
                i3 = i11;
                i4 = i13;
                i5 = i15;
                c2 = 1;
                c = 0;
                c3 = 2;
                c4 = 3;
            }
        }
        C09140Xm c09140Xm = EnumC09150Xn.Companion;
        int length2 = LIZIZ.length * 4;
        byte[] bArr4 = new byte[length2];
        int i36 = 0;
        for (int i37 : LIZIZ) {
            int i38 = i36 + 1;
            bArr4[i36] = (byte) ((i37 >> 24) & 255);
            int i39 = i38 + 1;
            bArr4[i38] = (byte) ((i37 >> 16) & 255);
            int i40 = i39 + 1;
            bArr4[i39] = (byte) ((i37 >> 8) & 255);
            i36 = i40 + 1;
            bArr4[i40] = (byte) ((i37 >> 0) & 255);
        }
        c09140Xm.getClass();
        int i41 = C09130Xl.LIZ[padding.ordinal()];
        if (i41 != 1) {
            if (i41 != 2 && i41 != 3 && i41 != 4) {
                if (i41 == 5) {
                    int i42 = 0;
                    for (int i43 = length2 - 1; i43 >= 0 && bArr4[i43] == 0; i43--) {
                        i42++;
                    }
                    int i44 = length2 - i42;
                    bArr2 = new byte[i44];
                    C78949Uyf.LJIIIZ(bArr4, 0, 0, bArr2, i44);
                } else {
                    throw new C162476Zf();
                }
            } else {
                int i45 = length2 - (bArr4[length2 - 1] & 255);
                bArr2 = new byte[i45];
                C78949Uyf.LJIIIZ(bArr4, 0, 0, bArr2, i45);
            }
            return bArr2;
        }
        return bArr4;
    }
}

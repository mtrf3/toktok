package X;

/* renamed from: X.YIg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87150YIg {
    public static int LIZIZ(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long LJIILIIL(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int LIZ(byte[] bArr, int i, C87175YJf c87175YJf) {
        int LJIIIZ = LJIIIZ(bArr, i, c87175YJf);
        int i2 = c87175YJf.LIZ;
        if (i2 >= 0) {
            if (i2 <= bArr.length - LJIIIZ) {
                if (i2 == 0) {
                    c87175YJf.LIZJ = AbstractC87134YHq.zzb;
                    return LJIIIZ;
                }
                c87175YJf.LIZJ = AbstractC87134YHq.zzl(bArr, LJIIIZ, i2);
                return LJIIIZ + i2;
            }
            throw C87144YIa.LIZJ();
        }
        throw C87144YIa.LIZIZ();
    }

    public static int LJI(byte[] bArr, int i, C87175YJf c87175YJf) {
        int LJIIIZ = LJIIIZ(bArr, i, c87175YJf);
        int i2 = c87175YJf.LIZ;
        if (i2 >= 0) {
            if (i2 == 0) {
                c87175YJf.LIZJ = "";
                return LJIIIZ;
            }
            c87175YJf.LIZJ = new String(bArr, LJIIIZ, i2, YIG.LIZ);
            return LJIIIZ + i2;
        }
        throw C87144YIa.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJII(byte[] r12, int r13, X.C87175YJf r14) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87150YIg.LJII(byte[], int, X.YJf):int");
    }

    public static int LJIIIZ(byte[] bArr, int i, C87175YJf c87175YJf) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c87175YJf.LIZ = b;
            return i2;
        }
        return LJIIJ(b, bArr, i2, c87175YJf);
    }

    public static int LJIIL(byte[] bArr, int i, C87175YJf c87175YJf) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c87175YJf.LIZIZ = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            i3++;
        }
        c87175YJf.LIZIZ = j2;
        return i3;
    }

    public static int LJFF(byte[] bArr, int i, XM7 xm7, C87175YJf c87175YJf) {
        C84684XLk c84684XLk = (C84684XLk) xm7;
        int LJIIIZ = LJIIIZ(bArr, i, c87175YJf);
        int i2 = c87175YJf.LIZ + LJIIIZ;
        while (LJIIIZ < i2) {
            LJIIIZ = LJIIIZ(bArr, LJIIIZ, c87175YJf);
            c84684XLk.LJFF(c87175YJf.LIZ);
        }
        if (LJIIIZ == i2) {
            return LJIIIZ;
        }
        throw C87144YIa.LIZJ();
    }

    public static int LJIIJ(int i, byte[] bArr, int i2, C87175YJf c87175YJf) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c87175YJf.LIZ = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c87175YJf.LIZ = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c87175YJf.LIZ = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c87175YJf.LIZ = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c87175YJf.LIZ = i11;
                return i12;
            }
        }
    }

    public static int LIZLLL(YIV yiv, byte[] bArr, int i, int i2, C87175YJf c87175YJf) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = LJIIJ(i4, bArr, i3, c87175YJf);
            i4 = c87175YJf.LIZ;
        }
        if (i4 >= 0 && i4 <= i2 - i3) {
            Object LJ = yiv.LJ();
            int i5 = i4 + i3;
            yiv.LJII(LJ, bArr, i3, i5, c87175YJf);
            yiv.LIZIZ(LJ);
            c87175YJf.LIZJ = LJ;
            return i5;
        }
        throw C87144YIa.LIZJ();
    }

    public static int LIZJ(YIV yiv, byte[] bArr, int i, int i2, int i3, C87175YJf c87175YJf) {
        C87151YIh c87151YIh = (C87151YIh) yiv;
        Object LJ = c87151YIh.LJ();
        int LJJ = c87151YIh.LJJ(LJ, bArr, i, i2, i3, c87175YJf);
        c87151YIh.LIZIZ(LJ);
        c87175YJf.LIZJ = LJ;
        return LJJ;
    }

    public static int LJIIIIZZ(int i, byte[] bArr, int i2, int i3, C87157YIn c87157YIn, C87175YJf c87175YJf) {
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                c87157YIn.LIZJ(i, Integer.valueOf(LIZIZ(i4, bArr)));
                                return i4 + 4;
                            }
                            throw new C87144YIa("Protocol message contained an invalid tag (zero).");
                        }
                        int i6 = (i & (-8)) | 4;
                        C87157YIn LIZIZ = C87157YIn.LIZIZ();
                        int i7 = 0;
                        while (i4 < i3) {
                            i4 = LJIIIZ(bArr, i4, c87175YJf);
                            i7 = c87175YJf.LIZ;
                            if (i7 == i6) {
                                break;
                            }
                            i4 = LJIIIIZZ(i7, bArr, i4, i3, LIZIZ, c87175YJf);
                        }
                        if (i4 <= i3 && i7 == i6) {
                            c87157YIn.LIZJ(i, LIZIZ);
                            return i4;
                        }
                        throw new C87144YIa("Failed to parse the message.");
                    }
                    int LJIIIZ = LJIIIZ(bArr, i4, c87175YJf);
                    int i8 = c87175YJf.LIZ;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - LJIIIZ) {
                            if (i8 == 0) {
                                c87157YIn.LIZJ(i, AbstractC87134YHq.zzb);
                            } else {
                                c87157YIn.LIZJ(i, AbstractC87134YHq.zzl(bArr, LJIIIZ, i8));
                            }
                            return LJIIIZ + i8;
                        }
                        throw C87144YIa.LIZJ();
                    }
                    throw C87144YIa.LIZIZ();
                }
                c87157YIn.LIZJ(i, Long.valueOf(LJIILIIL(i4, bArr)));
                return i4 + 8;
            }
            int LJIIL = LJIIL(bArr, i4, c87175YJf);
            c87157YIn.LIZJ(i, Long.valueOf(c87175YJf.LIZIZ));
            return LJIIL;
        }
        throw new C87144YIa("Protocol message contained an invalid tag (zero).");
    }

    public static int LJIIJJI(int i, byte[] bArr, int i2, int i3, XM7 xm7, C87175YJf c87175YJf) {
        C84684XLk c84684XLk = (C84684XLk) xm7;
        int LJIIIZ = LJIIIZ(bArr, i2, c87175YJf);
        c84684XLk.LJFF(c87175YJf.LIZ);
        while (LJIIIZ < i3) {
            int LJIIIZ2 = LJIIIZ(bArr, LJIIIZ, c87175YJf);
            if (i != c87175YJf.LIZ) {
                break;
            }
            LJIIIZ = LJIIIZ(bArr, LJIIIZ2, c87175YJf);
            c84684XLk.LJFF(c87175YJf.LIZ);
        }
        return LJIIIZ;
    }

    public static int LJ(YIV yiv, int i, byte[] bArr, int i2, int i3, XM7 xm7, C87175YJf c87175YJf) {
        int LIZLLL = LIZLLL(yiv, bArr, i2, i3, c87175YJf);
        xm7.add(c87175YJf.LIZJ);
        while (LIZLLL < i3) {
            int LJIIIZ = LJIIIZ(bArr, LIZLLL, c87175YJf);
            if (i != c87175YJf.LIZ) {
                break;
            }
            LIZLLL = LIZLLL(yiv, bArr, LJIIIZ, i3, c87175YJf);
            xm7.add(c87175YJf.LIZJ);
        }
        return LIZLLL;
    }
}

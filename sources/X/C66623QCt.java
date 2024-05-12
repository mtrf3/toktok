package X;

/* renamed from: X.QCt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66623QCt {
    public static final char[] LIZ = {';', ','};

    public static C66619QCp LIZ(C66622QCs c66622QCs, C66624QCu c66624QCu) {
        boolean z;
        boolean z2;
        String LIZLLL;
        char c;
        char[] cArr = LIZ;
        int i = c66624QCu.LIZIZ;
        int i2 = c66624QCu.LIZ;
        int i3 = i;
        loop0: while (true) {
            z = true;
            if (i3 < i2 && (c = c66622QCs.LIZ[i3]) != '=') {
                int i4 = 0;
                while (c != cArr[i4]) {
                    i4++;
                    if (i4 < 2) {
                    }
                }
                z2 = true;
                break loop0;
            }
            break;
            i3++;
        }
        z2 = false;
        if (i3 == i2) {
            LIZLLL = c66622QCs.LIZLLL(i, i2);
        } else {
            LIZLLL = c66622QCs.LIZLLL(i, i3);
            i3++;
            if (!z2) {
                int i5 = i3;
                boolean z3 = false;
                boolean z4 = false;
                loop2: while (true) {
                    if (i5 < i2) {
                        char c2 = c66622QCs.LIZ[i5];
                        if (c2 == '\"' && !z3) {
                            z4 = !z4;
                        }
                        if (!z4) {
                            if (!z3) {
                                int i6 = 0;
                                while (c2 != cArr[i6]) {
                                    i6++;
                                    if (i6 < 2) {
                                    }
                                }
                                break loop2;
                            }
                        } else if (!z3 && z4 && c2 == '\\') {
                            z3 = true;
                            i5++;
                        }
                        z3 = false;
                        i5++;
                    } else {
                        z = false;
                        break;
                    }
                }
                while (i3 < i5 && C62814Ol0.LJJI(c66622QCs.LIZ[i3])) {
                    i3++;
                }
                int i7 = i5;
                while (i7 > i3) {
                    int i8 = i7 - 1;
                    if (!C62814Ol0.LJJI(c66622QCs.LIZ[i8])) {
                        break;
                    }
                    i7 = i8;
                }
                if (i7 - i3 >= 2) {
                    char[] cArr2 = c66622QCs.LIZ;
                    if (cArr2[i3] == '\"') {
                        int i9 = i7 - 1;
                        if (cArr2[i9] == '\"') {
                            i3++;
                            i7 = i9;
                        }
                    }
                }
                if (i3 >= 0) {
                    if (i7 <= c66622QCs.LIZIZ) {
                        if (i3 <= i7) {
                            String str = new String(c66622QCs.LIZ, i3, i7 - i3);
                            if (z) {
                                i5++;
                            }
                            c66624QCu.LIZ(i5);
                            return new C66619QCp(LIZLLL, str);
                        }
                        throw new IndexOutOfBoundsException();
                    }
                    throw new IndexOutOfBoundsException();
                }
                throw new IndexOutOfBoundsException();
            }
        }
        c66624QCu.LIZ(i3);
        return new C66619QCp(LIZLLL, null);
    }
}

package X;

/* loaded from: classes14.dex */
public final class V08 extends AbstractC79017Uzl {
    @Override // X.AbstractC79017Uzl
    public final boolean[] LIZIZ(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int length2 = ((str.length() + 2 + 2) * 9) + 1;
            LJI(V0F.LJLIL[47], iArr);
            boolean[] zArr = new boolean[length2];
            LIZLLL(zArr, 0, iArr);
            int i = 9;
            for (int i2 = 0; i2 < length; i2++) {
                LJI(V0F.LJLIL["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i2))], iArr);
                LIZLLL(zArr, i, iArr);
                i += 9;
            }
            int LJFF = LJFF(20, str);
            int[] iArr2 = V0F.LJLIL;
            LJI(iArr2[LJFF], iArr);
            LIZLLL(zArr, i, iArr);
            int i3 = i + 9;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(LJFF));
            LJI(iArr2[LJFF(15, X1D.LIZIZ(LIZ))], iArr);
            LIZLLL(zArr, i3, iArr);
            int i4 = i3 + 9;
            LJI(iArr2[47], iArr);
            LIZLLL(zArr, i4, iArr);
            zArr[i4 + 9] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }

    public static int LJFF(int i, String str) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    public static void LJI(int i, int[] iArr) {
        int i2 = 0;
        do {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
            i2++;
        } while (i2 < 9);
    }

    public static void LIZLLL(boolean[] zArr, int i, int[] iArr) {
        boolean z;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            if (iArr[i2] != 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i] = z;
            i2++;
            i = i3;
        }
    }

    @Override // X.AbstractC79017Uzl, X.V04
    public final C79007Uzb LJ(String str, V0B v0b, int i, int i2, java.util.Map<EnumC79013Uzh, ?> map) {
        if (v0b == V0B.CODE_93) {
            return super.LJ(str, v0b, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(v0b)));
    }
}

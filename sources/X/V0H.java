package X;

/* loaded from: classes14.dex */
public final class V0H extends V0L {
    @Override // X.AbstractC79017Uzl
    public final boolean[] LIZIZ(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!V0K.LLLLZ(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (C86001Xp7 unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = KMP.LJ(str, V0K.LLLLZIL(PTR.LLLLZLLIL(str)));
            } catch (C86001Xp7 e) {
                throw new IllegalArgumentException(e);
            }
        }
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i = PTR.LJLJJLL[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int LIZ = AbstractC79017Uzl.LIZ(zArr, 0, V0K.LJLIL, true);
            for (int i2 = 1; i2 <= 6; i2++) {
                int digit2 = Character.digit(str.charAt(i2), 10);
                if (((i >> (6 - i2)) & 1) == 1) {
                    digit2 += 10;
                }
                LIZ += AbstractC79017Uzl.LIZ(zArr, LIZ, V0K.LJLJJL[digit2], false);
            }
            AbstractC79017Uzl.LIZ(zArr, LIZ, V0K.LJLJI, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }

    @Override // X.AbstractC79017Uzl, X.V04
    public final C79007Uzb LJ(String str, V0B v0b, int i, int i2, java.util.Map<EnumC79013Uzh, ?> map) {
        if (v0b == V0B.UPC_E) {
            return super.LJ(str, v0b, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(v0b)));
    }
}

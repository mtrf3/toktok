package X;

/* loaded from: classes14.dex */
public final class V0I extends V0L {
    @Override // X.AbstractC79017Uzl
    public final boolean[] LIZIZ(String str) {
        int length = str.length();
        if (length != 12) {
            if (length == 13) {
                try {
                    if (!V0K.LLLLZ(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (C86001Xp7 unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = KMP.LJ(str, V0K.LLLLZIL(str));
            } catch (C86001Xp7 e) {
                throw new IllegalArgumentException(e);
            }
        }
        int i = V0M.LJLJJLL[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int LIZ = AbstractC79017Uzl.LIZ(zArr, 0, V0K.LJLIL, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            LIZ += AbstractC79017Uzl.LIZ(zArr, LIZ, V0K.LJLJJL[digit], false);
        }
        int LIZ2 = AbstractC79017Uzl.LIZ(zArr, LIZ, V0K.LJLILLLLZI, false) + LIZ;
        for (int i3 = 7; i3 <= 12; i3++) {
            LIZ2 += AbstractC79017Uzl.LIZ(zArr, LIZ2, V0K.LJLJJI[Character.digit(str.charAt(i3), 10)], true);
        }
        AbstractC79017Uzl.LIZ(zArr, LIZ2, V0K.LJLIL, true);
        return zArr;
    }

    @Override // X.AbstractC79017Uzl, X.V04
    public final C79007Uzb LJ(String str, V0B v0b, int i, int i2, java.util.Map<EnumC79013Uzh, ?> map) {
        if (v0b == V0B.EAN_13) {
            return super.LJ(str, v0b, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(v0b)));
    }
}

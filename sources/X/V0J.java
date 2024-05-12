package X;

/* loaded from: classes14.dex */
public final class V0J extends V0L {
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
                str = KMP.LJ(str, V0K.LLLLZIL(str));
            } catch (C86001Xp7 e) {
                throw new IllegalArgumentException(e);
            }
        }
        boolean[] zArr = new boolean[67];
        int LIZ = AbstractC79017Uzl.LIZ(zArr, 0, V0K.LJLIL, true);
        for (int i = 0; i <= 3; i++) {
            LIZ += AbstractC79017Uzl.LIZ(zArr, LIZ, V0K.LJLJJI[Character.digit(str.charAt(i), 10)], false);
        }
        int LIZ2 = AbstractC79017Uzl.LIZ(zArr, LIZ, V0K.LJLILLLLZI, false) + LIZ;
        for (int i2 = 4; i2 <= 7; i2++) {
            LIZ2 += AbstractC79017Uzl.LIZ(zArr, LIZ2, V0K.LJLJJI[Character.digit(str.charAt(i2), 10)], true);
        }
        AbstractC79017Uzl.LIZ(zArr, LIZ2, V0K.LJLIL, true);
        return zArr;
    }

    @Override // X.AbstractC79017Uzl, X.V04
    public final C79007Uzb LJ(String str, V0B v0b, int i, int i2, java.util.Map<EnumC79013Uzh, ?> map) {
        if (v0b == V0B.EAN_8) {
            return super.LJ(str, v0b, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(v0b)));
    }
}

package X;

/* loaded from: classes14.dex */
public final class V09 extends AbstractC79017Uzl {
    public static final int[] LJLIL = {1, 1, 1, 1};
    public static final int[] LJLILLLLZI = {3, 1, 1};
    public static final int[][] LJLJI = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // X.AbstractC79017Uzl
    public final boolean[] LIZIZ(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                boolean[] zArr = new boolean[(length * 9) + 9];
                int LIZ = AbstractC79017Uzl.LIZ(zArr, 0, LJLIL, true);
                for (int i = 0; i < length; i += 2) {
                    int digit = Character.digit(str.charAt(i), 10);
                    int digit2 = Character.digit(str.charAt(i + 1), 10);
                    int[] iArr = new int[10];
                    int i2 = 0;
                    do {
                        int i3 = i2 * 2;
                        int[][] iArr2 = LJLJI;
                        iArr[i3] = iArr2[digit][i2];
                        iArr[i3 + 1] = iArr2[digit2][i2];
                        i2++;
                    } while (i2 < 5);
                    LIZ += AbstractC79017Uzl.LIZ(zArr, LIZ, iArr, true);
                }
                AbstractC79017Uzl.LIZ(zArr, LIZ, LJLILLLLZI, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }

    @Override // X.AbstractC79017Uzl, X.V04
    public final C79007Uzb LJ(String str, V0B v0b, int i, int i2, java.util.Map<EnumC79013Uzh, ?> map) {
        if (v0b == V0B.ITF) {
            return super.LJ(str, v0b, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(v0b)));
    }
}

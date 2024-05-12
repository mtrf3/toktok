package X;

/* loaded from: classes14.dex */
public abstract class V0K extends QXX {
    public static final int[] LJLIL = {1, 1, 1};
    public static final int[] LJLILLLLZI = {1, 1, 1, 1, 1};
    public static final int[] LJLJI = {1, 1, 1, 1, 1, 1};
    public static final int[][] LJLJJI;
    public static final int[][] LJLJJL;

    static {
        int i = 10;
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        LJLJJI = iArr;
        int[][] iArr2 = new int[20];
        LJLJJL = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        do {
            int[] iArr3 = LJLJJI[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            LJLJJL[i] = iArr4;
            i++;
        } while (i < 20);
    }

    public static boolean LLLLZ(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        if (LLLLZIL(charSequence.subSequence(0, i)) != Character.digit(charSequence.charAt(i), 10)) {
            return false;
        }
        return true;
    }

    public static int LLLLZIL(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt >= 0 && charAt <= 9) {
                i += charAt;
            } else {
                throw C86001Xp7.getFormatInstance();
            }
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 >= 0 && charAt2 <= 9) {
                i3 += charAt2;
            } else {
                throw C86001Xp7.getFormatInstance();
            }
        }
        return (1000 - i3) % 10;
    }
}

package X;

/* renamed from: X.PNy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64366PNy extends QXX {
    public static final char[] LJLJI = {'+'};
    public static final char[] LJLJJI = "0123456789ABCDEF".toCharArray();
    public final boolean LJLIL;
    public final boolean[] LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LLLLZ(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64366PNy.LLLLZ(java.lang.String):java.lang.String");
    }

    public final char[] LLLLZIL(int i) {
        boolean[] zArr = this.LJLILLLLZI;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32 && this.LJLIL) {
            return LJLJI;
        }
        if (i <= 127) {
            char[] cArr = LJLJJI;
            return new char[]{'%', cArr[i >>> 4], cArr[i & 15]};
        }
        if (i <= 2047) {
            char[] cArr2 = LJLJJI;
            char[] cArr3 = {'%', cArr2[(r14 >>> 4) | 12], cArr2[r14 & 15], '%', cArr2[(r14 & 3) | 8], cArr2[i & 15]};
            int i2 = i >>> 4;
            int i3 = i2 >>> 2;
            return cArr3;
        }
        if (i <= 65535) {
            char[] cArr4 = LJLJJI;
            char[] cArr5 = {'%', 'E', cArr4[r14 >>> 2], '%', cArr4[(r14 & 3) | 8], cArr4[r14 & 15], '%', cArr4[(r14 & 3) | 8], cArr4[i & 15]};
            int i4 = i >>> 4;
            int i5 = i4 >>> 2;
            int i6 = i5 >>> 4;
            return cArr5;
        }
        if (i <= 1114111) {
            char[] cArr6 = LJLJJI;
            char[] cArr7 = {'%', 'F', cArr6[(r14 >>> 2) & 7], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[i & 15]};
            int i7 = i >>> 4;
            int i8 = i7 >>> 2;
            int i9 = i8 >>> 4;
            int i10 = i9 >>> 2;
            int i11 = i10 >>> 4;
            return cArr7;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Invalid unicode character value ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public C64366PNy(String str, boolean z) {
        if (!str.matches(".*[0-9A-Za-z].*")) {
            if (!z || !str.contains(" ")) {
                if (!str.contains("%")) {
                    this.LJLIL = z;
                    char[] charArray = str.toCharArray();
                    int i = 122;
                    for (char c : charArray) {
                        i = Math.max((int) c, i);
                    }
                    boolean[] zArr = new boolean[i + 1];
                    int i2 = 48;
                    do {
                        zArr[i2] = true;
                        i2++;
                    } while (i2 <= 57);
                    int i3 = 65;
                    do {
                        zArr[i3] = true;
                        i3++;
                    } while (i3 <= 90);
                    int i4 = 97;
                    do {
                        zArr[i4] = true;
                        i4++;
                    } while (i4 <= 122);
                    for (char c2 : charArray) {
                        zArr[c2] = true;
                    }
                    this.LJLILLLLZI = zArr;
                    return;
                }
                throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
            }
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    public final int LLLLZLLIL(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.LJLILLLLZI;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }
}

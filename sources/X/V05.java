package X;

/* loaded from: classes14.dex */
public final class V05 extends AbstractC79017Uzl {
    @Override // X.AbstractC79017Uzl
    public final boolean[] LIZIZ(String str) {
        int[] iArr;
        int length = str.length();
        if (length <= 80) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                    int length2 = str.length();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt = str.charAt(i2);
                        if (charAt != 0) {
                            if (charAt != ' ') {
                                if (charAt != '@') {
                                    if (charAt != '`') {
                                        if (charAt != '-' && charAt != '.') {
                                            if (charAt <= 26) {
                                                sb.append('$');
                                                sb.append((char) ((charAt - 1) + 65));
                                            } else if (charAt < ' ') {
                                                sb.append('%');
                                                sb.append((char) ((charAt - 27) + 65));
                                            } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                                                sb.append('/');
                                                sb.append((char) ((charAt - '!') + 65));
                                            } else if (charAt <= '9') {
                                                sb.append((char) ((charAt - '0') + 48));
                                            } else if (charAt <= '?') {
                                                sb.append('%');
                                                sb.append((char) ((charAt - ';') + 70));
                                            } else if (charAt <= 'Z') {
                                                sb.append((char) ((charAt - 'A') + 65));
                                            } else if (charAt <= '_') {
                                                sb.append('%');
                                                sb.append((char) ((charAt - '[') + 75));
                                            } else if (charAt <= 'z') {
                                                sb.append('+');
                                                sb.append((char) ((charAt - 'a') + 65));
                                            } else if (charAt <= 127) {
                                                sb.append('%');
                                                sb.append((char) ((charAt - '{') + 80));
                                            } else {
                                                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i2) + "'");
                                            }
                                        }
                                    } else {
                                        sb.append("%W");
                                    }
                                } else {
                                    sb.append("%V");
                                }
                            }
                            sb.append(charAt);
                        } else {
                            sb.append("%U");
                        }
                    }
                    str = sb.toString();
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i++;
                }
            }
            int[] iArr2 = new int[9];
            int i3 = length + 25;
            int i4 = 0;
            while (true) {
                iArr = V06.LJLIL;
                if (i4 >= length) {
                    break;
                }
                LIZLLL(iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i4))], iArr2);
                int i5 = 0;
                do {
                    i3 += iArr2[i5];
                    i5++;
                } while (i5 < 9);
                i4++;
            }
            boolean[] zArr = new boolean[i3];
            LIZLLL(148, iArr2);
            int LIZ = AbstractC79017Uzl.LIZ(zArr, 0, iArr2, true);
            int[] iArr3 = {1};
            int LIZ2 = AbstractC79017Uzl.LIZ(zArr, LIZ, iArr3, false) + LIZ;
            for (int i6 = 0; i6 < length; i6++) {
                LIZLLL(iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i6))], iArr2);
                int LIZ3 = AbstractC79017Uzl.LIZ(zArr, LIZ2, iArr2, true) + LIZ2;
                LIZ2 = AbstractC79017Uzl.LIZ(zArr, LIZ3, iArr3, false) + LIZ3;
            }
            LIZLLL(148, iArr2);
            AbstractC79017Uzl.LIZ(zArr, LIZ2, iArr2, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }

    public static void LIZLLL(int i, int[] iArr) {
        int i2 = 0;
        do {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
            i2++;
        } while (i2 < 9);
    }

    @Override // X.AbstractC79017Uzl, X.V04
    public final C79007Uzb LJ(String str, V0B v0b, int i, int i2, java.util.Map<EnumC79013Uzh, ?> map) {
        if (v0b == V0B.CODE_39) {
            return super.LJ(str, v0b, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(v0b)));
    }
}

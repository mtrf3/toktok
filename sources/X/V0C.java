package X;

/* loaded from: classes14.dex */
public final class V0C extends AbstractC79017Uzl {
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ad, code lost:
    
        if (r0 < '`') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d5, code lost:
    
        if (LIZLLL(r9 + 3, r18) == X.V0E.TWO_DIGITS) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e7, code lost:
    
        if (r1 == X.V0E.ONE_DIGIT) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f7, code lost:
    
        if (r12 == X.V0E.TWO_DIGITS) goto L85;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    @Override // X.AbstractC79017Uzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean[] LIZIZ(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0C.LIZIZ(java.lang.String):boolean[]");
    }

    public static V0E LIZLLL(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (i >= length) {
            return V0E.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return V0E.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return V0E.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return V0E.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return V0E.ONE_DIGIT;
        }
        return V0E.TWO_DIGITS;
    }

    @Override // X.AbstractC79017Uzl, X.V04
    public final C79007Uzb LJ(String str, V0B v0b, int i, int i2, java.util.Map<EnumC79013Uzh, ?> map) {
        if (v0b == V0B.CODE_128) {
            return super.LJ(str, v0b, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(v0b)));
    }
}

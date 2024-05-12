package X;

/* renamed from: X.1M9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1M9 implements InterfaceC78568UsW, InterfaceC48098IuE {
    @Override // X.InterfaceC48098IuE
    public final long LIZ() {
        return C16880lQ.LLLLLZ();
    }

    public static String LIZIZ(CharSequence charSequence) {
        char c;
        char c2;
        StringBuilder sb = (StringBuilder) charSequence;
        int length = sb.length();
        char c3 = 0;
        if (length != 0) {
            char charAt = sb.charAt(0);
            if (length >= 2) {
                c = sb.charAt(1);
            } else {
                c = 0;
            }
            if (length >= 3) {
                c2 = sb.charAt(2);
                if (length >= 4) {
                    c3 = sb.charAt(3);
                }
            } else {
                c2 = 0;
            }
            int i = (charAt << 18) + (c << '\f') + (c2 << 6) + c3;
            char c4 = (char) ((i >> 16) & 255);
            char c5 = (char) ((i >> 8) & 255);
            char c6 = (char) (i & 255);
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append(c4);
            if (length >= 2) {
                sb2.append(c5);
                if (length >= 3) {
                    sb2.append(c6);
                }
            }
            return sb2.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r8 <= 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e9, code lost:
    
        X.C78939UyV.LJJIIJZLJL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    @Override // X.InterfaceC78568UsW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(X.C78593Usv r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1M9.LJJIFFI(X.Usv):void");
    }
}

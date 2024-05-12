package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.YBf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86967YBf implements InterfaceC80833Ff {
    public final boolean LIZ = C39419FdX.LIZIZ();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r5 == 64) goto L33;
     */
    @Override // X.InterfaceC80833Ff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r4 = "0"
            if (r0 == 0) goto Le
        L8:
            java.lang.String r0 = "hashCode(name)"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            return r4
        Le:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
            r1 = 0
        L15:
            int r0 = r8.length()
            r6 = 64
            if (r1 >= r0) goto L84
            char r5 = r8.charAt(r1)
            boolean r0 = java.lang.Character.isUpperCase(r5)
            if (r0 == 0) goto L44
            char r0 = r8.charAt(r1)
            int r5 = r0 + (-65)
        L2d:
            r0 = 10
            if (r5 >= r0) goto L7c
        L31:
            r3.append(r4)
        L34:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r3.append(r0)
            int r2 = r2 + 1
            int r1 = r1 + 1
            r0 = 12
            if (r2 >= r0) goto L86
            goto L15
        L44:
            boolean r0 = java.lang.Character.isLowerCase(r5)
            if (r0 == 0) goto L57
            char r0 = r8.charAt(r1)
            int r0 = r0 + (-97)
            int r5 = r0 + 26
            if (r1 != 0) goto L2d
            int r5 = r5 + (-26)
            goto L2d
        L57:
            boolean r0 = java.lang.Character.isDigit(r5)
            if (r0 == 0) goto L66
            char r0 = r8.charAt(r1)
            int r0 = r0 + (-48)
            int r5 = r0 + 52
            goto L2d
        L66:
            boolean r0 = X.C78840Uwu.LJJII(r5)
            if (r0 == 0) goto L6f
            r5 = 62
            goto L34
        L6f:
            java.lang.String r0 = r8.substring(r1)
            boolean r0 = X.C78840Uwu.LJJ(r0)
            if (r0 == 0) goto L81
            r5 = 64
            goto L7e
        L7c:
            if (r5 != r6) goto L34
        L7e:
            int r1 = r1 + 1
            goto L34
        L81:
            r5 = 63
            goto L34
        L84:
            r5 = 0
            goto L31
        L86:
            java.lang.String r4 = r3.toString()
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86967YBf.LIZ(java.lang.String):java.lang.String");
    }

    @Override // X.InterfaceC80833Ff
    public final String LIZIZ(String str) {
        String str2;
        boolean z = this.LIZ;
        if (!TextUtils.isEmpty(str)) {
            char charAt = str.charAt(0);
            if ((charAt >= 19968 && charAt <= 40869) || Character.isUpperCase(charAt) || Character.isLowerCase(charAt)) {
                str2 = C78897Uxp.LJJIII(str).substring(0, 1).toUpperCase();
                if (TextUtils.isEmpty(str2)) {
                    str2 = str.substring(0, 1).toUpperCase();
                }
            } else if (!Character.isDigit(charAt) && !C78840Uwu.LJJII(charAt) && !C78840Uwu.LJJ(str) && !z) {
                str2 = str.substring(0, 1);
            }
            o.LJIIIIZZ(str2, "getInitialLetter(name, mIsTraditionalSort)");
            return str2;
        }
        str2 = "#";
        o.LJIIIIZZ(str2, "getInitialLetter(name, mIsTraditionalSort)");
        return str2;
    }
}

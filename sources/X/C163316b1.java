package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.6b1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163316b1 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r10 > r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r9 >= r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        r1 = r12.substring(r9, r10);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "this as java.lang.String…ing(startIndex, endIndex)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r12) {
        /*
            int r10 = r12.length()
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r11 = ""
            if (r0 != 0) goto L7c
            int r9 = r10 + (-1)
            int r8 = r12.length()
        L12:
            r7 = 10
            r6 = 64
            r5 = 35
            r4 = 2131845634(0x7f116202, float:1.9324695E38)
            r3 = 32
            if (r9 < 0) goto L42
            char r2 = r12.charAt(r9)
            if (r2 == r3) goto L3f
            java.lang.String r1 = java.lang.String.valueOf(r2)
            android.content.Context r0 = X.C5L7.LIZ()
            android.content.Context r0 = X.C16880lQ.LLLLL(r0)
            java.lang.String r0 = r0.getString(r4)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L3f
            if (r2 == r6) goto L3f
            if (r2 != r7) goto L40
        L3f:
            return r11
        L40:
            if (r2 != r5) goto L79
        L42:
            if (r10 >= r8) goto L66
            char r2 = r12.charAt(r10)
            if (r2 == r5) goto L66
            if (r2 == r3) goto L66
            java.lang.String r1 = java.lang.String.valueOf(r2)
            android.content.Context r0 = X.C5L7.LIZ()
            android.content.Context r0 = X.C16880lQ.LLLLL(r0)
            java.lang.String r0 = r0.getString(r4)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L66
            if (r2 == r6) goto L66
            if (r2 != r7) goto L76
        L66:
            if (r9 < 0) goto L7c
            if (r10 > r8) goto L7c
            if (r9 >= r10) goto L7c
            java.lang.String r1 = r12.substring(r9, r10)
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        L76:
            int r10 = r10 + 1
            goto L42
        L79:
            int r9 = r9 + (-1)
            goto L12
        L7c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163316b1.LIZ(java.lang.String):java.lang.String");
    }

    public static String LIZIZ(String str, String str2) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (str != null) {
            i = Math.max(str2.length() - str.length(), 0);
        } else {
            i = 0;
        }
        String substring = str2.substring(0, i);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}

package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.F3i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38350F3i extends C38349F3h {
    public static final Double LJJIJL(String str) {
        o.LJIIIZ(str, "<this>");
        try {
            if (!C35D.LIZ.matches(str)) {
                return null;
            }
            return Double.valueOf(CastDoubleProtector.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final Float LJJIJLIJ(String str) {
        o.LJIIIZ(str, "<this>");
        try {
            if (!C35D.LIZ.matches(str)) {
                return null;
            }
            return Float.valueOf(CastFloatProtector.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x002d, code lost:
    
        if (r2 == '+') goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer LJJIL(java.lang.String r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            r9 = 10
            X.C17N.LJIIJ(r9)
            int r8 = r10.length()
            if (r8 != 0) goto L12
        L10:
            r0 = 0
        L11:
            return r0
        L12:
            r1 = 0
            char r2 = r10.charAt(r1)
            r0 = 48
            int r0 = kotlin.jvm.internal.o.LJIIJJI(r2, r0)
            if (r0 >= 0) goto L30
            r7 = 1
            if (r8 != r7) goto L23
            goto L10
        L23:
            r0 = 45
            if (r2 != r0) goto L2b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            goto L35
        L2b:
            r0 = 43
            if (r2 != r0) goto L10
            goto L31
        L30:
            r7 = 0
        L31:
            r6 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r5 = 0
        L35:
            r4 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r3 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L3b:
            if (r7 >= r8) goto L5c
            char r0 = r10.charAt(r7)
            int r2 = java.lang.Character.digit(r0, r9)
            if (r2 >= 0) goto L48
            goto L10
        L48:
            if (r1 >= r3) goto L51
            if (r3 != r4) goto L10
            int r3 = r6 / 10
            if (r1 >= r3) goto L51
            goto L10
        L51:
            int r1 = r1 * 10
            int r0 = r6 + r2
            if (r1 >= r0) goto L58
            goto L10
        L58:
            int r1 = r1 - r2
            int r7 = r7 + 1
            goto L3b
        L5c:
            if (r5 == 0) goto L63
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L11
        L63:
            int r0 = -r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38350F3i.LJJIL(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x002f, code lost:
    
        if (r1 == '+') goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Long LJJIZ(java.lang.String r17) {
        /*
            java.lang.String r0 = "<this>"
            r11 = r17
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            r10 = 10
            X.C17N.LJIIJ(r10)
            int r9 = r11.length()
            if (r9 != 0) goto L14
        L12:
            r0 = 0
        L13:
            return r0
        L14:
            r8 = 0
            char r1 = r11.charAt(r8)
            r0 = 48
            int r0 = kotlin.jvm.internal.o.LJIIJJI(r1, r0)
            if (r0 >= 0) goto L32
            r7 = 1
            if (r9 != r7) goto L25
            goto L12
        L25:
            r0 = 45
            if (r1 != r0) goto L2d
            r16 = -9223372036854775808
            r8 = 1
            goto L38
        L2d:
            r0 = 43
            if (r1 != r0) goto L12
            goto L33
        L32:
            r7 = 0
        L33:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L38:
            r14 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r5 = 0
            r12 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
        L44:
            if (r7 >= r9) goto L6f
            char r0 = r11.charAt(r7)
            int r2 = java.lang.Character.digit(r0, r10)
            if (r2 >= 0) goto L51
            goto L12
        L51:
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 >= 0) goto L61
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L12
            long r0 = (long) r10
            long r12 = r16 / r0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 >= 0) goto L61
            goto L12
        L61:
            long r0 = (long) r10
            long r5 = r5 * r0
            long r3 = (long) r2
            long r1 = r16 + r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6b
            goto L12
        L6b:
            long r5 = r5 - r3
            int r7 = r7 + 1
            goto L44
        L6f:
            if (r8 == 0) goto L76
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            goto L13
        L76:
            long r0 = -r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38350F3i.LJJIZ(java.lang.String):java.lang.Long");
    }
}

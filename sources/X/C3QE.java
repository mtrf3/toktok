package X;

import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3QE */
/* loaded from: classes2.dex */
public final class C3QE {
    public static final C3QE LIZ = new C3QE();
    public static final boolean LIZIZ = TextUtils.equals(EF7.LJIILIIL, "local_test");
    public static final List<OJD> LIZJ = C47261Igj.LJJIJIIJI(new OJD("\u2068"), new OJD("\u2069"));

    public static String LIZJ(String str) {
        if (str == null) {
            return "";
        }
        for (OJD ojd : LIZJ) {
            if (str != null) {
                str = ojd.replace(str, "");
            } else {
                str = null;
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String LIZLLL(String content) {
        String str;
        o.LJIIIZ(content, "content");
        int codePointCount = content.codePointCount(0, content.length());
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < codePointCount) {
            int i2 = i + 1;
            try {
                str = content.substring(content.offsetByCodePoints(0, i), content.offsetByCodePoints(0, i2));
                o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } catch (Exception unused) {
                str = content;
            }
            sb.append(str);
            sb.append(' ');
            i = i2;
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return s.LJZI(sb2).toString();
    }

    public static /* synthetic */ Object LIZIZ(C3QE c3qe, int i, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro2, C3Q8 c3q8, C98453th c98453th, C3QC c3qc, InterfaceC67352kd interfaceC67352kd) {
        return c3qe.LIZ(i, interfaceC65784Pro, interfaceC88472Yns, interfaceC65784Pro2, c3q8, c98453th, c3qc, new C3QJ(c3qe), new C81393Hj(c3qe), LIZIZ, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r29, X.InterfaceC65784Pro<? extends java.util.List<X.C3QL>> r30, X.InterfaceC88472Yns<? super java.lang.String, X.C76800UCe> r31, X.InterfaceC65784Pro<java.lang.String> r32, X.C3Q8 r33, X.C98453th r34, X.C3QC r35, X.InterfaceC88472Yns<? super java.util.List<X.C3QL>, java.lang.String> r36, X.InterfaceC88471Ynr<? super java.util.List<X.C3QL>, ? super java.util.List<X.C3QL>, ? extends X.OSZ<? extends java.util.List<X.C3QL>, ? extends java.util.List<X.C3QL>>> r37, boolean r38, X.InterfaceC67352kd<? super X.C76800UCe> r39) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3QE.LIZ(int, X.Pro, X.Yns, X.Pro, X.3Q8, X.3th, X.3QC, X.Yns, X.Ynr, boolean, X.2kd):java.lang.Object");
    }
}

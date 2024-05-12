package X;

import java.util.Random;
import m43.u;

/* loaded from: classes12.dex */
public class Q4W extends RuntimeException {
    public static final Q4X Companion = new Q4X();
    public static final long serialVersionUID = 1;

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        if (message == null) {
            return "";
        }
        return message;
    }

    public Q4W() {
    }

    public Q4W(String str) {
        super(str);
        Random random = new Random();
        if (str != null && u.LJII() && random.nextInt(100) > 50) {
            C65840Psi.LIZ(new QBF(str), EnumC88128YiK.ErrorReport);
        }
    }

    public Q4W(Throwable th) {
        super(th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q4W(java.lang.String r4, java.lang.Object... r5) {
        /*
            r3 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            if (r4 != 0) goto Lc
            r0 = 0
        L8:
            r3.<init>(r0)
            return
        Lc:
            int r0 = r5.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r0)
            int r1 = r2.length
            java.lang.String r0 = "java.lang.String.format(this, *args)"
            java.lang.String r0 = X.Q8U.LIZIZ(r2, r1, r4, r0)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q4W.<init>(java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: lambda$semisugar$_init_$lambda-0$0, reason: not valid java name */
    public static void m34lambda$semisugar$_init_$lambda0$0(String str, boolean z) {
    }

    public Q4W(String str, Throwable th) {
        super(str, th);
    }
}

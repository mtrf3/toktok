package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Ju5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50637Ju5 extends AbstractC50638Ju6 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50637Ju5() {
        /*
            r3 = this;
            java.lang.Class<X.OBS> r1 = X.OBS.class
            java.util.Map r0 = X.C50641Ju9.LIZ()
            java.lang.Object r0 = r0.get(r1)
            X.Ju7 r0 = (X.InterfaceC50639Ju7) r0
            r2 = 0
            if (r0 == 0) goto L22
            X.Jh7 r1 = r0.getData()
        L13:
            boolean r0 = r1 instanceof X.C50741Jvl
            if (r0 != 0) goto L18
            r1 = r2
        L18:
            X.Jvl r1 = (X.C50741Jvl) r1
            if (r1 == 0) goto L1e
            java.util.HashSet<java.lang.String> r2 = r1.LJLIL
        L1e:
            r3.<init>(r2)
            return
        L22:
            r1 = r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50637Ju5.<init>():void");
    }

    public final boolean LIZ(String input) {
        o.LJIIIZ(input, "input");
        if (input.length() == 0) {
            return false;
        }
        String lowerCase = QZP.LIZIZ("\\s+", input, "").toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        java.util.Set<String> set = this.LIZ;
        if (set != null && set.contains(lowerCase)) {
            return true;
        }
        return false;
    }
}

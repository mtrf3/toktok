package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Eha, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37122Eha extends AbstractC37134Ehm {
    @Override // X.AbstractC37134Ehm
    public final boolean LIZJ() {
        List list = this.LJI.LJII;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!EPA.LIZIZ().contains(C36970Ef8.LIZ((String) it.next()))) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC37134Ehm
    public final boolean LIZLLL() {
        if (EPA.LIZIZ().contains(C36970Ef8.LIZ(this.LIZIZ)) && LIZJ()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC37134Ehm
    public final void LJFF(java.util.Map<String, String> map) {
        map.put("name", this.LIZ);
        Iterable iterable = this.LJI.LJIIIIZZ;
        if (iterable == null) {
            iterable = C61878OQg.INSTANCE;
        }
        map.put("dependent_modules", ORZ.LLD(iterable, "|", null, null, null, 62));
        map.put("is_all_dependent_modules_installed", String.valueOf(LIZJ()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C37122Eha(java.lang.String r9, boolean r10, boolean r11, boolean r12, X.C37125Ehd r13, X.F5R r14, int r15) {
        /*
            r8 = this;
            r7 = r11
            r3 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0 = r15 & 2
            if (r0 == 0) goto La
            r3 = 0
        La:
            r0 = r15 & 4
            if (r0 == 0) goto Lf
            r7 = 1
        Lf:
            r0 = r15 & 8
            if (r0 == 0) goto L14
            r4 = 0
        L14:
            r0 = r15 & 16
            if (r0 == 0) goto L19
            r5 = 0
        L19:
            r0 = r15 & 32
            if (r0 == 0) goto L27
            X.F5Q r0 = new X.F5Q
            r0.<init>()
            X.F5R r6 = new X.F5R
            r6.<init>(r0)
        L27:
            java.lang.String r0 = "packageName"
            r2 = r9
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r1 = X.C36970Ef8.LIZ(r2)
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.List<java.lang.String> r1 = r6.LJII
            if (r1 != 0) goto L3b
            X.OQg r1 = X.C61878OQg.INSTANCE
        L3b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L4a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = X.C36970Ef8.LIZ(r1)
            r3.add(r0)
            goto L4a
        L63:
            r6.LJIIIIZZ = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37122Eha.<init>(java.lang.String, boolean, boolean, boolean, X.Ehd, X.F5R, int):void");
    }
}

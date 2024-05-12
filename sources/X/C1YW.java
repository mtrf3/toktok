package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1YW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YW extends AbstractC20180qk<C1YW> {
    public final C15010iP LJII;
    public final C18830oZ LJIIIIZZ;

    public final List<InterfaceC14750hz> LJJ(InterfaceC88472Yns<? super C1YW, ? extends InterfaceC14750hz> or) {
        o.LJIIIZ(or, "or");
        if (C08350Ul.LIZIZ(this.LJFF)) {
            InterfaceC14750hz invoke = or.invoke(this);
            if (invoke != null) {
                return C47261Igj.LJJIJ(invoke);
            }
            return null;
        }
        return C47261Igj.LJJIJIIJI(new C33711Tz("", 0), new C1U9(C08350Ul.LJ(this.LJFF), C08350Ul.LJ(this.LJFF)));
    }

    public final int LJJI(C18830oZ c18830oZ, int i) {
        C10390ax c10390ax;
        InterfaceC274415w interfaceC274415w;
        InterfaceC274415w interfaceC274415w2 = c18830oZ.LIZIZ;
        if (interfaceC274415w2 == null || (interfaceC274415w = c18830oZ.LIZJ) == null || (c10390ax = interfaceC274415w.LJIIJ(interfaceC274415w2, true)) == null) {
            c10390ax = C10390ax.LJ;
        }
        C10390ax LIZJ = c18830oZ.LIZ.LIZJ(this.LIZLLL.LIZIZ(C08350Ul.LIZJ(this.LJII.LIZIZ)));
        return this.LIZLLL.LIZ(c18830oZ.LIZ.LJIIL(C78923UyF.LIZ(LIZJ.LIZ, (C10430b1.LIZIZ(C1DF.LIZIZ(c10390ax.LIZJ - c10390ax.LIZ, c10390ax.LIZLLL - c10390ax.LIZIZ)) * i) + LIZJ.LIZIZ)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1YW(X.C15010iP r8, X.InterfaceC14950iJ r9, X.C18830oZ r10, X.C20210qn r11) {
        /*
            r7 = this;
            java.lang.String r0 = "currentValue"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "offsetMapping"
            r5 = r9
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "state"
            r6 = r11
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.0Uu r1 = r8.LIZ
            long r2 = r8.LIZIZ
            if (r10 == 0) goto L22
            X.0VG r4 = r10.LIZ
        L19:
            r0 = r7
            r0.<init>(r1, r2, r4, r5, r6)
            r0.LJII = r8
            r0.LJIIIIZZ = r10
            return
        L22:
            r4 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1YW.<init>(X.0iP, X.0iJ, X.0oZ, X.0qn):void");
    }
}

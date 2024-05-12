package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0qi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20160qi {
    public static final boolean LIZIZ(C20140qg c20140qg, boolean z) {
        InterfaceC274415w interfaceC274415w;
        C10390ax c10390ax;
        o.LJIIIZ(c20140qg, "<this>");
        C18810oX c18810oX = c20140qg.LIZLLL;
        if (c18810oX != null && (interfaceC274415w = c18810oX.LJI) != null) {
            InterfaceC274415w LJJIL = C78977Uz7.LJJIL(interfaceC274415w);
            C10390ax LJJIIZI = C78977Uz7.LJJIIZI(interfaceC274415w);
            float LIZ = (int) (LJJIL.LIZ() >> 32);
            float LIZIZ = C23490w5.LIZIZ(LJJIL.LIZ());
            float LJIIJJI = C78842Uww.LJIIJJI(LJJIIZI.LIZ, 0.0f, LIZ);
            float LJIIJJI2 = C78842Uww.LJIIJJI(LJJIIZI.LIZIZ, 0.0f, LIZIZ);
            float LJIIJJI3 = C78842Uww.LJIIJJI(LJJIIZI.LIZJ, 0.0f, LIZ);
            float LJIIJJI4 = C78842Uww.LJIIJJI(LJJIIZI.LIZLLL, 0.0f, LIZIZ);
            if (LJIIJJI == LJIIJJI3 || LJIIJJI2 == LJIIJJI4) {
                c10390ax = C10390ax.LJ;
            } else {
                long LJJJJLL = LJJIL.LJJJJLL(C78923UyF.LIZ(LJIIJJI, LJIIJJI2));
                long LJJJJLL2 = LJJIL.LJJJJLL(C78923UyF.LIZ(LJIIJJI3, LJIIJJI2));
                long LJJJJLL3 = LJJIL.LJJJJLL(C78923UyF.LIZ(LJIIJJI3, LJIIJJI4));
                long LJJJJLL4 = LJJIL.LJJJJLL(C78923UyF.LIZ(LJIIJJI, LJIIJJI4));
                float LIZLLL = C10370av.LIZLLL(LJJJJLL);
                float[] fArr = {C10370av.LIZLLL(LJJJJLL2), C10370av.LIZLLL(LJJJJLL4), C10370av.LIZLLL(LJJJJLL3)};
                int i = 0;
                do {
                    LIZLLL = Math.min(LIZLLL, fArr[i]);
                    i++;
                } while (i < 3);
                float LJ = C10370av.LJ(LJJJJLL);
                float[] fArr2 = {C10370av.LJ(LJJJJLL2), C10370av.LJ(LJJJJLL4), C10370av.LJ(LJJJJLL3)};
                int i2 = 0;
                do {
                    LJ = Math.min(LJ, fArr2[i2]);
                    i2++;
                } while (i2 < 3);
                float LIZLLL2 = C10370av.LIZLLL(LJJJJLL);
                float[] fArr3 = {C10370av.LIZLLL(LJJJJLL2), C10370av.LIZLLL(LJJJJLL4), C10370av.LIZLLL(LJJJJLL3)};
                int i3 = 0;
                do {
                    LIZLLL2 = Math.max(LIZLLL2, fArr3[i3]);
                    i3++;
                } while (i3 < 3);
                float LJ2 = C10370av.LJ(LJJJJLL);
                float[] fArr4 = {C10370av.LJ(LJJJJLL2), C10370av.LJ(LJJJJLL4), C10370av.LJ(LJJJJLL3)};
                int i4 = 0;
                do {
                    LJ2 = Math.max(LJ2, fArr4[i4]);
                    i4++;
                } while (i4 < 3);
                c10390ax = new C10390ax(LIZLLL, LJ, LIZLLL2, LJ2);
            }
            long LJIJJ = interfaceC274415w.LJIJJ(C78923UyF.LIZ(c10390ax.LIZ, c10390ax.LIZIZ));
            long LJIJJ2 = interfaceC274415w.LJIJJ(C78923UyF.LIZ(c10390ax.LIZJ, c10390ax.LIZLLL));
            float LIZLLL3 = C10370av.LIZLLL(LJIJJ);
            float LJ3 = C10370av.LJ(LJIJJ);
            float LIZLLL4 = C10370av.LIZLLL(LJIJJ2);
            float LJ4 = C10370av.LJ(LJIJJ2);
            long LJIIIIZZ = c20140qg.LJIIIIZZ(z);
            float LIZLLL5 = C10370av.LIZLLL(LJIIIIZZ);
            if (LIZLLL3 <= LIZLLL5 && LIZLLL5 <= LIZLLL4) {
                float LJ5 = C10370av.LJ(LJIIIIZZ);
                if (LJ3 <= LJ5 && LJ5 <= LJ4) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (r3 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(final boolean r12, X.EnumC22040tk r13, final X.C20140qg r14, X.InterfaceC24520xk r15, int r16) {
        /*
            java.lang.String r0 = "direction"
            r7 = r13
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "manager"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            r0 = -1344558920(0xffffffffafdba8b8, float:-3.995575E-10)
            r1 = r15
            X.1b3 r11 = r1.LJIL(r0)
            r6 = r12
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.LJJIIJ(r0)
            boolean r1 = r11.LJIJJ(r1)
            boolean r0 = r11.LJIJJ(r14)
            r1 = r1 | r0
            java.lang.Object r3 = r11.LJJJZ()
            if (r1 != 0) goto L36
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r3 != r0) goto L3e
        L36:
            X.1YM r3 = new X.1YM
            r3.<init>()
            r11.LJLJLLL(r3)
        L3e:
            r0 = 0
            r11.LJJJJJ(r0)
            X.0oF r3 = (X.InterfaceC18630oF) r3
            long r4 = r14.LJIIIIZZ(r6)
            X.0iP r0 = r14.LJIIIZ()
            long r0 = r0.LIZIZ
            boolean r8 = X.C08350Ul.LJFF(r0)
            X.1M1 r2 = X.InterfaceC07790Sh.LJJJI
            X.2FV r1 = new X.2FV
            r0 = 0
            r1.<init>(r3, r0)
            X.0Sh r9 = X.C11F.LIZIZ(r2, r3, r1)
            r10 = 0
            r2 = r16
            int r1 = r2 << 3
            r12 = r1 & 112(0x70, float:1.57E-43)
            r0 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 | r0
            r0 = r1 & 896(0x380, float:1.256E-42)
            r12 = r12 | r0
            X.C20120qe.LIZJ(r4, r6, r7, r8, r9, r10, r11, r12)
            X.1b9 r1 = r11.LJJJJLI()
            if (r1 != 0) goto L75
        L74:
            return
        L75:
            X.245 r0 = new X.245
            r0.<init>(r6, r7, r14, r2)
            r1.LIZLLL = r0
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20160qi.LIZ(boolean, X.0tk, X.0qg, X.0xk, int):void");
    }
}

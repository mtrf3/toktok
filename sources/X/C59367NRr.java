package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NRr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59367NRr {
    public static final NTR<InterfaceC41034G8o<? extends Object>> LIZ = new NTR<>();
    public static final C59403NTb<InterfaceC41034G8o<? extends Object>> LIZIZ = new C59403NTb<>();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r0 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class[] LIZ(X.InterfaceC41034G8o r6) {
        /*
            X.QSQ r5 = new X.QSQ
            r0 = 2
            r5.<init>(r0)
            java.lang.Class r0 = r6.getClass()
            r5.LIZ(r0)
            java.lang.Class r0 = r6.getClass()
            java.lang.annotation.Annotation[] r4 = r0.getAnnotations()
            java.lang.String r0 = "this::class.java.annotations"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            int r3 = r4.length
            r6 = 0
            r2 = 0
        L1d:
            r1 = 0
            if (r2 >= r3) goto L26
            r1 = r4[r2]
            boolean r0 = r1 instanceof X.InterfaceC55644Lse
            if (r0 == 0) goto L5f
        L26:
            boolean r0 = r1 instanceof X.InterfaceC55644Lse
            if (r0 == 0) goto L6a
            X.Lse r1 = (X.InterfaceC55644Lse) r1
            if (r1 == 0) goto L6a
            java.lang.Class[] r4 = r1.service()
            int r3 = r4.length
            if (r3 != 0) goto L4f
            X.Pko[] r2 = X.C65352Pkq.LIZIZ
            if (r2 == 0) goto L6a
        L39:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r2.length
            r4.<init>(r0)
            int r3 = r2.length
            r1 = 0
        L41:
            if (r1 >= r3) goto L62
            r0 = r2[r1]
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            r4.add(r0)
            int r1 = r1 + 1
            goto L41
        L4f:
            X.Pko[] r2 = new X.InterfaceC65350Pko[r3]
            r1 = 0
        L52:
            r0 = r4[r1]
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            if (r1 >= r3) goto L39
            goto L52
        L5f:
            int r2 = r2 + 1
            goto L1d
        L62:
            java.lang.Class[] r0 = new java.lang.Class[r6]
            java.lang.Object[] r0 = r4.toArray(r0)
            if (r0 != 0) goto L6c
        L6a:
            java.lang.Class[] r0 = new java.lang.Class[r6]
        L6c:
            r5.LJ(r0)
            int r0 = r5.LJFF()
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Object[] r0 = r5.LJIIIZ(r0)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59367NRr.LIZ(X.G8o):java.lang.Class[]");
    }

    public static final <T extends InterfaceC41034G8o<? extends Object>> T LIZIZ(Class<? extends T> cls) {
        T t = (T) LIZ.LIZ(cls);
        if (t == null) {
            return (T) LIZIZ.LIZ(cls);
        }
        return t;
    }

    public static final void LIZJ(InterfaceC41034G8o<? extends Object> module) {
        o.LJIIIZ(module, "module");
        for (Class<? extends InterfaceC41034G8o<? extends Object>> classKey : LIZ(module)) {
            NTR<InterfaceC41034G8o<? extends Object>> ntr = LIZ;
            ntr.getClass();
            o.LJIIIZ(classKey, "classKey");
            ntr.LIZJ.put(classKey, ntr.LIZ.invoke(module));
        }
    }
}

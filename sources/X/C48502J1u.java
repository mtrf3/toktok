package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.J1u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48502J1u {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C48357IyP LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a0, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ() {
        /*
            r5 = this;
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            X.IyP r1 = r5.LIZ
        L4:
            r4 = 0
            if (r1 == 0) goto L1e
            X.IyO r0 = X.C48356IyO.LIZ
            java.util.Map r2 = r0.LIZ(r1)
            java.lang.String r0 = "param_extra_ec_common_extra_param"
            java.lang.Object r2 = r2.get(r0)
            if (r2 != 0) goto L28
        L15:
            r2 = r4
        L16:
            java.lang.String r0 = "#$&*REMOVED*&$#"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L1f
        L1e:
            return r4
        L1f:
            if (r2 == 0) goto L23
            r4 = r2
            goto L1e
        L23:
            r1.getClass()
            r1 = r4
            goto L4
        L28:
            java.lang.Class r0 = r2.getClass()
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L33
            goto L16
        L33:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L42
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto Lc8
            goto L16
        L42:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r2.toString()
            java.lang.Boolean r2 = LJIIJJI(r0)
            boolean r0 = r2 instanceof java.lang.Object
            if (r0 != 0) goto L57
            goto L15
        L57:
            if (r2 != 0) goto L16
            goto L15
        L5a:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L72
            java.lang.String r0 = r2.toString()
            java.lang.Integer r2 = X.C38350F3i.LJJIL(r0)
            boolean r0 = r2 instanceof java.lang.Object
            if (r0 != 0) goto L6f
            goto L15
        L6f:
            if (r2 != 0) goto L16
            goto L15
        L72:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L8a
            java.lang.String r0 = r2.toString()
            java.lang.Long r2 = X.C38350F3i.LJJIZ(r0)
            boolean r0 = r2 instanceof java.lang.Object
            if (r0 != 0) goto L87
            goto L15
        L87:
            if (r2 != 0) goto L16
            goto L15
        L8a:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto La4
            java.lang.String r0 = r2.toString()
            java.lang.Double r2 = X.C38350F3i.LJJIJL(r0)
            boolean r0 = r2 instanceof java.lang.Object
            if (r0 != 0) goto La0
            goto L15
        La0:
            if (r2 != 0) goto L16
            goto L15
        La4:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r2.toString()
            java.lang.Float r2 = X.C38350F3i.LJJIJLIJ(r0)
            boolean r0 = r2 instanceof java.lang.Object
            if (r0 != 0) goto Lba
            goto L15
        Lba:
            if (r2 != 0) goto L16
            goto L15
        Lbe:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto Ld0
            goto L16
        Lc8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            r1.<init>(r0)
            throw r1
        Ld0:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r3.getName()
            r1.append(r0)
            java.lang.String r0 = " is not VALID."
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48502J1u.LIZIZ():java.lang.Object");
    }

    public C48502J1u(String str) {
        C48357IyP c48357IyP;
        synchronized (C48356IyO.LIZ) {
            C48356IyO.LIZIZ.getAndAdd(1);
            c48357IyP = new C48357IyP(str);
            C48356IyO.LIZJ.put(c48357IyP, new LinkedHashMap());
        }
        this.LIZ = c48357IyP;
    }

    public static Boolean LJIIJJI(String str) {
        String lowerCase = str.toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        if (o.LJ(lowerCase, "true")) {
            return Boolean.TRUE;
        }
        if (o.LJ(lowerCase, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        if (r3 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZ(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48502J1u.LIZ(java.lang.String):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a8, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c3, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48502J1u.LIZJ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ac, code lost:
    
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c7, code lost:
    
        if (r3 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48502J1u.LIZLLL(java.lang.String):boolean");
    }

    public final boolean LJ(String str) {
        C48357IyP c48357IyP = this.LIZ;
        if (c48357IyP == null) {
            return false;
        }
        boolean containsKey = C48356IyO.LIZ.LIZ(c48357IyP).containsKey(str);
        if (!containsKey) {
            c48357IyP.getClass();
        }
        return containsKey;
    }

    public final void LJIIJ(String str) {
        C48356IyO c48356IyO = C48356IyO.LIZ;
        C48357IyP c48357IyP = this.LIZ;
        o.LJI(c48357IyP);
        try {
            c48356IyO.LIZ(c48357IyP).put(str, "#$&*REMOVED*&$#");
        } catch (Exception unused) {
        }
    }

    public final void LJFF(int i, String str) {
        o.LJII(Integer.valueOf(i), "null cannot be cast to non-null type kotlin.Any");
        Integer valueOf = Integer.valueOf(i);
        C48356IyO c48356IyO = C48356IyO.LIZ;
        C48357IyP c48357IyP = this.LIZ;
        o.LJI(c48357IyP);
        c48356IyO.LIZ(c48357IyP).put(str, valueOf);
    }

    public final void LJI(long j, String str) {
        o.LJII(Long.valueOf(j), "null cannot be cast to non-null type kotlin.Any");
        Long valueOf = Long.valueOf(j);
        C48356IyO c48356IyO = C48356IyO.LIZ;
        C48357IyP c48357IyP = this.LIZ;
        o.LJI(c48357IyP);
        c48356IyO.LIZ(c48357IyP).put(str, valueOf);
    }

    public final void LJIIIIZZ(String str, java.util.Map<String, String> map) {
        o.LJII(map, "null cannot be cast to non-null type kotlin.Any");
        C48356IyO c48356IyO = C48356IyO.LIZ;
        C48357IyP c48357IyP = this.LIZ;
        o.LJI(c48357IyP);
        c48356IyO.LIZ(c48357IyP).put(str, map);
    }

    public final void LJIIIZ(String str, boolean z) {
        o.LJII(Boolean.valueOf(z), "null cannot be cast to non-null type kotlin.Any");
        Boolean valueOf = Boolean.valueOf(z);
        C48356IyO c48356IyO = C48356IyO.LIZ;
        C48357IyP c48357IyP = this.LIZ;
        o.LJI(c48357IyP);
        c48356IyO.LIZ(c48357IyP).put(str, valueOf);
    }

    public final void LJII(String str, String str2, boolean z) {
        if (!z) {
            if (str2 != null) {
                str2 = str2.toLowerCase();
                o.LJIIIIZZ(str2, "this as java.lang.String).toLowerCase()");
            } else {
                str2 = null;
            }
        }
        C48356IyO c48356IyO = C48356IyO.LIZ;
        C48357IyP c48357IyP = this.LIZ;
        o.LJI(c48357IyP);
        java.util.Map<String, Object> LIZ = c48356IyO.LIZ(c48357IyP);
        if (str2 == null) {
            LIZ.remove(str);
        } else {
            LIZ.put(str, str2);
        }
    }
}

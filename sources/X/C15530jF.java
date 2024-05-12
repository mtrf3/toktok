package X;

import java.lang.reflect.Method;

/* renamed from: X.0jF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15530jF {
    public static Object LIZ;
    public static Method LIZIZ;
    public static boolean LIZJ;
    public static long LIZLLL;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-1358935726776435028"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(obj, objArr);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:3|4|5|6|7|8|(6:18|19|11|12|13|14)|10|11|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(long r9) {
        /*
            boolean r0 = X.C15530jF.LIZJ
            r4 = 0
            r8 = 1
            r7 = 0
            if (r0 != 0) goto L4a
            X.C15530jF.LIZJ = r8
            java.lang.String r0 = "sun.misc.Unsafe"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L4a
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L4a
            java.lang.String r1 = "getUnsafe"
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)     // Catch: java.lang.Exception -> L1e
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.Exception -> L1e
            java.lang.reflect.Method r1 = r5.getDeclaredMethod(r1, r0)     // Catch: java.lang.Exception -> L1e
            goto L1f
        L1e:
            r1 = r4
        L1f:
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L4a
            if (r1 == 0) goto L2c
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)     // Catch: java.lang.Exception -> L2c
            java.lang.Object r0 = LIZ(r4, r1, r0)     // Catch: java.lang.Exception -> L2c
            goto L2d
        L2c:
            r0 = r4
        L2d:
            X.C15530jF.LIZ = r0     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = "getInt"
            java.lang.Class[] r2 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L4a
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = "TYPE"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L4a
            r2[r7] = r1     // Catch: java.lang.Exception -> L4a
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r8)     // Catch: java.lang.Exception -> L47
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.Exception -> L47
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r3, r0)     // Catch: java.lang.Exception -> L47
            goto L48
        L47:
            r0 = r4
        L48:
            X.C15530jF.LIZIZ = r0     // Catch: java.lang.Exception -> L4a
        L4a:
            java.lang.reflect.Method r3 = X.C15530jF.LIZIZ
            java.lang.Object r2 = X.C15530jF.LIZ
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r1[r7] = r0
            if (r3 == 0) goto L60
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r8)     // Catch: java.lang.Exception -> L60
            java.lang.Object r4 = LIZ(r2, r3, r0)     // Catch: java.lang.Exception -> L60
        L60:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L6b
            java.lang.Number r4 = (java.lang.Number) r4
            int r7 = r4.intValue()
        L6a:
            return r7
        L6b:
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = X.C15530jF.LIZLLL
            long r3 = r5 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L7a
            goto L6a
        L7a:
            X.C15530jF.LIZLLL = r5
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "ttlive_unsafe_getint_failed"
            X.C0K2.LJIILLIIL(r8, r7, r0, r1)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15530jF.LIZIZ(long):int");
    }
}

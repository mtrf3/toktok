package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.ImJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47607ImJ {
    public static Object LIZ;
    public static boolean LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.Object r6) {
        /*
            boolean r0 = X.C47607ImJ.LIZIZ
            if (r0 == 0) goto Lc
        L4:
            r1 = 0
        L5:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L4a
            return r1
        Lc:
            java.lang.Object r0 = X.C47607ImJ.LIZ
            r5 = 0
            r4 = 1
            if (r0 != 0) goto L23
            java.lang.String r0 = "com.google.gson.Gson"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L21
            X.C47607ImJ.LIZ = r0     // Catch: java.lang.Throwable -> L21
            X.C47607ImJ.LIZIZ = r5     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            X.C47607ImJ.LIZIZ = r4
        L23:
            java.lang.Object r0 = X.C47607ImJ.LIZ
            if (r0 == 0) goto L4
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L4
            java.lang.String r2 = "toJson"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L4
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1[r5] = r0     // Catch: java.lang.Throwable -> L4
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L4
            java.lang.Object r1 = X.C47607ImJ.LIZ     // Catch: java.lang.Throwable -> L4
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4
            r0[r5] = r6     // Catch: java.lang.Throwable -> L4
            java.lang.Object r1 = r2.invoke(r1, r0)     // Catch: java.lang.Throwable -> L4
            boolean r0 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L4
            if (r0 == 0) goto L4
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L4
            goto L5
        L4a:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47607ImJ.LIZJ(java.lang.Object):java.lang.String");
    }

    public static void LIZIZ(String str, java.util.Map map, Object obj) {
        ((HashMap) map).put(str, String.valueOf(obj));
    }

    public static C47160If6 LIZ(InterfaceC47616ImS interfaceC47616ImS, int i, String str, boolean z) {
        EnumC47176IfM enumC47176IfM;
        HashMap hashMap = null;
        if (i >= 0) {
            enumC47176IfM = EnumC47176IfM.valueOf(i);
        } else {
            enumC47176IfM = null;
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
            hashMap.put(32, str);
        }
        return interfaceC47616ImS.LJIJJLI(enumC47176IfM, hashMap, z);
    }
}

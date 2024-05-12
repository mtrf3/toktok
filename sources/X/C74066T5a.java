package X;

import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.T5a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74066T5a {
    public static Method LIZ(String str) {
        if (C74067T5b.LIZIZ.get(str) != null) {
            return null;
        }
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = C74067T5b.LIZ;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            C74067T5b.LIZIZ.put(str, Boolean.TRUE);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZIZ(java.lang.Object r2, java.lang.Object r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "any"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.reflect.Method r1 = LIZ(r4)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L1a
            if (r1 != 0) goto Lc
            goto L14
        Lc:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L1a
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L1a
            goto L15
        L14:
            r0 = r3
        L15:
            if (r0 != 0) goto L18
        L17:
            return r3
        L18:
            r3 = r0
            goto L17
        L1a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74066T5a.LIZIZ(java.lang.Object, java.lang.Object, java.lang.String):java.lang.Object");
    }
}

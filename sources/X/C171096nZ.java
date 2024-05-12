package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6nZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171096nZ {
    public static final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class, InterfaceC171106na<?>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class, InterfaceC171116nb> LIZJ = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0009, B:7:0x000f, B:10:0x0011, B:12:0x001b, B:14:0x0024, B:16:0x0031, B:17:0x0037, B:19:0x0039, B:25:0x005f, B:27:0x006e, B:28:0x0074, B:30:0x0076), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0078, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0009, B:7:0x000f, B:10:0x0011, B:12:0x001b, B:14:0x0024, B:16:0x0031, B:17:0x0037, B:19:0x0039, B:25:0x005f, B:27:0x006e, B:28:0x0074, B:30:0x0076), top: B:4:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T LIZ(java.lang.Class<T> r4) {
        /*
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, java.lang.Object> r3 = X.C171096nZ.LIZ
            java.lang.Object r2 = r3.get(r4)
            if (r2 != 0) goto L7b
            monitor-enter(r4)
            java.lang.Object r0 = r3.get(r4)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            return r0
        L11:
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, X.6na<?>> r1 = X.C171096nZ.LIZIZ     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r1.get(r4)     // Catch: java.lang.Throwable -> L78
            X.6na r0 = (X.InterfaceC171106na) r0     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L39
            java.lang.Object r2 = r0.create()     // Catch: java.lang.Throwable -> L78
            r1.remove(r4)     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L39
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, X.6nb> r1 = X.C171096nZ.LIZJ     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r1.get(r4)     // Catch: java.lang.Throwable -> L78
            X.6nb r0 = (X.InterfaceC171116nb) r0     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L37
            r0.LIZ()     // Catch: java.lang.Throwable -> L78
            r1.remove(r4)     // Catch: java.lang.Throwable -> L78
        L37:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            return r2
        L39:
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Throwable -> L78
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L78
            r0 = 0
            r1[r0] = r2     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "%s__ServiceProxy"
            java.lang.String r0 = X.C16880lQ.LLLZ(r0, r1)     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = r0.newInstance()     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r1 instanceof com.bytedance.news.common.service.manager.IServiceProxy     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5c
            com.bytedance.news.common.service.manager.IServiceProxy r1 = (com.bytedance.news.common.service.manager.IServiceProxy) r1     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r2 = r1.newInstance()     // Catch: java.lang.Throwable -> L5c
            goto L5d
        L5c:
            r2 = 0
        L5d:
            if (r2 == 0) goto L76
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, java.lang.Object> r0 = X.C171096nZ.LIZ     // Catch: java.lang.Throwable -> L78
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, X.6nb> r1 = X.C171096nZ.LIZJ     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r1.get(r4)     // Catch: java.lang.Throwable -> L78
            X.6nb r0 = (X.InterfaceC171116nb) r0     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L74
            r0.LIZ()     // Catch: java.lang.Throwable -> L78
            r1.remove(r4)     // Catch: java.lang.Throwable -> L78
        L74:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            return r2
        L76:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            goto L7b
        L78:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            throw r0
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C171096nZ.LIZ(java.lang.Class):java.lang.Object");
    }

    public static <T> void LIZIZ(Class<T> cls, InterfaceC171106na<T> interfaceC171106na) {
        LIZIZ.put(cls, interfaceC171106na);
    }
}

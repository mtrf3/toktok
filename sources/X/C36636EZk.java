package X;

/* renamed from: X.EZk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36636EZk {
    public static final AbstractC78621UtN LIZ;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #0 {, blocks: (B:34:0x0015, B:7:0x0031, B:10:0x0047, B:12:0x0074, B:13:0x007b, B:20:0x006e, B:21:0x003d, B:23:0x004a, B:24:0x0051, B:27:0x0060, B:6:0x0010, B:16:0x0069), top: B:2:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[Catch: all -> 0x007c, TryCatch #0 {, blocks: (B:34:0x0015, B:7:0x0031, B:10:0x0047, B:12:0x0074, B:13:0x007b, B:20:0x006e, B:21:0x003d, B:23:0x004a, B:24:0x0051, B:27:0x0060, B:6:0x0010, B:16:0x0069), top: B:2:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            r6 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L10
            if (r0 != 0) goto La
            goto L10
        La:
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L15
        L10:
            java.util.List r5 = X.C36846Ed8.LIZ()     // Catch: java.lang.Throwable -> L7c
            goto L31
        L15:
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r1 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L7c
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r1, r0)     // Catch: java.lang.Throwable -> L7c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7c
            X.45z r0 = X.OJ6.LJJIJLIJ(r0)     // Catch: java.lang.Throwable -> L7c
            java.util.List r0 = X.OJ4.LJJLIIIJ(r0)     // Catch: java.lang.Throwable -> L7c
            java.util.List r5 = X.C47261Igj.LJJIJLIJ(r0)     // Catch: java.lang.Throwable -> L7c
        L31:
            java.util.Iterator r4 = r5.iterator()     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L3d
            r3 = r6
            goto L47
        L3d:
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L4a
        L47:
            kotlinx.coroutines.internal.MainDispatcherFactory r3 = (kotlinx.coroutines.internal.MainDispatcherFactory) r3     // Catch: java.lang.Throwable -> L7c
            goto L67
        L4a:
            r0 = r3
            kotlinx.coroutines.internal.MainDispatcherFactory r0 = (kotlinx.coroutines.internal.MainDispatcherFactory) r0     // Catch: java.lang.Throwable -> L7c
            int r2 = r0.getLoadPriority()     // Catch: java.lang.Throwable -> L7c
        L51:
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L7c
            r0 = r1
            kotlinx.coroutines.internal.MainDispatcherFactory r0 = (kotlinx.coroutines.internal.MainDispatcherFactory) r0     // Catch: java.lang.Throwable -> L7c
            int r0 = r0.getLoadPriority()     // Catch: java.lang.Throwable -> L7c
            if (r2 >= r0) goto L60
            r3 = r1
            r2 = r0
        L60:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L51
            goto L47
        L67:
            if (r3 == 0) goto L74
            X.UtN r6 = r3.createDispatcher(r5)     // Catch: java.lang.Throwable -> L6e
            goto L71
        L6e:
            r3.hintOnError()     // Catch: java.lang.Throwable -> L7c
        L71:
            X.C36636EZk.LIZ = r6
            return
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7c
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36636EZk.<clinit>():void");
    }
}

package X;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EWQ {
    public static final Method LIZ;
    public static final Method LIZIZ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8344585710407264941"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r5 = 0
            r4 = 24
            if (r0 < r4) goto L27
            r0 = 4
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class<android.app.job.JobInfo> r0 = android.app.job.JobInfo.class
            r2[r3] = r0     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0 = 1
            r2[r0] = r1     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L27
            r0 = 2
            r2[r0] = r1     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0 = 3
            r2[r0] = r1     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class<android.app.job.JobScheduler> r1 = android.app.job.JobScheduler.class
            java.lang.String r0 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L27
            goto L28
        L27:
            r0 = r5
        L28:
            X.EWQ.LIZ = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L38
            java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L38
            java.lang.reflect.Method r5 = r2.getDeclaredMethod(r1, r0)     // Catch: java.lang.NoSuchMethodException -> L38
        L38:
            X.EWQ.LIZIZ = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EWQ.<clinit>():void");
    }
}

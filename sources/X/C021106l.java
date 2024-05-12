package X;

import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.06l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C021106l {
    public static final Class<?> LIZ;
    public static final Field LIZIZ;
    public static final Field LIZJ;
    public static final Method LIZLLL;
    public static final Method LJ;
    public static final Method LJFF;
    public static final Handler LJI = new Handler(C16880lQ.LLJJJJ());

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|2|3|4|5|6|7|8|9|10|(11:32|33|13|(6:28|29|16|(2:24|25)|20|21)|15|16|(1:18)|24|25|20|21)|12|13|(0)|15|16|(0)|24|25|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            r1.<init>(r0)
            X.C021106l.LJI = r1
            r9 = 0
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r0 = r9
        L14:
            X.C021106l.LIZ = r0
            r2 = 1
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r0 = "mMainThread"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L23
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r0 = r9
        L24:
            X.C021106l.LIZIZ = r0
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r0 = "mToken"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L32
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r0 = r9
        L33:
            X.C021106l.LIZJ = r0
            java.lang.Class<?> r4 = X.C021106l.LIZ
            r8 = 0
            r3 = 3
            java.lang.String r5 = "performStopActivity"
            r7 = 2
            if (r4 != 0) goto La0
        L3e:
            r0 = r9
        L3f:
            X.C021106l.LIZLLL = r0
            java.lang.Class<?> r4 = X.C021106l.LIZ
            if (r4 != 0) goto L8e
        L45:
            r0 = r9
        L46:
            X.C021106l.LJ = r0
            java.lang.Class<?> r6 = X.C021106l.LIZ
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 == r0) goto L54
            r0 = 27
            if (r1 != r0) goto L56
        L54:
            if (r6 != 0) goto L59
        L56:
            X.C021106l.LJFF = r9
            return
        L59:
            java.lang.String r5 = "requestRelaunchActivity"
            r0 = 9
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r4[r8] = r0     // Catch: java.lang.Throwable -> L56
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r4[r2] = r0     // Catch: java.lang.Throwable -> L56
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r4[r7] = r0     // Catch: java.lang.Throwable -> L56
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L56
            r4[r3] = r0     // Catch: java.lang.Throwable -> L56
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L56
            r0 = 4
            r4[r0] = r3     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            r0 = 5
            r4[r0] = r1     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            r0 = 6
            r4[r0] = r1     // Catch: java.lang.Throwable -> L56
            r0 = 7
            r4[r0] = r3     // Catch: java.lang.Throwable -> L56
            r0 = 8
            r4[r0] = r3     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r5, r4)     // Catch: java.lang.Throwable -> L56
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L56
            r9 = r0
            goto L56
        L8e:
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L45
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r1[r8] = r0     // Catch: java.lang.Throwable -> L45
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L45
            r1[r2] = r0     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r5, r1)     // Catch: java.lang.Throwable -> L45
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L45
            goto L46
        La0:
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r1[r8] = r0     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3e
            r1[r2] = r0     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r7] = r0     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r5, r1)     // Catch: java.lang.Throwable -> L3e
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3e
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C021106l.<clinit>():void");
    }
}

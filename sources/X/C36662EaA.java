package X;

/* renamed from: X.EaA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36662EaA {
    public static final QXX LIZ;

    /* JADX WARN: Removed duplicated region for block: B:10:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    static {
        /*
            r5 = 0
            java.lang.String r0 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L45
            java.lang.String r0 = "SDK_INT"
            java.lang.reflect.Field r0 = r1.getField(r0)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L45
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L45
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L45
            r5 = r0
            if (r0 == 0) goto L31
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L45
            r0 = 19
            if (r1 < r0) goto L31
            X.EaB r0 = new X.EaB     // Catch: java.lang.Throwable -> L45
            r0.<init>()     // Catch: java.lang.Throwable -> L45
            goto L77
        L24:
            r2 = move-exception
            java.io.PrintStream r1 = java.lang.System.err     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
            r1.println(r0)     // Catch: java.lang.Throwable -> L45
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.Throwable -> L45
            r2.printStackTrace(r0)     // Catch: java.lang.Throwable -> L45
        L31:
            java.lang.String r0 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r0 = java.lang.Boolean.getBoolean(r0)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L3f
            X.FfN r0 = new X.FfN     // Catch: java.lang.Throwable -> L45
            r0.<init>()     // Catch: java.lang.Throwable -> L45
            goto L77
        L3f:
            X.Dbk r0 = new X.Dbk     // Catch: java.lang.Throwable -> L45
            r0.<init>()     // Catch: java.lang.Throwable -> L45
            goto L77
        L45:
            r4 = move-exception
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<X.Dbk> r0 = X.C34212Dbk.class
            java.lang.String r2 = r0.getName()
            int r0 = r2.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 133
            r1.<init>(r0)
            java.lang.String r0 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "will be used. The error is: "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.println(r0)
            java.io.PrintStream r0 = java.lang.System.err
            r4.printStackTrace(r0)
            X.Dbk r0 = new X.Dbk
            r0.<init>()
        L77:
            X.C36662EaA.LIZ = r0
            if (r5 != 0) goto L7c
            return
        L7c:
            r5.intValue()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36662EaA.<clinit>():void");
    }

    public static void LIZ(Throwable th, Throwable th2) {
        LIZ.LJJZZIII(th, th2);
    }
}

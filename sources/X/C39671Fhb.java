package X;

/* renamed from: X.Fhb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39671Fhb {
    public static volatile AbstractC39672Fhc LIZ = AbstractC39672Fhc.zzc();
    public static final Object LIZIZ = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:17|(8:31|(1:33)(1:38)|34|(1:36)|25|26|27|28)|19|20|21|22|(1:24)|25|26|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.content.Context r6, android.net.Uri r7) {
        /*
            java.lang.String r1 = r7.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r1)
            r4 = 0
            if (r0 != 0) goto Le
            return r4
        Le:
            X.Fhc r0 = X.C39671Fhb.LIZ
            boolean r0 = r0.zzb()
            if (r0 == 0) goto L23
            X.Fhc r0 = X.C39671Fhb.LIZ
            java.lang.Object r0 = r0.zza()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L23:
            java.lang.Object r5 = X.C39671Fhb.LIZIZ
            monitor-enter(r5)
            X.Fhc r0 = X.C39671Fhb.LIZ     // Catch: java.lang.Throwable -> L92
            boolean r0 = r0.zzb()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L3c
            X.Fhc r0 = X.C39671Fhb.LIZ     // Catch: java.lang.Throwable -> L92
            java.lang.Object r0 = r0.zza()     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L92
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L92
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L92
            return r0
        L3c:
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = r6.getPackageName()     // Catch: java.lang.Throwable -> L92
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L5a
        L48:
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r0 = X.C16880lQ.LLLLLLLLL(r1, r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a java.lang.Throwable -> L92
            int r0 = r0.flags     // Catch: java.lang.Throwable -> L92
            r0 = r0 & 129(0x81, float:1.81E-43)
            if (r0 == 0) goto L7a
            r4 = 1
            goto L7a
        L5a:
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L92
            r0 = 29
            if (r1 >= r0) goto L68
            r0 = 0
            goto L6a
        L68:
            r0 = 268435456(0x10000000, float:2.524355E-29)
        L6a:
            android.content.pm.ProviderInfo r0 = r3.resolveContentProvider(r2, r0)     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L7a
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L92
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L48
        L7a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L92
            X.Fhc r0 = X.AbstractC39672Fhc.zzd(r0)     // Catch: java.lang.Throwable -> L92
            X.C39671Fhb.LIZ = r0     // Catch: java.lang.Throwable -> L92
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L92
            X.Fhc r0 = X.C39671Fhb.LIZ
            java.lang.Object r0 = r0.zza()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L92:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L92
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39671Fhb.LIZ(android.content.Context, android.net.Uri):boolean");
    }
}

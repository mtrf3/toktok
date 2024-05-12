package X;

/* loaded from: classes5.dex */
public final class A9T extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Set<String>> {
    public static final A9T INSTANCE = new A9T();

    public A9T() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[Catch: NameNotFoundException -> 0x0042, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x0042, blocks: (B:3:0x0005, B:5:0x0027, B:10:0x0033), top: B:2:0x0005 }] */
    @Override // X.InterfaceC65784Pro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<java.lang.String> invoke() {
        /*
            r5 = this;
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            android.app.Application r0 = X.C1791471i.LIZ     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            android.app.Application r0 = X.C1791471i.LIZ     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            java.lang.String r1 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = X.C16880lQ.LLLLLLLLL(r2, r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            java.lang.String r0 = "getApp().packageManager.…ageManager.GET_META_DATA)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            java.lang.String r0 = "tools_opt_tag"
            java.lang.String r3 = r1.getString(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            r2 = 0
            if (r3 == 0) goto L30
            int r0 = r3.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            r0 = 0
            goto L31
        L30:
            r0 = 1
        L31:
            if (r0 != 0) goto L46
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            r0 = 6
            java.util.List r0 = ujb.s.LJLJJL(r3, r1, r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            r4.addAll(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            goto L46
        L42:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9T.invoke():java.util.Set");
    }
}

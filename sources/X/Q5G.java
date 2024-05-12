package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m43.u;

/* loaded from: classes12.dex */
public final class Q5G {
    public static final String[] LIZ;

    static {
        new Q5G();
        LIZ = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    }

    public static final String LIZ() {
        if (C40700FyC.LIZ(Q5G.class)) {
            return null;
        }
        try {
            Context LIZJ = u.LIZJ();
            List<ResolveInfo> queryIntentServices = LIZJ.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                HashSet LJJLIL = ORY.LJJLIL(LIZ);
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && LJJLIL.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:6:0x000a, B:9:0x001a, B:13:0x0036, B:15:0x003c), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.lang.String r4) {
        /*
            java.lang.Class<X.Q5G> r0 = X.Q5G.class
            boolean r0 = X.C40700FyC.LIZ(r0)
            r3 = 0
            if (r0 == 0) goto La
            return r3
        La:
            java.lang.String r0 = "developerDefinedRedirectURI"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)     // Catch: java.lang.Throwable -> L55
            android.content.Context r0 = m43.u.LIZJ()     // Catch: java.lang.Throwable -> L55
            boolean r0 = X.Q4J.LIZIZ(r0, r4)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L1a
            return r4
        L1a:
            android.content.Context r2 = m43.u.LIZJ()     // Catch: java.lang.Throwable -> L55
            java.lang.Class<X.Q5G> r0 = X.Q5G.class
            boolean r0 = X.C40700FyC.LIZ(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "fbconnect://cct."
            if (r0 == 0) goto L2a
        L28:
            r0 = r3
            goto L36
        L2a:
            android.content.Context r0 = m43.u.LIZJ()     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = kotlin.jvm.internal.o.LJIILLIIL(r0, r1)     // Catch: java.lang.Throwable -> L28
        L36:
            boolean r0 = X.Q4J.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L52
            java.lang.Class<X.Q5G> r0 = X.Q5G.class
            boolean r0 = X.C40700FyC.LIZ(r0)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L45
            goto L51
        L45:
            android.content.Context r0 = m43.u.LIZJ()     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = kotlin.jvm.internal.o.LJIILLIIL(r0, r1)     // Catch: java.lang.Throwable -> L51
        L51:
            return r3
        L52:
            java.lang.String r0 = ""
            return r0
        L55:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q5G.LIZIZ(java.lang.String):java.lang.String");
    }
}

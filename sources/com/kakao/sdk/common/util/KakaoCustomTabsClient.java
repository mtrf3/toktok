package com.kakao.sdk.common.util;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C16880lQ;
import X.ORY;
import X.X1D;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import com.kakao.sdk.common.util.SdkLog;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class KakaoCustomTabsClient {
    public static final KakaoCustomTabsClient INSTANCE = new KakaoCustomTabsClient();
    public static final String[] chromePackageNames = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private final boolean isPackageNameChrome(String str) {
        return ORY.LJJIJIIJIL(str, chromePackageNames);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r5 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String resolveCustomTabsPackage(android.content.Context r8, android.net.Uri r9) {
        /*
            r7 = this;
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r3.<init>(r0, r9)
            int r6 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r6 < r5) goto L97
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            r0 = 65536(0x10000, double:3.2379E-319)
            android.content.pm.PackageManager$ResolveInfoFlags r0 = android.content.pm.PackageManager.ResolveInfoFlags.of(r0)
            android.content.pm.ResolveInfo r4 = r2.resolveActivity(r3, r0)
        L1c:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r0 = "android.support.customtabs.action.CustomTabsService"
            android.content.Intent r3 = r1.setAction(r0)
            java.lang.String r0 = "Intent().setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            if (r6 < r5) goto L8d
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            r0 = 0
            android.content.pm.PackageManager$ResolveInfoFlags r0 = android.content.pm.PackageManager.ResolveInfoFlags.of(r0)
            java.util.List r1 = r2.queryIntentServices(r3, r0)
        L3c:
            java.lang.String r0 = "if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {\n            context.packageManager.queryIntentServices(\n                serviceIntent,\n                PackageManager.ResolveInfoFlags.of(0)\n            )\n        } else {\n            @Suppress(\"DEPRECATION\")\n            context.packageManager.queryIntentServices(serviceIntent, 0)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r6 = r1.iterator()
            r1 = 0
            r5 = r1
        L47:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r3 = r6.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            if (r5 != 0) goto L68
            android.content.pm.ServiceInfo r0 = r3.serviceInfo
            java.lang.String r2 = r0.packageName
            java.lang.String r0 = "info.serviceInfo.packageName"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            boolean r0 = r7.isPackageNameChrome(r2)
            if (r0 == 0) goto L68
            android.content.pm.ServiceInfo r0 = r3.serviceInfo
            java.lang.String r5 = r0.packageName
        L68:
            android.content.pm.ServiceInfo r0 = r3.serviceInfo
            java.lang.String r2 = r0.packageName
            if (r4 != 0) goto L85
        L6e:
            r0 = r1
        L6f:
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L47
            if (r4 != 0) goto L7b
        L77:
            if (r5 == 0) goto L7a
            r1 = r5
        L7a:
            return r1
        L7b:
            android.content.pm.ActivityInfo r0 = r4.activityInfo
            if (r0 != 0) goto L80
            goto L77
        L80:
            java.lang.String r1 = r0.packageName
            if (r1 != 0) goto L7a
            goto L77
        L85:
            android.content.pm.ActivityInfo r0 = r4.activityInfo
            if (r0 != 0) goto L8a
            goto L6e
        L8a:
            java.lang.String r0 = r0.packageName
            goto L6f
        L8d:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            r0 = 0
            java.util.List r1 = r1.queryIntentServices(r3, r0)
            goto L3c
        L97:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            r0 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r4 = r1.resolveActivity(r3, r0)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.common.util.KakaoCustomTabsClient.resolveCustomTabsPackage(android.content.Context, android.net.Uri):java.lang.String");
    }

    public final void open(Context context, Uri uri) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(uri, "uri");
        AnonymousClass004 anonymousClass004 = new AnonymousClass004();
        anonymousClass004.LIZ.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        anonymousClass004.LIZ.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        anonymousClass004.LIZ().LIZ(context, uri);
    }

    public final ServiceConnection openWithDefault(final Context context, final Uri uri) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(uri, "uri");
        final String resolveCustomTabsPackage = resolveCustomTabsPackage(context, uri);
        if (resolveCustomTabsPackage != null) {
            SdkLog.Companion companion = SdkLog.Companion;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Choosing ");
            LIZ.append(resolveCustomTabsPackage);
            LIZ.append(" as custom tabs browser");
            companion.d(X1D.LIZIZ(LIZ));
            AnonymousClass007 anonymousClass007 = new AnonymousClass007() { // from class: com.kakao.sdk.common.util.KakaoCustomTabsClient$openWithDefault$connection$1
                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    SdkLog.Companion.d(o.LJIILLIIL(componentName, "onServiceDisconnected: "));
                }

                @Override // X.AnonymousClass007
                public void onCustomTabsServiceConnected(ComponentName name, AnonymousClass003 client) {
                    o.LJIIIZ(name, "name");
                    o.LJIIIZ(client, "client");
                    AnonymousClass004 anonymousClass004 = new AnonymousClass004();
                    anonymousClass004.LIZ.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                    anonymousClass004.LIZ.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                    AnonymousClass005 LIZ2 = anonymousClass004.LIZ();
                    LIZ2.LIZ.setData(uri);
                    LIZ2.LIZ.setPackage(resolveCustomTabsPackage);
                    C16880lQ.LIZJ(context, LIZ2.LIZ);
                }
            };
            if (AnonymousClass003.LIZ(context, resolveCustomTabsPackage, anonymousClass007)) {
                return anonymousClass007;
            }
            return null;
        }
        throw new UnsupportedOperationException();
    }
}

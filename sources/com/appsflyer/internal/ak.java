package com.appsflyer.internal;

import X.C16880lQ;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class ak {
    public static String AFKeystoreWrapper;

    public static synchronized String AFInAppEventParameterName(WeakReference<Context> weakReference) {
        synchronized (ak.class) {
            if (weakReference.get() == null) {
                return AFKeystoreWrapper;
            }
            if (AFKeystoreWrapper == null) {
                String str = null;
                if (weakReference.get() != null) {
                    str = ai.values(weakReference.get()).getString("AF_INSTALLATION", null);
                }
                if (str != null) {
                    AFKeystoreWrapper = str;
                } else {
                    try {
                        File file = new File(C16880lQ.LLIIJLIL(weakReference.get()), "AF_INSTALLATION");
                        if (!file.exists()) {
                            AFKeystoreWrapper = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                        } else {
                            AFKeystoreWrapper = AFInAppEventParameterName(file);
                            C16880lQ.LLLZZIL(file);
                        }
                        String str2 = AFKeystoreWrapper;
                        SharedPreferences.Editor edit = ai.values(weakReference.get()).edit();
                        edit.putString("AF_INSTALLATION", str2);
                        edit.apply();
                    } catch (Exception e) {
                        AFLogger.valueOf("Error getting AF unique ID", e);
                    }
                }
                if (AFKeystoreWrapper != null) {
                    AppsFlyerProperties.getInstance().set("uid", AFKeystoreWrapper);
                }
            }
            return AFKeystoreWrapper;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String AFInAppEventParameterName(java.io.File r6) {
        /*
            java.lang.String r5 = "Exception while trying to close the InstallationFile"
            r4 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L45
            java.lang.String r0 = "r"
            r3.<init>(r6, r0)     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L45
            long r1 = r3.length()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            int r0 = (int) r1     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            byte[] r4 = new byte[r0]     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r3.readFully(r4)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r3.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r3.close()     // Catch: java.io.IOException -> L1b
            goto L39
        L1b:
            r0 = move-exception
            com.appsflyer.AFLogger.valueOf(r5, r0)
            goto L39
        L20:
            r1 = move-exception
            r4 = r3
            goto L46
        L23:
            r1 = move-exception
            r2 = r4
            r4 = r3
            goto L29
        L27:
            r1 = move-exception
            r2 = r4
        L29:
            java.lang.String r0 = "Exception while reading InstallationFile: "
            com.appsflyer.AFLogger.valueOf(r0, r1)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L38
            r4.close()     // Catch: java.io.IOException -> L34
            goto L38
        L34:
            r0 = move-exception
            com.appsflyer.AFLogger.valueOf(r5, r0)
        L38:
            r4 = r2
        L39:
            java.lang.String r1 = new java.lang.String
            if (r4 == 0) goto L41
        L3d:
            r1.<init>(r4)
            return r1
        L41:
            r0 = 0
            byte[] r4 = new byte[r0]
            goto L3d
        L45:
            r1 = move-exception
        L46:
            if (r4 == 0) goto L50
            r4.close()     // Catch: java.io.IOException -> L4c
            goto L50
        L4c:
            r0 = move-exception
            com.appsflyer.AFLogger.valueOf(r5, r0)
        L50:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ak.AFInAppEventParameterName(java.io.File):java.lang.String");
    }
}

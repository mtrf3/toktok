package com.ttnet.org.chromium.base;

/* loaded from: classes7.dex */
public class ApkAssets {
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IOException -> 0x0054, all -> 0x0078, TryCatch #2 {IOException -> 0x0054, blocks: (B:3:0x0005, B:5:0x000d, B:10:0x002b, B:11:0x0014, B:13:0x001c, B:16:0x002f), top: B:2:0x0005, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long[] open(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = 2
            r6 = 1
            r5 = 0
            r3 = 3
            r4 = 0
            android.content.Context r2 = X.O6T.LIZ     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            if (r0 != 0) goto L2f
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            r0 = 26
            if (r1 >= r0) goto L14
            goto L28
        L14:
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            java.lang.String[] r0 = r0.splitNames     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            if (r0 == 0) goto L28
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            boolean r0 = r0.contains(r9)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L2f
            android.content.Context r2 = com.ttnet.org.chromium.base.BundleUtils.LIZ(r2, r9)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
        L2f:
            android.content.res.AssetManager r0 = r2.getAssets()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            android.content.res.AssetFileDescriptor r4 = r0.openNonAssetFd(r8)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            long[] r2 = new long[r3]     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            android.os.ParcelFileDescriptor r0 = r4.getParcelFileDescriptor()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            int r0 = r0.detachFd()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            long r0 = (long) r0     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            r2[r5] = r0     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            long r0 = r4.getStartOffset()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            r2[r6] = r0     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            long r0 = r4.getLength()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            r2[r7] = r0     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L78
            r4.close()     // Catch: java.io.IOException -> L53
        L53:
            return r2
        L54:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L68
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L78
            r0.equals(r8)     // Catch: java.lang.Throwable -> L78
        L68:
            long[] r2 = new long[r3]     // Catch: java.lang.Throwable -> L78
            r0 = -1
            r2[r5] = r0     // Catch: java.lang.Throwable -> L78
            r2[r6] = r0     // Catch: java.lang.Throwable -> L78
            r2[r7] = r0     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L77
            r4.close()     // Catch: java.io.IOException -> L77
        L77:
            return r2
        L78:
            r0 = move-exception
            if (r4 == 0) goto L7e
            r4.close()     // Catch: java.io.IOException -> L7e
        L7e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.ApkAssets.open(java.lang.String, java.lang.String):long[]");
    }
}

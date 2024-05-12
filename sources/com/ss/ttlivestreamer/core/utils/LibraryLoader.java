package com.ss.ttlivestreamer.core.utils;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import defpackage.a1;
import java.io.File;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class LibraryLoader {
    public static Loader sLoader;
    public static File sPrivateLibsDir;
    public static WeakReference<Context> sWeakContext;

    /* loaded from: classes7.dex */
    public interface Loader {
        boolean loadLibrary(String str);

        boolean loadLibraryFromPath(String str);
    }

    public static boolean loadLibrary(String str) {
        Loader loader = sLoader;
        if (!TextUtils.isEmpty(str)) {
            if (loader != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Loading [");
                LIZ.append(str);
                LIZ.append("] with external loader ");
                LIZ.append(loader);
                EarlyAVLog.println(5, "LibraryLoader", X1D.LIZIZ(LIZ), null);
                return loader.loadLibrary(str);
            }
            C16880lQ.LLJJJIL(str);
            return true;
        }
        throw new Exception("Invalid library name.");
    }

    public static void loadLibraryFromPath(String str) {
        Loader loader = sLoader;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                if (loader != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Loading [");
                    LIZ.append(file.getAbsolutePath());
                    LIZ.append("] with external loader ");
                    LIZ.append(loader);
                    EarlyAVLog.println(5, "LibraryLoader", X1D.LIZIZ(LIZ), null);
                    loader.loadLibraryFromPath(file.getAbsolutePath());
                    return;
                }
                System.load(file.getAbsolutePath());
                return;
            }
            throw new Exception(a1.LJ("Not found library '", str, "' file."));
        }
        throw new Exception("Invalid library name.");
    }

    public static boolean loadLocalLibrary(String str) {
        WeakReference<Context> weakReference;
        Context context;
        if (sPrivateLibsDir == null && (weakReference = sWeakContext) != null && (context = weakReference.get()) != null) {
            sPrivateLibsDir = context.getDir("libs", 0);
            DebugLogUtils.isEnableDebugLog();
        }
        if (sPrivateLibsDir == null) {
            DebugLogUtils.isEnableDebugLog();
            return false;
        }
        WeakReference<Context> weakReference2 = sWeakContext;
        if (weakReference2 == null || weakReference2.get() == null) {
            DebugLogUtils.isEnableDebugLog();
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(sPrivateLibsDir.getPath());
        LIZ.append("/");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLIIJI(sWeakContext.get(), null).getAbsolutePath());
        LIZ2.append("/");
        LIZ2.append(str);
        if (!copyLibrary(LIZIZ, X1D.LIZIZ(LIZ2))) {
            DebugLogUtils.isEnableDebugLog();
            return false;
        }
        try {
            System.load(LIZIZ);
            DebugLogUtils.isEnableDebugLog();
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static void setupLibraryLoader(Loader loader) {
        sLoader = loader;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loader ");
        LIZ.append(loader);
        EarlyAVLog.println(5, "setupLibraryLoader", X1D.LIZIZ(LIZ), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0047, code lost:
    
        if (0 == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean copyLibrary(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = 0
            r5 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L52
            r2.<init>(r7)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L52
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L52
            r1.<init>(r8)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L52
            com.ss.ttlivestreamer.core.utils.DebugLogUtils.isEnableDebugLog()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L52
            boolean r0 = r2.exists()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L52
            if (r0 == 0) goto L18
            X.C16880lQ.LLLZZIL(r2)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L52
        L18:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L52
            r4.<init>(r1)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L52
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L46
            r3.<init>(r2)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L46
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        L26:
            int r1 = r4.read(r2)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r0 = -1
            if (r1 == r0) goto L31
            r3.write(r2, r6, r1)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            goto L26
        L31:
            r3.flush()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r3.close()     // Catch: java.lang.Exception -> L37
        L37:
            r4.close()     // Catch: java.lang.Exception -> L3a
        L3a:
            r0 = 1
            return r0
        L3c:
            r0 = move-exception
            r5 = r3
            goto L49
        L3f:
            r5 = r3
            goto L42
        L41:
            r4 = r5
        L42:
            com.ss.ttlivestreamer.core.utils.DebugLogUtils.isEnableDebugLog()     // Catch: java.lang.Throwable -> L46
            goto L54
        L46:
            r0 = move-exception
            if (r5 == 0) goto L4c
        L49:
            r5.close()     // Catch: java.lang.Exception -> L4c
        L4c:
            if (r4 == 0) goto L53
            r4.close()     // Catch: java.lang.Exception -> L53
            goto L53
        L52:
            r0 = move-exception
        L53:
            throw r0
        L54:
            if (r5 == 0) goto L59
            r5.close()     // Catch: java.lang.Exception -> L59
        L59:
            if (r4 == 0) goto L5e
            r4.close()     // Catch: java.lang.Exception -> L5e
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.core.utils.LibraryLoader.copyLibrary(java.lang.String, java.lang.String):boolean");
    }

    public static void setupLibraryLoader(Loader loader, Context context) {
        setupLibraryLoader(loader);
        sWeakContext = new WeakReference<>(context);
    }
}

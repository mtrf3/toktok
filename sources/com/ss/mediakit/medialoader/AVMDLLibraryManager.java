package com.ss.mediakit.medialoader;

import X.C16880lQ;
import X.C39045FUb;
import com.ss.mediakit.vcnlib.VcnlibloadWrapper;

/* loaded from: classes9.dex */
public class AVMDLLibraryManager {
    public static boolean dependBoringSSl = true;
    public static boolean dependVcn = true;
    public static boolean enableV2 = false;
    public static IAVMDLLibraryLoader libraryLoader = null;
    public static int loadLevel = 0;
    public static boolean needBase = true;
    public static boolean needP2PLib;
    public static boolean needTTnetLib;
    public static boolean useShadowVersion;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r1 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean loadLibraries() {
        /*
            java.lang.Class<com.ss.mediakit.medialoader.AVMDLLibraryManager> r4 = com.ss.mediakit.medialoader.AVMDLLibraryManager.class
            monitor-enter(r4)
            tryLoadSSL()     // Catch: java.lang.Throwable -> L42
            tryLoadVcn()     // Catch: java.lang.Throwable -> L42
            boolean r0 = com.ss.mediakit.medialoader.AVMDLLibraryManager.needBase     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L11
            r0 = 4
            tryLoadLibray(r0)     // Catch: java.lang.Throwable -> L42
        L11:
            boolean r0 = com.ss.mediakit.medialoader.AVMDLLibraryManager.enableV2     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r0 == 0) goto L2a
            r2 = 16
            boolean r1 = tryLoadLibray(r2)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L28
            boolean r0 = com.ss.mediakit.medialoader.AVMDLLibraryManager.useShadowVersion     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L2a
            com.ss.mediakit.medialoader.AVMDLLibraryManager.useShadowVersion = r3     // Catch: java.lang.Throwable -> L42
            boolean r1 = tryLoadLibray(r2)     // Catch: java.lang.Throwable -> L42
        L28:
            if (r1 != 0) goto L40
        L2a:
            r0 = 8
            boolean r1 = tryLoadLibray(r0)     // Catch: java.lang.Throwable -> L42
            boolean r0 = com.ss.mediakit.medialoader.AVMDLLibraryManager.needP2PLib     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L38
            r0 = 1
            tryLoadLibray(r0)     // Catch: java.lang.Throwable -> L42
        L38:
            boolean r0 = com.ss.mediakit.medialoader.AVMDLLibraryManager.needTTnetLib     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L40
            r0 = 2
            tryLoadLibray(r0)     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r4)
            return r1
        L42:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLLibraryManager.loadLibraries():boolean");
    }

    public static boolean tryLoadSSL() {
        boolean z;
        if (shouldLoadLib(32)) {
            z = libraryLoader.loadLibrary("ttcrypto");
            if (z && (z = libraryLoader.loadLibrary("ttboringssl"))) {
                return z;
            }
        } else {
            z = false;
        }
        try {
            if (dependBoringSSl) {
                C39045FUb.LIZ();
                return true;
            }
            return z;
        } catch (Exception unused) {
            return z;
        }
    }

    public static boolean tryLoadVcn() {
        boolean loadLibrary;
        if (!dependVcn) {
            return true;
        }
        if (!shouldLoadLib(64) || !(loadLibrary = libraryLoader.loadLibrary("vcn"))) {
            boolean tryLoadVcnlib = VcnlibloadWrapper.tryLoadVcnlib();
            if (tryLoadVcnlib) {
                return VcnlibloadWrapper.tryLoadVcnverifylib();
            }
            return tryLoadVcnlib;
        }
        return loadLibrary;
    }

    public static synchronized void setBoringSSLDependency(boolean z) {
        synchronized (AVMDLLibraryManager.class) {
            dependBoringSSl = z;
        }
    }

    public static synchronized void setEnableV2(boolean z) {
        synchronized (AVMDLLibraryManager.class) {
            enableV2 = z;
        }
    }

    public static synchronized void setLibraryLoadLevel(int i) {
        synchronized (AVMDLLibraryManager.class) {
            loadLevel = i;
        }
    }

    public static synchronized void setLibraryLoader(IAVMDLLibraryLoader iAVMDLLibraryLoader) {
        synchronized (AVMDLLibraryManager.class) {
            libraryLoader = iAVMDLLibraryLoader;
        }
    }

    public static synchronized void setNeedBase(boolean z) {
        synchronized (AVMDLLibraryManager.class) {
            needBase = z;
        }
    }

    public static synchronized void setNeedP2PLib(boolean z) {
        synchronized (AVMDLLibraryManager.class) {
            needP2PLib = z;
        }
    }

    public static synchronized void setNeedTTnetLib(boolean z) {
        synchronized (AVMDLLibraryManager.class) {
            needTTnetLib = z;
        }
    }

    public static synchronized void setUseShadowVersion(boolean z) {
        synchronized (AVMDLLibraryManager.class) {
            useShadowVersion = z;
        }
    }

    public static synchronized void setVcnDependency(boolean z) {
        synchronized (AVMDLLibraryManager.class) {
            dependVcn = z;
        }
    }

    public static boolean shouldLoadLib(int i) {
        if (libraryLoader == null || i <= 0 || (loadLevel & i) != i) {
            return false;
        }
        return true;
    }

    public static boolean tryLoadLibray(int i) {
        String str;
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            return false;
                        }
                        if (useShadowVersion) {
                            str = "avmdls";
                        } else {
                            str = "avmdlv2";
                        }
                    } else {
                        str = "avmdl";
                    }
                } else {
                    str = "avmdlbase";
                }
            } else {
                str = "avmdlttnet";
            }
        } else {
            str = "avmdlp2p";
        }
        if (!shouldLoadLib(i) || !(z = libraryLoader.loadLibrary(str))) {
            try {
                C16880lQ.LLJJJIL(str);
                return true;
            } catch (Throwable unused) {
            }
        }
        return z;
    }
}

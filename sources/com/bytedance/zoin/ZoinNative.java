package com.bytedance.zoin;

import X.C16880lQ;
import X.C39639Fh5;
import X.C39733Fib;
import X.C39734Fic;
import X.X1D;
import android.content.res.AssetManager;
import com.bytedance.zoin.model.ZoinBuildFileInfo;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class ZoinNative {
    public static volatile boolean isLoaded;

    public static native int bypassDexFileVerify();

    public static native boolean nCheckSupportNativeFastLoad(int i, Class<RuntimeException> cls);

    public static native int nClearNamespace();

    public static native String nCollectDlopenStats();

    public static native int nDecode(AssetManager assetManager, String str, String str2, long j, long j2, int i, int i2, ZoinBuildFileInfo[] zoinBuildFileInfoArr, boolean z, boolean z2, boolean z3);

    public static native String nDumpDebugLogs();

    public static native int nHookDlopen(String[] strArr, boolean z);

    public static native int nInit(boolean z, boolean z2);

    public static native int nLinkNamespace(ClassLoader classLoader, String str, String str2);

    public static native Object nLoadDirectDex(String str, byte[] bArr);

    public static native int nLockerClose(int i);

    public static native int nLockerCreate(String str);

    public static native boolean nLockerIsLocked(int i);

    public static native int nLockerLock(int i);

    public static native int nLockerReleaseLock(int i);

    public static native boolean nMakeOptDexFile(String str, String str2);

    public static native int nPreFallocate(ZoinBuildFileInfo[] zoinBuildFileInfoArr);

    public static native int nSetLibsLoaded(String[] strArr);

    static {
        C39734Fic LIZJ = C39734Fic.LIZJ();
        try {
            LIZJ.getClass();
            C16880lQ.LLJJJIL("zoin");
            int nInit = nInit(LIZJ instanceof C39733Fib, false);
            boolean z = true;
            if (nInit != 1) {
                z = false;
            }
            isLoaded = z;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ZoinNative init ");
            LIZ.append(nInit);
            X1D.LIZIZ(LIZ);
            List<String> list = C39639Fh5.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("load zoin: success ");
            LIZ2.append(nInit);
            ((CopyOnWriteArrayList) list).add(X1D.LIZIZ(LIZ2));
        } catch (UnsatisfiedLinkError e) {
            isLoaded = false;
            LIZJ.getClass();
            List<String> list2 = C39639Fh5.LIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("load zoin:");
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            LIZ3.append(stringWriter.toString());
            ((CopyOnWriteArrayList) list2).add(X1D.LIZIZ(LIZ3));
        }
    }

    public static boolean isIsLoaded() {
        return isLoaded;
    }
}

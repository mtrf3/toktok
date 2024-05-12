package com.bytedance.crash.npth_fd_track;

import X.C78685UuP;
import X.X1D;

/* loaded from: classes12.dex */
public class FDNativeTools {
    public static boolean LIZ;

    public static native int doInitNativeParams(String[] strArr);

    public static native int nativeDoCommand(int i);

    public static native int nativeGetFdCount();

    public static int LIZIZ() {
        if (LIZ) {
            int nativeGetFdCount = nativeGetFdCount();
            if (nativeGetFdCount <= 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("get fd count err: ");
                LIZ2.append(nativeGetFdCount);
                X1D.LIZIZ(LIZ2);
                C78685UuP.LJJJLZIJ();
            }
            return nativeGetFdCount;
        }
        return -111;
    }

    public static int LIZ(int i) {
        if (LIZ) {
            int nativeDoCommand = nativeDoCommand(i);
            if (nativeDoCommand != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(i);
                LIZ2.append(" ==> ");
                LIZ2.append(nativeDoCommand);
                X1D.LIZIZ(LIZ2);
                C78685UuP.LJJJLZIJ();
            }
            return nativeDoCommand;
        }
        return -111;
    }

    public static int LIZJ(String[] strArr) {
        if (LIZ) {
            int doInitNativeParams = doInitNativeParams(strArr);
            if (doInitNativeParams != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("init params err: ");
                LIZ2.append(doInitNativeParams);
                X1D.LIZIZ(LIZ2);
                C78685UuP.LJJJLZIJ();
            }
            return doInitNativeParams;
        }
        return -111;
    }
}

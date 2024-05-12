package com.bytedance.common.jato.boost;

import X.C36729EbF;
import X.C48693J9d;

/* loaded from: classes7.dex */
public class CpusetManager {
    public static int[] bigCoreNum;
    public static int[] littleCoreNum;
    public static final Object mInitLock = new Object();
    public static boolean mHasInited = false;

    public static void bindBigCore() {
        bindCore(-1, 2);
    }

    public static void bindLittleCore() {
        bindCore(-1, 1);
    }

    public static void resetCoreBind() {
        resetCoreBind(-1);
    }

    public static native void resetCpuSetTid(int i);

    public static native void setCpuSetTid(int i, int[] iArr);

    public static boolean isReady() {
        if (littleCoreNum != null && bigCoreNum != null) {
            return true;
        }
        return false;
    }

    public static void init() {
        boolean LIZ = C36729EbF.LIZ();
        synchronized (mInitLock) {
            if (mHasInited) {
                return;
            }
            if (LIZ) {
                littleCoreNum = C36729EbF.LIZ;
                bigCoreNum = C36729EbF.LIZIZ;
            }
            mHasInited = true;
        }
    }

    public static void bindBigCore(int i) {
        bindCore(i, 2);
    }

    public static void bindLittleCore(int i) {
        bindCore(i, 1);
    }

    public static void resetCoreBind(int i) {
        if (!C48693J9d.LJFF()) {
            return;
        }
        synchronized (mInitLock) {
            if (isReady()) {
                resetCpuSetTid(i);
            }
        }
    }

    public static void bindCore(int i, int i2) {
        int[] iArr;
        if (!C48693J9d.LJFF()) {
            return;
        }
        synchronized (mInitLock) {
            if (i2 == 2) {
                iArr = bigCoreNum;
            } else if (i2 == 1) {
                iArr = littleCoreNum;
            }
            if (iArr != null && isReady()) {
                setCpuSetTid(i, iArr);
            }
        }
    }
}

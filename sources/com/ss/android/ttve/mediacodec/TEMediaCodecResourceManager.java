package com.ss.android.ttve.mediacodec;

import X.C65429Pm5;
import X.P4Q;
import X.X1D;
import android.os.Build;
import com.ss.android.vesdk.VEConfigCenter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class TEMediaCodecResourceManager {
    public static int sMaxCodecBlocksSize;
    public static int sUsedCodecBlocksSize;
    public static List<Integer> sMediaCodecInstance = new ArrayList();
    public static int sSafeLimitSize = 2304000;
    public static volatile boolean sHWEncoderStateIsBeforeRunning = false;
    public static volatile boolean sExistHWEncoder = false;

    public static synchronized int getMaxCodecBlocksSize() {
        int i;
        synchronized (TEMediaCodecResourceManager.class) {
            if (sMaxCodecBlocksSize == 0) {
                sMaxCodecBlocksSize = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sMaxCodecBlocksSize: ");
                LIZ.append(sMaxCodecBlocksSize);
                P4Q.LJFF("TEMediaCodecResourceManager", X1D.LIZIZ(LIZ));
            }
            i = sMaxCodecBlocksSize;
        }
        return i;
    }

    public static int getReuseDecoderType() {
        if (Build.MODEL.toLowerCase().contains("nth-an00")) {
            return 1;
        }
        return 0;
    }

    public static synchronized int getUsedCodecBlocksSize() {
        int i;
        synchronized (TEMediaCodecResourceManager.class) {
            i = sUsedCodecBlocksSize;
        }
        return i;
    }

    public static synchronized void resetCodecBlocksSize() {
        synchronized (TEMediaCodecResourceManager.class) {
            sUsedCodecBlocksSize = 0;
            sMaxCodecBlocksSize = 0;
            sMediaCodecInstance.clear();
            P4Q.LIZ("TEMediaCodecResourceManager", "resetCodecBlocksSize");
        }
    }

    public static int getAvailableCodecSize() {
        int maxCodecBlocksSize;
        if (!C65429Pm5.LJFF("ve_mediacodec_resource_reasonable_distribute", false) || (maxCodecBlocksSize = getMaxCodecBlocksSize()) <= 0) {
            return -1;
        }
        return maxCodecBlocksSize - sUsedCodecBlocksSize;
    }

    public static synchronized int canUseHardwareDecoder(int i) {
        synchronized (TEMediaCodecResourceManager.class) {
            int i2 = 0;
            if (!VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue()) {
                return -1;
            }
            if (sMaxCodecBlocksSize == 0) {
                sMaxCodecBlocksSize = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sMaxCodecBlocksSize: ");
                LIZ.append(sMaxCodecBlocksSize);
                P4Q.LJFF("TEMediaCodecResourceManager", X1D.LIZIZ(LIZ));
            }
            int i3 = sMaxCodecBlocksSize;
            if (i3 <= 0) {
                return -1;
            }
            if (sUsedCodecBlocksSize + i > i3) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("can't use hw decoder, sMaxCodecBlocksSize:");
                LIZ2.append(sMaxCodecBlocksSize);
                LIZ2.append(", sUsedCodecBlocksSize:");
                LIZ2.append(sUsedCodecBlocksSize);
                LIZ2.append(", blocksSize:");
                LIZ2.append(i);
                P4Q.LJII("TEMediaCodecResourceManager", X1D.LIZIZ(LIZ2));
            } else {
                i2 = 1;
            }
            return i2;
        }
    }

    public static synchronized void freeCodecBlocksSize(int i, int i2) {
        synchronized (TEMediaCodecResourceManager.class) {
            if (!sMediaCodecInstance.contains(Integer.valueOf(i2))) {
                return;
            }
            sUsedCodecBlocksSize -= i;
            sMediaCodecInstance.remove(Integer.valueOf(i2));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("freeCodecBlocksSize blocksSize: ");
            LIZ.append(i);
            LIZ.append(", sUsedCodecBlocksSize: ");
            LIZ.append(sUsedCodecBlocksSize);
            LIZ.append(", ");
            LIZ.append(i2);
            P4Q.LIZ("TEMediaCodecResourceManager", X1D.LIZIZ(LIZ));
            if (sUsedCodecBlocksSize < 0) {
                P4Q.LJII("TEMediaCodecResourceManager", "freeCodecBlocksSize sUsedCodecBlocksSize < 0");
                sUsedCodecBlocksSize = 0;
            }
        }
    }

    public static synchronized boolean tryUseCodecBlocksSize(int i, int i2) {
        synchronized (TEMediaCodecResourceManager.class) {
            if (sMaxCodecBlocksSize == 0) {
                sMaxCodecBlocksSize = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sMaxCodecBlocksSize: ");
                LIZ.append(sMaxCodecBlocksSize);
                P4Q.LJFF("TEMediaCodecResourceManager", X1D.LIZIZ(LIZ));
            }
            if (sMaxCodecBlocksSize == -1) {
                return true;
            }
            if (sMediaCodecInstance.contains(Integer.valueOf(i2))) {
                return true;
            }
            int i3 = sUsedCodecBlocksSize;
            if (i3 + i > sMaxCodecBlocksSize) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("sUsedCodecBlocksSize + blocksSize > sMaxCodecBlocksSize, sUsedCodecBlocksSize: ");
                LIZ2.append(sUsedCodecBlocksSize);
                LIZ2.append(", blocksSize:");
                LIZ2.append(i);
                P4Q.LJII("TEMediaCodecResourceManager", X1D.LIZIZ(LIZ2));
                return false;
            }
            sUsedCodecBlocksSize = i3 + i;
            sMediaCodecInstance.add(Integer.valueOf(i2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("tryUseCodecBlocksSize success blocksSize: ");
            LIZ3.append(i);
            LIZ3.append(", sUsedCodecBlocksSize: ");
            LIZ3.append(sUsedCodecBlocksSize);
            LIZ3.append(", ");
            LIZ3.append(i2);
            P4Q.LIZ("TEMediaCodecResourceManager", X1D.LIZIZ(LIZ3));
            return true;
        }
    }

    public static synchronized boolean checkCanFastImport(int i, int i2, int i3) {
        synchronized (TEMediaCodecResourceManager.class) {
            if (sMaxCodecBlocksSize == 0) {
                sMaxCodecBlocksSize = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sMaxCodecBlocksSize: ");
                LIZ.append(sMaxCodecBlocksSize);
                P4Q.LJFF("TEMediaCodecResourceManager", X1D.LIZIZ(LIZ));
            }
            int i4 = sMaxCodecBlocksSize;
            if (i4 == -1) {
                return true;
            }
            int i5 = sUsedCodecBlocksSize;
            int i6 = i * i2 * i3;
            if (i5 + i6 > i4) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("checkCanFastImport is false, sUsedCodecBlocksSize: ");
                LIZ2.append(sUsedCodecBlocksSize);
                LIZ2.append(", width: ");
                LIZ2.append(i);
                LIZ2.append(", height: ");
                LIZ2.append(i2);
                LIZ2.append(", fps: ");
                LIZ2.append(i3);
                P4Q.LIZ("TEMediaCodecResourceManager", X1D.LIZIZ(LIZ2));
                return false;
            }
            if (i5 > 0) {
                int i7 = sSafeLimitSize;
                if (i4 - i7 > 0 && i5 + i6 > i4 - i7) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("checkCanFastImport is false, sUsedCodecBlocksSize: ");
                    LIZ3.append(sUsedCodecBlocksSize);
                    LIZ3.append(", width: ");
                    LIZ3.append(i);
                    LIZ3.append(", height: ");
                    LIZ3.append(i2);
                    LIZ3.append(", fps: ");
                    LIZ3.append(i3);
                    P4Q.LIZ("TEMediaCodecResourceManager", X1D.LIZIZ(LIZ3));
                    return false;
                }
            }
            P4Q.LIZ("TEMediaCodecResourceManager", "checkCanFastImport is true");
            return true;
        }
    }
}

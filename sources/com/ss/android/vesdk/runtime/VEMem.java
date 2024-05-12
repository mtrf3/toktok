package com.ss.android.vesdk.runtime;

import X.C63868P4u;
import X.C65429Pm5;
import X.P4Q;
import X.X1D;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.VEConfigCenter;

/* loaded from: classes12.dex */
public class VEMem {
    public static VEMem sInstance;
    public boolean mEnableMemoryMode;
    public boolean mEnableUploadMemSize;
    public boolean mIsArm64v8a;
    public boolean mIsLocalTest;
    public int mLowMemThreshold;
    public int mTotalVirtualSize;
    public final int MEM_THRESHOLD = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    public boolean mFirstTimeEnterRecord = true;

    private native String nativeGetRuntimeMemoryInfo();

    public static VEMem getInstance() {
        if (sInstance == null) {
            synchronized (VEMem.class) {
                if (sInstance == null) {
                    sInstance = new VEMem();
                }
            }
        }
        return sInstance;
    }

    public boolean inLowMemMode() {
        if (!this.mEnableMemoryMode) {
            P4Q.LJFF("VEMem", "memory mode disabled");
            return false;
        }
        if (this.mIsArm64v8a) {
            P4Q.LJFF("VEMem", "cpu_abi is arm64-v8a, virtual mem info is unnecessary");
            return false;
        }
        double virtualMemSize = this.mTotalVirtualSize - getVirtualMemSize();
        if (virtualMemSize >= this.mLowMemThreshold) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("In low memory mode: free memory size = ");
        LIZ.append(virtualMemSize);
        LIZ.append(" threshold = ");
        LIZ.append(this.mLowMemThreshold);
        P4Q.LJII("VEMem", X1D.LIZIZ(LIZ));
        return true;
    }

    static {
        TENativeLibsLoader.loadBase();
        sInstance = null;
    }

    public VEMem() {
        this.mTotalVirtualSize = 4096;
        this.mLowMemThreshold = 300;
        TENativeLibsLoader.loadBase();
        this.mEnableUploadMemSize = VEConfigCenter.getInstance().getValue("ve_enable_upload_virtual_mem_size", false).booleanValue();
        this.mEnableMemoryMode = C65429Pm5.LJFF("ve_enable_memory_mode", false);
        this.mLowMemThreshold = VEConfigCenter.getInstance().getValue("ve_low_memory_threshold", 300);
        String str = Build.SUPPORTED_ABIS[0];
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cpu_abi = ");
        LIZ.append(str);
        P4Q.LJFF("VEMem", X1D.LIZIZ(LIZ));
        if (str.equals("armeabi-v7a")) {
            this.mTotalVirtualSize = 3072;
            P4Q.LJFF("VEMem", "set mTotalVirtualSize to 3072MB");
        }
        this.mIsArm64v8a = VERuntime.nativeIsArm64();
    }

    public String getRuntimeMemoryInfo() {
        return nativeGetRuntimeMemoryInfo();
    }

    public double getVirtualMemSize() {
        return VERuntime.nativeGetVirtualMemInfo();
    }

    public boolean isArm64() {
        return this.mIsArm64v8a;
    }

    public void setIsLocalTest(boolean z) {
        this.mIsLocalTest = z;
    }

    public void uploadVirtualMemSize(int i) {
        String str;
        if (!this.mEnableUploadMemSize) {
            P4Q.LJFF("VEMem", "upload mem size is disabled");
            return;
        }
        if (this.mIsArm64v8a) {
            P4Q.LJFF("VEMem", "cpu_abi is arm64-v8a, virtual mem info is unnecessary");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        double virtualMemSize = getVirtualMemSize();
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get virtual mem size cost ");
        LIZ.append(currentTimeMillis2 - currentTimeMillis);
        LIZ.append("ms");
        P4Q.LJFF("VEMem", X1D.LIZIZ(LIZ));
        if (virtualMemSize <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                str = "";
                            } else {
                                str = "te_composition_leave_virtual_memory_size";
                                C63868P4u.LIZLLL("te_composition_leave_virtual_memory_size", virtualMemSize);
                            }
                        } else {
                            str = "te_composition_enter_virtual_memory_size";
                            C63868P4u.LIZLLL("te_composition_enter_virtual_memory_size", virtualMemSize);
                        }
                    } else {
                        str = "te_edit_leave_virtual_memory_size";
                        C63868P4u.LIZLLL("te_edit_leave_virtual_memory_size", virtualMemSize);
                    }
                } else {
                    str = "te_edit_enter_virtual_memory_size";
                    C63868P4u.LIZLLL("te_edit_enter_virtual_memory_size", virtualMemSize);
                }
            } else {
                str = "te_record_leave_virtual_memory_size";
                C63868P4u.LIZLLL("te_record_leave_virtual_memory_size", virtualMemSize);
            }
        } else {
            str = "te_record_enter_virtual_memory_size";
            C63868P4u.LIZLLL("te_record_enter_virtual_memory_size", virtualMemSize);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(" virtual mem size ");
        LIZ2.append(virtualMemSize);
        LIZ2.append("MB");
        P4Q.LJFF("VEMem", X1D.LIZIZ(LIZ2));
        long currentTimeMillis3 = System.currentTimeMillis();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("upload virtual mem size cost ");
        LIZ3.append(currentTimeMillis3 - currentTimeMillis2);
        P4Q.LJFF("VEMem", X1D.LIZIZ(LIZ3));
    }
}

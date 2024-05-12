package com.bytedance.vmsdk.worker;

/* loaded from: classes7.dex */
public class VmSdkException extends Exception {
    public final int LJLIL;

    public int getCode() {
        return this.LJLIL;
    }

    public VmSdkException(int i, String str) {
        super(str);
        this.LJLIL = i;
    }

    public static void throwVmSdkException(int i, String str) {
        throw new VmSdkException(i, str);
    }
}

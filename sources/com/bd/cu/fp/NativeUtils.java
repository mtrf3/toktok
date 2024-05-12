package com.bd.cu.fp;

import X.C16880lQ;

/* loaded from: classes.dex */
public class NativeUtils {
    public static native byte[] crypt(long j, byte[] bArr);

    public static native long nativeInit(String str);

    public static native void release(long j);

    static {
        C16880lQ.LLJJJIL("fileprotect");
    }
}

package com.bytedance.frameworks.encryptor;

import X.C16880lQ;

/* loaded from: classes7.dex */
public class EncryptorUtil {
    public static native byte[] ttEncrypt(byte[] bArr, int i);

    static {
        try {
            C16880lQ.LLJJJIL("Encryptor");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    public static byte[] LIZ(int i, byte[] bArr) {
        if (bArr != null && i > 0) {
            try {
                if (bArr.length == i) {
                    return ttEncrypt(bArr, i);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}

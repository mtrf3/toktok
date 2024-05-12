package com.bytedance.ropa.encrypt;

import X.C16880lQ;

/* loaded from: classes9.dex */
public class RopaEncrypt {
    public static final /* synthetic */ int LIZ = 0;

    public static native String decryptData(String str, String str2, String str3, String str4, String str5, String str6);

    public static native String encryptData(String str, String str2, String str3, String str4, String str5, String str6);

    public static native String generateKey(long j);

    public static native EncryptResult getDecryptSeq(String str);

    public static native EncryptResult getEncryptSeq(String str, boolean z);

    public static native EncryptResult getEncryptSeqV2(String str, int i, String str2);

    public static native long getHash(String str);

    public static native long getRandom();

    static {
        try {
            C16880lQ.LLJJJIL("ropaencrypt");
        } catch (Throwable unused) {
        }
    }
}

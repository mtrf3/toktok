package com.bytedance.security.Sword;

import X.C16880lQ;

/* loaded from: classes30.dex */
public class Sword {
    public static native byte[] GenKeySeed();

    public static native int GetCryptoMethod();

    public static native int IsSupportedMethod(int i);

    public static native byte[] WBCKGenKeySeed();

    public static native int WBCKGetCryptoMethod();

    public static native byte[] WBCKPacked(byte[] bArr, int i, byte[] bArr2, int i2);

    public static native byte[] WBCKPackedNaked(byte[] bArr, int i, byte[] bArr2, int i2);

    public static native byte[] WBCKUnpacked(byte[] bArr, int i, byte[] bArr2);

    public static native byte[] clientPacked(byte[] bArr, int i);

    public static native String clientPackedBase64(byte[] bArr, int i);

    public static native byte[] clientPackedNaked(byte[] bArr, int i, int i2, byte[] bArr2);

    public static native String clientPackedNakedBase64(byte[] bArr, int i, int i2, byte[] bArr2);

    public static native byte[] clientUnpacked(byte[] bArr, int i);

    public static native byte[] clientUnpackedBase64(String str);

    public static native byte[] clientUnpackedNaked(byte[] bArr, int i, int i2, byte[] bArr2);

    public static native byte[] clientUnpackedNakedBase64(String str, int i, String str2);

    static {
        try {
            C16880lQ.LLJJJIL("bdsword");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }
}

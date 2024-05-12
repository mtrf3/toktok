package com.bytedance.pns.psi;

import X.C16880lQ;

/* loaded from: classes7.dex */
public final class PsiEncrypt {
    public static final Companion LIZ = new Companion();

    /* loaded from: classes7.dex */
    public static final class Companion {
        public final native byte[] blind(byte[] bArr, byte[] bArr2);

        public final native byte[] createNewKey();

        public final native byte[] encrypt(String str, byte[] bArr);

        public final native byte[] getPrefixBytes(String str);

        public final native long murmur3_32(byte[] bArr);

        public final native String sha256Hash(String str);

        public final native byte[] unBlind(byte[] bArr, byte[] bArr2);
    }

    static {
        C16880lQ.LLJJJIL("psiencrypt");
    }
}

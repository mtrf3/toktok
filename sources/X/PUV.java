package X;

/* loaded from: classes12.dex */
public final class PUV {
    public static String LIZ(int i) {
        if (i < 1000 || i >= 5000) {
            return KMP.LJ("Code must be in range [1000,5000): ", i);
        }
        if (i >= 1004) {
            if (i <= 1006 || (i >= 1012 && i <= 2999)) {
                return C0NY.LIZIZ("Code ", i, " is reserved and may not be used.");
            }
            return null;
        }
        return null;
    }

    public static void LIZIZ(PUT put, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = put.LJLJJL;
            int i2 = put.LJLJJLL;
            int i3 = put.LJLJL;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (put.LIZ() != -1);
    }
}

package X;

/* renamed from: X.aZv, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93999aZv {
    public final char[] LIZ = "0123456789abcdef".toCharArray();

    public final String LIZ(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = this.LIZ;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }
}

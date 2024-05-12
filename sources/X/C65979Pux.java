package X;

/* renamed from: X.Pux, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65979Pux {
    public static long LIZ(byte[] bArr) {
        int length = bArr.length;
        long j = 104729;
        int i = length >> 3;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i2 + (i3 << 3);
            j = (Long.rotateLeft(j ^ C74221TAz.LIZ((((((((bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8)) | ((bArr[i4 + 2] & 255) << 16)) | ((bArr[i4 + 3] & 255) << 24)) | ((bArr[i4 + 4] & 255) << 32)) | ((bArr[i4 + 5] & 255) << 40)) | ((bArr[i4 + 6] & 255) << 48)) | ((bArr[i4 + 7] & 255) << 56), -8663945395140668459L, 31, 5545529020109919103L), 27) * 5) + 1390208809;
            i3++;
            i2 = 0;
        }
        int i5 = i << 3;
        long j2 = 0;
        switch (length - i5) {
            case 7:
                j2 = 0 ^ ((bArr[i5 + 6] & 255) << 48);
            case 6:
                j2 ^= (bArr[i5 + 5] & 255) << 40;
            case 5:
                j2 ^= (bArr[i5 + 4] & 255) << 32;
            case 4:
                j2 ^= (bArr[i5 + 3] & 255) << 24;
            case 3:
                j2 ^= (bArr[i5 + 2] & 255) << 16;
            case 2:
                j2 ^= (bArr[i5 + 1] & 255) << 8;
            case 1:
                j ^= C74221TAz.LIZ((bArr[i5] & 255) ^ j2, -8663945395140668459L, 31, 5545529020109919103L);
                break;
        }
        long j3 = length ^ j;
        long j4 = (j3 ^ (j3 >>> 33)) * (-49064778989728563L);
        long j5 = (j4 ^ (j4 >>> 33)) * (-4265267296055464877L);
        return j5 ^ (j5 >>> 33);
    }
}

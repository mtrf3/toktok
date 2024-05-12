package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PUr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64541PUr {
    public static final byte[] LIZ;
    public static final byte[] LIZIZ;

    static {
        C64537PUn.Companion.getClass();
        LIZ = C64528PUe.LIZ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$jvm();
        LIZIZ = C64528PUe.LIZ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$jvm();
    }

    public static final String LIZ(byte[] receiver, byte[] map) {
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(map, "map");
        byte[] bArr = new byte[((receiver.length + 2) / 3) * 4];
        int length = receiver.length - (receiver.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = receiver[i];
            int i4 = i3 + 1;
            byte b2 = receiver[i3];
            i = i4 + 1;
            byte b3 = receiver[i4];
            int i5 = i2 + 1;
            bArr[i2] = map[(b & 255) >> 2];
            int i6 = i5 + 1;
            bArr[i5] = map[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i7 = i6 + 1;
            bArr[i6] = map[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i7 + 1;
            bArr[i7] = map[b3 & 63];
        }
        int length2 = receiver.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                byte b4 = receiver[i];
                byte b5 = receiver[i + 1];
                int i8 = i2 + 1;
                bArr[i2] = map[(b4 & 255) >> 2];
                int i9 = i8 + 1;
                bArr[i8] = map[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr[i9] = map[(b5 & 15) << 2];
                bArr[i9 + 1] = (byte) 61;
            }
        } else {
            byte b6 = receiver[i];
            int i10 = i2 + 1;
            bArr[i2] = map[(b6 & 255) >> 2];
            int i11 = i10 + 1;
            bArr[i10] = map[(b6 & 3) << 4];
            byte b7 = (byte) 61;
            bArr[i11] = b7;
            bArr[i11 + 1] = b7;
        }
        return new String(bArr, PVC.LIZ);
    }
}
